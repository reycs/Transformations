/**
 */
package owl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.Annotation#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link owl.Annotation#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
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
	 * @see owl.OwlPackage#getAnnotation_AnnotationProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnnotationProperty getAnnotationProperty();

	/**
	 * Sets the value of the '{@link owl.Annotation#getAnnotationProperty <em>Annotation Property</em>}' reference.
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
	 * @see owl.OwlPackage#getAnnotation_AnnotationValue()
	 * @model required="true"
	 * @generated
	 */
	AnnotationValue getAnnotationValue();

	/**
	 * Sets the value of the '{@link owl.Annotation#getAnnotationValue <em>Annotation Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Value</em>' reference.
	 * @see #getAnnotationValue()
	 * @generated
	 */
	void setAnnotationValue(AnnotationValue value);

} // Annotation
