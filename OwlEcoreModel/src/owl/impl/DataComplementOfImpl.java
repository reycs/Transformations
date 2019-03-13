/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.DataComplementOf;
import owl.DataRange;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Complement Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DataComplementOfImpl#getDataRange <em>Data Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataComplementOfImpl extends DataRangeImpl implements DataComplementOf {
	/**
	 * The cached value of the '{@link #getDataRange() <em>Data Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRange()
	 * @generated
	 * @ordered
	 */
	protected DataRange dataRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataComplementOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATA_COMPLEMENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getDataRange() {
		if (dataRange != null && dataRange.eIsProxy()) {
			InternalEObject oldDataRange = (InternalEObject)dataRange;
			dataRange = (DataRange)eResolveProxy(oldDataRange);
			if (dataRange != oldDataRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_COMPLEMENT_OF__DATA_RANGE, oldDataRange, dataRange));
			}
		}
		return dataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange basicGetDataRange() {
		return dataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRange(DataRange newDataRange) {
		DataRange oldDataRange = dataRange;
		dataRange = newDataRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_COMPLEMENT_OF__DATA_RANGE, oldDataRange, dataRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DATA_COMPLEMENT_OF__DATA_RANGE:
				if (resolve) return getDataRange();
				return basicGetDataRange();
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
			case OwlPackage.DATA_COMPLEMENT_OF__DATA_RANGE:
				setDataRange((DataRange)newValue);
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
			case OwlPackage.DATA_COMPLEMENT_OF__DATA_RANGE:
				setDataRange((DataRange)null);
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
			case OwlPackage.DATA_COMPLEMENT_OF__DATA_RANGE:
				return dataRange != null;
		}
		return super.eIsSet(featureID);
	}

} //DataComplementOfImpl
