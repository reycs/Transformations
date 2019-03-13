/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.Annotation;
import owl.AnonymousIndividual;
import owl.AnonymousIndividualAnnotation;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Individual Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.AnonymousIndividualAnnotationImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 *   <li>{@link owl.impl.AnonymousIndividualAnnotationImpl#getAnonymousIndiviudalAnnotations <em>Anonymous Indiviudal Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousIndividualAnnotationImpl extends AxiomImpl implements AnonymousIndividualAnnotation {
	/**
	 * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndividual()
	 * @generated
	 * @ordered
	 */
	protected AnonymousIndividual anonymousIndividual;

	/**
	 * The cached value of the '{@link #getAnonymousIndiviudalAnnotations() <em>Anonymous Indiviudal Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousIndiviudalAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> anonymousIndiviudalAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousIndividualAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ANONYMOUS_INDIVIDUAL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual getAnonymousIndividual() {
		if (anonymousIndividual != null && anonymousIndividual.eIsProxy()) {
			InternalEObject oldAnonymousIndividual = (InternalEObject)anonymousIndividual;
			anonymousIndividual = (AnonymousIndividual)eResolveProxy(oldAnonymousIndividual);
			if (anonymousIndividual != oldAnonymousIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL, oldAnonymousIndividual, anonymousIndividual));
			}
		}
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual basicGetAnonymousIndividual() {
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousIndividual(AnonymousIndividual newAnonymousIndividual) {
		AnonymousIndividual oldAnonymousIndividual = anonymousIndividual;
		anonymousIndividual = newAnonymousIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL, oldAnonymousIndividual, anonymousIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnonymousIndiviudalAnnotations() {
		if (anonymousIndiviudalAnnotations == null) {
			anonymousIndiviudalAnnotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS);
		}
		return anonymousIndiviudalAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
				if (resolve) return getAnonymousIndividual();
				return basicGetAnonymousIndividual();
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
				return getAnonymousIndiviudalAnnotations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividual)newValue);
				return;
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
				getAnonymousIndiviudalAnnotations().clear();
				getAnonymousIndiviudalAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
				setAnonymousIndividual((AnonymousIndividual)null);
				return;
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
				getAnonymousIndiviudalAnnotations().clear();
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
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
				return anonymousIndividual != null;
			case OwlPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
				return anonymousIndiviudalAnnotations != null && !anonymousIndiviudalAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnonymousIndividualAnnotationImpl
