/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.ObjectPropertyChain#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getObjectPropertyChain()
 * @model
 * @generated
 */
public interface ObjectPropertyChain extends SubObjectPropertyExpression {
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
	 * @see owl.OwlPackage#getObjectPropertyChain_ObjectPropertyExpressions()
	 * @model lower="2"
	 * @generated
	 */
	EList<ObjectPropertyExpression> getObjectPropertyExpressions();

} // ObjectPropertyChain
