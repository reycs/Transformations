/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.ObjectPropertyExpression;
import owl.OwlPackage;
import owl.SymmetricObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symmetric Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.SymmetricObjectPropertyImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymmetricObjectPropertyImpl extends ObjectPropertyAxiomImpl implements SymmetricObjectProperty {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymmetricObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.SYMMETRIC_OBJECT_PROPERTY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, objectPropertyExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, objectPropertyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION:
				if (resolve) return getObjectPropertyExpression();
				return basicGetObjectPropertyExpression();
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
			case OwlPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION:
				setObjectPropertyExpression((ObjectPropertyExpression)newValue);
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
			case OwlPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION:
				setObjectPropertyExpression((ObjectPropertyExpression)null);
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
			case OwlPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION:
				return objectPropertyExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //SymmetricObjectPropertyImpl
