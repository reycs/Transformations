/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.DataPropertyExpression;
import owl.Individual;
import owl.Literal;
import owl.NegativeDataPropertyAssertion;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.NegativeDataPropertyAssertionImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link owl.impl.NegativeDataPropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link owl.impl.NegativeDataPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegativeDataPropertyAssertionImpl extends AssertionImpl implements NegativeDataPropertyAssertion {
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
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected Literal targetValue;

	/**
	 * The cached value of the '{@link #getSourceIndividual() <em>Source Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual sourceIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeDataPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.NEGATIVE_DATA_PROPERTY_ASSERTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, dataPropertyExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, dataPropertyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getTargetValue() {
		if (targetValue != null && targetValue.eIsProxy()) {
			InternalEObject oldTargetValue = (InternalEObject)targetValue;
			targetValue = (Literal)eResolveProxy(oldTargetValue);
			if (targetValue != oldTargetValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, targetValue));
			}
		}
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(Literal newTargetValue) {
		Literal oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getSourceIndividual() {
		if (sourceIndividual != null && sourceIndividual.eIsProxy()) {
			InternalEObject oldSourceIndividual = (InternalEObject)sourceIndividual;
			sourceIndividual = (Individual)eResolveProxy(oldSourceIndividual);
			if (sourceIndividual != oldSourceIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, sourceIndividual));
			}
		}
		return sourceIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetSourceIndividual() {
		return sourceIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIndividual(Individual newSourceIndividual) {
		Individual oldSourceIndividual = sourceIndividual;
		sourceIndividual = newSourceIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, sourceIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
				if (resolve) return getDataPropertyExpression();
				return basicGetDataPropertyExpression();
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				if (resolve) return getTargetValue();
				return basicGetTargetValue();
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				if (resolve) return getSourceIndividual();
				return basicGetSourceIndividual();
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
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
				setDataPropertyExpression((DataPropertyExpression)newValue);
				return;
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Literal)newValue);
				return;
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)newValue);
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
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
				setDataPropertyExpression((DataPropertyExpression)null);
				return;
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				setTargetValue((Literal)null);
				return;
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)null);
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
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
				return dataPropertyExpression != null;
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE:
				return targetValue != null;
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return sourceIndividual != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativeDataPropertyAssertionImpl
