/**
 */
package owl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import owl.Annotation;
import owl.Axiom;
import owl.Ontology;
import owl.OwlPackage;
import owl.URI;

import owl.util.OwlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owl.impl.OntologyImpl#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link owl.impl.OntologyImpl#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link owl.impl.OntologyImpl#getImportedOntologies <em>Imported Ontologies</em>}</li>
 *   <li>{@link owl.impl.OntologyImpl#getOntologyURI <em>Ontology URI</em>}</li>
 *   <li>{@link owl.impl.OntologyImpl#getVersionURI <em>Version URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyImpl extends MinimalEObjectImpl.Container implements Ontology {
	/**
	 * The cached value of the '{@link #getOntologyAnnotations() <em>Ontology Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> ontologyAnnotations;

	/**
	 * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<Axiom> axioms;

	/**
	 * The cached value of the '{@link #getImportedOntologies() <em>Imported Ontologies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedOntologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontology> importedOntologies;

	/**
	 * The cached value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyURI()
	 * @generated
	 * @ordered
	 */
	protected URI ontologyURI;

	/**
	 * The cached value of the '{@link #getVersionURI() <em>Version URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionURI()
	 * @generated
	 * @ordered
	 */
	protected URI versionURI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getOntologyAnnotations() {
		if (ontologyAnnotations == null) {
			ontologyAnnotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS);
		}
		return ontologyAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Axiom> getAxioms() {
		if (axioms == null) {
			axioms = new EObjectResolvingEList<Axiom>(Axiom.class, this, OwlPackage.ONTOLOGY__AXIOMS);
		}
		return axioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontology> getImportedOntologies() {
		if (importedOntologies == null) {
			importedOntologies = new EObjectResolvingEList<Ontology>(Ontology.class, this, OwlPackage.ONTOLOGY__IMPORTED_ONTOLOGIES);
		}
		return importedOntologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getOntologyURI() {
		if (ontologyURI != null && ontologyURI.eIsProxy()) {
			InternalEObject oldOntologyURI = (InternalEObject)ontologyURI;
			ontologyURI = (URI)eResolveProxy(oldOntologyURI);
			if (ontologyURI != oldOntologyURI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ONTOLOGY__ONTOLOGY_URI, oldOntologyURI, ontologyURI));
			}
		}
		return ontologyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI basicGetOntologyURI() {
		return ontologyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntologyURI(URI newOntologyURI) {
		URI oldOntologyURI = ontologyURI;
		ontologyURI = newOntologyURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ONTOLOGY__ONTOLOGY_URI, oldOntologyURI, ontologyURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getVersionURI() {
		if (versionURI != null && versionURI.eIsProxy()) {
			InternalEObject oldVersionURI = (InternalEObject)versionURI;
			versionURI = (URI)eResolveProxy(oldVersionURI);
			if (versionURI != oldVersionURI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ONTOLOGY__VERSION_URI, oldVersionURI, versionURI));
			}
		}
		return versionURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI basicGetVersionURI() {
		return versionURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionURI(URI newVersionURI) {
		URI oldVersionURI = versionURI;
		versionURI = newVersionURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ONTOLOGY__VERSION_URI, oldVersionURI, versionURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean versionURIrequiresontologyURItobespecified(DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 OwlValidator.DIAGNOSTIC_SOURCE,
						 OwlValidator.ONTOLOGY__VERSION_UR_IREQUIRESONTOLOGY_UR_ITOBESPECIFIED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "versionURIrequiresontologyURItobespecified", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				return getOntologyAnnotations();
			case OwlPackage.ONTOLOGY__AXIOMS:
				return getAxioms();
			case OwlPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
				return getImportedOntologies();
			case OwlPackage.ONTOLOGY__ONTOLOGY_URI:
				if (resolve) return getOntologyURI();
				return basicGetOntologyURI();
			case OwlPackage.ONTOLOGY__VERSION_URI:
				if (resolve) return getVersionURI();
				return basicGetVersionURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				getOntologyAnnotations().clear();
				getOntologyAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OwlPackage.ONTOLOGY__AXIOMS:
				getAxioms().clear();
				getAxioms().addAll((Collection<? extends Axiom>)newValue);
				return;
			case OwlPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
				getImportedOntologies().clear();
				getImportedOntologies().addAll((Collection<? extends Ontology>)newValue);
				return;
			case OwlPackage.ONTOLOGY__ONTOLOGY_URI:
				setOntologyURI((URI)newValue);
				return;
			case OwlPackage.ONTOLOGY__VERSION_URI:
				setVersionURI((URI)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				getOntologyAnnotations().clear();
				return;
			case OwlPackage.ONTOLOGY__AXIOMS:
				getAxioms().clear();
				return;
			case OwlPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
				getImportedOntologies().clear();
				return;
			case OwlPackage.ONTOLOGY__ONTOLOGY_URI:
				setOntologyURI((URI)null);
				return;
			case OwlPackage.ONTOLOGY__VERSION_URI:
				setVersionURI((URI)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
				return ontologyAnnotations != null && !ontologyAnnotations.isEmpty();
			case OwlPackage.ONTOLOGY__AXIOMS:
				return axioms != null && !axioms.isEmpty();
			case OwlPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
				return importedOntologies != null && !importedOntologies.isEmpty();
			case OwlPackage.ONTOLOGY__ONTOLOGY_URI:
				return ontologyURI != null;
			case OwlPackage.ONTOLOGY__VERSION_URI:
				return versionURI != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OwlPackage.ONTOLOGY___VERSION_UR_IREQUIRESONTOLOGY_UR_ITOBESPECIFIED__DIAGNOSTICCHAIN_MAP:
				return versionURIrequiresontologyURItobespecified((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OntologyImpl
