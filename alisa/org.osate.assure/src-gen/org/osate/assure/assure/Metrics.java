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
package org.osate.assure.assure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.assure.assure.Metrics#getTbdCount <em>Tbd Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getSuccessCount <em>Success Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getFailCount <em>Fail Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getTimeoutCount <em>Timeout Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getDidelseCount <em>Didelse Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getThenskipCount <em>Thenskip Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getPreconditionfailCount <em>Preconditionfail Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getValidationfailCount <em>Validationfail Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getFeaturesCount <em>Features Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getFeaturesRequirementsCount <em>Features Requirements Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getQualityCategoryRequirementsCount <em>Quality Category Requirements Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getRequirementsWithoutPlanClaimCount <em>Requirements Without Plan Claim Count</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.osate.assure.assure.Metrics#getExecutionTime <em>Execution Time</em>}</li>
 * </ul>
 *
 * @see org.osate.assure.assure.AssurePackage#getMetrics()
 * @model
 * @generated
 */
public interface Metrics extends EObject
{
  /**
   * Returns the value of the '<em><b>Tbd Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tbd Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tbd Count</em>' attribute.
   * @see #setTbdCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_TbdCount()
   * @model
   * @generated
   */
  int getTbdCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getTbdCount <em>Tbd Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tbd Count</em>' attribute.
   * @see #getTbdCount()
   * @generated
   */
  void setTbdCount(int value);

  /**
   * Returns the value of the '<em><b>Success Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Success Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Success Count</em>' attribute.
   * @see #setSuccessCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_SuccessCount()
   * @model
   * @generated
   */
  int getSuccessCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getSuccessCount <em>Success Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Success Count</em>' attribute.
   * @see #getSuccessCount()
   * @generated
   */
  void setSuccessCount(int value);

  /**
   * Returns the value of the '<em><b>Fail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fail Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fail Count</em>' attribute.
   * @see #setFailCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_FailCount()
   * @model
   * @generated
   */
  int getFailCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getFailCount <em>Fail Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail Count</em>' attribute.
   * @see #getFailCount()
   * @generated
   */
  void setFailCount(int value);

  /**
   * Returns the value of the '<em><b>Timeout Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout Count</em>' attribute.
   * @see #setTimeoutCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_TimeoutCount()
   * @model
   * @generated
   */
  int getTimeoutCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getTimeoutCount <em>Timeout Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout Count</em>' attribute.
   * @see #getTimeoutCount()
   * @generated
   */
  void setTimeoutCount(int value);

  /**
   * Returns the value of the '<em><b>Error Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Count</em>' attribute.
   * @see #setErrorCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_ErrorCount()
   * @model
   * @generated
   */
  int getErrorCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getErrorCount <em>Error Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Count</em>' attribute.
   * @see #getErrorCount()
   * @generated
   */
  void setErrorCount(int value);

  /**
   * Returns the value of the '<em><b>Didelse Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Didelse Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Didelse Count</em>' attribute.
   * @see #setDidelseCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_DidelseCount()
   * @model
   * @generated
   */
  int getDidelseCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getDidelseCount <em>Didelse Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Didelse Count</em>' attribute.
   * @see #getDidelseCount()
   * @generated
   */
  void setDidelseCount(int value);

  /**
   * Returns the value of the '<em><b>Thenskip Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thenskip Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thenskip Count</em>' attribute.
   * @see #setThenskipCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_ThenskipCount()
   * @model
   * @generated
   */
  int getThenskipCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getThenskipCount <em>Thenskip Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thenskip Count</em>' attribute.
   * @see #getThenskipCount()
   * @generated
   */
  void setThenskipCount(int value);

  /**
   * Returns the value of the '<em><b>Preconditionfail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preconditionfail Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preconditionfail Count</em>' attribute.
   * @see #setPreconditionfailCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_PreconditionfailCount()
   * @model
   * @generated
   */
  int getPreconditionfailCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getPreconditionfailCount <em>Preconditionfail Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preconditionfail Count</em>' attribute.
   * @see #getPreconditionfailCount()
   * @generated
   */
  void setPreconditionfailCount(int value);

  /**
   * Returns the value of the '<em><b>Validationfail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validationfail Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validationfail Count</em>' attribute.
   * @see #setValidationfailCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_ValidationfailCount()
   * @model
   * @generated
   */
  int getValidationfailCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getValidationfailCount <em>Validationfail Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validationfail Count</em>' attribute.
   * @see #getValidationfailCount()
   * @generated
   */
  void setValidationfailCount(int value);

  /**
   * Returns the value of the '<em><b>Features Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Count</em>' attribute.
   * @see #setFeaturesCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_FeaturesCount()
   * @model
   * @generated
   */
  int getFeaturesCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getFeaturesCount <em>Features Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features Count</em>' attribute.
   * @see #getFeaturesCount()
   * @generated
   */
  void setFeaturesCount(int value);

  /**
   * Returns the value of the '<em><b>Features Requirements Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Requirements Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Requirements Count</em>' attribute.
   * @see #setFeaturesRequirementsCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_FeaturesRequirementsCount()
   * @model
   * @generated
   */
  int getFeaturesRequirementsCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getFeaturesRequirementsCount <em>Features Requirements Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features Requirements Count</em>' attribute.
   * @see #getFeaturesRequirementsCount()
   * @generated
   */
  void setFeaturesRequirementsCount(int value);

  /**
   * Returns the value of the '<em><b>Quality Category Requirements Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quality Category Requirements Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quality Category Requirements Count</em>' attribute.
   * @see #setQualityCategoryRequirementsCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_QualityCategoryRequirementsCount()
   * @model
   * @generated
   */
  int getQualityCategoryRequirementsCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getQualityCategoryRequirementsCount <em>Quality Category Requirements Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quality Category Requirements Count</em>' attribute.
   * @see #getQualityCategoryRequirementsCount()
   * @generated
   */
  void setQualityCategoryRequirementsCount(int value);

  /**
   * Returns the value of the '<em><b>Requirements Without Plan Claim Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements Without Plan Claim Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements Without Plan Claim Count</em>' attribute.
   * @see #setRequirementsWithoutPlanClaimCount(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_RequirementsWithoutPlanClaimCount()
   * @model
   * @generated
   */
  int getRequirementsWithoutPlanClaimCount();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getRequirementsWithoutPlanClaimCount <em>Requirements Without Plan Claim Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirements Without Plan Claim Count</em>' attribute.
   * @see #getRequirementsWithoutPlanClaimCount()
   * @generated
   */
  void setRequirementsWithoutPlanClaimCount(int value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(int)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_Weight()
   * @model
   * @generated
   */
  int getWeight();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(int value);

  /**
   * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution Time</em>' attribute.
   * @see #setExecutionTime(long)
   * @see org.osate.assure.assure.AssurePackage#getMetrics_ExecutionTime()
   * @model dataType="org.osate.aadl2.Integer"
   * @generated
   */
  long getExecutionTime();

  /**
   * Sets the value of the '{@link org.osate.assure.assure.Metrics#getExecutionTime <em>Execution Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution Time</em>' attribute.
   * @see #getExecutionTime()
   * @generated
   */
  void setExecutionTime(long value);

} // Metrics
