/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link owl.AnnotationPropertyDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnnotationPropertyDomain()
 * @model
 * @generated
 */
public interface AnnotationPropertyDomain extends AnnotationAxiom {
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
	 * @see owl.OwlPackage#getAnnotationPropertyDomain_AnnotationProperty()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getAnnotationProperty();

	/**
	 * Sets the value of the '{@link owl.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Property</em>' reference.
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	void setAnnotationProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(URI)
	 * @see owl.OwlPackage#getAnnotationPropertyDomain_Domain()
	 * @model required="true"
	 * @generated
	 */
	URI getDomain();

	/**
	 * Sets the value of the '{@link owl.AnnotationPropertyDomain#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(URI value);

} // AnnotationPropertyDomain
