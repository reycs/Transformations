/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.ObjectPropertyRange#getRange <em>Range</em>}</li>
 *   <li>{@link owl.ObjectPropertyRange#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getObjectPropertyRange()
 * @model
 * @generated
 */
public interface ObjectPropertyRange extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(ClassExpression)
	 * @see owl.OwlPackage#getObjectPropertyRange_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ClassExpression getRange();

	/**
	 * Sets the value of the '{@link owl.ObjectPropertyRange#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ClassExpression value);

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
	 * @see owl.OwlPackage#getObjectPropertyRange_ObjectPropertyExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ObjectPropertyExpression getObjectPropertyExpression();

	/**
	 * Sets the value of the '{@link owl.ObjectPropertyRange#getObjectPropertyExpression <em>Object Property Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property Expression</em>' reference.
	 * @see #getObjectPropertyExpression()
	 * @generated
	 */
	void setObjectPropertyExpression(ObjectPropertyExpression value);

} // ObjectPropertyRange
