/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.DataPropertyExpression;
import owl.DisjointDataProperties;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Data Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DisjointDataPropertiesImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisjointDataPropertiesImpl extends DataPropertyAxiomImpl implements DisjointDataProperties {
	/**
	 * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPropertyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyExpression> dataPropertyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjointDataPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DISJOINT_DATA_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyExpression> getDataPropertyExpressions() {
		if (dataPropertyExpressions == null) {
			dataPropertyExpressions = new EObjectResolvingEList<DataPropertyExpression>(DataPropertyExpression.class, this, OwlPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);
		}
		return dataPropertyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
				return getDataPropertyExpressions();
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
			case OwlPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
				getDataPropertyExpressions().clear();
				getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
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
			case OwlPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
				getDataPropertyExpressions().clear();
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
			case OwlPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
				return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisjointDataPropertiesImpl
