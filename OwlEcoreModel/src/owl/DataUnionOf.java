/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Union Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DataUnionOf#getDataRanges <em>Data Ranges</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDataUnionOf()
 * @model
 * @generated
 */
public interface DataUnionOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Ranges</b></em>' reference list.
	 * The list contents are of type {@link owl.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Ranges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ranges</em>' reference list.
	 * @see owl.OwlPackage#getDataUnionOf_DataRanges()
	 * @model lower="2"
	 * @generated
	 */
	EList<DataRange> getDataRanges();

} // DataUnionOf
