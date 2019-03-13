package owlecore;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import owl.Class;
import owl.DataProperty;
import owl.NamedIndividual;
import owl.ObjectProperty;
import owl.OwlPackage;
import owl.SubClassOf;
import owl.util.OwlSwitch;

public class OwlEcoreParser<T> extends OwlSwitch<T> {
	private OWLOntologyManager ontologyManager;
	private OWLDataFactory ontologyDataFactory;
	private OWLOntology ontology;
	private Resource ecoreOntologyInstance;
	
	/**
	 * Parser class that allows parsing XMI models conform w3C owl2 ecore to the OWL API.
	 * @param uri file to parse
	 */
	public OwlEcoreParser(String uri) {
		// Load the ecore owl model instance
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put("http:///owl.ecore", OwlPackage.eINSTANCE);
		ecoreOntologyInstance = resourceSet.getResource(URI.createURI(uri), true);
		
		// Create a new ontology, manager and data factory using the OWL api
		ontologyManager = OWLManager.createOWLOntologyManager();
		ontologyDataFactory = ontologyManager.getOWLDataFactory();
		try {
			ontology = ontologyManager.createOntology();
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Iterates over the EObjects in the XMI and populates the ontology using the OWL API.
	 * Saves the ontology in the given location and the given format.
	 * @param fileName filename and location
	 * @param ontologyFormat format to save the ontology in
	 */
	public void parse(String fileName, OWLDocumentFormat ontologyFormat) {
		for (EObject object : ecoreOntologyInstance.getContents()) {
			this.doSwitch(object);
		}
		ontologyManager.setOntologyFormat(ontology, ontologyFormat);
		File file = new File(fileName);
		try {
			ontologyManager.saveOntology(ontology, IRI.create(file.toURI()));
			
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public T caseClass(owl.Class object) {
		OWLClass newClass = ontologyDataFactory.getOWLClass(object.getEntityURI().getValue());
		OWLDeclarationAxiom newClassDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newClass);
		ontology.add(newClassDeclaration);
		return null;
	}
	
	@Override
	public T caseSubClassOf(SubClassOf object) {
		owl.Class subClass = (Class) object.getSubClassExpression();
		owl.Class superClass = (Class) object.getSuperClassExpression();
		OWLClass owlSubClass = ontologyDataFactory.getOWLClass(subClass.getEntityURI().getValue());
		OWLClass owlSuperClass = ontologyDataFactory.getOWLClass(superClass.getEntityURI().getValue());
		ontology.add(ontologyDataFactory.getOWLSubClassOfAxiom(owlSubClass, owlSuperClass));
		return null;
	}
	
	@Override
	public T caseObjectProperty(ObjectProperty object) {
		OWLObjectProperty newObjectProperty = ontologyDataFactory.getOWLObjectProperty(object.getEntityURI().getValue());
		OWLDeclarationAxiom newObjectPropertyDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newObjectProperty);
		ontology.add(newObjectPropertyDeclaration);
		return null;
	}
	
	@Override 
	public T caseDataProperty(DataProperty object) {
		OWLDataProperty newDataProperty = ontologyDataFactory.getOWLDataProperty(object.getEntityURI().getValue());
		OWLDeclarationAxiom newDataPropertyDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newDataProperty);
		ontology.add(newDataPropertyDeclaration);
		return null;
	}
	
	@Override
	public T caseNamedIndividual(NamedIndividual object) {
		OWLNamedIndividual newNamedIndividual = ontologyDataFactory.getOWLNamedIndividual(object.getEntityURI().getValue());
		OWLDeclarationAxiom newNamedIndividualDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newNamedIndividual);
		ontology.add(newNamedIndividualDeclaration);
		return null;
	}
}
