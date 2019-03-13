/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.NamedIndividual;
import owl.OwlPackage;
import owl.SameIndividual;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.SameIndividualImpl#getSameIndividuals <em>Same Individuals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SameIndividualImpl extends AssertionImpl implements SameIndividual {
	/**
	 * The cached value of the '{@link #getSameIndividuals() <em>Same Individuals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedIndividual> sameIndividuals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SameIndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.SAME_INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedIndividual> getSameIndividuals() {
		if (sameIndividuals == null) {
			sameIndividuals = new EObjectResolvingEList<NamedIndividual>(NamedIndividual.class, this, OwlPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS);
		}
		return sameIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
				return getSameIndividuals();
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
			case OwlPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
				getSameIndividuals().clear();
				getSameIndividuals().addAll((Collection<? extends NamedIndividual>)newValue);
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
			case OwlPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
				getSameIndividuals().clear();
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
			case OwlPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
				return sameIndividuals != null && !sameIndividuals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SameIndividualImpl
