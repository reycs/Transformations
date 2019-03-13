/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.ClassExpression;
import owl.DataPropertyDomain;
import owl.DataPropertyExpression;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DataPropertyDomainImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link owl.impl.DataPropertyDomainImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPropertyDomainImpl extends DataPropertyAxiomImpl implements DataPropertyDomain {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected ClassExpression domain;

	/**
	 * The cached value of the '{@link #getDataPropertyExpression() <em>Data Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyExpression()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyExpression dataPropertyExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATA_PROPERTY_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (ClassExpression)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_PROPERTY_DOMAIN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExpression basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(ClassExpression newDomain) {
		ClassExpression oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_DOMAIN__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression getDataPropertyExpression() {
		if (dataPropertyExpression != null && dataPropertyExpression.eIsProxy()) {
			InternalEObject oldDataPropertyExpression = (InternalEObject)dataPropertyExpression;
			dataPropertyExpression = (DataPropertyExpression)eResolveProxy(oldDataPropertyExpression);
			if (dataPropertyExpression != oldDataPropertyExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, dataPropertyExpression));
			}
		}
		return dataPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyExpression basicGetDataPropertyExpression() {
		return dataPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPropertyExpression(DataPropertyExpression newDataPropertyExpression) {
		DataPropertyExpression oldDataPropertyExpression = dataPropertyExpression;
		dataPropertyExpression = newDataPropertyExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, dataPropertyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DATA_PROPERTY_DOMAIN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case OwlPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION:
				if (resolve) return getDataPropertyExpression();
				return basicGetDataPropertyExpression();
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
			case OwlPackage.DATA_PROPERTY_DOMAIN__DOMAIN:
				setDomain((ClassExpression)newValue);
				return;
			case OwlPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION:
				setDataPropertyExpression((DataPropertyExpression)newValue);
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
			case OwlPackage.DATA_PROPERTY_DOMAIN__DOMAIN:
				setDomain((ClassExpression)null);
				return;
			case OwlPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION:
				setDataPropertyExpression((DataPropertyExpression)null);
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
			case OwlPackage.DATA_PROPERTY_DOMAIN__DOMAIN:
				return domain != null;
			case OwlPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION:
				return dataPropertyExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //DataPropertyDomainImpl
