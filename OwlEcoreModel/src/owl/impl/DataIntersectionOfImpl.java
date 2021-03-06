/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.DataIntersectionOf;
import owl.DataRange;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DataIntersectionOfImpl#getDataRanges <em>Data Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataIntersectionOfImpl extends DataRangeImpl implements DataIntersectionOf {
	/**
	 * The cached value of the '{@link #getDataRanges() <em>Data Ranges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRange> dataRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataIntersectionOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATA_INTERSECTION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRange> getDataRanges() {
		if (dataRanges == null) {
			dataRanges = new EObjectResolvingEList<DataRange>(DataRange.class, this, OwlPackage.DATA_INTERSECTION_OF__DATA_RANGES);
		}
		return dataRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DATA_INTERSECTION_OF__DATA_RANGES:
				return getDataRanges();
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
			case OwlPackage.DATA_INTERSECTION_OF__DATA_RANGES:
				getDataRanges().clear();
				getDataRanges().addAll((Collection<? extends DataRange>)newValue);
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
			case OwlPackage.DATA_INTERSECTION_OF__DATA_RANGES:
				getDataRanges().clear();
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
			case OwlPackage.DATA_INTERSECTION_OF__DATA_RANGES:
				return dataRanges != null && !dataRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataIntersectionOfImpl
