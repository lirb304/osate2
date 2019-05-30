/**
 * generated by Xtext 2.17.0
 */
package org.osate.expr.expr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.Type;

import org.osate.expr.expr.ExprPackage;
import org.osate.expr.expr.Expression;
import org.osate.expr.expr.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.impl.VarDeclImpl#isConst <em>Const</em>}</li>
 *   <li>{@link org.osate.expr.expr.impl.VarDeclImpl#getDeclType <em>Decl Type</em>}</li>
 *   <li>{@link org.osate.expr.expr.impl.VarDeclImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDeclImpl extends EDeclarationImpl implements VarDecl
{
  /**
   * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected static final boolean CONST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected boolean const_ = CONST_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclType() <em>Decl Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclType()
   * @generated
   * @ordered
   */
  protected Type declType;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExprPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConst(boolean newConst)
  {
    boolean oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.VAR_DECL__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getDeclType()
  {
    return declType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclType(Type newDeclType, NotificationChain msgs)
  {
    Type oldDeclType = declType;
    declType = newDeclType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.VAR_DECL__DECL_TYPE, oldDeclType, newDeclType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeclType(Type newDeclType)
  {
    if (newDeclType != declType)
    {
      NotificationChain msgs = null;
      if (declType != null)
        msgs = ((InternalEObject)declType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.VAR_DECL__DECL_TYPE, null, msgs);
      if (newDeclType != null)
        msgs = ((InternalEObject)newDeclType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.VAR_DECL__DECL_TYPE, null, msgs);
      msgs = basicSetDeclType(newDeclType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.VAR_DECL__DECL_TYPE, newDeclType, newDeclType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.VAR_DECL__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.VAR_DECL__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.VAR_DECL__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.VAR_DECL__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExprPackage.VAR_DECL__DECL_TYPE:
        return basicSetDeclType(null, msgs);
      case ExprPackage.VAR_DECL__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExprPackage.VAR_DECL__CONST:
        return isConst();
      case ExprPackage.VAR_DECL__DECL_TYPE:
        return getDeclType();
      case ExprPackage.VAR_DECL__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExprPackage.VAR_DECL__CONST:
        setConst((Boolean)newValue);
        return;
      case ExprPackage.VAR_DECL__DECL_TYPE:
        setDeclType((Type)newValue);
        return;
      case ExprPackage.VAR_DECL__VALUE:
        setValue((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExprPackage.VAR_DECL__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case ExprPackage.VAR_DECL__DECL_TYPE:
        setDeclType((Type)null);
        return;
      case ExprPackage.VAR_DECL__VALUE:
        setValue((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExprPackage.VAR_DECL__CONST:
        return const_ != CONST_EDEFAULT;
      case ExprPackage.VAR_DECL__DECL_TYPE:
        return declType != null;
      case ExprPackage.VAR_DECL__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (const: ");
    result.append(const_);
    result.append(')');
    return result.toString();
  }

} //VarDeclImpl
