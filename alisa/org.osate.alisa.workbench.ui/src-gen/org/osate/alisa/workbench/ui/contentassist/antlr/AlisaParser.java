/*
* generated by Xtext
*/
package org.osate.alisa.workbench.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.alisa.workbench.services.AlisaGrammarAccess;

public class AlisaParser extends AbstractContentAssistParser {
	
	@Inject
	private AlisaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.alisa.workbench.ui.contentassist.antlr.internal.InternalAlisaParser createParser() {
		org.osate.alisa.workbench.ui.contentassist.antlr.internal.InternalAlisaParser result = new org.osate.alisa.workbench.ui.contentassist.antlr.internal.InternalAlisaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getPredicateExpressionAccess().getOpAlternatives_1_0(), "rule__PredicateExpression__OpAlternatives_1_0");
					put(grammarAccess.getAlisaWorkAreaAccess().getGroup(), "rule__AlisaWorkArea__Group__0");
					put(grammarAccess.getAssuranceCasePlanAccess().getGroup(), "rule__AssuranceCasePlan__Group__0");
					put(grammarAccess.getAssuranceCasePlanAccess().getGroup_5_0(), "rule__AssuranceCasePlan__Group_5_0__0");
					put(grammarAccess.getAssuranceCasePlanAccess().getGroup_5_1(), "rule__AssuranceCasePlan__Group_5_1__0");
					put(grammarAccess.getAssuranceCasePlanAccess().getGroup_5_2(), "rule__AssuranceCasePlan__Group_5_2__0");
					put(grammarAccess.getAssuranceCasePlanAccess().getGroup_5_2_0(), "rule__AssuranceCasePlan__Group_5_2_0__0");
					put(grammarAccess.getReferencePathAccess().getGroup(), "rule__ReferencePath__Group__0");
					put(grammarAccess.getReferencePathAccess().getGroup_1(), "rule__ReferencePath__Group_1__0");
					put(grammarAccess.getPredicateExpressionAccess().getGroup(), "rule__PredicateExpression__Group__0");
					put(grammarAccess.getFinalValueAccess().getGroup(), "rule__FinalValue__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup(), "rule__AadlClassifierReference__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_0(), "rule__AadlClassifierReference__Group_0__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2(), "rule__AadlClassifierReference__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getAlisaWorkAreaAccess().getNameAssignment_1(), "rule__AlisaWorkArea__NameAssignment_1");
					put(grammarAccess.getAlisaWorkAreaAccess().getCasesAssignment_2(), "rule__AlisaWorkArea__CasesAssignment_2");
					put(grammarAccess.getAssuranceCasePlanAccess().getNameAssignment_1(), "rule__AssuranceCasePlan__NameAssignment_1");
					put(grammarAccess.getAssuranceCasePlanAccess().getSystemAssignment_3(), "rule__AssuranceCasePlan__SystemAssignment_3");
					put(grammarAccess.getAssuranceCasePlanAccess().getTitleAssignment_5_0_1(), "rule__AssuranceCasePlan__TitleAssignment_5_0_1");
					put(grammarAccess.getAssuranceCasePlanAccess().getDescriptionAssignment_5_1_1(), "rule__AssuranceCasePlan__DescriptionAssignment_5_1_1");
					put(grammarAccess.getAssuranceCasePlanAccess().getConstantAssignment_5_2_0_1(), "rule__AssuranceCasePlan__ConstantAssignment_5_2_0_1");
					put(grammarAccess.getAssuranceCasePlanAccess().getPlansAssignment_5_2_2(), "rule__AssuranceCasePlan__PlansAssignment_5_2_2");
					put(grammarAccess.getModelAccess().getContentAssignment(), "rule__Model__ContentAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
					put(grammarAccess.getDescriptionElementAccess().getTextAssignment_0(), "rule__DescriptionElement__TextAssignment_0");
					put(grammarAccess.getDescriptionElementAccess().getRefAssignment_1(), "rule__DescriptionElement__RefAssignment_1");
					put(grammarAccess.getReferencePathAccess().getRefAssignment_0(), "rule__ReferencePath__RefAssignment_0");
					put(grammarAccess.getReferencePathAccess().getSubpathAssignment_1_1(), "rule__ReferencePath__SubpathAssignment_1_1");
					put(grammarAccess.getPredicateExpressionAccess().getOpAssignment_1(), "rule__PredicateExpression__OpAssignment_1");
					put(grammarAccess.getFinalValueAccess().getNameAssignment_0(), "rule__FinalValue__NameAssignment_0");
					put(grammarAccess.getFinalValueAccess().getValueAssignment_2(), "rule__FinalValue__ValueAssignment_2");
					put(grammarAccess.getAssuranceCasePlanAccess().getUnorderedGroup_5(), "rule__AssuranceCasePlan__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.alisa.workbench.ui.contentassist.antlr.internal.InternalAlisaParser typedParser = (org.osate.alisa.workbench.ui.contentassist.antlr.internal.InternalAlisaParser) parser;
			typedParser.entryRuleAlisaWorkArea();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AlisaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AlisaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
