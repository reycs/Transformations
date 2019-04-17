/**
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import owl.OwlPackage;
import owl.SubObjectPropertyExpression;
import owl.SubObjectPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.SubObjectPropertyOfImpl#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}</li>
 *   <li>{@link owl.impl.SubObjectPropertyOfImpl#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubObjectPropertyOfImpl extends ObjectPropertyAxiomImpl implements SubObjectPropertyOf {
	/**
	 * The cached value of the '{@link #getSubObjectPropertyExpressions() <em>Sub Object Property Expressions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubObjectPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected SubObjectPropertyExpression subObjectPropertyExpressions;

	/**
	 * The cached value of the '{@link #getSuperObjectPropertyExpression() <em>Super Object Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperObjectPropertyExpression()
	 * @generated
	 * @ordered
	 */
	protected SubObjectPropertyExpression superObjectPropertyExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubObjectPropertyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.SUB_OBJECT_PROPERTY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyExpression getSuperObjectPropertyExpression() {
		if (superObjectPropertyExpression != null && superObjectPropertyExpression.eIsProxy()) {
			InternalEObject oldSuperObjectPropertyExpression = (InternalEObject)superObjectPropertyExpression;
			superObjectPropertyExpression = (SubObjectPropertyExpression)eResolveProxy(oldSuperObjectPropertyExpression);
			if (superObjectPropertyExpression != oldSuperObjectPropertyExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, oldSuperObjectPropertyExpression, superObjectPropertyExpression));
			}
		}
		return superObjectPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyExpression basicGetSuperObjectPropertyExpression() {
		return superObjectPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperObjectPropertyExpression(SubObjectPropertyExpression newSuperObjectPropertyExpression) {
		SubObjectPropertyExpression oldSuperObjectPropertyExpression = superObjectPropertyExpression;
		superObjectPropertyExpression = newSuperObjectPropertyExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, oldSuperObjectPropertyExpression, superObjectPropertyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyExpression getSubObjectPropertyExpressions() {
		if (subObjectPropertyExpressions != null && subObjectPropertyExpressions.eIsProxy()) {
			InternalEObject oldSubObjectPropertyExpressions = (InternalEObject)subObjectPropertyExpressions;
			subObjectPropertyExpressions = (SubObjectPropertyExpression)eResolveProxy(oldSubObjectPropertyExpressions);
			if (subObjectPropertyExpressions != oldSubObjectPropertyExpressions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS, oldSubObjectPropertyExpressions, subObjectPropertyExpressions));
			}
		}
		return subObjectPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyExpression basicGetSubObjectPropertyExpressions() {
		return subObjectPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubObjectPropertyExpressions(SubObjectPropertyExpression newSubObjectPropertyExpressions) {
		SubObjectPropertyExpression oldSubObjectPropertyExpressions = subObjectPropertyExpressions;
		subObjectPropertyExpressions = newSubObjectPropertyExpressions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS, oldSubObjectPropertyExpressions, subObjectPropertyExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
				if (resolve) return getSubObjectPropertyExpressions();
				return basicGetSubObjectPropertyExpressions();
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
				if (resolve) return getSuperObjectPropertyExpression();
				return basicGetSuperObjectPropertyExpression();
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
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
				setSubObjectPropertyExpressions((SubObjectPropertyExpression)newValue);
				return;
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
				setSuperObjectPropertyExpression((SubObjectPropertyExpression)newValue);
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
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
				setSubObjectPropertyExpressions((SubObjectPropertyExpression)null);
				return;
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
				setSuperObjectPropertyExpression((SubObjectPropertyExpression)null);
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
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
				return subObjectPropertyExpressions != null;
			case OwlPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
				return superObjectPropertyExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //SubObjectPropertyOfImpl
