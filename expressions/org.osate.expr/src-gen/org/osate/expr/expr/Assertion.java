/**
 */
package org.osate.expr.expr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.Assertion#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see org.osate.expr.expr.ExprPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends EDeclaration
{
  /**
   * Returns the value of the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert</em>' containment reference.
   * @see #setAssert(Expression)
   * @see org.osate.expr.expr.ExprPackage#getAssertion_Assert()
   * @model containment="true"
   * @generated
   */
  Expression getAssert();

  /**
   * Sets the value of the '{@link org.osate.expr.expr.Assertion#getAssert <em>Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert</em>' containment reference.
   * @see #getAssert()
   * @generated
   */
  void setAssert(Expression value);

} // Assertion
