/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.Axiom#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAxiom()
 * @model abstract="true"
 * @generated
 */
public interface Axiom extends EObject {
	/**
	 * Returns the value of the '<em><b>Axiom Annotations</b></em>' reference list.
	 * The list contents are of type {@link owl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axiom Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axiom Annotations</em>' reference list.
	 * @see owl.OwlPackage#getAxiom_AxiomAnnotations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Annotation> getAxiomAnnotations();

} // Axiom
