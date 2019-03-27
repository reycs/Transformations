/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.AnnotationPropertyRange#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link owl.AnnotationPropertyRange#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnnotationPropertyRange()
 * @model
 * @generated
 */
public interface AnnotationPropertyRange extends AnnotationAxiom {
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
	 * @see owl.OwlPackage#getAnnotationPropertyRange_AnnotationProperty()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getAnnotationProperty();

	/**
	 * Sets the value of the '{@link owl.AnnotationPropertyRange#getAnnotationProperty <em>Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Property</em>' reference.
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	void setAnnotationProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(URI)
	 * @see owl.OwlPackage#getAnnotationPropertyRange_Range()
	 * @model required="true"
	 * @generated
	 */
	URI getRange();

	/**
	 * Sets the value of the '{@link owl.AnnotationPropertyRange#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(URI value);

} // AnnotationPropertyRange
