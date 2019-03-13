package owlecore;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

import owl.ClassExpression;
import owl.DataMaxCardinality;
import owl.DataMinCardinality;
import owl.DataProperty;
import owl.DataPropertyDomain;
import owl.DataPropertyRange;
import owl.Datatype;
import owl.EquivalentClasses;
import owl.NamedIndividual;
import owl.ObjectMaxCardinality;
import owl.ObjectMinCardinality;
import owl.ObjectOneOf;
import owl.ObjectProperty;
import owl.ObjectPropertyDomain;
import owl.ObjectPropertyRange;
import owl.OwlFactory;
import owl.OwlPackage;
import owl.SubClassOf;

public class OwlEcoreWriter implements OWLObjectVisitor {	
    private OWLOntologyManager ontologyManager;
	private OWLOntology ontology;
	private ResourceSet resourceSet;
	private Resource ecoreOntologyInstance;
	private OwlFactory ecoreOntologyFactory;
	private HashMap<String, owl.Class> classDefinitions;
	private HashMap<String, NamedIndividual> namedIndividualDefinitions;
	private HashMap<String, ObjectProperty> objectPropertyDefinitions;
	private HashMap<String, DataProperty> dataPropertyDefinitions;
	private ClassExpression lastClassExpression;
	
	/**
	 * Class to render the owl documents to xmi conform w3c owl2 ecore
	 * @param document OWL Api document to write
	 */
    public OwlEcoreWriter(String document) {
    	resourceSet = new ResourceSetImpl();
    	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put("http:///owl.ecore", OwlPackage.eINSTANCE);
    	ontologyManager = OWLManager.createOWLOntologyManager();
    	ecoreOntologyFactory = OwlFactory.eINSTANCE;
    	
    	// keep track of all declared entities 
    	classDefinitions = new HashMap<String, owl.Class>();
    	namedIndividualDefinitions = new HashMap<String, NamedIndividual>();
    	objectPropertyDefinitions = new HashMap<String, ObjectProperty>();
    	dataPropertyDefinitions = new HashMap<String, DataProperty>();
    	
    	File ontologyFile = new File(document);
    	try {
			ontology = ontologyManager.loadOntologyFromOntologyDocument(ontologyFile);
    	} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * Stores the ontology in w3c ecore format in the given location
     * @param uri
     */
    public void write(String uri) {
    	ecoreOntologyInstance = resourceSet.createResource(URI.createURI(uri));
    	ontology.accept(this);
    	try {
			ecoreOntologyInstance.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * Helper function that creates and stores a URI declaration 
     * @param uri
     * @return
     */
    protected owl.URI createURIHelper(String uri) {
    	owl.URI newUri = ecoreOntologyFactory.createURI();
    	newUri.setValue(uri);
    	ecoreOntologyInstance.getContents().add(newUri);
    	return newUri;
    }
    
    @Override
    public void visit(OWLOntology ontology) {
        ontology.axioms().sorted().forEach(ax -> {
            ax.accept(this);
        });
    }
    
    @Override
    public void visit(OWLDeclarationAxiom axiom) {
        axiom.getEntity().accept(this);
    }
    
    /* Declaration axioms (entities) */
    
    @Override
    public void visit(OWLClass ce) {
    	if (classDefinitions.containsKey(ce.getIRI().getIRIString())) {
    		lastClassExpression = classDefinitions.get(ce.getIRI().getIRIString());
    	} else {
	        owl.Class newClass = ecoreOntologyFactory.createClass();
	        newClass.setEntityURI(createURIHelper(ce.getIRI().getIRIString()));
	        ecoreOntologyInstance.getContents().add(newClass);
	        classDefinitions.put(ce.getIRI().getIRIString(), newClass);
	        lastClassExpression = newClass;
    	}
    }
    
    @Override
    public void visit(OWLObjectProperty property) {
        ObjectProperty newObjectProperty = ecoreOntologyFactory.createObjectProperty();
        newObjectProperty.setEntityURI(createURIHelper(property.getIRI().getIRIString()));
        ecoreOntologyInstance.getContents().add(newObjectProperty);
        objectPropertyDefinitions.put(property.getIRI().getIRIString(), newObjectProperty);
    }
    
    @Override
    public void visit(OWLDataProperty property) {
    	DataProperty newDataProperty = ecoreOntologyFactory.createDataProperty();
    	newDataProperty.setEntityURI(createURIHelper(property.getIRI().getIRIString()));
    	ecoreOntologyInstance.getContents().add(newDataProperty);
    	dataPropertyDefinitions.put(property.getIRI().getIRIString(), newDataProperty);
    }
    
    @Override
    public void visit(OWLNamedIndividual individual) {
    	if (!namedIndividualDefinitions.containsKey(individual.getIRI().getIRIString())) {
	    	NamedIndividual newNamedIndividual = ecoreOntologyFactory.createNamedIndividual();
	    	newNamedIndividual.setEntityURI(createURIHelper(individual.getIRI().getIRIString()));
	    	ecoreOntologyInstance.getContents().add(newNamedIndividual);
	    	namedIndividualDefinitions.put(individual.getIRI().getIRIString(), newNamedIndividual);
    	}
    }
    

    @Override
    public void visit(OWLDatatype node) {
    	// Currently Datatypes are not considered entities, in the future we should change this by keeping track of the datatypes in here
    }
    
    /* ClassExpressions (Except class) */
    
    @Override
    public void visit(OWLObjectOneOf ce) {
    	ObjectOneOf newObjectOneOf = ecoreOntologyFactory.createObjectOneOf();
    	ce.individuals().forEach(individual -> {
    		NamedIndividual namedIndividual = namedIndividualDefinitions.get(individual.asOWLNamedIndividual().getIRI().getIRIString());
			newObjectOneOf.getIndividuals().add(namedIndividual);
    	});
    	ecoreOntologyInstance.getContents().add(newObjectOneOf);
    	lastClassExpression = newObjectOneOf;
    }
    
    @Override
    public void visit(OWLObjectMinCardinality ce) {
    	ObjectMinCardinality newObjectMinCardinality = ecoreOntologyFactory.createObjectMinCardinality();
    	// * note if cardinality = 0 it is not explicitly serialised in the XMI
    	newObjectMinCardinality.setCardinality(ce.getCardinality());
    	OWLObjectProperty property = (OWLObjectProperty) ce.getProperty();
    	newObjectMinCardinality.setObjectPropertyExpression(objectPropertyDefinitions.get(property.getIRI().getIRIString()));
    	if (ce.isQualified()) {
    		newObjectMinCardinality.setClassExpression(classDefinitions.get(ce.getFiller().asOWLClass().getIRI().getIRIString()));
    	}
    	ecoreOntologyInstance.getContents().add(newObjectMinCardinality);
    	lastClassExpression = newObjectMinCardinality;
    }
    
    @Override
    public void visit(OWLObjectMaxCardinality ce) {
    	ObjectMaxCardinality newObjectMaxCardinality = ecoreOntologyFactory.createObjectMaxCardinality();
    	newObjectMaxCardinality.setCardinality(ce.getCardinality());
    	OWLObjectProperty property = (OWLObjectProperty) ce.getProperty();
    	newObjectMaxCardinality.setObjectPropertyExpression(objectPropertyDefinitions.get(property.getIRI().getIRIString()));
    	if (ce.isQualified()) {
    		newObjectMaxCardinality.setClassExpression(classDefinitions.get(ce.getFiller().asOWLClass().getIRI().getIRIString()));
    	}
    	ecoreOntologyInstance.getContents().add(newObjectMaxCardinality);
    	lastClassExpression = newObjectMaxCardinality;
    }
    
    @Override
    public void visit(OWLDataMinCardinality ce) {
        DataMinCardinality newDataMinCardinality = ecoreOntologyFactory.createDataMinCardinality();
        newDataMinCardinality.setCardinality(ce.getCardinality());
        newDataMinCardinality.setDataPropertyExpression(dataPropertyDefinitions.get(ce.getProperty().asOWLDataProperty().getIRI().getIRIString()));
        if (ce.isQualified()) {
        	// handle datatype // STANDARD PREFIX RESOLVING 2.4 of the structural specification
        	Datatype newDatatype = ecoreOntologyFactory.createDatatype();
        	owl.URI newUri = ecoreOntologyFactory.createURI();
        	newUri.setValue(ce.getFiller().asOWLDatatype().getIRI().getIRIString());
        	newDatatype.setEntityURI(newUri);
        	newDataMinCardinality.setDataRange(newDatatype);
        	ecoreOntologyInstance.getContents().add(newDatatype);
        	ecoreOntologyInstance.getContents().add(newUri);
        	// in the future shift this to the visit DataType
        	// dataRange.accept(this);
        	
        }
        ecoreOntologyInstance.getContents().add(newDataMinCardinality);
        lastClassExpression = newDataMinCardinality;
    }
    
    @Override
    public void visit(OWLDataMaxCardinality ce) {
    	DataMaxCardinality newDataMaxCardinality = ecoreOntologyFactory.createDataMaxCardinality();
    	newDataMaxCardinality.setCardinality(ce.getCardinality());
    	newDataMaxCardinality.setDataPropertyExpression(dataPropertyDefinitions.get(ce.getProperty().asOWLDataProperty().getIRI().getIRIString()));
    	if (ce.isQualified()) {
    		// Requires same changes as OWLDataMinCardinality.
    		Datatype newDatatype = ecoreOntologyFactory.createDatatype();
    		owl.URI newUri = ecoreOntologyFactory.createURI();
    		newUri.setValue(ce.getFiller().asOWLDatatype().getIRI().getIRIString());
    		newDatatype.setEntityURI(newUri);
    		newDataMaxCardinality.setDataRange(newDatatype);
    		ecoreOntologyInstance.getContents().add(newDatatype);
    		ecoreOntologyInstance.getContents().add(newUri);
    	}
    	ecoreOntologyInstance.getContents().add(newDataMaxCardinality);
    	lastClassExpression = newDataMaxCardinality;
    }
    
    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {
    	EquivalentClasses newEquivalentClasses = ecoreOntologyFactory.createEquivalentClasses();
    	ecoreOntologyInstance.getContents().add(newEquivalentClasses);
        axiom.classExpressions().forEach(ax -> {
            ax.accept(this);
            newEquivalentClasses.getEquivalentClassExpressions().add(lastClassExpression);
        });
    }
       
    @Override
    public void visit(OWLSubClassOfAxiom axiom) {
    	SubClassOf newSubClassOf = ecoreOntologyFactory.createSubClassOf();
    	newSubClassOf.setSubClassExpression(classDefinitions.get(axiom.getSubClass().asOWLClass().getIRI().getIRIString()));
    	newSubClassOf.setSuperClassExpression(classDefinitions.get(axiom.getSuperClass().asOWLClass().getIRI().getIRIString()));
    	ecoreOntologyInstance.getContents().add(newSubClassOf);
    }
    
    /* Object and data property range and domain */
    
    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {
    	ObjectPropertyRange newObjectPropertyRange = ecoreOntologyFactory.createObjectPropertyRange();
    	newObjectPropertyRange.setObjectPropertyExpression(objectPropertyDefinitions.get(axiom.getProperty().asOWLObjectProperty().getIRI().getIRIString()));
    	newObjectPropertyRange.setRange(classDefinitions.get(axiom.getRange().asOWLClass().getIRI().getIRIString()));
        ecoreOntologyInstance.getContents().add(newObjectPropertyRange);
    }
    
    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {
        ObjectPropertyDomain newObjectPropertyDomain = ecoreOntologyFactory.createObjectPropertyDomain();
        newObjectPropertyDomain.setObjectPropertyExpression(objectPropertyDefinitions.get(axiom.getProperty().asOWLObjectProperty().getIRI().getIRIString()));
        newObjectPropertyDomain.setDomain(classDefinitions.get(axiom.getDomain().asOWLClass().getIRI().getIRIString()));
        ecoreOntologyInstance.getContents().add(newObjectPropertyDomain);
    }
    
    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {
        DataPropertyRange newDataPropertyRange = ecoreOntologyFactory.createDataPropertyRange();
        newDataPropertyRange.setDataPropertyExpression(dataPropertyDefinitions.get(axiom.getProperty().asOWLDataProperty().getIRI().getIRIString()));
        // Currently datatypes are not entities
        Datatype newDatatype = ecoreOntologyFactory.createDatatype();
		owl.URI newUri = ecoreOntologyFactory.createURI();
		newUri.setValue(axiom.getRange().asOWLDatatype().getIRI().getIRIString());
		newDatatype.setEntityURI(newUri);
		newDataPropertyRange.setRange(newDatatype);
		ecoreOntologyInstance.getContents().add(newDatatype);
		ecoreOntologyInstance.getContents().add(newUri);
        ecoreOntologyInstance.getContents().add(newDataPropertyRange);
    }
    
    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {
        DataPropertyDomain newDataPropertyDomain = ecoreOntologyFactory.createDataPropertyDomain();
        newDataPropertyDomain.setDataPropertyExpression(dataPropertyDefinitions.get(axiom.getProperty().asOWLDataProperty().getIRI().getIRIString()));
        newDataPropertyDomain.setDomain(classDefinitions.get(axiom.getDomain().asOWLClass().getIRI().getIRIString()));
        ecoreOntologyInstance.getContents().add(newDataPropertyDomain);
    }
}
