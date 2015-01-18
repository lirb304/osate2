/*
* generated by Xtext
*/
package org.osate.alisa.common.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class CommonGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentDescriptionParserRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//Model:
		//	content=Description;
		public ParserRule getRule() { return rule; }

		//content=Description
		public Assignment getContentAssignment() { return cContentAssignment; }

		//Description
		public RuleCall getContentDescriptionParserRuleCall_0() { return cContentDescriptionParserRuleCall_0; }
	}

	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Description");
		private final Assignment cDescriptionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDescriptionDescriptionElementParserRuleCall_0 = (RuleCall)cDescriptionAssignment.eContents().get(0);
		
		//Description:
		//	description+=DescriptionElement+;
		public ParserRule getRule() { return rule; }

		//description+=DescriptionElement+
		public Assignment getDescriptionAssignment() { return cDescriptionAssignment; }

		//DescriptionElement
		public RuleCall getDescriptionDescriptionElementParserRuleCall_0() { return cDescriptionDescriptionElementParserRuleCall_0; }
	}

	public class DescriptionElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DescriptionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTextAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTextSTRINGTerminalRuleCall_0_0 = (RuleCall)cTextAssignment_0.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cRefEObjectCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefEObjectIDTerminalRuleCall_1_0_1 = (RuleCall)cRefEObjectCrossReference_1_0.eContents().get(1);
		
		//DescriptionElement:
		//	text=STRING | ref=[ecore::EObject];
		public ParserRule getRule() { return rule; }

		//text=STRING | ref=[ecore::EObject]
		public Alternatives getAlternatives() { return cAlternatives; }

		//text=STRING
		public Assignment getTextAssignment_0() { return cTextAssignment_0; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0_0() { return cTextSTRINGTerminalRuleCall_0_0; }

		//ref=[ecore::EObject]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }

		//[ecore::EObject]
		public CrossReference getRefEObjectCrossReference_1_0() { return cRefEObjectCrossReference_1_0; }

		//ID
		public RuleCall getRefEObjectIDTerminalRuleCall_1_0_1() { return cRefEObjectIDTerminalRuleCall_1_0_1; }
	}

	public class ReferencePathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReferencePath");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cRefEObjectCrossReference_0_0 = (CrossReference)cRefAssignment_0.eContents().get(0);
		private final RuleCall cRefEObjectIDTerminalRuleCall_0_0_1 = (RuleCall)cRefEObjectCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSubpathAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSubpathReferencePathParserRuleCall_1_1_0 = (RuleCall)cSubpathAssignment_1_1.eContents().get(0);
		
		//ReferencePath:
		//	ref=[ecore::EObject] ("." subpath=ReferencePath);
		public ParserRule getRule() { return rule; }

		//ref=[ecore::EObject] ("." subpath=ReferencePath)
		public Group getGroup() { return cGroup; }

		//ref=[ecore::EObject]
		public Assignment getRefAssignment_0() { return cRefAssignment_0; }

		//[ecore::EObject]
		public CrossReference getRefEObjectCrossReference_0_0() { return cRefEObjectCrossReference_0_0; }

		//ID
		public RuleCall getRefEObjectIDTerminalRuleCall_0_0_1() { return cRefEObjectIDTerminalRuleCall_0_0_1; }

		//"." subpath=ReferencePath
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//subpath=ReferencePath
		public Assignment getSubpathAssignment_1_1() { return cSubpathAssignment_1_1; }

		//ReferencePath
		public RuleCall getSubpathReferencePathParserRuleCall_1_1_0() { return cSubpathReferencePathParserRuleCall_1_1_0; }
	}

	public class PredicateExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PredicateExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final Keyword cOpEqualsSignKeyword_1_0_0 = (Keyword)cOpAlternatives_1_0.eContents().get(0);
		private final Keyword cOpExclamationMarkEqualsSignKeyword_1_0_1 = (Keyword)cOpAlternatives_1_0.eContents().get(1);
		private final Keyword cOpLessThanSignKeyword_1_0_2 = (Keyword)cOpAlternatives_1_0.eContents().get(2);
		private final Keyword cOpEqualsSignLessThanSignKeyword_1_0_3 = (Keyword)cOpAlternatives_1_0.eContents().get(3);
		private final Keyword cOpGreaterThanSignKeyword_1_0_4 = (Keyword)cOpAlternatives_1_0.eContents().get(4);
		private final Keyword cOpGreaterThanSignEqualsSignKeyword_1_0_5 = (Keyword)cOpAlternatives_1_0.eContents().get(5);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//// Dummy placeholder for comparison conditions
		//PredicateExpression:
		//	ID op=("=" | "!=" | "<" | "=<" | ">" | ">=") ID;
		public ParserRule getRule() { return rule; }

		//ID op=("=" | "!=" | "<" | "=<" | ">" | ">=") ID
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//op=("=" | "!=" | "<" | "=<" | ">" | ">=")
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }

		//"=" | "!=" | "<" | "=<" | ">" | ">="
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }

		//"="
		public Keyword getOpEqualsSignKeyword_1_0_0() { return cOpEqualsSignKeyword_1_0_0; }

		//"!="
		public Keyword getOpExclamationMarkEqualsSignKeyword_1_0_1() { return cOpExclamationMarkEqualsSignKeyword_1_0_1; }

		//"<"
		public Keyword getOpLessThanSignKeyword_1_0_2() { return cOpLessThanSignKeyword_1_0_2; }

		//"=<"
		public Keyword getOpEqualsSignLessThanSignKeyword_1_0_3() { return cOpEqualsSignLessThanSignKeyword_1_0_3; }

		//">"
		public Keyword getOpGreaterThanSignKeyword_1_0_4() { return cOpGreaterThanSignKeyword_1_0_4; }

		//">="
		public Keyword getOpGreaterThanSignEqualsSignKeyword_1_0_5() { return cOpGreaterThanSignEqualsSignKeyword_1_0_5; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
	}

	public class FinalValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FinalValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueStringParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//FinalValue:
		//	name=ID "=" value=ValueString;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=ValueString
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=ValueString
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//ValueString
		public RuleCall getValueValueStringParserRuleCall_2_0() { return cValueValueStringParserRuleCall_2_0; }
	}

	public class ValueStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValueString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValueString: // remove quotes from string in ValueConverter 
		//	STRING;
		public ParserRule getRule() { return rule; }

		//// remove quotes from string in ValueConverter 
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}

	public class AadlClassifierReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AadlClassifierReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//// Qualified classifier reference
		//AadlClassifierReference:
		//	(ID "::")* ID ("." ID)?;
		public ParserRule getRule() { return rule; }

		//(ID "::")* ID ("." ID)?
		public Group getGroup() { return cGroup; }

		//(ID "::")*
		public Group getGroup_0() { return cGroup_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }

		//"::"
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//("." ID)?
		public Group getGroup_2() { return cGroup_2; }

		//"."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}

	public class CatRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CatRef");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// Category reference. Currently it is only a single ID
		//CatRef: //('.' ID)?
		//	ID;
		public ParserRule getRule() { return rule; }

		////('.' ID)?
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class URIIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URIID");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//URIID:
		//	STRING;
		public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final DescriptionElements pDescription;
	private final DescriptionElementElements pDescriptionElement;
	private final ReferencePathElements pReferencePath;
	private final PredicateExpressionElements pPredicateExpression;
	private final FinalValueElements pFinalValue;
	private final ValueStringElements pValueString;
	private final AadlClassifierReferenceElements pAadlClassifierReference;
	private final CatRefElements pCatRef;
	private final QualifiedNameElements pQualifiedName;
	private final URIIDElements pURIID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CommonGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDescription = new DescriptionElements();
		this.pDescriptionElement = new DescriptionElementElements();
		this.pReferencePath = new ReferencePathElements();
		this.pPredicateExpression = new PredicateExpressionElements();
		this.pFinalValue = new FinalValueElements();
		this.pValueString = new ValueStringElements();
		this.pAadlClassifierReference = new AadlClassifierReferenceElements();
		this.pCatRef = new CatRefElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pURIID = new URIIDElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.alisa.common.Common".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	content=Description;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Description:
	//	description+=DescriptionElement+;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}

	//DescriptionElement:
	//	text=STRING | ref=[ecore::EObject];
	public DescriptionElementElements getDescriptionElementAccess() {
		return pDescriptionElement;
	}
	
	public ParserRule getDescriptionElementRule() {
		return getDescriptionElementAccess().getRule();
	}

	//ReferencePath:
	//	ref=[ecore::EObject] ("." subpath=ReferencePath);
	public ReferencePathElements getReferencePathAccess() {
		return pReferencePath;
	}
	
	public ParserRule getReferencePathRule() {
		return getReferencePathAccess().getRule();
	}

	//// Dummy placeholder for comparison conditions
	//PredicateExpression:
	//	ID op=("=" | "!=" | "<" | "=<" | ">" | ">=") ID;
	public PredicateExpressionElements getPredicateExpressionAccess() {
		return pPredicateExpression;
	}
	
	public ParserRule getPredicateExpressionRule() {
		return getPredicateExpressionAccess().getRule();
	}

	//FinalValue:
	//	name=ID "=" value=ValueString;
	public FinalValueElements getFinalValueAccess() {
		return pFinalValue;
	}
	
	public ParserRule getFinalValueRule() {
		return getFinalValueAccess().getRule();
	}

	//ValueString: // remove quotes from string in ValueConverter 
	//	STRING;
	public ValueStringElements getValueStringAccess() {
		return pValueString;
	}
	
	public ParserRule getValueStringRule() {
		return getValueStringAccess().getRule();
	}

	//// Qualified classifier reference
	//AadlClassifierReference:
	//	(ID "::")* ID ("." ID)?;
	public AadlClassifierReferenceElements getAadlClassifierReferenceAccess() {
		return pAadlClassifierReference;
	}
	
	public ParserRule getAadlClassifierReferenceRule() {
		return getAadlClassifierReferenceAccess().getRule();
	}

	//// Category reference. Currently it is only a single ID
	//CatRef: //('.' ID)?
	//	ID;
	public CatRefElements getCatRefAccess() {
		return pCatRef;
	}
	
	public ParserRule getCatRefRule() {
		return getCatRefAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//URIID:
	//	STRING;
	public URIIDElements getURIIDAccess() {
		return pURIID;
	}
	
	public ParserRule getURIIDRule() {
		return getURIIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
