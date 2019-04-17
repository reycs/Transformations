/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.ObjectPropertyChain;
import owl.ObjectPropertyExpression;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.ObjectPropertyChainImpl#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectPropertyChainImpl extends SubObjectPropertyExpressionImpl implements ObjectPropertyChain {
	/**
	 * The cached value of the '{@link #getObjectPropertyExpressions() <em>Object Property Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyExpression> objectPropertyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OBJECT_PROPERTY_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyExpression> getObjectPropertyExpressions() {
		if (objectPropertyExpressions == null) {
			objectPropertyExpressions = new EObjectResolvingEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, OwlPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS);
		}
		return objectPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS:
				return getObjectPropertyExpressions();
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
			case OwlPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS:
				getObjectPropertyExpressions().clear();
				getObjectPropertyExpressions().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
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
			case OwlPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS:
				getObjectPropertyExpressions().clear();
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
			case OwlPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS:
				return objectPropertyExpressions != null && !objectPropertyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectPropertyChainImpl
