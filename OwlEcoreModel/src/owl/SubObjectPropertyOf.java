/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.SubObjectPropertyOf#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}</li>
 *   <li>{@link owl.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getSubObjectPropertyOf()
 * @model
 * @generated
 */
public interface SubObjectPropertyOf extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Super Object Property Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Object Property Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Object Property Expression</em>' reference.
	 * @see #setSuperObjectPropertyExpression(SubObjectPropertyExpression)
	 * @see owl.OwlPackage#getSubObjectPropertyOf_SuperObjectPropertyExpression()
	 * @model required="true"
	 * @generated
	 */
	SubObjectPropertyExpression getSuperObjectPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Object Property Expression</em>' reference.
	 * @see #getSuperObjectPropertyExpression()
	 * @generated
	 */
	void setSuperObjectPropertyExpression(SubObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Sub Object Property Expressions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Object Property Expressions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Object Property Expressions</em>' reference.
	 * @see #setSubObjectPropertyExpressions(SubObjectPropertyExpression)
	 * @see owl.OwlPackage#getSubObjectPropertyOf_SubObjectPropertyExpressions()
	 * @model required="true"
	 * @generated
	 */
	SubObjectPropertyExpression getSubObjectPropertyExpressions();

	/**
	 * Sets the value of the '{@link owl.SubObjectPropertyOf#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Object Property Expressions</em>' reference.
	 * @see #getSubObjectPropertyExpressions()
	 * @generated
	 */
	void setSubObjectPropertyExpressions(SubObjectPropertyExpression value);

} // SubObjectPropertyOf
