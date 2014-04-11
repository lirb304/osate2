package org.osate.aadl2.errormodel.analysis.cma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.util.OsateDebug;
import org.osate.xtext.aadl2.errormodel.errorModel.CompositeState;
import org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement;
import org.osate.xtext.aadl2.errormodel.errorModel.ConditionExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource;
import org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeSet;
import org.osate.xtext.aadl2.errormodel.util.AnalysisModel;
import org.osate.xtext.aadl2.errormodel.util.EMV2Util;
import org.osate.xtext.aadl2.errormodel.util.PropagationPathEnd;

public class CMAUtils {

	
	/**
	 * The processState method is used to report all potential CMA report entry.
	 * These entries are then added to the complete CMA report.
	 * To process the state, we analyze the composite error states related to 
	 * this behavior state and, when having an ANDed condition, we report
	 * all common cause of failure.
	 * @param component - the root component to process
	 * @param state     - the behavior state to process
	 * @param typeset   - the typeset associated with the state.
	 * @return
	 */
	public static List<CMAReportEntry> processState (AnalysisModel analysisModel, ErrorBehaviorState state, TypeSet typeset)
	{
		ArrayList<CMAReportEntry> result = new ArrayList<CMAReportEntry>();
		
		for (CompositeState cs : EMV2Util.getAllCompositeStates(analysisModel.getRoot().getComponentInstance()))
		{
			if (cs.getState() == state)
			{
				result.addAll (processConditionExpression (analysisModel, cs.getCondition()));
			}
		}
		return result;
	}
	
	/**
	 * Get the report entries related to a condition expression. Detect the ANDed
	 * elements and process then.
	 * @param component   - the component instance that contain the condition expression
	 * @param expression  - the condition expression to process
	 * @return            - the list of entries to add 
	 */
	public static List<CMAReportEntry> processConditionExpression (AnalysisModel analysisModel,
			                                                       ConditionExpression expression)
	{
		List<CMAReportEntry> 	result = new ArrayList<CMAReportEntry>();
		List<ConditionElement> toAnalyze = new ArrayList<ConditionElement>();
		
		OsateDebug.osateDebug("[CMAUtils] expression " + expression);
		
		if (expression instanceof SAndExpression)
		{
			SAndExpression sand = (SAndExpression) expression;
			List<ConditionExpression> exprs = sand.getOperands();
			
			for (ConditionExpression element : exprs)
			{
				OsateDebug.osateDebug("[CMAUtils] element " + element);
				if (element instanceof ConditionElement)
				{
					toAnalyze.add ((ConditionElement)element);
				}
				else
				{
					OsateDebug.osateDebug("[CMAUtils] TODO - get all contributors to the ANDed branch");
				}
			}
			result.addAll (processConditionElements (analysisModel, toAnalyze));
		}
		return result;
	}
	
	/**
	 * processConditionElements then process all elements from an ANDed condition
	 * and look for all potential Common Cause of Failure.
	 * @param analysisModel - the analysis model with the root component 
	 * @param elements      - the elements to consider
	 * @return              - the list of entries to add in the report
	 */
	public static List<CMAReportEntry> processConditionElements (AnalysisModel analysisModel, 
			                                                     List<ConditionElement> elements)
	{
		
		List<CMAReportEntry> 		result;
		List<ComponentClassifier> 	usedClassifiers;
		List<PropagationPathEnd> 	relatedErrorSources;
		List<ComponentInstance>     referencedInstances;
		
		/**
		 * The componentClassifiers map contains all the classifiers contained/used
		 * by a component instance so that we can later detect potential duplicates.
		 */
		Map<ComponentInstance, List<ComponentClassifier>> componentClassifiers;

		/**
		 * The errorSources map contains all the error sources contained/used
		 * by a component instance so that we can later detect potential duplicates.
		 */
		Map<ComponentInstance, List<PropagationPathEnd>> errorSources;		
		
		result 					= new ArrayList<CMAReportEntry>();
		referencedInstances 	= new ArrayList<ComponentInstance>();
		componentClassifiers 	= new HashMap<ComponentInstance, List<ComponentClassifier>>();
		errorSources 			= new HashMap<ComponentInstance, List<PropagationPathEnd>>();
		
		
		for (ConditionElement elt : elements)
		{
			/**
			 * Here, the condition come from a subcomponent.
			 */
			if (elt.getSubcomponents().size() == 1)
			{
				/**
				 * Here, we retrieve the subcomponent related to the condition.
				 */
				SubcomponentElement selt = elt.getSubcomponents().get(0);
				Subcomponent subcomp = selt.getSubcomponent();
				ComponentInstance subcompInstance = findComponentInstance (analysisModel.getRoot().getComponentInstance(), subcomp);
				referencedInstances.add(subcompInstance);
				
				/**
				 * Then, we get all the classifiers used by the subcomponent.
				 */
				usedClassifiers = new ArrayList<ComponentClassifier>();
				getAllClassifiers (subcompInstance, usedClassifiers);
				
				/**
				 * For each component involved in the condition, we stored
				 * all the used classifiers.
				 */
				componentClassifiers.put(subcompInstance, usedClassifiers);
			
				/**
				 * Then, we get all the error propagations that might
				 * impact the component.
				 */
				relatedErrorSources = new ArrayList<PropagationPathEnd>();
				getAllErrorSources (subcompInstance, analysisModel, relatedErrorSources);
				
				/**
				 * For each component involved in the condition, we stored
				 * all the used classifiers.
				 */
				errorSources.put(subcompInstance, relatedErrorSources);
			}
		}
		

		/**
		 * In the following, we try to find common error sources between ANDed components.
		 */
		for (ComponentInstance ci : referencedInstances)
		{
			List<ComponentInstance> duplicatesContainer = new ArrayList<ComponentInstance>();
			boolean foundInOther;
			boolean duplicated;
			for (PropagationPathEnd ppe1 : errorSources.get(ci))
			{
				duplicated = true;
				for (ComponentInstance ci2 : referencedInstances)
				{
					
					foundInOther = false;
					
					if (ci2 == ci)
					{
						continue;
					}
					
					for (PropagationPathEnd ppe2 : errorSources.get(ci2))
					{
						if (ppe1.getErrorPropagation() == ppe2.getErrorPropagation())
						{
							foundInOther = true;
							duplicatesContainer.add (ci2);
							duplicatesContainer.add (ci);
						}
					}
					if (foundInOther == false)
					{
						duplicated = false;
					}
				}

				if (duplicated)
				{
					OsateDebug.osateDebug("[CMAUtils] Propagation duplicate:" + ppe1.getErrorPropagation());
					OsateDebug.osateDebug("[CMAUtils] found in components");
					for (ComponentInstance tmp : duplicatesContainer)
					{
						OsateDebug.osateDebug("[CMAUtils]    " + tmp.getName());
					}
				}	
			}
		}
		
		
		/**
		 * In the following, we will then try to find duplicates classifier between ANDed
		 * components.
		 */
		for (ComponentInstance ci : referencedInstances)
		{
			List<ComponentInstance> duplicatesContainer = new ArrayList<ComponentInstance>();
			boolean foundInOther;
			boolean duplicated;
			for (ComponentClassifier cl : componentClassifiers.get(ci))
			{
				duplicated = true;
				for (ComponentInstance ci2 : referencedInstances)
				{
					
					foundInOther = false;
					
					if (ci2 == ci)
					{
						continue;
					}
					
					for (ComponentClassifier cl2 : componentClassifiers.get(ci2))
					{
						if (cl2 == cl)
						{
							foundInOther = true;
							duplicatesContainer.add (ci2);
							duplicatesContainer.add (ci);
						}
					}
					if (foundInOther == false)
					{
						duplicated = false;
					}
				}

				if (duplicated)
				{
					OsateDebug.osateDebug("[CMAUtils] Component duplicate:" + cl.getName());
					OsateDebug.osateDebug("[CMAUtils] found in components");
					for (ComponentInstance tmp : duplicatesContainer)
					{
						OsateDebug.osateDebug("[CMAUtils]    " + tmp.getName());
					}
				}	
			}
		}
		
		return result;
	}
	
	/**
	 * Get all the classifiers used by a component. It browses its children and related
	 * components to register all sub-components classifiers.
	 * @param instance - the top-level component that contains the rest.
	 * @param result   - an initialized list that will contain the result (all the classifiers)
	 */
	public static void getAllClassifiers (ComponentInstance instance, List<ComponentClassifier> result)
	{
		result.add(instance.getComponentClassifier());
		for (ComponentInstance child : instance.getComponentInstances())
		{
			getAllClassifiers(child, result);
		}
	}
	
	/**
	 * Get all the error sources related to a component and its subcomponent. We can then
	 * check if there is some overlap of error sources that impact two components.
	 * @param instance - the top-level component that contains the rest.
	 * @param result   - an initialized list that will contain the result (all the error sources)
	 */
	public static void getAllErrorSources (ComponentInstance instance, AnalysisModel analysisModel, List<PropagationPathEnd> result)
	{
		for (ErrorPropagation ep : EMV2Util.getAllIncomingErrorPropagations(instance))
		{
//			OsateDebug.osateDebug("[CMAUtils] instance= " + instance + "ep=" + ep);
			
			//FIXME: no propagation path is found!
			for (PropagationPathEnd ppe : analysisModel.getAllPropagationSourceEnds(instance, ep))
			{
//				OsateDebug.osateDebug("[CMAUtils] add ppe1=" + ppe);
				result.add(ppe);
			}
		}
		
		for (ComponentInstance child : instance.getComponentInstances())
		{
			getAllErrorSources(child, analysisModel, result);
		}
	}
	
	
	/**
	 * find a component instance in a component.
	 * @param rootComponent - the component that contains the subcomponent
	 * @param subcomponent  - the subcomponent to look for
	 * @return
	 */
	public static ComponentInstance findComponentInstance (ComponentInstance rootComponent, Subcomponent subcomponent)
	{
		ComponentInstance result = null;
		for (ComponentInstance ci : rootComponent.getComponentInstances())
		{
			if (ci.getName().equalsIgnoreCase(subcomponent.getName()))
			{
				result = ci;
			}
		}
		return result;
	}
}
