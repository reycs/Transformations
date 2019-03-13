/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation By Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.AnnotationByEntity#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnnotationByEntity()
 * @model
 * @generated
 */
public interface AnnotationByEntity extends Annotation {
	/**
	 * Returns the value of the '<em><b>Annotation Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Value</em>' reference.
	 * @see #setAnnotationValue(Entity)
	 * @see owl.OwlPackage#getAnnotationByEntity_AnnotationValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Entity getAnnotationValue();

	/**
	 * Sets the value of the '{@link owl.AnnotationByEntity#getAnnotationValue <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Value</em>' reference.
	 * @see #getAnnotationValue()
	 * @generated
	 */
	void setAnnotationValue(Entity value);

} // AnnotationByEntity
