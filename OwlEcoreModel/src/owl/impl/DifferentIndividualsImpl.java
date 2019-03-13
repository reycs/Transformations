/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.DifferentIndividuals;
import owl.NamedIndividual;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.DifferentIndividualsImpl#getDifferentIndividuals <em>Different Individuals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifferentIndividualsImpl extends AssertionImpl implements DifferentIndividuals {
	/**
	 * The cached value of the '{@link #getDifferentIndividuals() <em>Different Individuals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferentIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedIndividual> differentIndividuals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferentIndividualsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DIFFERENT_INDIVIDUALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedIndividual> getDifferentIndividuals() {
		if (differentIndividuals == null) {
			differentIndividuals = new EObjectResolvingEList<NamedIndividual>(NamedIndividual.class, this, OwlPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS);
		}
		return differentIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
				return getDifferentIndividuals();
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
			case OwlPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
				getDifferentIndividuals().clear();
				getDifferentIndividuals().addAll((Collection<? extends NamedIndividual>)newValue);
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
			case OwlPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
				getDifferentIndividuals().clear();
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
			case OwlPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
				return differentIndividuals != null && !differentIndividuals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DifferentIndividualsImpl
