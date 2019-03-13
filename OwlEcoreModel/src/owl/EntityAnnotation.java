/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.EntityAnnotation#getEntity <em>Entity</em>}</li>
 *   <li>{@link owl.EntityAnnotation#getEntityAnnotations <em>Entity Annotations</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getEntityAnnotation()
 * @model
 * @generated
 */
public interface EntityAnnotation extends Axiom {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see owl.OwlPackage#getEntityAnnotation_Entity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link owl.EntityAnnotation#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Entity Annotations</b></em>' reference list.
	 * The list contents are of type {@link owl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Annotations</em>' reference list.
	 * @see owl.OwlPackage#getEntityAnnotation_EntityAnnotations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Annotation> getEntityAnnotations();

} // EntityAnnotation
