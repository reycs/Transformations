/**
 */
package owl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owl.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link owl.Ontology#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link owl.Ontology#getImportedOntologies <em>Imported Ontologies</em>}</li>
 *   <li>{@link owl.Ontology#getOntologyURI <em>Ontology URI</em>}</li>
 *   <li>{@link owl.Ontology#getVersionURI <em>Version URI</em>}</li>
 * </ul>
 *
 * @see owl.OwlPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontology Annotations</b></em>' reference list.
	 * The list contents are of type {@link owl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology Annotations</em>' reference list.
	 * @see owl.OwlPackage#getOntology_OntologyAnnotations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Annotation> getOntologyAnnotations();

	/**
	 * Returns the value of the '<em><b>Axioms</b></em>' reference list.
	 * The list contents are of type {@link owl.Axiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axioms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axioms</em>' reference list.
	 * @see owl.OwlPackage#getOntology_Axioms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Axiom> getAxioms();

	/**
	 * Returns the value of the '<em><b>Imported Ontologies</b></em>' reference list.
	 * The list contents are of type {@link owl.Ontology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Ontologies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Ontologies</em>' reference list.
	 * @see owl.OwlPackage#getOntology_ImportedOntologies()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Ontology> getImportedOntologies();

	/**
	 * Returns the value of the '<em><b>Ontology URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology URI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology URI</em>' reference.
	 * @see #setOntologyURI(URI)
	 * @see owl.OwlPackage#getOntology_OntologyURI()
	 * @model ordered="false"
	 * @generated
	 */
	URI getOntologyURI();

	/**
	 * Sets the value of the '{@link owl.Ontology#getOntologyURI <em>Ontology URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology URI</em>' reference.
	 * @see #getOntologyURI()
	 * @generated
	 */
	void setOntologyURI(URI value);

	/**
	 * Returns the value of the '<em><b>Version URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version URI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version URI</em>' reference.
	 * @see #setVersionURI(URI)
	 * @see owl.OwlPackage#getOntology_VersionURI()
	 * @model ordered="false"
	 * @generated
	 */
	URI getVersionURI();

	/**
	 * Sets the value of the '{@link owl.Ontology#getVersionURI <em>Version URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version URI</em>' reference.
	 * @see #getVersionURI()
	 * @generated
	 */
	void setVersionURI(URI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.versionURI != 0 implies self.ontologyURI != 0
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean versionURIrequiresontologyURItobespecified(DiagnosticChain diagnostics, Map context);

} // Ontology
