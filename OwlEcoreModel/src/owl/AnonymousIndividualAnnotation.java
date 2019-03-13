/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Individual Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.AnonymousIndividualAnnotation#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 *   <li>{@link owl.AnonymousIndividualAnnotation#getAnonymousIndiviudalAnnotations <em>Anonymous Indiviudal Annotations</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnonymousIndividualAnnotation()
 * @model
 * @generated
 */
public interface AnonymousIndividualAnnotation extends Axiom {
	/**
	 * Returns the value of the '<em><b>Anonymous Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Individual</em>' reference.
	 * @see #setAnonymousIndividual(AnonymousIndividual)
	 * @see owl.OwlPackage#getAnonymousIndividualAnnotation_AnonymousIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnonymousIndividual getAnonymousIndividual();

	/**
	 * Sets the value of the '{@link owl.AnonymousIndividualAnnotation#getAnonymousIndividual <em>Anonymous Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Individual</em>' reference.
	 * @see #getAnonymousIndividual()
	 * @generated
	 */
	void setAnonymousIndividual(AnonymousIndividual value);

	/**
	 * Returns the value of the '<em><b>Anonymous Indiviudal Annotations</b></em>' reference list.
	 * The list contents are of type {@link owl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Indiviudal Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Indiviudal Annotations</em>' reference list.
	 * @see owl.OwlPackage#getAnonymousIndividualAnnotation_AnonymousIndiviudalAnnotations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Annotation> getAnonymousIndiviudalAnnotations();

} // AnonymousIndividualAnnotation
