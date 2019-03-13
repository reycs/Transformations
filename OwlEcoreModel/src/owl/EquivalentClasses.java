/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.EquivalentClasses#getEquivalentClassExpressions <em>Equivalent Class Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getEquivalentClasses()
 * @model
 * @generated
 */
public interface EquivalentClasses extends ClassAxiom {
	/**
	 * Returns the value of the '<em><b>Equivalent Class Expressions</b></em>' reference list.
	 * The list contents are of type {@link owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Class Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Class Expressions</em>' reference list.
	 * @see owl.OwlPackage#getEquivalentClasses_EquivalentClassExpressions()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getEquivalentClassExpressions();

} // EquivalentClasses
