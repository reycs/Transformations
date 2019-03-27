/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.TypedLiteral#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link owl.TypedLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getTypedLiteral()
 * @model
 * @generated
 */
public interface TypedLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Value</em>' attribute.
	 * @see #setLexicalValue(String)
	 * @see owl.OwlPackage#getTypedLiteral_LexicalValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLexicalValue();

	/**
	 * Sets the value of the '{@link owl.TypedLiteral#getLexicalValue <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Value</em>' attribute.
	 * @see #getLexicalValue()
	 * @generated
	 */
	void setLexicalValue(String value);

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
	 * @see owl.OwlPackage#getTypedLiteral_Datatype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link owl.TypedLiteral#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

} // TypedLiteral
