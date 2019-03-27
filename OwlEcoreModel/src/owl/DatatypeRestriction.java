/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DatatypeRestriction#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link owl.DatatypeRestriction#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDatatypeRestriction()
 * @model
 * @generated
 */
public interface DatatypeRestriction extends DataRange {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(Datatype)
	 * @see owl.OwlPackage#getDatatypeRestriction_Datatype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link owl.DatatypeRestriction#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' reference list.
	 * The list contents are of type {@link owl.FacetLiteralPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' reference list.
	 * @see owl.OwlPackage#getDatatypeRestriction_Restrictions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FacetLiteralPair> getRestrictions();

} // DatatypeRestriction
