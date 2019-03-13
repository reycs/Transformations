/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}</li>
 *   <li>{@link owl.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getSubDataPropertyOf()
 * @model
 * @generated
 */
public interface SubDataPropertyOf extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Super Data Property Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Data Property Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Data Property Expression</em>' reference.
	 * @see #setSuperDataPropertyExpression(DataPropertyExpression)
	 * @see owl.OwlPackage#getSubDataPropertyOf_SuperDataPropertyExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataPropertyExpression getSuperDataPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Data Property Expression</em>' reference.
	 * @see #getSuperDataPropertyExpression()
	 * @generated
	 */
	void setSuperDataPropertyExpression(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Sub Data Property Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Data Property Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Data Property Expression</em>' reference.
	 * @see #setSubDataPropertyExpression(DataPropertyExpression)
	 * @see owl.OwlPackage#getSubDataPropertyOf_SubDataPropertyExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataPropertyExpression getSubDataPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Data Property Expression</em>' reference.
	 * @see #getSubDataPropertyExpression()
	 * @generated
	 */
	void setSubDataPropertyExpression(DataPropertyExpression value);

} // SubDataPropertyOf
