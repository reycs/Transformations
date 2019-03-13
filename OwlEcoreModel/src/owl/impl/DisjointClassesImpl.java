/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.ClassExpression;
import owl.DisjointClasses;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DisjointClassesImpl#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisjointClassesImpl extends ClassAxiomImpl implements DisjointClasses {
	/**
	 * The cached value of the '{@link #getDisjointClassExpressions() <em>Disjoint Class Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointClassExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> disjointClassExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjointClassesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DISJOINT_CLASSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getDisjointClassExpressions() {
		if (disjointClassExpressions == null) {
			disjointClassExpressions = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, OwlPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS);
		}
		return disjointClassExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS:
				return getDisjointClassExpressions();
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
			case OwlPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS:
				getDisjointClassExpressions().clear();
				getDisjointClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
			case OwlPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS:
				getDisjointClassExpressions().clear();
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
			case OwlPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS:
				return disjointClassExpressions != null && !disjointClassExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisjointClassesImpl
