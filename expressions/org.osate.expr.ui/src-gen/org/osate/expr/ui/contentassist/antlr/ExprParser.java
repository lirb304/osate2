/*
 * generated by Xtext
 */
package org.osate.expr.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractPartialContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.expr.services.ExprGrammarAccess;

public class ExprParser extends AbstractPartialContentAssistParser {
	
	@Inject
	private ExprGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.expr.ui.contentassist.antlr.internal.InternalExprParser createParser() {
		org.osate.expr.ui.contentassist.antlr.internal.InternalExprParser result = new org.osate.expr.ui.contentassist.antlr.internal.InternalExprParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExprModelAccess().getAlternatives(), "rule__ExprModel__Alternatives");
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getEDeclarationAccess().getAlternatives(), "rule__EDeclaration__Alternatives");
					put(grammarAccess.getVarDeclAccess().getAlternatives_0(), "rule__VarDecl__Alternatives_0");
					put(grammarAccess.getFunDeclAccess().getAlternatives_7_1(), "rule__FunDecl__Alternatives_7_1");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
					put(grammarAccess.getENumberTypeAccess().getAlternatives(), "rule__ENumberType__Alternatives");
					put(grammarAccess.getComponentCategoryAccess().getAlternatives(), "rule__ComponentCategory__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getOpOrAccess().getAlternatives(), "rule__OpOr__Alternatives");
					put(grammarAccess.getOpAndAccess().getAlternatives(), "rule__OpAnd__Alternatives");
					put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
					put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
					put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
					put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
					put(grammarAccess.getUnaryOperationAccess().getAlternatives(), "rule__UnaryOperation__Alternatives");
					put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
					put(grammarAccess.getUnitExpressionAccess().getAlternatives_1_1(), "rule__UnitExpression__Alternatives_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getEBooleanLiteralAccess().getAlternatives_1(), "rule__EBooleanLiteral__Alternatives_1");
					put(grammarAccess.getNumberLiteralAccess().getAlternatives(), "rule__NumberLiteral__Alternatives");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1(), "rule__ContainedPropertyAssociation__Alternatives_1");
					put(grammarAccess.getPropertyAssociationAccess().getAlternatives_1(), "rule__PropertyAssociation__Alternatives_1");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
					put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
					put(grammarAccess.getSignedIntAccess().getAlternatives_0(), "rule__SignedInt__Alternatives_0");
					put(grammarAccess.getNumAltAccess().getAlternatives(), "rule__NumAlt__Alternatives");
					put(grammarAccess.getMetaClassEnumAccess().getAlternatives(), "rule__MetaClassEnum__Alternatives");
					put(grammarAccess.getTargetTypeAccess().getAlternatives(), "rule__TargetType__Alternatives");
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getExprModelAccess().getGroup_0(), "rule__ExprModel__Group_0__0");
					put(grammarAccess.getExprModelAccess().getGroup_1(), "rule__ExprModel__Group_1__0");
					put(grammarAccess.getExprLibraryAccess().getGroup(), "rule__ExprLibrary__Group__0");
					put(grammarAccess.getExprSubclauseAccess().getGroup(), "rule__ExprSubclause__Group__0");
					put(grammarAccess.getDeclarationsAccess().getGroup(), "rule__Declarations__Group__0");
					put(grammarAccess.getDeclarationsAccess().getGroup_1(), "rule__Declarations__Group_1__0");
					put(grammarAccess.getTypeDeclAccess().getGroup(), "rule__TypeDecl__Group__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_4(), "rule__TypeDecl__Group_4__0");
					put(grammarAccess.getTypeDeclAccess().getGroup_4_2(), "rule__TypeDecl__Group_4_2__0");
					put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup_2(), "rule__VarDecl__Group_2__0");
					put(grammarAccess.getVarDeclAccess().getGroup_3(), "rule__VarDecl__Group_3__0");
					put(grammarAccess.getFunDeclAccess().getGroup(), "rule__FunDecl__Group__0");
					put(grammarAccess.getFunDeclAccess().getGroup_7(), "rule__FunDecl__Group_7__0");
					put(grammarAccess.getFunDeclAccess().getGroup_7_1_0(), "rule__FunDecl__Group_7_1_0__0");
					put(grammarAccess.getJavaFQNAccess().getGroup(), "rule__JavaFQN__Group__0");
					put(grammarAccess.getJavaFQNAccess().getGroup_1(), "rule__JavaFQN__Group_1__0");
					put(grammarAccess.getArgsAccess().getGroup(), "rule__Args__Group__0");
					put(grammarAccess.getArgsAccess().getGroup_1(), "rule__Args__Group_1__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getAssertionAccess().getGroup(), "rule__Assertion__Group__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_0(), "rule__PrimitiveType__Group_0__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup_2(), "rule__PrimitiveType__Group_2__0");
					put(grammarAccess.getEIntegerAccess().getGroup(), "rule__EInteger__Group__0");
					put(grammarAccess.getERealAccess().getGroup(), "rule__EReal__Group__0");
					put(grammarAccess.getRangeTypeAccess().getGroup(), "rule__RangeType__Group__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_8(), "rule__ComponentCategory__Group_8__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_10(), "rule__ComponentCategory__Group_10__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_12(), "rule__ComponentCategory__Group_12__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup_13(), "rule__ComponentCategory__Group_13__0");
					put(grammarAccess.getRecordTypeAccess().getGroup(), "rule__RecordType__Group__0");
					put(grammarAccess.getRecordTypeAccess().getGroup_3(), "rule__RecordType__Group_3__0");
					put(grammarAccess.getRecordTypeAccess().getGroup_3_1(), "rule__RecordType__Group_3_1__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getUnionTypeAccess().getGroup(), "rule__UnionType__Group__0");
					put(grammarAccess.getUnionTypeAccess().getGroup_3(), "rule__UnionType__Group_3__0");
					put(grammarAccess.getUnionTypeAccess().getGroup_3_1(), "rule__UnionType__Group_3_1__0");
					put(grammarAccess.getTupleTypeAccess().getGroup(), "rule__TupleType__Group__0");
					put(grammarAccess.getTupleTypeAccess().getGroup_3(), "rule__TupleType__Group_3__0");
					put(grammarAccess.getTupleTypeAccess().getGroup_3_1(), "rule__TupleType__Group_3_1__0");
					put(grammarAccess.getListTypeAccess().getGroup(), "rule__ListType__Group__0");
					put(grammarAccess.getSetTypeAccess().getGroup(), "rule__SetType__Group__0");
					put(grammarAccess.getBagTypeAccess().getGroup(), "rule__BagType__Group__0");
					put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_3(), "rule__EnumType__Group_3__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_3_1(), "rule__EnumType__Group_3_1__0");
					put(grammarAccess.getBlockExpressionAccess().getGroup(), "rule__BlockExpression__Group__0");
					put(grammarAccess.getBlockExpressionAccess().getGroup_2(), "rule__BlockExpression__Group_2__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_0(), "rule__OrExpression__Group_1_0__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_0_0(), "rule__OrExpression__Group_1_0_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0(), "rule__AndExpression__Group_1_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0_0(), "rule__AndExpression__Group_1_0_0__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1_0(), "rule__EqualityExpression__Group_1_0__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1_0_0(), "rule__EqualityExpression__Group_1_0_0__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0(), "rule__RelationalExpression__Group_1_0__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0(), "rule__RelationalExpression__Group_1_0_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0(), "rule__AdditiveExpression__Group_1_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0(), "rule__AdditiveExpression__Group_1_0_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0(), "rule__MultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__MultiplicativeExpression__Group_1_0_0__0");
					put(grammarAccess.getUnaryOperationAccess().getGroup_0(), "rule__UnaryOperation__Group_0__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup(), "rule__UnitExpression__Group__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_1(), "rule__UnitExpression__Group_1__0");
					put(grammarAccess.getPropertyExpressionAccess().getGroup(), "rule__PropertyExpression__Group__0");
					put(grammarAccess.getPropertyExpressionAccess().getGroup_1(), "rule__PropertyExpression__Group_1__0");
					put(grammarAccess.getPropertyExpressionAccess().getGroup_1_0(), "rule__PropertyExpression__Group_1_0__0");
					put(grammarAccess.getPropertyExpressionAccess().getGroup_1_0_0(), "rule__PropertyExpression__Group_1_0_0__0");
					put(grammarAccess.getSelectExpressionAccess().getGroup(), "rule__SelectExpression__Group__0");
					put(grammarAccess.getSelectExpressionAccess().getGroup_1(), "rule__SelectExpression__Group_1__0");
					put(grammarAccess.getSelectExpressionAccess().getGroup_1_0(), "rule__SelectExpression__Group_1_0__0");
					put(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3(), "rule__SelectExpression__Group_1_0_3__0");
					put(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1(), "rule__SelectExpression__Group_1_0_3_1__0");
					put(grammarAccess.getSelectExpressionAccess().getGroup_1_0_3_1_1(), "rule__SelectExpression__Group_1_0_3_1_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
					put(grammarAccess.getNamedElementRefAccess().getGroup(), "rule__NamedElementRef__Group__0");
					put(grammarAccess.getNamedElementRefAccess().getGroup_2(), "rule__NamedElementRef__Group_2__0");
					put(grammarAccess.getNamedElementRefAccess().getGroup_2_1(), "rule__NamedElementRef__Group_2_1__0");
					put(grammarAccess.getNamedElementRefAccess().getGroup_2_1_1(), "rule__NamedElementRef__Group_2_1_1__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup(), "rule__RangeExpression__Group__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup_5(), "rule__RangeExpression__Group_5__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getIfExpressionAccess().getGroup_5(), "rule__IfExpression__Group_5__0");
					put(grammarAccess.getWrappedNamedElementAccess().getGroup(), "rule__WrappedNamedElement__Group__0");
					put(grammarAccess.getEBooleanLiteralAccess().getGroup(), "rule__EBooleanLiteral__Group__0");
					put(grammarAccess.getEIntegerLiteralAccess().getGroup(), "rule__EIntegerLiteral__Group__0");
					put(grammarAccess.getERealLiteralAccess().getGroup(), "rule__ERealLiteral__Group__0");
					put(grammarAccess.getEStringLiteralAccess().getGroup(), "rule__EStringLiteral__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1_1(), "rule__ExpressionList__Group_1_1__0");
					put(grammarAccess.getListLiteralAccess().getGroup(), "rule__ListLiteral__Group__0");
					put(grammarAccess.getSetLiteralAccess().getGroup(), "rule__SetLiteral__Group__0");
					put(grammarAccess.getRecordLiteralAccess().getGroup(), "rule__RecordLiteral__Group__0");
					put(grammarAccess.getRecordLiteralAccess().getGroup_3(), "rule__RecordLiteral__Group_3__0");
					put(grammarAccess.getRecordLiteralAccess().getGroup_3_1(), "rule__RecordLiteral__Group_3_1__0");
					put(grammarAccess.getFieldValueAccess().getGroup(), "rule__FieldValue__Group__0");
					put(grammarAccess.getUnionLiteralAccess().getGroup(), "rule__UnionLiteral__Group__0");
					put(grammarAccess.getTupleLiteralAccess().getGroup(), "rule__TupleLiteral__Group__0");
					put(grammarAccess.getBagLiteralAccess().getGroup(), "rule__BagLiteral__Group__0");
					put(grammarAccess.getMapLiteralAccess().getGroup(), "rule__MapLiteral__Group__0");
					put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
					put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
					put(grammarAccess.getQCREFAccess().getGroup_2(), "rule__QCREF__Group_2__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup(), "rule__ContainedPropertyAssociation__Group__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3(), "rule__ContainedPropertyAssociation__Group_3__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1(), "rule__ContainedPropertyAssociation__Group_3_1__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4(), "rule__ContainedPropertyAssociation__Group_4__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2(), "rule__ContainedPropertyAssociation__Group_4_2__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5(), "rule__ContainedPropertyAssociation__Group_5__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3(), "rule__PropertyAssociation__Group_3__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3_1(), "rule__PropertyAssociation__Group_3_1__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_4(), "rule__PropertyAssociation__Group_4__0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getGroup(), "rule__BasicPropertyAssociation__Group__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup(), "rule__ModalPropertyValue__Group__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup_4(), "rule__ModalPropertyValue__Group_4__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup(), "rule__OptionalModalPropertyValue__Group__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1(), "rule__OptionalModalPropertyValue__Group_1__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3(), "rule__OptionalModalPropertyValue__Group_1_3__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getReferenceTermAccess().getGroup(), "rule__ReferenceTerm__Group__0");
					put(grammarAccess.getRecordTermAccess().getGroup(), "rule__RecordTerm__Group__0");
					put(grammarAccess.getOldRecordTermAccess().getGroup(), "rule__OldRecordTerm__Group__0");
					put(grammarAccess.getComputedTermAccess().getGroup(), "rule__ComputedTerm__Group__0");
					put(grammarAccess.getComponentClassifierTermAccess().getGroup(), "rule__ComponentClassifierTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup(), "rule__ListTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup_2(), "rule__ListTerm__Group_2__0");
					put(grammarAccess.getListTermAccess().getGroup_2_1(), "rule__ListTerm__Group_2_1__0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getGroup(), "rule__FieldPropertyAssociation__Group__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup(), "rule__ContainmentPathElement__Group__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup_0(), "rule__ContainmentPathElement__Group_0__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup_1(), "rule__ContainmentPathElement__Group_1__0");
					put(grammarAccess.getANNEXREFAccess().getGroup(), "rule__ANNEXREF__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup_3(), "rule__ArrayRange__Group_3__0");
					put(grammarAccess.getSignedConstantAccess().getGroup(), "rule__SignedConstant__Group__0");
					put(grammarAccess.getIntegerTermAccess().getGroup(), "rule__IntegerTerm__Group__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getRealTermAccess().getGroup(), "rule__RealTerm__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup(), "rule__NumericRangeTerm__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup_3(), "rule__NumericRangeTerm__Group_3__0");
					put(grammarAccess.getAppliesToKeywordsAccess().getGroup(), "rule__AppliesToKeywords__Group__0");
					put(grammarAccess.getInBindingKeywordsAccess().getGroup(), "rule__InBindingKeywords__Group__0");
					put(grammarAccess.getInModesKeywordsAccess().getGroup(), "rule__InModesKeywords__Group__0");
					put(grammarAccess.getQCLREFAccess().getGroup(), "rule__QCLREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
					put(grammarAccess.getExprModelAccess().getAnnexAssignment_0_1(), "rule__ExprModel__AnnexAssignment_0_1");
					put(grammarAccess.getExprModelAccess().getAnnexAssignment_1_1(), "rule__ExprModel__AnnexAssignment_1_1");
					put(grammarAccess.getDeclarationsAccess().getDeclsAssignment_0(), "rule__Declarations__DeclsAssignment_0");
					put(grammarAccess.getDeclarationsAccess().getDeclsAssignment_1_1(), "rule__Declarations__DeclsAssignment_1_1");
					put(grammarAccess.getTypeDeclAccess().getNameAssignment_1(), "rule__TypeDecl__NameAssignment_1");
					put(grammarAccess.getTypeDeclAccess().getTypeAssignment_3(), "rule__TypeDecl__TypeAssignment_3");
					put(grammarAccess.getTypeDeclAccess().getOwnedPropertyAssociationsAssignment_4_1(), "rule__TypeDecl__OwnedPropertyAssociationsAssignment_4_1");
					put(grammarAccess.getTypeDeclAccess().getOwnedPropertyAssociationsAssignment_4_2_1(), "rule__TypeDecl__OwnedPropertyAssociationsAssignment_4_2_1");
					put(grammarAccess.getVarDeclAccess().getConstAssignment_0_0(), "rule__VarDecl__ConstAssignment_0_0");
					put(grammarAccess.getVarDeclAccess().getNameAssignment_1(), "rule__VarDecl__NameAssignment_1");
					put(grammarAccess.getVarDeclAccess().getDeclTypeAssignment_2_1(), "rule__VarDecl__DeclTypeAssignment_2_1");
					put(grammarAccess.getVarDeclAccess().getValueAssignment_3_1(), "rule__VarDecl__ValueAssignment_3_1");
					put(grammarAccess.getFunDeclAccess().getNameAssignment_1(), "rule__FunDecl__NameAssignment_1");
					put(grammarAccess.getFunDeclAccess().getResultTypeAssignment_6(), "rule__FunDecl__ResultTypeAssignment_6");
					put(grammarAccess.getFunDeclAccess().getJavaAssignment_7_1_0_0(), "rule__FunDecl__JavaAssignment_7_1_0_0");
					put(grammarAccess.getFunDeclAccess().getFqnAssignment_7_1_0_2(), "rule__FunDecl__FqnAssignment_7_1_0_2");
					put(grammarAccess.getFunDeclAccess().getExpAssignment_7_1_1(), "rule__FunDecl__ExpAssignment_7_1_1");
					put(grammarAccess.getArgsAccess().getArgsAssignment_0(), "rule__Args__ArgsAssignment_0");
					put(grammarAccess.getArgsAccess().getArgsAssignment_1_1(), "rule__Args__ArgsAssignment_1_1");
					put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
					put(grammarAccess.getArgumentAccess().getTypeAssignment_3(), "rule__Argument__TypeAssignment_3");
					put(grammarAccess.getAssertionAccess().getNameAssignment_1(), "rule__Assertion__NameAssignment_1");
					put(grammarAccess.getAssertionAccess().getAssertAssignment_3(), "rule__Assertion__AssertAssignment_3");
					put(grammarAccess.getRangeTypeAccess().getTypeAssignment_2(), "rule__RangeType__TypeAssignment_2");
					put(grammarAccess.getCategoryAccess().getCategoryAssignment(), "rule__Category__CategoryAssignment");
					put(grammarAccess.getMetaClassAccess().getClassAssignment(), "rule__MetaClass__ClassAssignment");
					put(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_0(), "rule__RecordType__FieldsAssignment_3_0");
					put(grammarAccess.getRecordTypeAccess().getFieldsAssignment_3_1_1(), "rule__RecordType__FieldsAssignment_3_1_1");
					put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
					put(grammarAccess.getFieldAccess().getTypeAssignment_3(), "rule__Field__TypeAssignment_3");
					put(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_0(), "rule__UnionType__FieldsAssignment_3_0");
					put(grammarAccess.getUnionTypeAccess().getFieldsAssignment_3_1_1(), "rule__UnionType__FieldsAssignment_3_1_1");
					put(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_0(), "rule__TupleType__FieldsAssignment_3_0");
					put(grammarAccess.getTupleTypeAccess().getFieldsAssignment_3_1_1(), "rule__TupleType__FieldsAssignment_3_1_1");
					put(grammarAccess.getTupleFieldAccess().getTypeAssignment(), "rule__TupleField__TypeAssignment");
					put(grammarAccess.getListTypeAccess().getTypeAssignment_2(), "rule__ListType__TypeAssignment_2");
					put(grammarAccess.getSetTypeAccess().getTypeAssignment_2(), "rule__SetType__TypeAssignment_2");
					put(grammarAccess.getBagTypeAccess().getTypeAssignment_2(), "rule__BagType__TypeAssignment_2");
					put(grammarAccess.getMapTypeAccess().getDomainAssignment_1(), "rule__MapType__DomainAssignment_1");
					put(grammarAccess.getMapTypeAccess().getImageAssignment_3(), "rule__MapType__ImageAssignment_3");
					put(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_0(), "rule__EnumType__LiteralsAssignment_3_0");
					put(grammarAccess.getEnumTypeAccess().getLiteralsAssignment_3_1_1(), "rule__EnumType__LiteralsAssignment_3_1_1");
					put(grammarAccess.getEnumLiteralAccess().getNameAssignment(), "rule__EnumLiteral__NameAssignment");
					put(grammarAccess.getTypeRefAccess().getRefAssignment(), "rule__TypeRef__RefAssignment");
					put(grammarAccess.getBlockExpressionAccess().getDeclsAssignment_2_0(), "rule__BlockExpression__DeclsAssignment_2_0");
					put(grammarAccess.getBlockExpressionAccess().getResultAssignment_3(), "rule__BlockExpression__ResultAssignment_3");
					put(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__OrExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1(), "rule__OrExpression__RightAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AndExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1(), "rule__AndExpression__RightAssignment_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__EqualityExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_1(), "rule__EqualityExpression__RightAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__RelationalExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1(), "rule__RelationalExpression__RightAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AdditiveExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1(), "rule__AdditiveExpression__RightAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1(), "rule__MultiplicativeExpression__RightAssignment_1_1");
					put(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0_1(), "rule__UnaryOperation__OperatorAssignment_0_1");
					put(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2(), "rule__UnaryOperation__OperandAssignment_0_2");
					put(grammarAccess.getUnitExpressionAccess().getConvertAssignment_1_1_0(), "rule__UnitExpression__ConvertAssignment_1_1_0");
					put(grammarAccess.getUnitExpressionAccess().getDropAssignment_1_1_1(), "rule__UnitExpression__DropAssignment_1_1_1");
					put(grammarAccess.getUnitExpressionAccess().getUnitAssignment_1_2(), "rule__UnitExpression__UnitAssignment_1_2");
					put(grammarAccess.getPropertyExpressionAccess().getPropertyAssignment_1_1(), "rule__PropertyExpression__PropertyAssignment_1_1");
					put(grammarAccess.getSelectExpressionAccess().getRefAssignment_1_0_2(), "rule__SelectExpression__RefAssignment_1_0_2");
					put(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_0(), "rule__SelectExpression__ArgsAssignment_1_0_3_1_0");
					put(grammarAccess.getSelectExpressionAccess().getArgsAssignment_1_0_3_1_1_1(), "rule__SelectExpression__ArgsAssignment_1_0_3_1_1_1");
					put(grammarAccess.getNamedElementRefAccess().getCoreAssignment_0(), "rule__NamedElementRef__CoreAssignment_0");
					put(grammarAccess.getNamedElementRefAccess().getRefAssignment_1(), "rule__NamedElementRef__RefAssignment_1");
					put(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_0(), "rule__NamedElementRef__ArgsAssignment_2_1_0");
					put(grammarAccess.getNamedElementRefAccess().getArgsAssignment_2_1_1_1(), "rule__NamedElementRef__ArgsAssignment_2_1_1_1");
					put(grammarAccess.getRangeExpressionAccess().getMinimumAssignment_2(), "rule__RangeExpression__MinimumAssignment_2");
					put(grammarAccess.getRangeExpressionAccess().getMaximumAssignment_4(), "rule__RangeExpression__MaximumAssignment_4");
					put(grammarAccess.getRangeExpressionAccess().getDeltaAssignment_5_1(), "rule__RangeExpression__DeltaAssignment_5_1");
					put(grammarAccess.getIfExpressionAccess().getIfAssignment_2(), "rule__IfExpression__IfAssignment_2");
					put(grammarAccess.getIfExpressionAccess().getThenAssignment_4(), "rule__IfExpression__ThenAssignment_4");
					put(grammarAccess.getIfExpressionAccess().getElseAssignment_5_1(), "rule__IfExpression__ElseAssignment_5_1");
					put(grammarAccess.getWrappedNamedElementAccess().getElemAssignment_1(), "rule__WrappedNamedElement__ElemAssignment_1");
					put(grammarAccess.getEBooleanLiteralAccess().getValueAssignment_1_0(), "rule__EBooleanLiteral__ValueAssignment_1_0");
					put(grammarAccess.getEIntegerLiteralAccess().getValueAssignment_1(), "rule__EIntegerLiteral__ValueAssignment_1");
					put(grammarAccess.getERealLiteralAccess().getValueAssignment_1(), "rule__ERealLiteral__ValueAssignment_1");
					put(grammarAccess.getEStringLiteralAccess().getValueAssignment_1(), "rule__EStringLiteral__ValueAssignment_1");
					put(grammarAccess.getExpressionListAccess().getElementsAssignment_1_0(), "rule__ExpressionList__ElementsAssignment_1_0");
					put(grammarAccess.getExpressionListAccess().getElementsAssignment_1_1_1(), "rule__ExpressionList__ElementsAssignment_1_1_1");
					put(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_0(), "rule__RecordLiteral__FieldValuesAssignment_3_0");
					put(grammarAccess.getRecordLiteralAccess().getFieldValuesAssignment_3_1_1(), "rule__RecordLiteral__FieldValuesAssignment_3_1_1");
					put(grammarAccess.getFieldValueAccess().getNameAssignment_0(), "rule__FieldValue__NameAssignment_0");
					put(grammarAccess.getFieldValueAccess().getValueAssignment_2(), "rule__FieldValue__ValueAssignment_2");
					put(grammarAccess.getUnionLiteralAccess().getFieldValueAssignment_3(), "rule__UnionLiteral__FieldValueAssignment_3");
					put(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0(), "rule__ContainedPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__ContainedPropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2(), "rule__ContainedPropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2(), "rule__ContainedPropertyAssociation__InBindingAssignment_5_2");
					put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_0(), "rule__PropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__PropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getConstantAssignment_2(), "rule__PropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__PropertyAssociation__OwnedValueAssignment_3_0");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getInBindingAssignment_4_2(), "rule__PropertyAssociation__InBindingAssignment_4_2");
					put(grammarAccess.getBasicPropertyAssociationAccess().getPropertyAssignment_0(), "rule__BasicPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__BasicPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathAccess().getPathAssignment(), "rule__ContainmentPath__PathAssignment");
					put(grammarAccess.getModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__ModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_3(), "rule__ModalPropertyValue__InModeAssignment_3");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_4_1(), "rule__ModalPropertyValue__InModeAssignment_4_1");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__OptionalModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2(), "rule__OptionalModalPropertyValue__InModeAssignment_1_2");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1(), "rule__OptionalModalPropertyValue__InModeAssignment_1_3_1");
					put(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment(), "rule__PropertyValue__OwnedValueAssignment");
					put(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment(), "rule__LiteralorReferenceTerm__NamedValueAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
					put(grammarAccess.getConstantValueAccess().getNamedValueAssignment(), "rule__ConstantValue__NamedValueAssignment");
					put(grammarAccess.getReferenceTermAccess().getPathAssignment_2(), "rule__ReferenceTerm__PathAssignment_2");
					put(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__RecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getOldRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__OldRecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getComputedTermAccess().getFunctionAssignment_2(), "rule__ComputedTerm__FunctionAssignment_2");
					put(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2(), "rule__ComponentClassifierTerm__ClassifierAssignment_2");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0(), "rule__ListTerm__OwnedListElementAssignment_2_0");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1(), "rule__ListTerm__OwnedListElementAssignment_2_1_1");
					put(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0(), "rule__FieldPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__FieldPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0(), "rule__ContainmentPathElement__NamedElementAssignment_0_0");
					put(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1(), "rule__ContainmentPathElement__ArrayRangeAssignment_0_1");
					put(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1(), "rule__ContainmentPathElement__PathAssignment_1_1");
					put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
					put(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2(), "rule__ArrayRange__LowerBoundAssignment_2");
					put(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1(), "rule__ArrayRange__UpperBoundAssignment_3_1");
					put(grammarAccess.getSignedConstantAccess().getOpAssignment_0(), "rule__SignedConstant__OpAssignment_0");
					put(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1(), "rule__SignedConstant__OwnedPropertyExpressionAssignment_1");
					put(grammarAccess.getIntegerTermAccess().getValueAssignment_0(), "rule__IntegerTerm__ValueAssignment_0");
					put(grammarAccess.getIntegerTermAccess().getUnitAssignment_1(), "rule__IntegerTerm__UnitAssignment_1");
					put(grammarAccess.getRealTermAccess().getValueAssignment_0(), "rule__RealTerm__ValueAssignment_0");
					put(grammarAccess.getRealTermAccess().getUnitAssignment_1(), "rule__RealTerm__UnitAssignment_1");
					put(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0(), "rule__NumericRangeTerm__MinimumAssignment_0");
					put(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2(), "rule__NumericRangeTerm__MaximumAssignment_2");
					put(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1(), "rule__NumericRangeTerm__DeltaAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.expr.ui.contentassist.antlr.internal.InternalExprParser typedParser = (org.osate.expr.ui.contentassist.antlr.internal.InternalExprParser) parser;
			typedParser.entryRuleExprModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public ExprGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExprGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
