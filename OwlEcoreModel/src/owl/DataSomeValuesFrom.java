/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DataSomeValuesFrom#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link owl.DataSomeValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDataSomeValuesFrom()
 * @model
 * @generated
 */
public interface DataSomeValuesFrom extends ClassExpression {
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
	 * @see owl.OwlPackage#getDataSomeValuesFrom_DataRange()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataRange getDataRange();

	/**
	 * Sets the value of the '{@link owl.DataSomeValuesFrom#getDataRange <em>Data Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Range</em>' reference.
	 * @see #getDataRange()
	 * @generated
	 */
	void setDataRange(DataRange value);

	/**
	 * Returns the value of the '<em><b>Data Property Expressions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expressions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Expressions</em>' reference.
	 * @see #setDataPropertyExpressions(DataPropertyExpression)
	 * @see owl.OwlPackage#getDataSomeValuesFrom_DataPropertyExpressions()
	 * @model required="true"
	 * @generated
	 */
	DataPropertyExpression getDataPropertyExpressions();

	/**
	 * Sets the value of the '{@link owl.DataSomeValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Property Expressions</em>' reference.
	 * @see #getDataPropertyExpressions()
	 * @generated
	 */
	void setDataPropertyExpressions(DataPropertyExpression value);

} // DataSomeValuesFrom
