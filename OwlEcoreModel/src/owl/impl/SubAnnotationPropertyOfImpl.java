/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.AnnotationProperty;
import owl.OwlPackage;
import owl.SubAnnotationPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.SubAnnotationPropertyOfImpl#getSubAnnotationProperty <em>Sub Annotation Property</em>}</li>
 *   <li>{@link owl.impl.SubAnnotationPropertyOfImpl#getSuperAnnotationProperty <em>Super Annotation Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubAnnotationPropertyOfImpl extends AnnotationAxiomImpl implements SubAnnotationPropertyOf {
	/**
	 * The cached value of the '{@link #getSubAnnotationProperty() <em>Sub Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationProperty subAnnotationProperty;

	/**
	 * The cached value of the '{@link #getSuperAnnotationProperty() <em>Super Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationProperty superAnnotationProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubAnnotationPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.SUB_ANNOTATION_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty getSubAnnotationProperty() {
		if (subAnnotationProperty != null && subAnnotationProperty.eIsProxy()) {
			InternalEObject oldSubAnnotationProperty = (InternalEObject)subAnnotationProperty;
			subAnnotationProperty = (AnnotationProperty)eResolveProxy(oldSubAnnotationProperty);
			if (subAnnotationProperty != oldSubAnnotationProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY, oldSubAnnotationProperty, subAnnotationProperty));
			}
		}
		return subAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty basicGetSubAnnotationProperty() {
		return subAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubAnnotationProperty(AnnotationProperty newSubAnnotationProperty) {
		AnnotationProperty oldSubAnnotationProperty = subAnnotationProperty;
		subAnnotationProperty = newSubAnnotationProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY, oldSubAnnotationProperty, subAnnotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty getSuperAnnotationProperty() {
		if (superAnnotationProperty != null && superAnnotationProperty.eIsProxy()) {
			InternalEObject oldSuperAnnotationProperty = (InternalEObject)superAnnotationProperty;
			superAnnotationProperty = (AnnotationProperty)eResolveProxy(oldSuperAnnotationProperty);
			if (superAnnotationProperty != oldSuperAnnotationProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY, oldSuperAnnotationProperty, superAnnotationProperty));
			}
		}
		return superAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty basicGetSuperAnnotationProperty() {
		return superAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperAnnotationProperty(AnnotationProperty newSuperAnnotationProperty) {
		AnnotationProperty oldSuperAnnotationProperty = superAnnotationProperty;
		superAnnotationProperty = newSuperAnnotationProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY, oldSuperAnnotationProperty, superAnnotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				if (resolve) return getSubAnnotationProperty();
				return basicGetSubAnnotationProperty();
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				if (resolve) return getSuperAnnotationProperty();
				return basicGetSuperAnnotationProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				setSubAnnotationProperty((AnnotationProperty)newValue);
				return;
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				setSuperAnnotationProperty((AnnotationProperty)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				setSubAnnotationProperty((AnnotationProperty)null);
				return;
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				setSuperAnnotationProperty((AnnotationProperty)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY:
				return subAnnotationProperty != null;
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY:
				return superAnnotationProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SubAnnotationPropertyOfImpl
