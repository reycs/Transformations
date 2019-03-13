/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DisjointUnion#getUnionClass <em>Union Class</em>}</li>
 *   <li>{@link owl.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDisjointUnion()
 * @model
 * @generated
 */
public interface DisjointUnion extends ClassAxiom {
	/**
	 * Returns the value of the '<em><b>Union Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Class</em>' reference.
	 * @see #setUnionClass(owl.Class)
	 * @see owl.OwlPackage#getDisjointUnion_UnionClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	owl.Class getUnionClass();

	/**
	 * Sets the value of the '{@link owl.DisjointUnion#getUnionClass <em>Union Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union Class</em>' reference.
	 * @see #getUnionClass()
	 * @generated
	 */
	void setUnionClass(owl.Class value);

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
	 * @see owl.OwlPackage#getDisjointUnion_DisjointClassExpressions()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<ClassExpression> getDisjointClassExpressions();

} // DisjointUnion
