/**
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Data Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.DisjointDataProperties#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getDisjointDataProperties()
 * @model
 * @generated
 */
public interface DisjointDataProperties extends DataPropertyAxiom {
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
	 * @see owl.OwlPackage#getDisjointDataProperties_DataPropertyExpressions()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<DataPropertyExpression> getDataPropertyExpressions();

} // DisjointDataProperties
