/**
 */
package org.osate.reqspec.reqSpec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.reqspec.reqSpec.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqSpecFactoryImpl extends EFactoryImpl implements ReqSpecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReqSpecFactory init()
  {
    try
    {
      ReqSpecFactory theReqSpecFactory = (ReqSpecFactory)EPackage.Registry.INSTANCE.getEFactory(ReqSpecPackage.eNS_URI);
      if (theReqSpecFactory != null)
      {
        return theReqSpecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReqSpecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReqSpecPackage.REQ_SPEC: return createReqSpec();
      case ReqSpecPackage.REQ_SPEC_CONTAINER: return createReqSpecContainer();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT: return createContractualElement();
      case ReqSpecPackage.REQ_SPEC_MODEL: return createReqSpecModel();
      case ReqSpecPackage.REQ_SPEC_DOCUMENT: return createReqSpecDocument();
      case ReqSpecPackage.REQ_SPEC_FOLDER: return createReqSpecFolder();
      case ReqSpecPackage.RSL_VARIABLE: return createRSLVariable();
      case ReqSpecPackage.GOAL: return createGoal();
      case ReqSpecPackage.REQUIREMENT: return createRequirement();
      case ReqSpecPackage.HAZARD: return createHazard();
      case ReqSpecPackage.EXTERNAL_DOCUMENT: return createExternalDocument();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpec createReqSpec()
  {
    ReqSpecImpl reqSpec = new ReqSpecImpl();
    return reqSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecContainer createReqSpecContainer()
  {
    ReqSpecContainerImpl reqSpecContainer = new ReqSpecContainerImpl();
    return reqSpecContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractualElement createContractualElement()
  {
    ContractualElementImpl contractualElement = new ContractualElementImpl();
    return contractualElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecModel createReqSpecModel()
  {
    ReqSpecModelImpl reqSpecModel = new ReqSpecModelImpl();
    return reqSpecModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecDocument createReqSpecDocument()
  {
    ReqSpecDocumentImpl reqSpecDocument = new ReqSpecDocumentImpl();
    return reqSpecDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecFolder createReqSpecFolder()
  {
    ReqSpecFolderImpl reqSpecFolder = new ReqSpecFolderImpl();
    return reqSpecFolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLVariable createRSLVariable()
  {
    RSLVariableImpl rslVariable = new RSLVariableImpl();
    return rslVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hazard createHazard()
  {
    HazardImpl hazard = new HazardImpl();
    return hazard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDocument createExternalDocument()
  {
    ExternalDocumentImpl externalDocument = new ExternalDocumentImpl();
    return externalDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecPackage getReqSpecPackage()
  {
    return (ReqSpecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReqSpecPackage getPackage()
  {
    return ReqSpecPackage.eINSTANCE;
  }

} //ReqSpecFactoryImpl