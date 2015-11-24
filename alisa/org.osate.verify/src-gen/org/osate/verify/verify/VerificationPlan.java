/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.verify.verify;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.alisa.common.common.Description;
import org.osate.alisa.common.common.Rationale;

import org.osate.reqspec.reqSpec.SystemRequirements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getTitle <em>Title</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan()
 * @model
 * @generated
 */
public interface VerificationPlan extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' reference.
   * @see #setRequirements(SystemRequirements)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Requirements()
   * @model
   * @generated
   */
  SystemRequirements getRequirements();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getRequirements <em>Requirements</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirements</em>' reference.
   * @see #getRequirements()
   * @generated
   */
  void setRequirements(SystemRequirements value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Claim</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.verify.verify.Claim}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Claim</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Claim</em>' containment reference list.
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Claim()
   * @model containment="true"
   * @generated
   */
  EList<Claim> getClaim();

  /**
   * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale</em>' containment reference.
   * @see #setRationale(Rationale)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Rationale()
   * @model containment="true"
   * @generated
   */
  Rationale getRationale();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getRationale <em>Rationale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' containment reference.
   * @see #getRationale()
   * @generated
   */
  void setRationale(Rationale value);

  /**
   * Returns the value of the '<em><b>Issues</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issues</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issues</em>' attribute list.
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Issues()
   * @model unique="false"
   * @generated
   */
  EList<String> getIssues();

} // VerificationPlan
