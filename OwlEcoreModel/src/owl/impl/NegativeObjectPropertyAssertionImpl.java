/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.Individual;
import owl.NegativeObjectPropertyAssertion;
import owl.ObjectPropertyExpression;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.NegativeObjectPropertyAssertionImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link owl.impl.NegativeObjectPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link owl.impl.NegativeObjectPropertyAssertionImpl#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegativeObjectPropertyAssertionImpl extends AssertionImpl implements NegativeObjectPropertyAssertion {
	/**
	 * The cached value of the '{@link #getObjectPropertyExpression() <em>Object Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyExpression()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression objectPropertyExpression;

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
	 * The cached value of the '{@link #getTargetIndividual() <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIndividual()
	 * @generated
	 * @ordered
	 */
	protected Individual targetIndividual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeObjectPropertyAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.NEGATIVE_OBJECT_PROPERTY_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getObjectPropertyExpression() {
		if (objectPropertyExpression != null && objectPropertyExpression.eIsProxy()) {
			InternalEObject oldObjectPropertyExpression = (InternalEObject)objectPropertyExpression;
			objectPropertyExpression = (ObjectPropertyExpression)eResolveProxy(oldObjectPropertyExpression);
			if (objectPropertyExpression != oldObjectPropertyExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, objectPropertyExpression));
			}
		}
		return objectPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression basicGetObjectPropertyExpression() {
		return objectPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression) {
		ObjectPropertyExpression oldObjectPropertyExpression = objectPropertyExpression;
		objectPropertyExpression = newObjectPropertyExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, objectPropertyExpression));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, sourceIndividual));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, sourceIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getTargetIndividual() {
		if (targetIndividual != null && targetIndividual.eIsProxy()) {
			InternalEObject oldTargetIndividual = (InternalEObject)targetIndividual;
			targetIndividual = (Individual)eResolveProxy(oldTargetIndividual);
			if (targetIndividual != oldTargetIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, targetIndividual));
			}
		}
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetTargetIndividual() {
		return targetIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIndividual(Individual newTargetIndividual) {
		Individual oldTargetIndividual = targetIndividual;
		targetIndividual = newTargetIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, targetIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
				if (resolve) return getObjectPropertyExpression();
				return basicGetObjectPropertyExpression();
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				if (resolve) return getSourceIndividual();
				return basicGetSourceIndividual();
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				if (resolve) return getTargetIndividual();
				return basicGetTargetIndividual();
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
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
				setObjectPropertyExpression((ObjectPropertyExpression)newValue);
				return;
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)newValue);
				return;
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Individual)newValue);
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
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
				setObjectPropertyExpression((ObjectPropertyExpression)null);
				return;
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				setSourceIndividual((Individual)null);
				return;
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				setTargetIndividual((Individual)null);
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
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
				return objectPropertyExpression != null;
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
				return sourceIndividual != null;
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
				return targetIndividual != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativeObjectPropertyAssertionImpl
