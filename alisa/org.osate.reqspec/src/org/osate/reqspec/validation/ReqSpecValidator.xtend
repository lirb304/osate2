/*
 * generated by Xtext
 */
package org.osate.reqspec.validation

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import org.osate.aadl2.Classifier
import org.osate.aadl2.NamedElement
import org.osate.aadl2.SystemImplementation
import org.osate.alisa.common.scoping.ICommonGlobalReferenceFinder
import org.osate.alisa.common.util.CommonUtilExtension
import org.osate.reqspec.reqSpec.ContractualElement
import org.osate.reqspec.reqSpec.DocumentSection
import org.osate.reqspec.reqSpec.GlobalConstants
import org.osate.reqspec.reqSpec.Goal
import org.osate.reqspec.reqSpec.ReqDocument
import org.osate.reqspec.reqSpec.ReqSpec
import org.osate.reqspec.reqSpec.ReqSpecPackage
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.StakeholderGoals
import org.osate.reqspec.reqSpec.SystemRequirements
import org.osate.reqspec.util.IReqspecGlobalReferenceFinder

import static extension org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.osate.aadl2.ComponentClassifier

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ReqSpecValidator extends AbstractReqSpecValidator {

  public static val MISSING_STAKEHOLDER = 'missingStakeholder'
  public static val MISSING_STAKEHOLDER_GOAL = 'missingStakeholderGoal'
  public static val MULTIPLE_CLASSIFIERS = 'multipleClassifiers'
  public static val FEATURES_WITHOUT_REQUIREMENT = 'featuresWithoutRequirement'
  public static val DUPLICATE_GOAL_WITHIN_STAKEHOLDER_GOALS = 'org.osate.reqspec.validation.duplicate.goal.within.stakeholdergoals'
  public static val DUPLICATE_STAKEHOLDER_GOALS = 'org.osate.reqspec.validation.duplicate.stakeholdergoals'
  public static val REQSPEC_FOR_DIFFERS_FROM_STAKEHOLDERGOALS_FOR = 'org.osate.reqspec.validation.reqspec.for.differs.from.stakeholdergoals.for'
  public static val GOAL_REFERENCE_NOT_FOUND = 'org.osate.reqspec.validation.goal.reference.not.found'
  public static val DUPLICATE_SYSTEMS_REQUIREMENT = 'org.osate.reqspec.validation.duplicate.system.requiremnts'
  public static val DUPLICATE_REQUIREMENT_WITHIN_SYSTEM_REQUIREMENTS = 'org.osate.reqspec.validation.duplicate.requirement.within.system.requirements'
  public static val CYCLE_IN_GOAL_REFINE_HIERARCHY = 'org.osate.reqspec.validation.cycle.in.goal.refine.hierarchy'
  public static val CYCLE_IN_REQUIREMENT_REFINE_HIERARCHY = 'org.osate.reqspec.validation.cycle.in.requirement.refine.hierarchy'
  public static val ILLEGAL_OBJECT_FOR_FILETYPE_IN_DOCUMENTSECTION = 'org.osate.reqspec.validation.illegal.object.for.filetype.in.documentsection'
  public static val ILLEGAL_OBJECT_FOR_FILETYPE_IN_REQSPEC = 'org.osate.reqspec.validation.illegal.object.for.filetype.in.reqspec'
  public static val ILLEGAL_OBJECT_FOR_FILETYPE_IN_REQDOCUMENT = 'org.osate.reqspec.validation.illegal.object.for.filetype.in.reqdocument'
  public static val REQSPEC_FILE_EXT = "reqspec"
  public static val GOALS_FILE_EXT = "goals"
  public static val REQDOC_FILE_EXT = "reqdoc"
  public static val GOALDOC_FILE_EXT = "goaldoc"
  public static val CONSTANTS_FILE_EXT = "constants"


	@Check//(CheckType.EXPENSIVE)
	def void checkMissingStakeholder(Goal goal) {
		if (goal.stakeholderReference.empty) {
			if (goal.refinesReference.empty){
			warning('Goal should have stakeholders', 
					ReqSpecPackage.Literals.GOAL__STAKEHOLDER_REFERENCE,
					MISSING_STAKEHOLDER)
			} else {
				goal.refinesReference.forEach[checkMissingStakeholder]
			}		
		}
	}
	
	@Check(CheckType.EXPENSIVE)
	def void checkMissingGoal(Requirement req) {
		if (req.goalReference.empty  && req.stakeholderRequirementReference.empty) {
			if (req.refinesReference.empty){ 
			warning('System requirement should have stakeholder goal or requirement reference', 
					ReqSpecPackage.Literals.REQUIREMENT__GOAL_REFERENCE,
					MISSING_STAKEHOLDER_GOAL)
			} else {
				req.refinesReference.forEach[checkMissingGoal]
			}		
		}
	}

	
	@Check(CheckType.EXPENSIVE)
	def void checkMultipleSystems(ReqDocument reqdoc) {
		val syslist = new BasicEList<Classifier>
		reqdoc.content.forEach[e | if (e instanceof ContractualElement) syslist += e.targetClassifier]
		if (syslist.size > 1){
			val cls = syslist.map[name].reduce[p1, p2| p1 + ' ' + p2]
			warning('Requirements cover multiple classifiers: '+cls, 
					ReqSpecPackage.Literals.REQ_DOCUMENT__CONTENT,
					MULTIPLE_CLASSIFIERS)
		}
	}
	
		@Check(CheckType.EXPENSIVE)
	def void checkMultipleSystems(DocumentSection docsection) {
		val syslist = new BasicEList<Classifier>
		docsection.content.forEach[e | if (e instanceof ContractualElement) syslist += e.targetClassifier]
		if (!syslist.empty){
			val cls = syslist.map[name].reduce[p1, p2| p1 + ' ' + p2]
			warning('Requirements cover multiple classifiers: '+cls, 
					ReqSpecPackage.Literals.DOCUMENT_SECTION__CONTENT,
					MULTIPLE_CLASSIFIERS)
		}
	}
	
		@Check(CheckType.EXPENSIVE)
	def void checkFeatureCoverage(SystemRequirements sysreqs) {
		val cl = sysreqs.target
		if (cl == null || cl.getAllFeatures.empty ) return
		
		val fealist = new BasicEList<NamedElement>
		cl.getAllFeatures.forEach[e| if (!sysreqs.content.exists[r| r.targetElement == e ]) fealist += e]
		if (!fealist.empty){
			val fls = sysreqs.content.map[name].reduce[p1, p2| p1 + ' ' + p2]
			warning('Features without requirement: '+fls, 
					ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS__CONTENT,
					FEATURES_WITHOUT_REQUIREMENT)
		}
	}
	
	
		@Check(CheckType.NORMAL)
	def void checkDuplicateGoal(StakeholderGoals stakeHolderGoals) {
		stakeHolderGoals.content.forEach[goal | 
			if (stakeHolderGoals.content.filter[name == goal.name].size > 1) 
				error("Duplicate goal name '" + goal.name + "' in StakeholderGoals '" + stakeHolderGoals.name + "'",  
					goal, ReqSpecPackage.Literals.CONTRACTUAL_ELEMENT__NAME,
					DUPLICATE_GOAL_WITHIN_STAKEHOLDER_GOALS, EcoreUtil.getURI(stakeHolderGoals).toString()
				)
		] 
	}
	
@Inject ICommonGlobalReferenceFinder refFinder

	@Check(CheckType.NORMAL)
	def void checkDuplicateStakeholderGoals(StakeholderGoals shg) {
		val dupes = refFinder.getDuplicates(shg)
			if (dupes.size > 0) {
				val node = NodeModelUtils.getNode(shg);
				error("Duplicate StakeholderGoal name '" + shg.name + "'",  
					shg, ReqSpecPackage.Literals.STAKEHOLDER_GOALS__NAME,
					DUPLICATE_STAKEHOLDER_GOALS, "" + node.offset, "" + node.length)
			}
	}
	
	@Check(CheckType.NORMAL)
	def void checkDuplicateSystemRequirements(SystemRequirements sysReq) {
		val dupes = refFinder.getDuplicates(sysReq)
			if (dupes.size > 0) {
				val node = NodeModelUtils.getNode(sysReq);
				error("Duplicate System Requirements name '" + sysReq.name + "'",  
					sysReq, ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS__NAME,
					DUPLICATE_SYSTEMS_REQUIREMENT, "" + node.offset, "" + node.length)
			}
	}
	@Check(CheckType.NORMAL)
	def void checkDuplicateRequirement(SystemRequirements sysReq) {
		sysReq.content.forEach[requirement | 
			if (sysReq.content.filter[name == requirement.name].size > 1) 
				error("Duplicate requirement name '" + requirement.name + "' in system requirements '" + sysReq.name + "'",  
					requirement, ReqSpecPackage.Literals.CONTRACTUAL_ELEMENT__NAME,
					DUPLICATE_REQUIREMENT_WITHIN_SYSTEM_REQUIREMENTS, EcoreUtil.getURI(sysReq).toString()
				)
		] 
	}

	@Check(CheckType.FAST)
	def void checkSpecGoalTargetConsistency(SystemRequirements sysReqs) {
		val reqSpecTarget = sysReqs.target
		val requirements = sysReqs.content
		val resource = sysReqs.eResource();

		requirements.forEach[requirement | 
			val goalReferences = requirement.goalReference
			goalReferences.forEach[goalRef | 
				val goalRefResolved = 
					switch goalRef {
						case !goalRef.eIsProxy : goalRef
						case goalRef.eIsProxy && EcoreUtil.resolve(goalRef,  resource.resourceSet).eIsProxy : null
						default : EcoreUtil.resolve(goalRef,  resource.resourceSet)
					} as Goal
				if (goalRefResolved != null && goalRefResolved.targetClassifier != null 
					&& !CommonUtilExtension.isSameorExtends(reqSpecTarget,goalRefResolved.targetClassifier )){
						val goalTargetName = goalRefResolved.targetClassifier.name
						val goalTargetURI = EcoreUtil.getURI(goalRefResolved.targetClassifier).toString();
						error("System Requirement '" +  sysReqs.name + 
								"' is not for the same component as the StakeholderGoals that " +
								"holds the goal that corresponds to requirement '" + requirement.name + "'", sysReqs,  
								ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS__TARGET, REQSPEC_FOR_DIFFERS_FROM_STAKEHOLDERGOALS_FOR,
								sysReqs.target.name, goalTargetName, goalTargetURI )
				}
				
			]
		]
	}

	@Check(CheckType.FAST)
	def void checkGoalForCycles(Goal goal) {
		val  goalList = new ArrayList<Goal>()
		goalList.add(goal)
		goal.refinesReference.forEach[refinedGoal, index|
			goalList.add(refinedGoal)
			if(refinedGoal.checkGoalForCycles(goalList)){
				error("A circular dependency or dependencies exists in the 'refined' hierarchy of " + goal.getName() + ".", 
						goal, ReqSpecPackage.Literals.GOAL__REFINES_REFERENCE, index, CYCLE_IN_GOAL_REFINE_HIERARCHY, 
						refinedGoal.name, EcoreUtil.getURI(refinedGoal).toString())
			}
			goalList.remove(goalList.size - 1)
		]
	}


	def private boolean checkGoalForCycles(Goal goal, List<Goal> goalList) {
		val refinedGoals = goal.getRefinesReference()
		refinedGoals.exists[refinedGoal | goalList.contains(refinedGoal)] || refinedGoals.exists[refinedGoal |
			goalList.add(refinedGoal)
			val cycles = refinedGoal.checkGoalForCycles(goalList)
			goalList.remove(goalList.size - 1)
			return cycles
		]
	}		

	@Check(CheckType.FAST)
	def void checkRequirementForCycles(Requirement requirement) {
		val  reqList = new ArrayList<Requirement>()
		reqList.add(requirement)
		requirement.refinesReference.forEach[refinedReq, index|
			reqList.add(refinedReq)
			if(refinedReq.checkRequirementForCycles(reqList)){
				error("A circular dependency or dependencies exists in the 'refined' hierarchy of " + requirement.getName() + ".", 
						requirement, ReqSpecPackage.Literals.REQUIREMENT__REFINES_REFERENCE, index, CYCLE_IN_REQUIREMENT_REFINE_HIERARCHY,
						refinedReq.name, EcoreUtil.getURI(refinedReq).toString())
			}
			reqList.remove(reqList.size - 1)
		]
	}

	def private boolean checkRequirementForCycles(Requirement requirement, List<Requirement> reqList) {
		val refinedReqs = requirement.getRefinesReference()
		refinedReqs.exists[refinedReq | reqList.contains(refinedReq)] || refinedReqs.exists[refinedReq |
			reqList.add(refinedReq)
			val cycles = refinedReq.checkRequirementForCycles(reqList)
			reqList.remove(reqList.size - 1)
			return cycles
		]
	}	
	@Inject IReqspecGlobalReferenceFinder reqSpecrefFinder
		
	@Check(CheckType.EXPENSIVE)
	def void checkCoverage(StakeholderGoals shgs) {
		val target = shgs.target
		if (!SystemImplementation.isInstance(target)){ return }
		val sysReqs = reqSpecrefFinder.getSystemRequirements(target)
		shgs.content.forEach[goal | 
			if (!sysReqs.exists[sysReq | sysReq.content.exists[goalReference.exists[goalRef | goalRef === goal]]]){
				error("Goal " + goal.name + " does not have a corresponding System Requirement.", 
						goal, ReqSpecPackage.Literals.CONTRACTUAL_ELEMENT__NAME)
			}
		]
	}
	
	@Check (CheckType.FAST)
	def void checkFileTypeContents(ReqSpec reqSpec) {
		val reqSpecURI =EcoreUtil.getURI(reqSpec)
		val fileExt = reqSpecURI.fileExtension.toLowerCase
		val parts = reqSpec.parts
		switch fileExt{
			case REQSPEC_FILE_EXT : {
				parts.forEach[part |
					switch part {
						SystemRequirements : {}
						StakeholderGoals : fileTypeWarning(fileExt, "stakeholder goal", part)	
						ReqDocument : fileTypeWarning(fileExt, "document", part)	
						GlobalConstants : fileTypeWarning(fileExt, "constant", part)
						default : fileTypeWarning(fileExt, part.class.name, part)
					}
				]
			}
			case GOALS_FILE_EXT : {
				parts.forEach[part |
					switch part {
						StakeholderGoals : {}
						SystemRequirements : fileTypeWarning(fileExt, "system requirement", part)	
						ReqDocument : fileTypeWarning(fileExt, "document", part)	
						GlobalConstants : fileTypeWarning(fileExt, "constant", part)
						default : fileTypeWarning(fileExt, part.class.name, part)
					}
				]
			} 
			case REQDOC_FILE_EXT : {
				parts.forEach[part |
					switch part {
						ReqDocument : {
							val reqDocContent = part.content
							reqDocContent.forEach[element |
								switch element {
									Requirement : {}
									Goal : fileTypeWarning(fileExt, "goal" , element)
									DocumentSection : checkRecDocSection(element)
									default : fileTypeWarning(fileExt, element.class.name, element)
								}
							]
						}	
						SystemRequirements : fileTypeWarning(fileExt, "system requirement", part)	
						GlobalConstants : fileTypeWarning(fileExt, "constant", part)
						StakeholderGoals : fileTypeWarning(fileExt, "stakeholder goal", part)	
						default : fileTypeWarning(fileExt, part.class.name, part)
					}
				]
			}
			case GOALDOC_FILE_EXT : {
				parts.forEach[part |
					switch part {
						ReqDocument : {
							val reqDocContent = part.content
							reqDocContent.forEach[element |
								switch element {
									Goal : {}
									Requirement : fileTypeWarning(fileExt, "requirement" , element)
									DocumentSection : checkGoalDocSection(element)
									default : fileTypeWarning(fileExt, element.class.name, element)
								}
							]
						}	
						SystemRequirements : fileTypeWarning(fileExt, "system requirement", part)	
						GlobalConstants : fileTypeWarning(fileExt, "constant", part)
						StakeholderGoals : fileTypeWarning(fileExt, "stakeholder goal", part)	
						default : fileTypeWarning(fileExt, part.class.name, part)
					}
				]
			}
			case CONSTANTS_FILE_EXT : {
				parts.forEach[part |
					switch part {
						GlobalConstants : {}
						SystemRequirements : fileTypeWarning(fileExt, "system requirement", part)	
						StakeholderGoals : fileTypeWarning(fileExt, "stakeholder goal", part)	
						ReqDocument : fileTypeWarning(fileExt, "document", part)	
						default : fileTypeWarning(fileExt, part.class.name, part)
					}
				]
			}
			
			default : {}
		}
	}	
	def void fileTypeWarning(String fileType, String partName, EObject part){
		warning( partName +" not allowed in '"+ fileType + "' file.", part, null)
	}
	/** TODO: These methods invoke the QuickFixes, not using yet do to unexpected behavior: 
	 * 		  when removing illegal stakeholder goal from reqspec, the SystemsRequirements elements re-order in a way causing an error
	def void fileTypeError(String fileType, String partName, EObject part, ReqSpec parent){
		error( partName +" not allowed in '"+ fileType + "' file.", part, null, ILLEGAL_OBJECT_FOR_FILETYPE_IN_REQSPEC, partName, EcoreUtil.getURI(parent).toString())
	}
	def void fileTypeError(String fileType, String partName, EObject part, ReqDocument parent){
		error( partName +" not allowed in '"+ fileType + "' file.", part, null, ILLEGAL_OBJECT_FOR_FILETYPE_IN_REQDOCUMENT, partName, EcoreUtil.getURI(parent).toString())
	}
	def void fileTypeError(String fileType, String partName, EObject part, DocumentSection parent){
		error( partName +" not allowed in '"+ fileType + "' file.", part, null, ILLEGAL_OBJECT_FOR_FILETYPE_IN_DOCUMENTSECTION, partName, EcoreUtil.getURI(parent).toString())
	}
	 */
	def void checkRecDocSection(DocumentSection section){
		val contents = section.content
		contents.forEach[element |
			switch element {
				Requirement : {}
				Goal : fileTypeWarning(REQDOC_FILE_EXT,  "goal" , element)
				DocumentSection : checkRecDocSection(element)
				default : fileTypeWarning(REQDOC_FILE_EXT, element.class.name, element)
			}
		]
	}
	def void checkGoalDocSection(DocumentSection section){
		val contents = section.content
		contents.forEach[element |
			switch element {
				Goal : {}
				Requirement : fileTypeWarning(GOALDOC_FILE_EXT,  "requirement" , element)
				DocumentSection : checkGoalDocSection(element)
				default : fileTypeWarning(GOALDOC_FILE_EXT, element.class.name, element)
			}
		]
	}
	
	@Check(CheckType.FAST)
	def void checkSystemRequirementsUniqueToComponentClassifier(SystemRequirements sysReq) {
		val target = sysReq.target
		val allSystemRequirements = reqSpecrefFinder.getSystemRequirementsForScopesNoExtends(target)
		if (allSystemRequirements.size > 1){
			error("Other System Requirements exist for '" +  target.name + 
								"'. Only one System Requirement is allowed for a specific component." , sysReq,  
								ReqSpecPackage.Literals.SYSTEM_REQUIREMENTS__TARGET)
		}
	}
	
	@Check(CheckType.FAST)
	def void checkStakeholderGoalsUniqueToComponentClassifier(StakeholderGoals shg) {
		val target = shg.target
		val allStakeholderGoals = reqSpecrefFinder.getStakeholderGoals(target)
		if (allStakeholderGoals.size > 1){
			error("Other Stakeholder Goals exist for '" +  target.name + 
								"'. Only one Stakeholder Goals is allowed for a specific component." , shg,  
								ReqSpecPackage.Literals.STAKEHOLDER_GOALS__TARGET)
		}
	}

////TODO: This should work but not successfully tested yet because there is an exception thrown
////      in the call to allParents that seems to be a problem with EOCL 
////      "Error executing EValidator java.lang.UnsupportedOperationException: 2:1:2:65 missing ")" to complete scope	
	@Check(CheckType.FAST)
	def void checkRequirementShadowing(Requirement req){
		val reqName = req.name
		val reqEvolvesReferences = req.evolvesReference
		val containingSysReqs = req.containingSystemRequirements
		val componentClassifier = containingSysReqs.target
		val classifierParents = componentClassifier.allParents()
		classifierParents.forEach[ classifierParent |
			reqSpecrefFinder.getSystemRequirementsForScopes(classifierParent as ComponentClassifier).forEach[ sysreqs |
				if (sysreqs.content.exists[r| r.name == reqName && !r.dropped && !reqEvolvesReferences.contains(r)]){
					error("Requirement '" + req.name + "' for '" + componentClassifier.name + 
							"' shadows a requirement of the same name in the System Requirements for '" +
							classifierParent.name + "'. Shadowing '" + reqName + "' must evolve original or original '" + 
							reqName + "' must be tagged as 'dropped'", req,  
								ReqSpecPackage.Literals.CONTRACTUAL_ELEMENT__NAME)
				}
			]
			
		]
		
	}
	
	
}
