/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.StringLiteral#getQuotedString <em>Quoted String</em>}</li>
 *   <li>{@link owl.StringLiteral#getLanguageTag <em>Language Tag</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Quoted String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quoted String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quoted String</em>' attribute.
	 * @see #setQuotedString(String)
	 * @see owl.OwlPackage#getStringLiteral_QuotedString()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getQuotedString();

	/**
	 * Sets the value of the '{@link owl.StringLiteral#getQuotedString <em>Quoted String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quoted String</em>' attribute.
	 * @see #getQuotedString()
	 * @generated
	 */
	void setQuotedString(String value);

	/**
	 * Returns the value of the '<em><b>Language Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Tag</em>' attribute.
	 * @see #setLanguageTag(String)
	 * @see owl.OwlPackage#getStringLiteral_LanguageTag()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguageTag();

	/**
	 * Sets the value of the '{@link owl.StringLiteral#getLanguageTag <em>Language Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Tag</em>' attribute.
	 * @see #getLanguageTag()
	 * @generated
	 */
	void setLanguageTag(String value);

} // StringLiteral
