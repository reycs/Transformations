/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import owl.Annotation;
import owl.AnnotationProperty;
import owl.AnnotationValue;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.AnnotationImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link owl.impl.AnnotationImpl#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation {
	/**
	 * The cached value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationProperty annotationProperty;

	/**
	 * The cached value of the '{@link #getAnnotationValue() <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected AnnotationValue annotationValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty getAnnotationProperty() {
		if (annotationProperty != null && annotationProperty.eIsProxy()) {
			InternalEObject oldAnnotationProperty = (InternalEObject)annotationProperty;
			annotationProperty = (AnnotationProperty)eResolveProxy(oldAnnotationProperty);
			if (annotationProperty != oldAnnotationProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ANNOTATION__ANNOTATION_PROPERTY, oldAnnotationProperty, annotationProperty));
			}
		}
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty basicGetAnnotationProperty() {
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationProperty(AnnotationProperty newAnnotationProperty) {
		AnnotationProperty oldAnnotationProperty = annotationProperty;
		annotationProperty = newAnnotationProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANNOTATION__ANNOTATION_PROPERTY, oldAnnotationProperty, annotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationValue getAnnotationValue() {
		if (annotationValue != null && annotationValue.eIsProxy()) {
			InternalEObject oldAnnotationValue = (InternalEObject)annotationValue;
			annotationValue = (AnnotationValue)eResolveProxy(oldAnnotationValue);
			if (annotationValue != oldAnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ANNOTATION__ANNOTATION_VALUE, oldAnnotationValue, annotationValue));
			}
		}
		return annotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationValue basicGetAnnotationValue() {
		return annotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationValue(AnnotationValue newAnnotationValue) {
		AnnotationValue oldAnnotationValue = annotationValue;
		annotationValue = newAnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANNOTATION__ANNOTATION_VALUE, oldAnnotationValue, annotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				if (resolve) return getAnnotationProperty();
				return basicGetAnnotationProperty();
			case OwlPackage.ANNOTATION__ANNOTATION_VALUE:
				if (resolve) return getAnnotationValue();
				return basicGetAnnotationValue();
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
			case OwlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)newValue);
				return;
			case OwlPackage.ANNOTATION__ANNOTATION_VALUE:
				setAnnotationValue((AnnotationValue)newValue);
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
			case OwlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)null);
				return;
			case OwlPackage.ANNOTATION__ANNOTATION_VALUE:
				setAnnotationValue((AnnotationValue)null);
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
			case OwlPackage.ANNOTATION__ANNOTATION_PROPERTY:
				return annotationProperty != null;
			case OwlPackage.ANNOTATION__ANNOTATION_VALUE:
				return annotationValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
