/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import owl.FacetLiteralPair;
import owl.Literal;
import owl.OwlPackage;
import owl.URI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Literal Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.FacetLiteralPairImpl#getRestrictionValue <em>Restriction Value</em>}</li>
 *   <li>{@link owl.impl.FacetLiteralPairImpl#getConstrainingFacet <em>Constraining Facet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetLiteralPairImpl extends MinimalEObjectImpl.Container implements FacetLiteralPair {
	/**
	 * The cached value of the '{@link #getRestrictionValue() <em>Restriction Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionValue()
	 * @generated
	 * @ordered
	 */
	protected Literal restrictionValue;

	/**
	 * The cached value of the '{@link #getConstrainingFacet() <em>Constraining Facet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingFacet()
	 * @generated
	 * @ordered
	 */
	protected URI constrainingFacet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetLiteralPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.FACET_LITERAL_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getRestrictionValue() {
		if (restrictionValue != null && restrictionValue.eIsProxy()) {
			InternalEObject oldRestrictionValue = (InternalEObject)restrictionValue;
			restrictionValue = (Literal)eResolveProxy(oldRestrictionValue);
			if (restrictionValue != oldRestrictionValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.FACET_LITERAL_PAIR__RESTRICTION_VALUE, oldRestrictionValue, restrictionValue));
			}
		}
		return restrictionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetRestrictionValue() {
		return restrictionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionValue(Literal newRestrictionValue) {
		Literal oldRestrictionValue = restrictionValue;
		restrictionValue = newRestrictionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_LITERAL_PAIR__RESTRICTION_VALUE, oldRestrictionValue, restrictionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getConstrainingFacet() {
		if (constrainingFacet != null && constrainingFacet.eIsProxy()) {
			InternalEObject oldConstrainingFacet = (InternalEObject)constrainingFacet;
			constrainingFacet = (URI)eResolveProxy(oldConstrainingFacet);
			if (constrainingFacet != oldConstrainingFacet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.FACET_LITERAL_PAIR__CONSTRAINING_FACET, oldConstrainingFacet, constrainingFacet));
			}
		}
		return constrainingFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI basicGetConstrainingFacet() {
		return constrainingFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingFacet(URI newConstrainingFacet) {
		URI oldConstrainingFacet = constrainingFacet;
		constrainingFacet = newConstrainingFacet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_LITERAL_PAIR__CONSTRAINING_FACET, oldConstrainingFacet, constrainingFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.FACET_LITERAL_PAIR__RESTRICTION_VALUE:
				if (resolve) return getRestrictionValue();
				return basicGetRestrictionValue();
			case OwlPackage.FACET_LITERAL_PAIR__CONSTRAINING_FACET:
				if (resolve) return getConstrainingFacet();
				return basicGetConstrainingFacet();
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
			case OwlPackage.FACET_LITERAL_PAIR__RESTRICTION_VALUE:
				setRestrictionValue((Literal)newValue);
				return;
			case OwlPackage.FACET_LITERAL_PAIR__CONSTRAINING_FACET:
				setConstrainingFacet((URI)newValue);
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
			case OwlPackage.FACET_LITERAL_PAIR__RESTRICTION_VALUE:
				setRestrictionValue((Literal)null);
				return;
			case OwlPackage.FACET_LITERAL_PAIR__CONSTRAINING_FACET:
				setConstrainingFacet((URI)null);
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
			case OwlPackage.FACET_LITERAL_PAIR__RESTRICTION_VALUE:
				return restrictionValue != null;
			case OwlPackage.FACET_LITERAL_PAIR__CONSTRAINING_FACET:
				return constrainingFacet != null;
		}
		return super.eIsSet(featureID);
	}

} //FacetLiteralPairImpl
