/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.InverseObjectProperties#getInverseObjectProperties <em>Inverse Object Properties</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getInverseObjectProperties()
 * @model
 * @generated
 */
public interface InverseObjectProperties extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Inverse Object Properties</b></em>' reference list.
	 * The list contents are of type {@link owl.ObjectPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Object Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Object Properties</em>' reference list.
	 * @see owl.OwlPackage#getInverseObjectProperties_InverseObjectProperties()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getInverseObjectProperties();

} // InverseObjectProperties
