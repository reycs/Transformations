/**
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.Annotation;
import owl.Axiom;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.AxiomImpl#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AxiomImpl extends MinimalEObjectImpl.Container implements Axiom {
	/**
	 * The cached value of the '{@link #getAxiomAnnotations() <em>Axiom Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxiomAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> axiomAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAxiomAnnotations() {
		if (axiomAnnotations == null) {
			axiomAnnotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OwlPackage.AXIOM__AXIOM_ANNOTATIONS);
		}
		return axiomAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.AXIOM__AXIOM_ANNOTATIONS:
				return getAxiomAnnotations();
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
			case OwlPackage.AXIOM__AXIOM_ANNOTATIONS:
				getAxiomAnnotations().clear();
				getAxiomAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case OwlPackage.AXIOM__AXIOM_ANNOTATIONS:
				getAxiomAnnotations().clear();
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
			case OwlPackage.AXIOM__AXIOM_ANNOTATIONS:
				return axiomAnnotations != null && !axiomAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AxiomImpl
