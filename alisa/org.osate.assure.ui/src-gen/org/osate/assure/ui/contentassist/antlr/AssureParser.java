/*
* generated by Xtext
*/
package org.osate.assure.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.assure.services.AssureGrammarAccess;

public class AssureParser extends AbstractContentAssistParser {
	
	@Inject
	private AssureGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.assure.ui.contentassist.antlr.internal.InternalAssureParser createParser() {
		org.osate.assure.ui.contentassist.antlr.internal.InternalAssureParser result = new org.osate.assure.ui.contentassist.antlr.internal.InternalAssureParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAssuranceResultAccess().getAlternatives(), "rule__AssuranceResult__Alternatives");
					put(grammarAccess.getEvidenceResultAccess().getAlternatives(), "rule__EvidenceResult__Alternatives");
					put(grammarAccess.getClaimExprAccess().getAlternatives(), "rule__ClaimExpr__Alternatives");
					put(grammarAccess.getClaimExprAccess().getAlternatives_1_0(), "rule__ClaimExpr__Alternatives_1_0");
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getPredicateExpressionAccess().getOpAlternatives_1_0(), "rule__PredicateExpression__OpAlternatives_1_0");
					put(grammarAccess.getVerificationResultStateAccess().getAlternatives(), "rule__VerificationResultState__Alternatives");
					put(grammarAccess.getVerificationResultStatusAccess().getAlternatives(), "rule__VerificationResultStatus__Alternatives");
					put(grammarAccess.getIssueTypeAccess().getAlternatives(), "rule__IssueType__Alternatives");
					put(grammarAccess.getCaseResultAccess().getGroup(), "rule__CaseResult__Group__0");
					put(grammarAccess.getCaseResultAccess().getGroup_5(), "rule__CaseResult__Group_5__0");
					put(grammarAccess.getCaseResultAccess().getGroup_6(), "rule__CaseResult__Group_6__0");
					put(grammarAccess.getCaseResultAccess().getGroup_7(), "rule__CaseResult__Group_7__0");
					put(grammarAccess.getCaseResultAccess().getGroup_8(), "rule__CaseResult__Group_8__0");
					put(grammarAccess.getCaseResultAccess().getGroup_9(), "rule__CaseResult__Group_9__0");
					put(grammarAccess.getCaseResultAccess().getGroup_10(), "rule__CaseResult__Group_10__0");
					put(grammarAccess.getCaseResultAccess().getGroup_11(), "rule__CaseResult__Group_11__0");
					put(grammarAccess.getVerificationResultAccess().getGroup(), "rule__VerificationResult__Group__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_4(), "rule__VerificationResult__Group_4__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_6(), "rule__VerificationResult__Group_6__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_7(), "rule__VerificationResult__Group_7__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_8(), "rule__VerificationResult__Group_8__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_9(), "rule__VerificationResult__Group_9__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_10(), "rule__VerificationResult__Group_10__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_11(), "rule__VerificationResult__Group_11__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_12(), "rule__VerificationResult__Group_12__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_13(), "rule__VerificationResult__Group_13__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup(), "rule__AssumptionResult__Group__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_4(), "rule__AssumptionResult__Group_4__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_6(), "rule__AssumptionResult__Group_6__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_7(), "rule__AssumptionResult__Group_7__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_8(), "rule__AssumptionResult__Group_8__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_9(), "rule__AssumptionResult__Group_9__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_10(), "rule__AssumptionResult__Group_10__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_11(), "rule__AssumptionResult__Group_11__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_12(), "rule__AssumptionResult__Group_12__0");
					put(grammarAccess.getAssumptionResultAccess().getGroup_13(), "rule__AssumptionResult__Group_13__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup(), "rule__PreconditionResult__Group__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_4(), "rule__PreconditionResult__Group_4__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_6(), "rule__PreconditionResult__Group_6__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_7(), "rule__PreconditionResult__Group_7__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_8(), "rule__PreconditionResult__Group_8__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_9(), "rule__PreconditionResult__Group_9__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_10(), "rule__PreconditionResult__Group_10__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_11(), "rule__PreconditionResult__Group_11__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_12(), "rule__PreconditionResult__Group_12__0");
					put(grammarAccess.getPreconditionResultAccess().getGroup_13(), "rule__PreconditionResult__Group_13__0");
					put(grammarAccess.getClaimResultAccess().getGroup(), "rule__ClaimResult__Group__0");
					put(grammarAccess.getClaimResultAccess().getGroup_4(), "rule__ClaimResult__Group_4__0");
					put(grammarAccess.getClaimResultAccess().getGroup_6(), "rule__ClaimResult__Group_6__0");
					put(grammarAccess.getClaimResultAccess().getGroup_7(), "rule__ClaimResult__Group_7__0");
					put(grammarAccess.getClaimResultAccess().getGroup_8(), "rule__ClaimResult__Group_8__0");
					put(grammarAccess.getClaimResultAccess().getGroup_9(), "rule__ClaimResult__Group_9__0");
					put(grammarAccess.getClaimResultAccess().getGroup_10(), "rule__ClaimResult__Group_10__0");
					put(grammarAccess.getClaimResultAccess().getGroup_11(), "rule__ClaimResult__Group_11__0");
					put(grammarAccess.getClaimResultAccess().getGroup_12(), "rule__ClaimResult__Group_12__0");
					put(grammarAccess.getHazardResultAccess().getGroup(), "rule__HazardResult__Group__0");
					put(grammarAccess.getHazardResultAccess().getGroup_4(), "rule__HazardResult__Group_4__0");
					put(grammarAccess.getHazardResultAccess().getGroup_6(), "rule__HazardResult__Group_6__0");
					put(grammarAccess.getHazardResultAccess().getGroup_7(), "rule__HazardResult__Group_7__0");
					put(grammarAccess.getHazardResultAccess().getGroup_8(), "rule__HazardResult__Group_8__0");
					put(grammarAccess.getHazardResultAccess().getGroup_9(), "rule__HazardResult__Group_9__0");
					put(grammarAccess.getClaimExprAccess().getGroup_1(), "rule__ClaimExpr__Group_1__0");
					put(grammarAccess.getClaimExprAccess().getGroup_1_0_0(), "rule__ClaimExpr__Group_1_0_0__0");
					put(grammarAccess.getClaimExprAccess().getGroup_1_0_1(), "rule__ClaimExpr__Group_1_0_1__0");
					put(grammarAccess.getReferencePathAccess().getGroup(), "rule__ReferencePath__Group__0");
					put(grammarAccess.getReferencePathAccess().getGroup_1(), "rule__ReferencePath__Group_1__0");
					put(grammarAccess.getPredicateExpressionAccess().getGroup(), "rule__PredicateExpression__Group__0");
					put(grammarAccess.getFinalValueAccess().getGroup(), "rule__FinalValue__Group__0");
					put(grammarAccess.getResultIssueAccess().getGroup(), "rule__ResultIssue__Group__0");
					put(grammarAccess.getMultiLineStringAccess().getGroup(), "rule__MultiLineString__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup(), "rule__AadlClassifierReference__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_0(), "rule__AadlClassifierReference__Group_0__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2(), "rule__AadlClassifierReference__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getCaseResultAccess().getNameAssignment_1(), "rule__CaseResult__NameAssignment_1");
					put(grammarAccess.getCaseResultAccess().getTargetAssignment_3(), "rule__CaseResult__TargetAssignment_3");
					put(grammarAccess.getCaseResultAccess().getPassCountAssignment_5_1(), "rule__CaseResult__PassCountAssignment_5_1");
					put(grammarAccess.getCaseResultAccess().getFailCountAssignment_6_1(), "rule__CaseResult__FailCountAssignment_6_1");
					put(grammarAccess.getCaseResultAccess().getNeutralCountAssignment_7_1(), "rule__CaseResult__NeutralCountAssignment_7_1");
					put(grammarAccess.getCaseResultAccess().getUnknownCountAssignment_8_1(), "rule__CaseResult__UnknownCountAssignment_8_1");
					put(grammarAccess.getCaseResultAccess().getWeightAssignment_9_1(), "rule__CaseResult__WeightAssignment_9_1");
					put(grammarAccess.getCaseResultAccess().getSucessMsgAssignment_10_1(), "rule__CaseResult__SucessMsgAssignment_10_1");
					put(grammarAccess.getCaseResultAccess().getFailMsgAssignment_11_1(), "rule__CaseResult__FailMsgAssignment_11_1");
					put(grammarAccess.getCaseResultAccess().getSubCaseResultAssignment_12(), "rule__CaseResult__SubCaseResultAssignment_12");
					put(grammarAccess.getCaseResultAccess().getClaimResultAssignment_13(), "rule__CaseResult__ClaimResultAssignment_13");
					put(grammarAccess.getCaseResultAccess().getHazardResultAssignment_14(), "rule__CaseResult__HazardResultAssignment_14");
					put(grammarAccess.getVerificationResultAccess().getNameAssignment_1(), "rule__VerificationResult__NameAssignment_1");
					put(grammarAccess.getVerificationResultAccess().getVerificationActivityAssignment_3(), "rule__VerificationResult__VerificationActivityAssignment_3");
					put(grammarAccess.getVerificationResultAccess().getTargetAssignment_4_1(), "rule__VerificationResult__TargetAssignment_4_1");
					put(grammarAccess.getVerificationResultAccess().getTitleAssignment_6_1(), "rule__VerificationResult__TitleAssignment_6_1");
					put(grammarAccess.getVerificationResultAccess().getDescriptionAssignment_7_1(), "rule__VerificationResult__DescriptionAssignment_7_1");
					put(grammarAccess.getVerificationResultAccess().getDateAssignment_8_1(), "rule__VerificationResult__DateAssignment_8_1");
					put(grammarAccess.getVerificationResultAccess().getStateAssignment_9_1(), "rule__VerificationResult__StateAssignment_9_1");
					put(grammarAccess.getVerificationResultAccess().getStatusAssignment_10_1(), "rule__VerificationResult__StatusAssignment_10_1");
					put(grammarAccess.getVerificationResultAccess().getWeightAssignment_11_1(), "rule__VerificationResult__WeightAssignment_11_1");
					put(grammarAccess.getVerificationResultAccess().getSucessMsgAssignment_12_1(), "rule__VerificationResult__SucessMsgAssignment_12_1");
					put(grammarAccess.getVerificationResultAccess().getFailMsgAssignment_13_1(), "rule__VerificationResult__FailMsgAssignment_13_1");
					put(grammarAccess.getVerificationResultAccess().getAssumptionResultAssignment_14(), "rule__VerificationResult__AssumptionResultAssignment_14");
					put(grammarAccess.getVerificationResultAccess().getPreconditionResultAssignment_15(), "rule__VerificationResult__PreconditionResultAssignment_15");
					put(grammarAccess.getAssumptionResultAccess().getNameAssignment_1(), "rule__AssumptionResult__NameAssignment_1");
					put(grammarAccess.getAssumptionResultAccess().getVerificationActivityAssignment_3(), "rule__AssumptionResult__VerificationActivityAssignment_3");
					put(grammarAccess.getAssumptionResultAccess().getTargetAssignment_4_1(), "rule__AssumptionResult__TargetAssignment_4_1");
					put(grammarAccess.getAssumptionResultAccess().getTitleAssignment_6_1(), "rule__AssumptionResult__TitleAssignment_6_1");
					put(grammarAccess.getAssumptionResultAccess().getDescriptionAssignment_7_1(), "rule__AssumptionResult__DescriptionAssignment_7_1");
					put(grammarAccess.getAssumptionResultAccess().getDateAssignment_8_1(), "rule__AssumptionResult__DateAssignment_8_1");
					put(grammarAccess.getAssumptionResultAccess().getStateAssignment_9_1(), "rule__AssumptionResult__StateAssignment_9_1");
					put(grammarAccess.getAssumptionResultAccess().getStatusAssignment_10_1(), "rule__AssumptionResult__StatusAssignment_10_1");
					put(grammarAccess.getAssumptionResultAccess().getWeightAssignment_11_1(), "rule__AssumptionResult__WeightAssignment_11_1");
					put(grammarAccess.getAssumptionResultAccess().getSucessMsgAssignment_12_1(), "rule__AssumptionResult__SucessMsgAssignment_12_1");
					put(grammarAccess.getAssumptionResultAccess().getFailMsgAssignment_13_1(), "rule__AssumptionResult__FailMsgAssignment_13_1");
					put(grammarAccess.getPreconditionResultAccess().getNameAssignment_1(), "rule__PreconditionResult__NameAssignment_1");
					put(grammarAccess.getPreconditionResultAccess().getVerificationActivityAssignment_3(), "rule__PreconditionResult__VerificationActivityAssignment_3");
					put(grammarAccess.getPreconditionResultAccess().getTargetAssignment_4_1(), "rule__PreconditionResult__TargetAssignment_4_1");
					put(grammarAccess.getPreconditionResultAccess().getTitleAssignment_6_1(), "rule__PreconditionResult__TitleAssignment_6_1");
					put(grammarAccess.getPreconditionResultAccess().getDescriptionAssignment_7_1(), "rule__PreconditionResult__DescriptionAssignment_7_1");
					put(grammarAccess.getPreconditionResultAccess().getDateAssignment_8_1(), "rule__PreconditionResult__DateAssignment_8_1");
					put(grammarAccess.getPreconditionResultAccess().getStateAssignment_9_1(), "rule__PreconditionResult__StateAssignment_9_1");
					put(grammarAccess.getPreconditionResultAccess().getStatusAssignment_10_1(), "rule__PreconditionResult__StatusAssignment_10_1");
					put(grammarAccess.getPreconditionResultAccess().getWeightAssignment_11_1(), "rule__PreconditionResult__WeightAssignment_11_1");
					put(grammarAccess.getPreconditionResultAccess().getSucessMsgAssignment_12_1(), "rule__PreconditionResult__SucessMsgAssignment_12_1");
					put(grammarAccess.getPreconditionResultAccess().getFailMsgAssignment_13_1(), "rule__PreconditionResult__FailMsgAssignment_13_1");
					put(grammarAccess.getClaimResultAccess().getNameAssignment_1(), "rule__ClaimResult__NameAssignment_1");
					put(grammarAccess.getClaimResultAccess().getRequirementAssignment_3(), "rule__ClaimResult__RequirementAssignment_3");
					put(grammarAccess.getClaimResultAccess().getTargetAssignment_4_1(), "rule__ClaimResult__TargetAssignment_4_1");
					put(grammarAccess.getClaimResultAccess().getSuccessCountAssignment_6_1(), "rule__ClaimResult__SuccessCountAssignment_6_1");
					put(grammarAccess.getClaimResultAccess().getFailCountAssignment_7_1(), "rule__ClaimResult__FailCountAssignment_7_1");
					put(grammarAccess.getClaimResultAccess().getNeutralCountAssignment_8_1(), "rule__ClaimResult__NeutralCountAssignment_8_1");
					put(grammarAccess.getClaimResultAccess().getUnknownCountAssignment_9_1(), "rule__ClaimResult__UnknownCountAssignment_9_1");
					put(grammarAccess.getClaimResultAccess().getWeightAssignment_10_1(), "rule__ClaimResult__WeightAssignment_10_1");
					put(grammarAccess.getClaimResultAccess().getSucessMsgAssignment_11_1(), "rule__ClaimResult__SucessMsgAssignment_11_1");
					put(grammarAccess.getClaimResultAccess().getFailMsgAssignment_12_1(), "rule__ClaimResult__FailMsgAssignment_12_1");
					put(grammarAccess.getClaimResultAccess().getSubClaimResultAssignment_13(), "rule__ClaimResult__SubClaimResultAssignment_13");
					put(grammarAccess.getClaimResultAccess().getVerificationResultAssignment_14(), "rule__ClaimResult__VerificationResultAssignment_14");
					put(grammarAccess.getHazardResultAccess().getNameAssignment_1(), "rule__HazardResult__NameAssignment_1");
					put(grammarAccess.getHazardResultAccess().getHazardAssignment_3(), "rule__HazardResult__HazardAssignment_3");
					put(grammarAccess.getHazardResultAccess().getTargetAssignment_4_1(), "rule__HazardResult__TargetAssignment_4_1");
					put(grammarAccess.getHazardResultAccess().getPassCountAssignment_6_1(), "rule__HazardResult__PassCountAssignment_6_1");
					put(grammarAccess.getHazardResultAccess().getFailCountAssignment_7_1(), "rule__HazardResult__FailCountAssignment_7_1");
					put(grammarAccess.getHazardResultAccess().getNeutralCountAssignment_8_1(), "rule__HazardResult__NeutralCountAssignment_8_1");
					put(grammarAccess.getHazardResultAccess().getUnknownCountAssignment_9_1(), "rule__HazardResult__UnknownCountAssignment_9_1");
					put(grammarAccess.getHazardResultAccess().getVerificationResultAssignment_10(), "rule__HazardResult__VerificationResultAssignment_10");
					put(grammarAccess.getClaimExprAccess().getFirstAssignment_1_1(), "rule__ClaimExpr__FirstAssignment_1_1");
					put(grammarAccess.getClaimExprAccess().getSecondAssignment_1_3(), "rule__ClaimExpr__SecondAssignment_1_3");
					put(grammarAccess.getModelAccess().getContentAssignment(), "rule__Model__ContentAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
					put(grammarAccess.getDescriptionElementAccess().getTextAssignment_0(), "rule__DescriptionElement__TextAssignment_0");
					put(grammarAccess.getDescriptionElementAccess().getRefAssignment_1(), "rule__DescriptionElement__RefAssignment_1");
					put(grammarAccess.getReferencePathAccess().getRefAssignment_0(), "rule__ReferencePath__RefAssignment_0");
					put(grammarAccess.getReferencePathAccess().getSubpathAssignment_1_1(), "rule__ReferencePath__SubpathAssignment_1_1");
					put(grammarAccess.getPredicateExpressionAccess().getOpAssignment_1(), "rule__PredicateExpression__OpAssignment_1");
					put(grammarAccess.getFinalValueAccess().getNameAssignment_0(), "rule__FinalValue__NameAssignment_0");
					put(grammarAccess.getFinalValueAccess().getValueAssignment_2(), "rule__FinalValue__ValueAssignment_2");
					put(grammarAccess.getResultIssueAccess().getTypeAssignment_0(), "rule__ResultIssue__TypeAssignment_0");
					put(grammarAccess.getResultIssueAccess().getMsgAssignment_1(), "rule__ResultIssue__MsgAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.assure.ui.contentassist.antlr.internal.InternalAssureParser typedParser = (org.osate.assure.ui.contentassist.antlr.internal.InternalAssureParser) parser;
			typedParser.entryRuleCaseResult();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AssureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AssureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
