/**
 */
package org.osate.xtext.aadl2.errormodel.errorModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadl2.provider.ElementItemProvider;

import org.osate.xtext.aadl2.errormodel.errorModel.ComponentErrorBehavior;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelFactory;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelPackage;

/**
 * This is the item provider adapter for a {@link org.osate.xtext.aadl2.errormodel.errorModel.ComponentErrorBehavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentErrorBehaviorItemProvider
	extends ElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentErrorBehaviorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUseTransformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Use Transformation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseTransformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentErrorBehavior_useTransformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentErrorBehavior_useTransformation_feature", "_UI_ComponentErrorBehavior_type"),
				 ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__USE_TRANSFORMATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__EVENTS);
			childrenFeatures.add(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__TRANSITIONS);
			childrenFeatures.add(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__OUTGOING_PROPAGATION_CONDITIONS);
			childrenFeatures.add(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__ERROR_DETECTIONS);
			childrenFeatures.add(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__ERROR_STATE_TO_MODE_MAPPINGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentErrorBehavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentErrorBehavior"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComponentErrorBehavior_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComponentErrorBehavior.class)) {
			case ErrorModelPackage.COMPONENT_ERROR_BEHAVIOR__EVENTS:
			case ErrorModelPackage.COMPONENT_ERROR_BEHAVIOR__TRANSITIONS:
			case ErrorModelPackage.COMPONENT_ERROR_BEHAVIOR__OUTGOING_PROPAGATION_CONDITIONS:
			case ErrorModelPackage.COMPONENT_ERROR_BEHAVIOR__ERROR_DETECTIONS:
			case ErrorModelPackage.COMPONENT_ERROR_BEHAVIOR__ERROR_STATE_TO_MODE_MAPPINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__EVENTS,
				 ErrorModelFactory.eINSTANCE.createErrorBehaviorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__EVENTS,
				 ErrorModelFactory.eINSTANCE.createErrorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__EVENTS,
				 ErrorModelFactory.eINSTANCE.createRepairEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__EVENTS,
				 ErrorModelFactory.eINSTANCE.createRecoverEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__TRANSITIONS,
				 ErrorModelFactory.eINSTANCE.createErrorBehaviorTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__OUTGOING_PROPAGATION_CONDITIONS,
				 ErrorModelFactory.eINSTANCE.createOutgoingPropagationCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__ERROR_DETECTIONS,
				 ErrorModelFactory.eINSTANCE.createErrorDetection()));

		newChildDescriptors.add
			(createChildParameter
				(ErrorModelPackage.Literals.COMPONENT_ERROR_BEHAVIOR__ERROR_STATE_TO_MODE_MAPPINGS,
				 ErrorModelFactory.eINSTANCE.createErrorStateToModeMapping()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ErrorModelEditPlugin.INSTANCE;
	}

}
