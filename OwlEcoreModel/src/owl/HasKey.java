/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.HasKey#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link owl.HasKey#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link owl.HasKey#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getHasKey()
 * @model
 * @generated
 */
public interface HasKey extends ObjectAndDataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Class Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Expression</em>' reference.
	 * @see #setClassExpression(ClassExpression)
	 * @see owl.OwlPackage#getHasKey_ClassExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ClassExpression getClassExpression();

	/**
	 * Sets the value of the '{@link owl.HasKey#getClassExpression <em>Class Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Expression</em>' reference.
	 * @see #getClassExpression()
	 * @generated
	 */
	void setClassExpression(ClassExpression value);

	/**
	 * Returns the value of the '<em><b>Data Property Expressions</b></em>' reference list.
	 * The list contents are of type {@link owl.DataPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property Expressions</em>' reference list.
	 * @see owl.OwlPackage#getHasKey_DataPropertyExpressions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DataPropertyExpression> getDataPropertyExpressions();

	/**
	 * Returns the value of the '<em><b>Object Property Expressions</b></em>' reference list.
	 * The list contents are of type {@link owl.ObjectPropertyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property Expressions</em>' reference list.
	 * @see owl.OwlPackage#getHasKey_ObjectPropertyExpressions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getObjectPropertyExpressions();

} // HasKey
