/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DataOneOf#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDataOneOf()
 * @model
 * @generated
 */
public interface DataOneOf extends DataRange {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' reference list.
	 * The list contents are of type {@link owl.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' reference list.
	 * @see owl.OwlPackage#getDataOneOf_Constants()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Constant> getConstants();

} // DataOneOf