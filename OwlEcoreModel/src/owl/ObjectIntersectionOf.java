/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.ObjectIntersectionOf#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getObjectIntersectionOf()
 * @model
 * @generated
 */
public interface ObjectIntersectionOf extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Class Expressions</b></em>' reference list.
	 * The list contents are of type {@link owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Expressions</em>' reference list.
	 * @see owl.OwlPackage#getObjectIntersectionOf_ClassExpressions()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getClassExpressions();

} // ObjectIntersectionOf
