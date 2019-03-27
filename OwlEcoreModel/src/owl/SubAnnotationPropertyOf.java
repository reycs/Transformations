/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}</li>
 *   <li>{@link owl.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getSubAnnotationPropertyOf()
 * @model
 * @generated
 */
public interface SubAnnotationPropertyOf extends AnnotationAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Annotation Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Annotation Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Annotation Property</em>' reference.
	 * @see #setSubAnnotationProperty(AnnotationProperty)
	 * @see owl.OwlPackage#getSubAnnotationPropertyOf_SubAnnotationProperty()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getSubAnnotationProperty();

	/**
	 * Sets the value of the '{@link owl.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Annotation Property</em>' reference.
	 * @see #getSubAnnotationProperty()
	 * @generated
	 */
	void setSubAnnotationProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Super Annotation Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Annotation Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Annotation Property</em>' reference.
	 * @see #setSuperAnnotationProperty(AnnotationProperty)
	 * @see owl.OwlPackage#getSubAnnotationPropertyOf_SuperAnnotationProperty()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getSuperAnnotationProperty();

	/**
	 * Sets the value of the '{@link owl.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Annotation Property</em>' reference.
	 * @see #getSuperAnnotationProperty()
	 * @generated
	 */
	void setSuperAnnotationProperty(AnnotationProperty value);

} // SubAnnotationPropertyOf
