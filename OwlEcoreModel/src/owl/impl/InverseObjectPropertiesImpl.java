/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import owl.InverseObjectProperties;
import owl.ObjectPropertyExpression;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.InverseObjectPropertiesImpl#getFirstProperty <em>First Property</em>}</li>
 *   <li>{@link owl.impl.InverseObjectPropertiesImpl#getSecondProperty <em>Second Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InverseObjectPropertiesImpl extends ObjectPropertyAxiomImpl implements InverseObjectProperties {
	/**
	 * The cached value of the '{@link #getFirstProperty() <em>First Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression firstProperty;
	/**
	 * The cached value of the '{@link #getSecondProperty() <em>Second Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondProperty()
	 * @generated
	 * @ordered
	 */
	protected ObjectPropertyExpression secondProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverseObjectPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.INVERSE_OBJECT_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getFirstProperty() {
		if (firstProperty != null && firstProperty.eIsProxy()) {
			InternalEObject oldFirstProperty = (InternalEObject)firstProperty;
			firstProperty = (ObjectPropertyExpression)eResolveProxy(oldFirstProperty);
			if (firstProperty != oldFirstProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.INVERSE_OBJECT_PROPERTIES__FIRST_PROPERTY, oldFirstProperty, firstProperty));
			}
		}
		return firstProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression basicGetFirstProperty() {
		return firstProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstProperty(ObjectPropertyExpression newFirstProperty) {
		ObjectPropertyExpression oldFirstProperty = firstProperty;
		firstProperty = newFirstProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.INVERSE_OBJECT_PROPERTIES__FIRST_PROPERTY, oldFirstProperty, firstProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression getSecondProperty() {
		if (secondProperty != null && secondProperty.eIsProxy()) {
			InternalEObject oldSecondProperty = (InternalEObject)secondProperty;
			secondProperty = (ObjectPropertyExpression)eResolveProxy(oldSecondProperty);
			if (secondProperty != oldSecondProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.INVERSE_OBJECT_PROPERTIES__SECOND_PROPERTY, oldSecondProperty, secondProperty));
			}
		}
		return secondProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyExpression basicGetSecondProperty() {
		return secondProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondProperty(ObjectPropertyExpression newSecondProperty) {
		ObjectPropertyExpression oldSecondProperty = secondProperty;
		secondProperty = newSecondProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.INVERSE_OBJECT_PROPERTIES__SECOND_PROPERTY, oldSecondProperty, secondProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__FIRST_PROPERTY:
				if (resolve) return getFirstProperty();
				return basicGetFirstProperty();
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__SECOND_PROPERTY:
				if (resolve) return getSecondProperty();
				return basicGetSecondProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__FIRST_PROPERTY:
				setFirstProperty((ObjectPropertyExpression)newValue);
				return;
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__SECOND_PROPERTY:
				setSecondProperty((ObjectPropertyExpression)newValue);
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
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__FIRST_PROPERTY:
				setFirstProperty((ObjectPropertyExpression)null);
				return;
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__SECOND_PROPERTY:
				setSecondProperty((ObjectPropertyExpression)null);
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
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__FIRST_PROPERTY:
				return firstProperty != null;
			case OwlPackage.INVERSE_OBJECT_PROPERTIES__SECOND_PROPERTY:
				return secondProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //InverseObjectPropertiesImpl
