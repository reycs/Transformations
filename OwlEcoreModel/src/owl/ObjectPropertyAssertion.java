/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link owl.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link owl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface ObjectPropertyAssertion extends Assertion {
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
	 * @see owl.OwlPackage#getObjectPropertyAssertion_ObjectPropertyExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ObjectPropertyExpression getObjectPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}' reference.
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
	 * @see owl.OwlPackage#getObjectPropertyAssertion_SourceIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Individual getSourceIndividual();

	/**
	 * Sets the value of the '{@link owl.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' reference.
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
	 * @see owl.OwlPackage#getObjectPropertyAssertion_TargetIndividual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Individual getTargetIndividual();

	/**
	 * Sets the value of the '{@link owl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Individual</em>' reference.
	 * @see #getTargetIndividual()
	 * @generated
	 */
	void setTargetIndividual(Individual value);

} // ObjectPropertyAssertion
