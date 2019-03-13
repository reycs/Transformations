/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import owl.FullURI;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full URI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.FullURIImpl#getIri <em>Iri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullURIImpl extends MinimalEObjectImpl.Container implements FullURI {
	/**
	 * The default value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected static final String IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected String iri = IRI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullURIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.FULL_URI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIri() {
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIri(String newIri) {
		String oldIri = iri;
		iri = newIri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FULL_URI__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.FULL_URI__IRI:
				return getIri();
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
			case OwlPackage.FULL_URI__IRI:
				setIri((String)newValue);
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
			case OwlPackage.FULL_URI__IRI:
				setIri(IRI_EDEFAULT);
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
			case OwlPackage.FULL_URI__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
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
		result.append(" (iri: ");
		result.append(iri);
		result.append(')');
		return result.toString();
	}

} //FullURIImpl
