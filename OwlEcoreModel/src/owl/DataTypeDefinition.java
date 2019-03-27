/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DataTypeDefinition#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link owl.DataTypeDefinition#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDataTypeDefinition()
 * @model
 * @generated
 */
public interface DataTypeDefinition extends Axiom {
	/**
	 * Returns the value of the '<em><b>Data Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Range</em>' reference.
	 * @see #setDataRange(DataRange)
	 * @see owl.OwlPackage#getDataTypeDefinition_DataRange()
	 * @model required="true"
	 * @generated
	 */
	DataRange getDataRange();

	/**
	 * Sets the value of the '{@link owl.DataTypeDefinition#getDataRange <em>Data Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Range</em>' reference.
	 * @see #getDataRange()
	 * @generated
	 */
	void setDataRange(DataRange value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Datatype)
	 * @see owl.OwlPackage#getDataTypeDefinition_DataType()
	 * @model required="true"
	 * @generated
	 */
	Datatype getDataType();

	/**
	 * Sets the value of the '{@link owl.DataTypeDefinition#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Datatype value);

} // DataTypeDefinition
