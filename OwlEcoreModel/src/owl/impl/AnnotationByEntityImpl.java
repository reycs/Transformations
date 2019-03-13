/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.AnnotationByEntity;
import owl.Entity;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation By Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.AnnotationByEntityImpl#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationByEntityImpl extends AnnotationImpl implements AnnotationByEntity {
	/**
	 * The cached value of the '{@link #getAnnotationValue() <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationValue()
	 * @generated
	 * @ordered
	 */
	protected Entity annotationValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationByEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ANNOTATION_BY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getAnnotationValue() {
		if (annotationValue != null && annotationValue.eIsProxy()) {
			InternalEObject oldAnnotationValue = (InternalEObject)annotationValue;
			annotationValue = (Entity)eResolveProxy(oldAnnotationValue);
			if (annotationValue != oldAnnotationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ANNOTATION_BY_ENTITY__ANNOTATION_VALUE, oldAnnotationValue, annotationValue));
			}
		}
		return annotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAnnotationValue() {
		return annotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationValue(Entity newAnnotationValue) {
		Entity oldAnnotationValue = annotationValue;
		annotationValue = newAnnotationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANNOTATION_BY_ENTITY__ANNOTATION_VALUE, oldAnnotationValue, annotationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ANNOTATION_BY_ENTITY__ANNOTATION_VALUE:
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
			case OwlPackage.ANNOTATION_BY_ENTITY__ANNOTATION_VALUE:
				setAnnotationValue((Entity)newValue);
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
			case OwlPackage.ANNOTATION_BY_ENTITY__ANNOTATION_VALUE:
				setAnnotationValue((Entity)null);
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
			case OwlPackage.ANNOTATION_BY_ENTITY__ANNOTATION_VALUE:
				return annotationValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationByEntityImpl
