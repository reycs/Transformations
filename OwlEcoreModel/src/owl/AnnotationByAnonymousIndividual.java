/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation By Anonymous Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.AnnotationByAnonymousIndividual#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnnotationByAnonymousIndividual()
 * @model
 * @generated
 */
public interface AnnotationByAnonymousIndividual extends Annotation {
	/**
	 * Returns the value of the '<em><b>Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Value</em>' reference.
	 * @see #setAnnotationValue(AnonymousIndividual)
	 * @see owl.OwlPackage#getAnnotationByAnonymousIndividual_AnnotationValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnonymousIndividual getAnnotationValue();

	/**
	 * Sets the value of the '{@link owl.AnnotationByAnonymousIndividual#getAnnotationValue <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Value</em>' reference.
	 * @see #getAnnotationValue()
	 * @generated
	 */
	void setAnnotationValue(AnonymousIndividual value);

} // AnnotationByAnonymousIndividual
