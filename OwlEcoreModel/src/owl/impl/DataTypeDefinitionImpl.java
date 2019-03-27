/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.DataRange;
import owl.DataTypeDefinition;
import owl.Datatype;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DataTypeDefinitionImpl#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link owl.impl.DataTypeDefinitionImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeDefinitionImpl extends AxiomImpl implements DataTypeDefinition {
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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Datatype dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATA_TYPE_DEFINITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_TYPE_DEFINITION__DATA_RANGE, oldDataRange, dataRange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_TYPE_DEFINITION__DATA_RANGE, oldDataRange, dataRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (Datatype)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_TYPE_DEFINITION__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(Datatype newDataType) {
		Datatype oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_TYPE_DEFINITION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_RANGE:
				if (resolve) return getDataRange();
				return basicGetDataRange();
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_RANGE:
				setDataRange((DataRange)newValue);
				return;
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_TYPE:
				setDataType((Datatype)newValue);
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
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_RANGE:
				setDataRange((DataRange)null);
				return;
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_TYPE:
				setDataType((Datatype)null);
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
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_RANGE:
				return dataRange != null;
			case OwlPackage.DATA_TYPE_DEFINITION__DATA_TYPE:
				return dataType != null;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeDefinitionImpl
