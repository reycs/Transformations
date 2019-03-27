/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.AnnotationProperty;
import owl.AnnotationPropertyDomain;
import owl.OwlPackage;
import owl.URI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Property Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.AnnotationPropertyDomainImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link owl.impl.AnnotationPropertyDomainImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationPropertyDomainImpl extends AnnotationAxiomImpl implements AnnotationPropertyDomain {
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
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected URI domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationPropertyDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ANNOTATION_PROPERTY_DOMAIN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY, oldAnnotationProperty, annotationProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY, oldAnnotationProperty, annotationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (URI)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ANNOTATION_PROPERTY_DOMAIN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(URI newDomain) {
		URI oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANNOTATION_PROPERTY_DOMAIN__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
				if (resolve) return getAnnotationProperty();
				return basicGetAnnotationProperty();
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
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
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)newValue);
				return;
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__DOMAIN:
				setDomain((URI)newValue);
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
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
				setAnnotationProperty((AnnotationProperty)null);
				return;
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__DOMAIN:
				setDomain((URI)null);
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
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
				return annotationProperty != null;
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationPropertyDomainImpl
