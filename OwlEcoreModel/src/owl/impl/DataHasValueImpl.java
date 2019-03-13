/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.Constant;
import owl.DataHasValue;
import owl.DataPropertyExpression;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DataHasValueImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link owl.impl.DataHasValueImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataHasValueImpl extends ClassExpressionImpl implements DataHasValue {
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
	protected DataHasValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATA_HAS_VALUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_HAS_VALUE__CONSTANT, oldConstant, constant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_HAS_VALUE__CONSTANT, oldConstant, constant));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, dataPropertyExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, dataPropertyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DATA_HAS_VALUE__CONSTANT:
				if (resolve) return getConstant();
				return basicGetConstant();
			case OwlPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
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
			case OwlPackage.DATA_HAS_VALUE__CONSTANT:
				setConstant((Constant)newValue);
				return;
			case OwlPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
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
			case OwlPackage.DATA_HAS_VALUE__CONSTANT:
				setConstant((Constant)null);
				return;
			case OwlPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
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
			case OwlPackage.DATA_HAS_VALUE__CONSTANT:
				return constant != null;
			case OwlPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
				return dataPropertyExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //DataHasValueImpl
