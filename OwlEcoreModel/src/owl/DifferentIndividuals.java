/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DifferentIndividuals#getDifferentIndividuals <em>Different Individuals</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDifferentIndividuals()
 * @model
 * @generated
 */
public interface DifferentIndividuals extends Assertion {
	/**
	 * Returns the value of the '<em><b>Different Individuals</b></em>' reference list.
	 * The list contents are of type {@link owl.NamedIndividual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Different Individuals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Different Individuals</em>' reference list.
	 * @see owl.OwlPackage#getDifferentIndividuals_DifferentIndividuals()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<NamedIndividual> getDifferentIndividuals();

} // DifferentIndividuals
