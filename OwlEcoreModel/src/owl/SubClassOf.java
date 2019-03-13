/**
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}</li>
 *   <li>{@link owl.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getSubClassOf()
 * @model
 * @generated
 */
public interface SubClassOf extends ClassAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Class Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Expression</em>' reference.
	 * @see #setSubClassExpression(ClassExpression)
	 * @see owl.OwlPackage#getSubClassOf_SubClassExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ClassExpression getSubClassExpression();

	/**
	 * Sets the value of the '{@link owl.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class Expression</em>' reference.
	 * @see #getSubClassExpression()
	 * @generated
	 */
	void setSubClassExpression(ClassExpression value);

	/**
	 * Returns the value of the '<em><b>Super Class Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class Expression</em>' reference.
	 * @see #setSuperClassExpression(ClassExpression)
	 * @see owl.OwlPackage#getSubClassOf_SuperClassExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ClassExpression getSuperClassExpression();

	/**
	 * Sets the value of the '{@link owl.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class Expression</em>' reference.
	 * @see #getSuperClassExpression()
	 * @generated
	 */
	void setSuperClassExpression(ClassExpression value);

} // SubClassOf
