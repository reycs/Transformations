/**
 */
package owl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.Entity#getEntityURI <em>Entity URI</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity URI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity URI</em>' reference.
	 * @see #setEntityURI(URI)
	 * @see owl.OwlPackage#getEntity_EntityURI()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	URI getEntityURI();

	/**
	 * Sets the value of the '{@link owl.Entity#getEntityURI <em>Entity URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity URI</em>' reference.
	 * @see #getEntityURI()
	 * @generated
	 */
	void setEntityURI(URI value);

} // Entity
