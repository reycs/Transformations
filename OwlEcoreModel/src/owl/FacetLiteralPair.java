/**
 */
package owl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Literal Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.facet = 'length' 
 * or self.facet = 'minLength' 
 * or self.facet = 'maxLength' 
 * or self.facet = 'pattern' 
 * or self.facet = 'minInclusive' 
 * or self.facet = 'minExclusive' 
 * or self.facet = 'maxInclusive'
 * or self.facet = 'maxExclusive'
 * or self.facet = 'totalDigits' 
 * or self.facet = 'fractionDigits'
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.FacetLiteralPair#getRestrictionValue <em>Restriction Value</em>}</li>
 *   <li>{@link owl.FacetLiteralPair#getConstrainingFacet <em>Constraining Facet</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getFacetLiteralPair()
 * @model
 * @generated
 */
public interface FacetLiteralPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Restriction Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Value</em>' reference.
	 * @see #setRestrictionValue(Literal)
	 * @see owl.OwlPackage#getFacetLiteralPair_RestrictionValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Literal getRestrictionValue();

	/**
	 * Sets the value of the '{@link owl.FacetLiteralPair#getRestrictionValue <em>Restriction Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Value</em>' reference.
	 * @see #getRestrictionValue()
	 * @generated
	 */
	void setRestrictionValue(Literal value);

	/**
	 * Returns the value of the '<em><b>Constraining Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraining Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraining Facet</em>' reference.
	 * @see #setConstrainingFacet(URI)
	 * @see owl.OwlPackage#getFacetLiteralPair_ConstrainingFacet()
	 * @model required="true"
	 * @generated
	 */
	URI getConstrainingFacet();

	/**
	 * Sets the value of the '{@link owl.FacetLiteralPair#getConstrainingFacet <em>Constraining Facet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Facet</em>' reference.
	 * @see #getConstrainingFacet()
	 * @generated
	 */
	void setConstrainingFacet(URI value);

} // FacetLiteralPair
