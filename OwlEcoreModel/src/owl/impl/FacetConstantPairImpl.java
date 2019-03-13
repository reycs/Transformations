/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import owl.Constant;
import owl.FacetConstantPair;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Constant Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.FacetConstantPairImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link owl.impl.FacetConstantPairImpl#getFacet <em>Facet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetConstantPairImpl extends MinimalEObjectImpl.Container implements FacetConstantPair {
	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant constant;

	/**
	 * The default value of the '{@link #getFacet() <em>Facet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacet()
	 * @generated
	 * @ordered
	 */
	protected static final String FACET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacet() <em>Facet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacet()
	 * @generated
	 * @ordered
	 */
	protected String facet = FACET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetConstantPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.FACET_CONSTANT_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getConstant() {
		if (constant != null && constant.eIsProxy()) {
			InternalEObject oldConstant = (InternalEObject)constant;
			constant = (Constant)eResolveProxy(oldConstant);
			if (constant != oldConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.FACET_CONSTANT_PAIR__CONSTANT, oldConstant, constant));
			}
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(Constant newConstant) {
		Constant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_CONSTANT_PAIR__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFacet() {
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacet(String newFacet) {
		String oldFacet = facet;
		facet = newFacet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_CONSTANT_PAIR__FACET, oldFacet, facet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.FACET_CONSTANT_PAIR__CONSTANT:
				if (resolve) return getConstant();
				return basicGetConstant();
			case OwlPackage.FACET_CONSTANT_PAIR__FACET:
				return getFacet();
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
			case OwlPackage.FACET_CONSTANT_PAIR__CONSTANT:
				setConstant((Constant)newValue);
				return;
			case OwlPackage.FACET_CONSTANT_PAIR__FACET:
				setFacet((String)newValue);
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
			case OwlPackage.FACET_CONSTANT_PAIR__CONSTANT:
				setConstant((Constant)null);
				return;
			case OwlPackage.FACET_CONSTANT_PAIR__FACET:
				setFacet(FACET_EDEFAULT);
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
			case OwlPackage.FACET_CONSTANT_PAIR__CONSTANT:
				return constant != null;
			case OwlPackage.FACET_CONSTANT_PAIR__FACET:
				return FACET_EDEFAULT == null ? facet != null : !FACET_EDEFAULT.equals(facet);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (facet: ");
		result.append(facet);
		result.append(')');
		return result.toString();
	}

} //FacetConstantPairImpl
