/**
 */
package org.osate.expr.expr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.Type;

import org.osate.expr.expr.ExprPackage;
import org.osate.expr.expr.TypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.expr.expr.impl.TypeDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.expr.expr.impl.TypeDeclImpl#getOwnedPropertyAssociations <em>Owned Property Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclImpl extends EDeclarationImpl implements TypeDecl
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getOwnedPropertyAssociations() <em>Owned Property Associations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPropertyAssociations()
   * @generated
   * @ordered
   */
  protected EList<PropertyAssociation> ownedPropertyAssociations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDeclImpl()
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
    return ExprPackage.Literals.TYPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprPackage.TYPE_DECL__TYPE, oldType, newType);
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
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprPackage.TYPE_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprPackage.TYPE_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprPackage.TYPE_DECL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyAssociation> getOwnedPropertyAssociations()
  {
    if (ownedPropertyAssociations == null)
    {
      ownedPropertyAssociations = new EObjectContainmentEList<PropertyAssociation>(PropertyAssociation.class, this, ExprPackage.TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS);
    }
    return ownedPropertyAssociations;
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
      case ExprPackage.TYPE_DECL__TYPE:
        return basicSetType(null, msgs);
      case ExprPackage.TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS:
        return ((InternalEList<?>)getOwnedPropertyAssociations()).basicRemove(otherEnd, msgs);
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
      case ExprPackage.TYPE_DECL__TYPE:
        return getType();
      case ExprPackage.TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS:
        return getOwnedPropertyAssociations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExprPackage.TYPE_DECL__TYPE:
        setType((Type)newValue);
        return;
      case ExprPackage.TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS:
        getOwnedPropertyAssociations().clear();
        getOwnedPropertyAssociations().addAll((Collection<? extends PropertyAssociation>)newValue);
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
      case ExprPackage.TYPE_DECL__TYPE:
        setType((Type)null);
        return;
      case ExprPackage.TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS:
        getOwnedPropertyAssociations().clear();
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
      case ExprPackage.TYPE_DECL__TYPE:
        return type != null;
      case ExprPackage.TYPE_DECL__OWNED_PROPERTY_ASSOCIATIONS:
        return ownedPropertyAssociations != null && !ownedPropertyAssociations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeDeclImpl
