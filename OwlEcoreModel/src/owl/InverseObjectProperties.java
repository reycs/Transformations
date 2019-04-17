/**
 */
package owl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.InverseObjectProperties#getFirstProperty <em>First Property</em>}</li>
 *   <li>{@link owl.InverseObjectProperties#getSecondProperty <em>Second Property</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getInverseObjectProperties()
 * @model
 * @generated
 */
public interface InverseObjectProperties extends ObjectPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>First Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Property</em>' reference.
	 * @see #setFirstProperty(ObjectPropertyExpression)
	 * @see owl.OwlPackage#getInverseObjectProperties_FirstProperty()
	 * @model required="true"
	 * @generated
	 */
	ObjectPropertyExpression getFirstProperty();

	/**
	 * Sets the value of the '{@link owl.InverseObjectProperties#getFirstProperty <em>First Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Property</em>' reference.
	 * @see #getFirstProperty()
	 * @generated
	 */
	void setFirstProperty(ObjectPropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Second Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Property</em>' reference.
	 * @see #setSecondProperty(ObjectPropertyExpression)
	 * @see owl.OwlPackage#getInverseObjectProperties_SecondProperty()
	 * @model required="true"
	 * @generated
	 */
	ObjectPropertyExpression getSecondProperty();

	/**
	 * Sets the value of the '{@link owl.InverseObjectProperties#getSecondProperty <em>Second Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Property</em>' reference.
	 * @see #getSecondProperty()
	 * @generated
	 */
	void setSecondProperty(ObjectPropertyExpression value);

} // InverseObjectProperties
