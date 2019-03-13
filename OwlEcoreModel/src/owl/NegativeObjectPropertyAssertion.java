/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link owl.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link owl.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getNegativeObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface NegativeObjectPropertyAssertion extends Assertion {
	/**
	 * Returns the value of the '<em><b>Object Property Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property Expression</em>' reference.
	 * @see #setObjectPropertyExpression(ObjectPropertyExpression)
	 * @see owl.OwlPackage#getNegativeObjectPropertyAssertion_ObjectPropertyExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ObjectPropertyExpression getObjectPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property Expression</em>' reference.
	 * @see #getObjectPropertyExpression()
	 * @generated
	 */
	void setObjectPropertyExpression(ObjectPropertyExpression value);

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
	 * @see owl.OwlPackage#getNegativeObjectPropertyAssertion_SourceIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Individual getSourceIndividual();

	/**
	 * Sets the value of the '{@link owl.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Individual</em>' reference.
	 * @see #getSourceIndividual()
	 * @generated
	 */
	void setSourceIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>Target Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Individual</em>' reference.
	 * @see #setTargetIndividual(Individual)
	 * @see owl.OwlPackage#getNegativeObjectPropertyAssertion_TargetIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Individual getTargetIndividual();

	/**
	 * Sets the value of the '{@link owl.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Individual</em>' reference.
	 * @see #getTargetIndividual()
	 * @generated
	 */
	void setTargetIndividual(Individual value);

} // NegativeObjectPropertyAssertion
