/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.SameIndividual#getSameIndividuals <em>Same Individuals</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getSameIndividual()
 * @model
 * @generated
 */
public interface SameIndividual extends Assertion {
	/**
	 * Returns the value of the '<em><b>Same Individuals</b></em>' reference list.
	 * The list contents are of type {@link owl.NamedIndividual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Individuals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Individuals</em>' reference list.
	 * @see owl.OwlPackage#getSameIndividual_SameIndividuals()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<NamedIndividual> getSameIndividuals();

} // SameIndividual
