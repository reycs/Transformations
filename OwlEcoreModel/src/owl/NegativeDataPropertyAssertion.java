/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.NegativeDataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link owl.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link owl.NegativeDataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getNegativeDataPropertyAssertion()
 * @model
 * @generated
 */
public interface NegativeDataPropertyAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Data Property Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Expression</em>' reference.
	 * @see #setDataPropertyExpression(DataPropertyExpression)
	 * @see owl.OwlPackage#getNegativeDataPropertyAssertion_DataPropertyExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataPropertyExpression getDataPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.NegativeDataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Property Expression</em>' reference.
	 * @see #getDataPropertyExpression()
	 * @generated
	 */
	void setDataPropertyExpression(DataPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' reference.
	 * @see #setTargetValue(Literal)
	 * @see owl.OwlPackage#getNegativeDataPropertyAssertion_TargetValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Literal getTargetValue();

	/**
	 * Sets the value of the '{@link owl.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(Literal value);

	/**
	 * Returns the value of the '<em><b>Source Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Individual</em>' reference.
	 * @see #setSourceIndividual(Individual)
	 * @see owl.OwlPackage#getNegativeDataPropertyAssertion_SourceIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Individual getSourceIndividual();

	/**
	 * Sets the value of the '{@link owl.NegativeDataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Individual</em>' reference.
	 * @see #getSourceIndividual()
	 * @generated
	 */
	void setSourceIndividual(Individual value);

} // NegativeDataPropertyAssertion
