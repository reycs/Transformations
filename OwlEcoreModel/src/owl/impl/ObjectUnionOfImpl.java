/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.ClassExpression;
import owl.ObjectUnionOf;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Union Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.ObjectUnionOfImpl#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectUnionOfImpl extends ClassExpressionImpl implements ObjectUnionOf {
	/**
	 * The cached value of the '{@link #getClassExpressions() <em>Class Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> classExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectUnionOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OBJECT_UNION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getClassExpressions() {
		if (classExpressions == null) {
			classExpressions = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, OwlPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS);
		}
		return classExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS:
				return getClassExpressions();
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
			case OwlPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS:
				getClassExpressions().clear();
				getClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OwlPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS:
				getClassExpressions().clear();
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
			case OwlPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS:
				return classExpressions != null && !classExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectUnionOfImpl
