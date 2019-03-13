/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DisjointClasses#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDisjointClasses()
 * @model
 * @generated
 */
public interface DisjointClasses extends ClassAxiom {
	/**
	 * Returns the value of the '<em><b>Disjoint Class Expressions</b></em>' reference list.
	 * The list contents are of type {@link owl.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Class Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Class Expressions</em>' reference list.
	 * @see owl.OwlPackage#getDisjointClasses_DisjointClassExpressions()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getDisjointClassExpressions();

} // DisjointClasses
