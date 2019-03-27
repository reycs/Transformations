/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.AnnotationAssertion#getAnnotationSubject <em>Annotation Subject</em>}</li>
 *   <li>{@link owl.AnnotationAssertion#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link owl.AnnotationAssertion#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnnotationAssertion()
 * @model
 * @generated
 */
public interface AnnotationAssertion extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Annotation Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Subject</em>' reference.
	 * @see #setAnnotationSubject(AnnotationSubject)
	 * @see owl.OwlPackage#getAnnotationAssertion_AnnotationSubject()
	 * @model required="true"
	 * @generated
	 */
	AnnotationSubject getAnnotationSubject();

	/**
	 * Sets the value of the '{@link owl.AnnotationAssertion#getAnnotationSubject <em>Annotation Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Subject</em>' reference.
	 * @see #getAnnotationSubject()
	 * @generated
	 */
	void setAnnotationSubject(AnnotationSubject value);

	/**
	 * Returns the value of the '<em><b>Annotation Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Property</em>' reference.
	 * @see #setAnnotationProperty(AnnotationProperty)
	 * @see owl.OwlPackage#getAnnotationAssertion_AnnotationProperty()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getAnnotationProperty();

	/**
	 * Sets the value of the '{@link owl.AnnotationAssertion#getAnnotationProperty <em>Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Property</em>' reference.
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	void setAnnotationProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Value</em>' reference.
	 * @see #setAnnotationValue(AnnotationValue)
	 * @see owl.OwlPackage#getAnnotationAssertion_AnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	AnnotationValue getAnnotationValue();

	/**
	 * Sets the value of the '{@link owl.AnnotationAssertion#getAnnotationValue <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Value</em>' reference.
	 * @see #getAnnotationValue()
	 * @generated
	 */
	void setAnnotationValue(AnnotationValue value);

} // AnnotationAssertion
