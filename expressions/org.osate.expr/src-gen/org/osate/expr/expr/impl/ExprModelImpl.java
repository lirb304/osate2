/**
 */
package org.osate.expr.expr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.NamedElement;

import org.osate.expr.expr.ExprModel;
import org.osate.expr.expr.ExprPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.impl.ExprModelImpl#getAnnex <em>Annex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprModelImpl extends MinimalEObjectImpl.Container implements ExprModel
{
  /**
   * The cached value of the '{@link #getAnnex() <em>Annex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnex()
   * @generated
   * @ordered
   */
  protected NamedElement annex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprModelImpl()
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
    return ExprPackage.Literals.EXPR_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getAnnex()
  {
    return annex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnex(NamedElement newAnnex, NotificationChain msgs)
  {
    NamedElement oldAnnex = annex;
    annex = newAnnex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.EXPR_MODEL__ANNEX, oldAnnex, newAnnex);
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
  public void setAnnex(NamedElement newAnnex)
  {
    if (newAnnex != annex)
    {
      NotificationChain msgs = null;
      if (annex != null)
        msgs = ((InternalEObject)annex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.EXPR_MODEL__ANNEX, null, msgs);
      if (newAnnex != null)
        msgs = ((InternalEObject)newAnnex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.EXPR_MODEL__ANNEX, null, msgs);
      msgs = basicSetAnnex(newAnnex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.EXPR_MODEL__ANNEX, newAnnex, newAnnex));
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
      case ExprPackage.EXPR_MODEL__ANNEX:
        return basicSetAnnex(null, msgs);
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
      case ExprPackage.EXPR_MODEL__ANNEX:
        return getAnnex();
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
      case ExprPackage.EXPR_MODEL__ANNEX:
        setAnnex((NamedElement)newValue);
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
      case ExprPackage.EXPR_MODEL__ANNEX:
        setAnnex((NamedElement)null);
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
      case ExprPackage.EXPR_MODEL__ANNEX:
        return annex != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprModelImpl
