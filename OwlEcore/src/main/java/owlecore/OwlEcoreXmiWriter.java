package owlecore;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.MissingImportHandlingStrategy;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;

import owl.Annotation;
import owl.AnnotationAssertion;
import owl.AnnotationProperty;
import owl.AnnotationPropertyDomain;
import owl.AnnotationPropertyRange;
import owl.AnnotationSubject;
import owl.AnnotationValue;
import owl.AnonymousIndividual;
import owl.AsymmetricObjectProperty;
import owl.Axiom;
import owl.ClassAssertion;
import owl.ClassExpression;
import owl.DataAllValuesFrom;
import owl.DataComplementOf;
import owl.DataExactCardinality;
import owl.DataHasValue;
import owl.DataIntersectionOf;
import owl.DataMaxCardinality;
import owl.DataMinCardinality;
import owl.DataOneOf;
import owl.DataProperty;
import owl.DataPropertyAssertion;
import owl.DataPropertyDomain;
import owl.DataPropertyExpression;
import owl.DataPropertyRange;
import owl.DataRange;
import owl.DataSomeValuesFrom;
import owl.DataTypeDefinition;
import owl.DataUnionOf;
import owl.Datatype;
import owl.DatatypeRestriction;
import owl.Declaration;
import owl.DifferentIndividuals;
import owl.DisjointClasses;
import owl.DisjointDataProperties;
import owl.DisjointObjectProperties;
import owl.DisjointUnion;
import owl.Entity;
import owl.EquivalentClasses;
import owl.EquivalentDataProperties;
import owl.EquivalentObjectProperties;
import owl.FacetLiteralPair;
import owl.FunctionalDataProperty;
import owl.FunctionalObjectProperty;
import owl.HasKey;
import owl.Individual;
import owl.InverseFunctionalObjectProperty;
import owl.InverseObjectProperties;
import owl.InverseObjectProperty;
import owl.IrreflexiveObjectProperty;
import owl.Literal;
import owl.NamedIndividual;
import owl.NegativeDataPropertyAssertion;
import owl.NegativeObjectPropertyAssertion;
import owl.ObjectAllValuesFrom;
import owl.ObjectComplementOf;
import owl.ObjectExactCardinality;
import owl.ObjectHasSelf;
import owl.ObjectHasValue;
import owl.ObjectIntersectionOf;
import owl.ObjectMaxCardinality;
import owl.ObjectMinCardinality;
import owl.ObjectOneOf;
import owl.ObjectProperty;
import owl.ObjectPropertyAssertion;
import owl.ObjectPropertyChain;
import owl.ObjectPropertyDomain;
import owl.ObjectPropertyExpression;
import owl.ObjectPropertyRange;
import owl.ObjectSomeValuesFrom;
import owl.ObjectUnionOf;
import owl.Ontology;
import owl.OwlFactory;
import owl.OwlPackage;
import owl.ReflexiveObjectProperty;
import owl.SameIndividual;
import owl.StringLiteral;
import owl.SubAnnotationPropertyOf;
import owl.SubClassOf;
import owl.SubDataPropertyOf;
import owl.SubObjectPropertyExpression;
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;
import owl.TypedLiteral;

public class OwlEcoreXmiWriter implements OWLObjectVisitor {	
    private OWLOntologyManager ontologyManager;
	private OWLOntology ontology;
	private ResourceSet resourceSet;
	private Resource ecoreOntologyInstance;
	private OwlFactory ecoreOntologyFactory;
	private HashMap<String, owl.Class> classEntities;
	private HashMap<String, NamedIndividual> namedIndividualEntities;
	private HashMap<String, AnonymousIndividual> anonymousIndividualEntities;
	private HashMap<String, ObjectProperty> objectPropertyEntities;
	private HashMap<String, DataProperty> dataPropertyEntities;
	private HashMap<String, Datatype> datatypeEntities;
	private HashMap<String, AnnotationProperty> annotationPropertyEntities;
	private HashMap<String, owl.URI> URIs;
	private EObject lastVisitedObject;
	
	/**
	 * Class to render the owl documents to xmi conform w3c owl2 ecore
	 * @param document OWL Api document to write
	 */
    public OwlEcoreXmiWriter(String document) {
    	resourceSet = new ResourceSetImpl();
    	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put("http:///owl.ecore", OwlPackage.eINSTANCE);
    	ontologyManager = OWLManager.createOWLOntologyManager();
    	ecoreOntologyFactory = OwlFactory.eINSTANCE;
    	loadOntology(document);
    }
    
    /**
     * Loads an ontology using the OWL ontology manager 
     * @param document ontology to load
     */
    public void loadOntology(String document) {
    	File ontologyFile = new File(document);
    	try {
    		ontologyManager.setOntologyLoaderConfiguration(new OWLOntologyLoaderConfiguration().setMissingImportHandlingStrategy(MissingImportHandlingStrategy.SILENT));
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
    	// keep track of all declared entities 
    	classEntities = new HashMap<String, owl.Class>();
    	namedIndividualEntities = new HashMap<String, NamedIndividual>();
    	anonymousIndividualEntities = new HashMap<String, AnonymousIndividual>();
    	objectPropertyEntities = new HashMap<String, ObjectProperty>();
    	dataPropertyEntities = new HashMap<String, DataProperty>();
    	datatypeEntities = new HashMap<String, Datatype>();
    	annotationPropertyEntities = new HashMap<String, AnnotationProperty>();
    	URIs = new HashMap<String, owl.URI>();
    	
    	ecoreOntologyInstance = resourceSet.createResource(URI.createURI(uri));
    	ontology.accept(this);
    	try {
			ecoreOntologyInstance.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
	public OWLOntology getLoadedOntology() {
		return ontology;
	}
    
    public void setAxiomAnnotations(OWLAxiom inputAxiom, Axiom newAxiom) {
    	inputAxiom.annotations().forEach(annotation -> {
    		annotation.accept(this);
    		newAxiom.getAxiomAnnotations().add((Annotation) lastVisitedObject);
    	});
    }
    
    @Override
    public void visit(IRI iri) {
    	if (URIs.containsKey(iri.getIRIString())) {
    		lastVisitedObject = URIs.get(iri.getIRIString());
    	} else {
    		owl.URI newUri = ecoreOntologyFactory.createURI();
    		newUri.setValue(iri.getIRIString());
    		ecoreOntologyInstance.getContents().add(newUri);
    		URIs.put(iri.getIRIString(), newUri);
    		lastVisitedObject = newUri;
    	}
    }
    
    @Override
    public void visit(OWLOntology ontology) {
    	Ontology newOntology = ecoreOntologyFactory.createOntology();
    	if (ontology.getOntologyID().getOntologyIRI().isPresent()) {
        	ontology.getOntologyID().getOntologyIRI().get().accept(this);
        	newOntology.setOntologyURI((owl.URI) lastVisitedObject);
    	}
    	if (ontology.getOntologyID().getVersionIRI().isPresent()) {
    		ontology.getOntologyID().getVersionIRI().get().accept(this);
    		newOntology.setVersionURI((owl.URI) lastVisitedObject);
    	}
        ontology.axioms().sorted().forEach(ax -> {
            ax.accept(this);
        });
        ontology.annotations().forEach(annotation -> {
        	annotation.accept(this);
        	newOntology.getOntologyAnnotations().add((Annotation) lastVisitedObject);
        });
    	ecoreOntologyInstance.getContents().add(newOntology);
    }
    
    /*
     * DECLARATION AXIOMS [W3OWL:SECTION5]
     * https://www.w3.org/TR/owl2-syntax/#Entities.2C_Literals.2C_and_Anonymous_Individuals
     * Entities := Class | Datatype | ObjectProperty | DataProperty | AnnotationProperty | NamedIndividual
     */
    
    @Override
    public void visit(OWLDeclarationAxiom axiom) {
    	Declaration newDeclaration = ecoreOntologyFactory.createDeclaration();
        axiom.getEntity().accept(this);
        newDeclaration.setEntity((Entity) lastVisitedObject);
        ecoreOntologyInstance.getContents().add(newDeclaration);
    }
    
    @Override
    public void visit(OWLClass entity) {
    	if (classEntities.containsKey(entity.getIRI().getIRIString())) {
    		lastVisitedObject = classEntities.get(entity.getIRI().getIRIString());
    	} else {
	        owl.Class newClass = ecoreOntologyFactory.createClass();
	        entity.getIRI().accept(this);
	        newClass.setEntityURI((owl.URI) lastVisitedObject);
	        ecoreOntologyInstance.getContents().add(newClass);
	        classEntities.put(entity.getIRI().getIRIString(), newClass);
	        lastVisitedObject = newClass;
    	}
    }
    
    @Override
    public void visit(OWLDatatype entity) {
    	if (datatypeEntities.containsKey(entity.getIRI().getIRIString())) {
    		lastVisitedObject = datatypeEntities.get(entity.getIRI().getIRIString());
    	} else {
    		Datatype newDatatype = ecoreOntologyFactory.createDatatype();
    		entity.getIRI().accept(this);
    		newDatatype.setEntityURI((owl.URI) lastVisitedObject);
    		ecoreOntologyInstance.getContents().add(newDatatype);
    		datatypeEntities.put(entity.getIRI().getIRIString(), newDatatype);
    		lastVisitedObject = newDatatype;
    	}
    }
    
    @Override
    public void visit(OWLObjectProperty entity) {
    	if (objectPropertyEntities.containsKey(entity.getIRI().getIRIString())) {
    		lastVisitedObject = objectPropertyEntities.get(entity.getIRI().getIRIString());
    	} else {
    		ObjectProperty newObjectProperty = ecoreOntologyFactory.createObjectProperty();
    		entity.getIRI().accept(this);
    		newObjectProperty.setEntityURI((owl.URI) lastVisitedObject);
    		ecoreOntologyInstance.getContents().add(newObjectProperty);
    		objectPropertyEntities.put(entity.getIRI().getIRIString(), newObjectProperty);
    		lastVisitedObject = newObjectProperty;
    	}
    }
    
    @Override
    public void visit(OWLObjectInverseOf property) {
    	property.getNamedProperty().accept(this);
		InverseObjectProperty newInverseObjectProperty = ecoreOntologyFactory.createInverseObjectProperty();
		newInverseObjectProperty.setObjectProperty((ObjectProperty) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newInverseObjectProperty);
		lastVisitedObject = newInverseObjectProperty;
    }
    
    @Override
    public void visit(OWLDataProperty entity) {
    	if (dataPropertyEntities.containsKey(entity.getIRI().getIRIString())) {
    		lastVisitedObject = dataPropertyEntities.get(entity.getIRI().getIRIString());
    	} else {
    		DataProperty newDataProperty = ecoreOntologyFactory.createDataProperty();
    		entity.getIRI().accept(this);
    		newDataProperty.setEntityURI((owl.URI) lastVisitedObject);
    		ecoreOntologyInstance.getContents().add(newDataProperty);
    		dataPropertyEntities.put(entity.getIRI().getIRIString(), newDataProperty);
    		lastVisitedObject = newDataProperty;
    	}
    }
    

    @Override
    public void visit(OWLAnnotationProperty entity) {
        if (annotationPropertyEntities.containsKey(entity.getIRI().getIRIString())) {
        	lastVisitedObject = annotationPropertyEntities.get(entity.getIRI().getIRIString());
        } else {
        	AnnotationProperty newAnnotationProperty = ecoreOntologyFactory.createAnnotationProperty();
        	entity.getIRI().accept(this);
        	newAnnotationProperty.setEntityURI((owl.URI) lastVisitedObject);
        	ecoreOntologyInstance.getContents().add(newAnnotationProperty);
        	annotationPropertyEntities.put(entity.getIRI().getIRIString(), newAnnotationProperty);
        	lastVisitedObject = newAnnotationProperty;
        }
    }
    
    @Override
    public void visit(OWLNamedIndividual entity) {
    	 if (namedIndividualEntities.containsKey(entity.getIRI().getIRIString())) {
         	lastVisitedObject = namedIndividualEntities.get(entity.getIRI().getIRIString());
         } else {
        	NamedIndividual newNamedIndividual = ecoreOntologyFactory.createNamedIndividual();
        	entity.getIRI().accept(this);
        	newNamedIndividual.setEntityURI((owl.URI) lastVisitedObject);
         	ecoreOntologyInstance.getContents().add(newNamedIndividual);
         	namedIndividualEntities.put(entity.getIRI().getIRIString(), newNamedIndividual);
         	lastVisitedObject = newNamedIndividual;
         }
    }
    
    /**
     * Note: an anonymous individual is only an entity local to the ontology 
     */
    @Override
    public void visit(OWLAnonymousIndividual individual) {
    	if (anonymousIndividualEntities.containsKey(individual.getID().getID())) {
    		lastVisitedObject = anonymousIndividualEntities.get(individual.getID().getID());
    	} else {
        	AnonymousIndividual newAnonymousIndividual = ecoreOntologyFactory.createAnonymousIndividual();
        	newAnonymousIndividual.setNodeID(individual.getID().getID());
        	ecoreOntologyInstance.getContents().add(newAnonymousIndividual);
        	anonymousIndividualEntities.put(individual.getID().getID(), newAnonymousIndividual);
        	lastVisitedObject = newAnonymousIndividual;
    	}
    }
    
    /*
     * CLASS EXPRESSION AXIOMS [W3OWL:SECTION9.1]
     * https://www.w3.org/TR/owl2-syntax/#Class_Expression_Axioms
     * ClassAxiom := SubClassOf | EquivalentClasses | DisjointClasses | DisjointUnion
     */
    
    @Override
    public void visit(OWLSubClassOfAxiom axiom) {
    	SubClassOf newSubClassOf = ecoreOntologyFactory.createSubClassOf();
    	setAxiomAnnotations(axiom, newSubClassOf);
    	axiom.getSubClass().accept(this);
    	newSubClassOf.setSubClassExpression((ClassExpression) lastVisitedObject);
    	axiom.getSuperClass().accept(this);
    	newSubClassOf.setSuperClassExpression((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubClassOf);
    }
    
    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {
    	EquivalentClasses newEquivalentClasses = ecoreOntologyFactory.createEquivalentClasses();
    	setAxiomAnnotations(axiom, newEquivalentClasses);
        axiom.classExpressions().forEach(ax -> {
            ax.accept(this);
            newEquivalentClasses.getEquivalentClassExpressions().add((ClassExpression) lastVisitedObject);
        });
    	ecoreOntologyInstance.getContents().add(newEquivalentClasses);
    }
    
    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {
    	DisjointClasses newDisjointClasses = ecoreOntologyFactory.createDisjointClasses();
    	setAxiomAnnotations(axiom, newDisjointClasses);
        axiom.classExpressions().forEach(ax -> {
        	ax.accept(this);
        	newDisjointClasses.getDisjointClassExpressions().add((ClassExpression) lastVisitedObject);
        });
        ecoreOntologyInstance.getContents().add(newDisjointClasses);
	}
    

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {
        DisjointUnion newDisjointUnion = ecoreOntologyFactory.createDisjointUnion();
        setAxiomAnnotations(axiom, newDisjointUnion);
        axiom.getOWLClass().accept(this);
        newDisjointUnion.setUnionClass((owl.Class) lastVisitedObject);
        axiom.classExpressions().forEach(ax -> {
        	ax.accept(this);
        	newDisjointUnion.getDisjointClassExpressions().add((ClassExpression) lastVisitedObject);
        });
        ecoreOntologyInstance.getContents().add(newDisjointUnion);
    }
    
    /*
     * OBJECT PROPERTY AXIOMS [W3OWL:SECTION9.2]
     * https://www.w3.org/TR/owl2-syntax/#Object_Property_Axioms
     * ObjectPropertyAxiom := SubObjectPropertyOf | EquivalentObjectProperties | DisjointObjectProperties | InverseObjectProperties |
     * ObjectPropertyDomain | ObjectPropertyRange | FunctionalObjectProperty | InverseFunctionalObjectProperty |
     * ReflexiveObjectProperty | IrreflexiveObjectProperty | SymmetricObjectProperty | AsymmetricObjectProperty |
     * TransitiveObjectProperty
     */
    
    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {
    	SubObjectPropertyOf newSubObjectPropertyOf = ecoreOntologyFactory.createSubObjectPropertyOf();
    	setAxiomAnnotations(axiom, newSubObjectPropertyOf);
    	axiom.getSubProperty().accept(this);
    	newSubObjectPropertyOf.setSubObjectPropertyExpressions((SubObjectPropertyExpression) lastVisitedObject);
    	axiom.getSuperProperty().accept(this);
    	newSubObjectPropertyOf.setSuperObjectPropertyExpression((SubObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubObjectPropertyOf);
    }
    
    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {
    	SubObjectPropertyOf newSubObjectPropertyOf = ecoreOntologyFactory.createSubObjectPropertyOf();
    	ObjectPropertyChain newObjectPropertyChain = ecoreOntologyFactory.createObjectPropertyChain();
    	axiom.getPropertyChain().forEach(property -> {
    		property.accept(this);
    		newObjectPropertyChain.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	newSubObjectPropertyOf.setSubObjectPropertyExpressions(newObjectPropertyChain);
    	axiom.getSuperProperty().accept(this);
    	newSubObjectPropertyOf.setSuperObjectPropertyExpression((SubObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newObjectPropertyChain);
    	ecoreOntologyInstance.getContents().add(newSubObjectPropertyOf);
    }
    
    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {
    	EquivalentObjectProperties newEquivalentObjectProperties = ecoreOntologyFactory.createEquivalentObjectProperties();
    	setAxiomAnnotations(axiom, newEquivalentObjectProperties);
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newEquivalentObjectProperties.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newEquivalentObjectProperties);
    }
    
    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {
    	DisjointObjectProperties newDisjointObjectProperties = ecoreOntologyFactory.createDisjointObjectProperties();
    	setAxiomAnnotations(axiom, newDisjointObjectProperties);
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newDisjointObjectProperties.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newDisjointObjectProperties);
    }
    
    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {
    	InverseObjectProperties newInverseObjectProperties = ecoreOntologyFactory.createInverseObjectProperties();
    	setAxiomAnnotations(axiom, newInverseObjectProperties);
    	axiom.getFirstProperty().accept(this);
    	newInverseObjectProperties.setFirstProperty((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getSecondProperty().accept(this);
    	newInverseObjectProperties.setSecondProperty((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newInverseObjectProperties);
    }
    
    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {
    	ObjectPropertyDomain newObjectPropertyDomain = ecoreOntologyFactory.createObjectPropertyDomain();
    	setAxiomAnnotations(axiom, newObjectPropertyDomain);
    	axiom.getProperty().accept(this);
    	newObjectPropertyDomain.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getDomain().accept(this);
    	newObjectPropertyDomain.setDomain((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newObjectPropertyDomain);
    }
    
    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {
    	ObjectPropertyRange newObjectPropertyRange = ecoreOntologyFactory.createObjectPropertyRange();
    	setAxiomAnnotations(axiom, newObjectPropertyRange);
    	axiom.getProperty().accept(this);
    	newObjectPropertyRange.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getRange().accept(this);
    	newObjectPropertyRange.setRange((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newObjectPropertyRange);
    }
    
    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {
    	FunctionalObjectProperty newFunctionalObjectProperty = ecoreOntologyFactory.createFunctionalObjectProperty();
    	setAxiomAnnotations(axiom, newFunctionalObjectProperty);
    	axiom.getProperty().accept(this);
    	newFunctionalObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newFunctionalObjectProperty);
    }
    
    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {
    	InverseFunctionalObjectProperty newInverseFunctionalObjectProperty = ecoreOntologyFactory.createInverseFunctionalObjectProperty();
    	setAxiomAnnotations(axiom, newInverseFunctionalObjectProperty);
    	axiom.getProperty().accept(this);
    	newInverseFunctionalObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newInverseFunctionalObjectProperty);
    }
    
    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {
    	ReflexiveObjectProperty newReflexiveObjectProperty = ecoreOntologyFactory.createReflexiveObjectProperty();
    	setAxiomAnnotations(axiom, newReflexiveObjectProperty);
    	axiom.getProperty().accept(this);
    	newReflexiveObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newReflexiveObjectProperty);
    }
    
    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {
    	IrreflexiveObjectProperty newIrreflexiveObjectProperty = ecoreOntologyFactory.createIrreflexiveObjectProperty();
    	setAxiomAnnotations(axiom, newIrreflexiveObjectProperty);
    	axiom.getProperty().accept(this);
    	newIrreflexiveObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newIrreflexiveObjectProperty);
    }
    
    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {
    	SymmetricObjectProperty newSymmetricObjectProperty = ecoreOntologyFactory.createSymmetricObjectProperty();
    	setAxiomAnnotations(axiom, newSymmetricObjectProperty);
    	axiom.getProperty().accept(this);
    	newSymmetricObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSymmetricObjectProperty);
    }
    
    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {
    	AsymmetricObjectProperty newAsymmetricObjectProperty = ecoreOntologyFactory.createAsymmetricObjectProperty();
    	setAxiomAnnotations(axiom, newAsymmetricObjectProperty);
    	axiom.getProperty().accept(this);
    	newAsymmetricObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newAsymmetricObjectProperty);
    }
    
    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {
    	TransitiveObjectProperty newTransitiveObjectProperty = ecoreOntologyFactory.createTransitiveObjectProperty();
    	setAxiomAnnotations(axiom, newTransitiveObjectProperty);
    	axiom.getProperty().accept(this);
    	newTransitiveObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newTransitiveObjectProperty);
    }
    
    /*
     * DATA PROPERTY AXIOMS [W3OWL:SECTION9.3]
     * https://www.w3.org/TR/owl2-syntax/#Data_Property_Axioms
     * DataPropertyAxiom := SubDataPropertyOf | EquivalentDataProperties | DisjointDataProperties | DataPropertyDomain | DataPropertyRange | FunctionalDataProperty
     */
    
    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {
    	SubDataPropertyOf newSubDataPropertyOf = ecoreOntologyFactory.createSubDataPropertyOf();
    	setAxiomAnnotations(axiom, newSubDataPropertyOf);
    	axiom.getSubProperty().accept(this);
    	newSubDataPropertyOf.setSubDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getSuperProperty().accept(this);
    	newSubDataPropertyOf.setSuperDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubDataPropertyOf);
    }
    
    @Override 
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {
    	EquivalentDataProperties newEquivalentDataProperties = ecoreOntologyFactory.createEquivalentDataProperties();
    	setAxiomAnnotations(axiom, newEquivalentDataProperties);
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newEquivalentDataProperties.getDataPropertyExpressions().add((DataPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newEquivalentDataProperties);
    }
    
    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {
    	DisjointDataProperties newDisjointDataProperties = ecoreOntologyFactory.createDisjointDataProperties();
    	setAxiomAnnotations(axiom, newDisjointDataProperties);
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newDisjointDataProperties.getDataPropertyExpressions().add((DataPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newDisjointDataProperties);
    }
    
    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {
    	DataPropertyDomain newDataPropertyDomain = ecoreOntologyFactory.createDataPropertyDomain();
    	setAxiomAnnotations(axiom, newDataPropertyDomain);
    	axiom.getProperty().accept(this);
    	newDataPropertyDomain.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getDomain().accept(this);
    	newDataPropertyDomain.setDomain((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newDataPropertyDomain);
    }
    
    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {
    	DataPropertyRange newDataPropertyRange = ecoreOntologyFactory.createDataPropertyRange();
    	setAxiomAnnotations(axiom, newDataPropertyRange);
    	axiom.getProperty().accept(this);
    	newDataPropertyRange.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getRange().accept(this);
    	newDataPropertyRange.setRange((DataRange) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newDataPropertyRange);
    }
    
    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {
    	FunctionalDataProperty newFunctionalDataProperty = ecoreOntologyFactory.createFunctionalDataProperty();
    	setAxiomAnnotations(axiom, newFunctionalDataProperty);
    	axiom.getProperty().accept(this);
    	newFunctionalDataProperty.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newFunctionalDataProperty);
    }
    
    /*
     * DATATYPE DEFINITIONS [W3OWL:SECTION9.4]
     * https://www.w3.org/TR/owl2-syntax/#Datatype_Definitions
     */
    
    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {
    	DataTypeDefinition newDataTypeDefinition = ecoreOntologyFactory.createDataTypeDefinition();
    	setAxiomAnnotations(axiom, newDataTypeDefinition);
    	axiom.getDatatype().accept(this);
    	newDataTypeDefinition.setDataType((Datatype) lastVisitedObject);
    	axiom.getDataRange().accept(this);
    	newDataTypeDefinition.setDataRange((DataRange) lastVisitedObject);
    }
    
    /*
     * KEYS [W3OWL:SECTION9.5]
     * https://www.w3.org/TR/owl2-syntax/#Keys
     */
    
    @Override
    public void visit(OWLHasKeyAxiom axiom) {
    	HasKey newHasKey = ecoreOntologyFactory.createHasKey();
    	setAxiomAnnotations(axiom, newHasKey);
    	axiom.getClassExpression().accept(this);
    	newHasKey.setClassExpression((ClassExpression) lastVisitedObject);
    	axiom.objectPropertyExpressions().forEach(ax -> {
    		ax.accept(this);
    		newHasKey.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	axiom.dataPropertyExpressions().forEach(ax -> {
    		ax.accept(this);
    		newHasKey.getDataPropertyExpressions().add((DataPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newHasKey);
    }
    
    /*
     * ASSERTIONS [W3OWL:SECTION9.6]
     * https://www.w3.org/TR/owl2-syntax/#Assertions
     * Assertion := SameIndividual | DifferentIndividuals | ClassAssertion | ObjectPropertyAssertion
     * NegativeObjectPropertyAssertion | DataPropertyAssertion | NegativeDataPropertyAssertion
     */
    
    @Override
    public void visit(OWLSameIndividualAxiom axiom) {
    	SameIndividual newSameIndividual = ecoreOntologyFactory.createSameIndividual();
    	setAxiomAnnotations(axiom, newSameIndividual);
    	axiom.individuals().forEach(ax -> {
    		ax.accept(this);
    		newSameIndividual.getIndividuals().add((Individual) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newSameIndividual);
    }
    
    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {
    	DifferentIndividuals newDifferentIndividuals = ecoreOntologyFactory.createDifferentIndividuals();
    	setAxiomAnnotations(axiom, newDifferentIndividuals);
    	axiom.individuals().forEach(ax -> {
    		ax.accept(this);
    		newDifferentIndividuals.getIndividuals().add((Individual) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newDifferentIndividuals);
    }
    
    @Override
    public void visit(OWLClassAssertionAxiom axiom) {
    	ClassAssertion newClassAssertion = ecoreOntologyFactory.createClassAssertion();
    	setAxiomAnnotations(axiom, newClassAssertion);
    	axiom.getClassExpression().accept(this);
    	newClassAssertion.setClassExpression((ClassExpression) lastVisitedObject);
    	axiom.getIndividual().accept(this);
    	newClassAssertion.setIndividual((Individual) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newClassAssertion);
    }
    
    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {
    	ObjectPropertyAssertion newObjectPropertyAssertion = ecoreOntologyFactory.createObjectPropertyAssertion();
    	setAxiomAnnotations(axiom, newObjectPropertyAssertion);
    	axiom.getProperty().accept(this);
    	newObjectPropertyAssertion.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newObjectPropertyAssertion.setSourceIndividual((Individual) lastVisitedObject);
    	axiom.getObject().accept(this);
    	newObjectPropertyAssertion.setTargetIndividual((Individual) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newObjectPropertyAssertion);
    }
    
    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {
    	NegativeObjectPropertyAssertion newNegativeObjectPropertyAssertion = ecoreOntologyFactory.createNegativeObjectPropertyAssertion();
    	setAxiomAnnotations(axiom, newNegativeObjectPropertyAssertion);
    	axiom.getProperty().accept(this);
    	newNegativeObjectPropertyAssertion.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newNegativeObjectPropertyAssertion.setSourceIndividual((Individual) lastVisitedObject);
    	axiom.getObject().accept(this);
    	newNegativeObjectPropertyAssertion.setTargetIndividual((Individual) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newNegativeObjectPropertyAssertion);
    }
    
    @Override 
    public void visit(OWLDataPropertyAssertionAxiom axiom) {
    	DataPropertyAssertion newDataPropertyAssertion = ecoreOntologyFactory.createDataPropertyAssertion();
    	setAxiomAnnotations(axiom, newDataPropertyAssertion);
    	axiom.getProperty().accept(this);
    	newDataPropertyAssertion.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newDataPropertyAssertion.setSourceIndividual((Individual) lastVisitedObject);
    	axiom.getObject().accept(this);
    	newDataPropertyAssertion.setTargetValue((Literal) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newDataPropertyAssertion);
    }
    
    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {
    	NegativeDataPropertyAssertion newNegativeDataPropertyAssertion = ecoreOntologyFactory.createNegativeDataPropertyAssertion();
    	setAxiomAnnotations(axiom, newNegativeDataPropertyAssertion);
    	axiom.getProperty().accept(this);
    	newNegativeDataPropertyAssertion.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newNegativeDataPropertyAssertion.setSourceIndividual((Individual) lastVisitedObject);
    	axiom.getObject().accept(this);
    	newNegativeDataPropertyAssertion.setTargetValue((Literal) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newNegativeDataPropertyAssertion);
    }
    
    /*
     * ANNOTATION OF ONTOLOGIES AXIOMS AND OTHER ANNOTATIONS [W3OWL:SECTION10.1]
     * https://www.w3.org/TR/owl2-syntax/#Annotations
     */
    
    @Override 
    public void visit(OWLAnnotation an) {
    	Annotation newAnnotation = ecoreOntologyFactory.createAnnotation();
    	an.getProperty().accept(this);
    	newAnnotation.setAnnotationProperty((AnnotationProperty) lastVisitedObject);
    	an.getValue().accept(this);
    	newAnnotation.setAnnotationValue((AnnotationValue) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newAnnotation);
    	lastVisitedObject = newAnnotation;
    }
    
    /*
     * ANNOTATION AXIOMS [W3OWL:SECTION10.2]
     * https://www.w3.org/TR/owl2-syntax/#Annotations
     * AnnotationAxiom := AnnotationAssertion | SubAnnotationPropertyOf | AnnotationPropertyDomain | AnnotationPropertyRange
     */
    
    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {
    	AnnotationAssertion newAnnotationAssertion = ecoreOntologyFactory.createAnnotationAssertion();
    	setAxiomAnnotations(axiom, newAnnotationAssertion);
    	axiom.getProperty().accept(this);
    	newAnnotationAssertion.setAnnotationProperty((AnnotationProperty) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newAnnotationAssertion.setAnnotationSubject((AnnotationSubject) lastVisitedObject);
    	axiom.getValue().accept(this);
    	newAnnotationAssertion.setAnnotationValue((AnnotationValue) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newAnnotationAssertion);
    }
    
    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {
    	SubAnnotationPropertyOf newSubAnnotationPropertyOf = ecoreOntologyFactory.createSubAnnotationPropertyOf();
    	setAxiomAnnotations(axiom, newSubAnnotationPropertyOf);
    	axiom.getSubProperty().accept(this);
    	newSubAnnotationPropertyOf.setSubAnnotationProperty((AnnotationProperty) lastVisitedObject);
    	axiom.getSuperProperty().accept(this);
    	newSubAnnotationPropertyOf.setSuperAnnotationProperty((AnnotationProperty) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubAnnotationPropertyOf);
    }
    
    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {
    	AnnotationPropertyDomain newAnnotationPropertyDomain = ecoreOntologyFactory.createAnnotationPropertyDomain();
    	setAxiomAnnotations(axiom, newAnnotationPropertyDomain);
    	axiom.getDomain().accept(this);
    	newAnnotationPropertyDomain.setDomain((owl.URI) lastVisitedObject);
    	axiom.getProperty().accept(this);
    	newAnnotationPropertyDomain.setAnnotationProperty((AnnotationProperty) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newAnnotationPropertyDomain);
    }
    
    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {
    	AnnotationPropertyRange newAnnotationPropertyRange = ecoreOntologyFactory.createAnnotationPropertyRange();
    	setAxiomAnnotations(axiom, newAnnotationPropertyRange);
    	axiom.getRange().accept(this);
    	newAnnotationPropertyRange.setRange((owl.URI) lastVisitedObject);
    	axiom.getProperty().accept(this);
    	newAnnotationPropertyRange.setAnnotationProperty((AnnotationProperty) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newAnnotationPropertyRange);
    }
    
	/*
	 * CLASS EXPRESSIONS [W3OWL:SECTION8]
	 * https://www.w3.org/TR/owl2-syntax/#Class_Expressions
	 * ClassExpression := Class | ObjectIntersectionOf | ObjectUnionOf | ObjectComplementOf | ObjectOneOf |
	 * ObjectSomeValuesFrom | ObjectAllValuesFrom | ObjectHasValue | ObjectHasSelf |
	 * ObjectMinCardinality | ObjectMaxCardinality | ObjectExactCardinality |
	 * DataSomeValuesFrom | DataAllValuesFrom | DataHasValue |
	 * DataMinCardinality | DataMaxCardinality | DataExactCardinality
	 * Class is defined in the declaration axiom functions
	 */
    
	@Override
	public void visit(OWLObjectIntersectionOf ce) {
		ObjectIntersectionOf newObjectIntersectionOf = ecoreOntologyFactory.createObjectIntersectionOf();
		ce.operands().forEach(ax -> {
			ax.accept(this);
			newObjectIntersectionOf.getClassExpressions().add((ClassExpression) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newObjectIntersectionOf);
		lastVisitedObject = newObjectIntersectionOf;
	}
	
	@Override
	public void visit(OWLObjectUnionOf ce) {
		ObjectUnionOf newObjectUnionOf = ecoreOntologyFactory.createObjectUnionOf();
		ce.operands().forEach(ax -> {
			ax.accept(this);
			newObjectUnionOf.getClassExpressions().add((ClassExpression) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newObjectUnionOf);
		lastVisitedObject = newObjectUnionOf;
	}
	
	@Override
	public void visit(OWLObjectComplementOf ce) {
		ObjectComplementOf newObjectComplementOf = ecoreOntologyFactory.createObjectComplementOf();
		ce.getOperand().accept(this);
		newObjectComplementOf.setClassExpression((ClassExpression) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newObjectComplementOf);
		lastVisitedObject = newObjectComplementOf;
	}
	
	@Override
	public void visit(OWLObjectOneOf ce) {
		ObjectOneOf newObjectOneOf = ecoreOntologyFactory.createObjectOneOf();
		ce.individuals().forEach(ax -> {
			ax.accept(this);
			newObjectOneOf.getIndividuals().add((Individual) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newObjectOneOf);
		lastVisitedObject = newObjectOneOf;
	}
	
	@Override
	public void visit(OWLObjectSomeValuesFrom ce) {
		ObjectSomeValuesFrom newObjectSomeValuesFrom = ecoreOntologyFactory.createObjectSomeValuesFrom();
		ce.getProperty().accept(this);
		newObjectSomeValuesFrom.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		ce.getFiller().accept(this);
		newObjectSomeValuesFrom.setClassExpression((ClassExpression) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newObjectSomeValuesFrom);
		lastVisitedObject = newObjectSomeValuesFrom;
	}
	
	@Override
	public void visit(OWLObjectAllValuesFrom ce) {
		ObjectAllValuesFrom newObjectAllValuesFrom = ecoreOntologyFactory.createObjectAllValuesFrom();
		ce.getProperty().accept(this);
		newObjectAllValuesFrom.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		ce.getFiller().accept(this);
		newObjectAllValuesFrom.setClassExpression((ClassExpression) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newObjectAllValuesFrom);
		lastVisitedObject = newObjectAllValuesFrom;
	}
	
	@Override 
	public void visit(OWLObjectHasValue ce) {
		ObjectHasValue newObjectHasValue = ecoreOntologyFactory.createObjectHasValue();
		ce.getProperty().accept(this);
		newObjectHasValue.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		ce.getFiller().accept(this);
		newObjectHasValue.setIndividual((Individual) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newObjectHasValue);
		lastVisitedObject = newObjectHasValue;
	}
	
	@Override 
	public void visit(OWLObjectHasSelf ce) {
		ObjectHasSelf newObjectHasSelf = ecoreOntologyFactory.createObjectHasSelf();
		ce.getProperty().accept(this);
		newObjectHasSelf.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newObjectHasSelf);
		lastVisitedObject = newObjectHasSelf;
	}
	
	@Override 
	public void visit(OWLObjectMinCardinality ce) {
		ObjectMinCardinality newObjectMinCardinality = ecoreOntologyFactory.createObjectMinCardinality();
		newObjectMinCardinality.setCardinality(ce.getCardinality());
		ce.getProperty().accept(this);
		newObjectMinCardinality.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		if (ce.isQualified()) {
			ce.getFiller().accept(this);
			newObjectMinCardinality.setClassExpression((ClassExpression) lastVisitedObject);
		}
		ecoreOntologyInstance.getContents().add(newObjectMinCardinality);
		lastVisitedObject = newObjectMinCardinality;
	}
	
	@Override 
	public void visit(OWLObjectMaxCardinality ce) {
		ObjectMaxCardinality newObjectMaxCardinality = ecoreOntologyFactory.createObjectMaxCardinality();
		newObjectMaxCardinality.setCardinality(ce.getCardinality());
		ce.getProperty().accept(this);
		newObjectMaxCardinality.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		if (ce.isQualified()) {
			ce.getFiller().accept(this);
			newObjectMaxCardinality.setClassExpression((ClassExpression) lastVisitedObject);
		}
		ecoreOntologyInstance.getContents().add(newObjectMaxCardinality);
		lastVisitedObject = newObjectMaxCardinality;
	}
	
	@Override
	public void visit(OWLObjectExactCardinality ce) {
		ObjectExactCardinality newObjectExactCardinality = ecoreOntologyFactory.createObjectExactCardinality();
		newObjectExactCardinality.setCardinality(ce.getCardinality());
		ce.getProperty().accept(this);
		newObjectExactCardinality.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
		if (ce.isQualified()) {
			ce.getFiller().accept(this);
			newObjectExactCardinality.setClassExpression((ClassExpression) lastVisitedObject);
		}
		ecoreOntologyInstance.getContents().add(newObjectExactCardinality);
		lastVisitedObject = newObjectExactCardinality;
	}
	
	@Override
	public void visit(OWLDataSomeValuesFrom ce) {
		DataSomeValuesFrom newDataSomeValuesFrom = ecoreOntologyFactory.createDataSomeValuesFrom();
		ce.getProperty().accept(this);
		newDataSomeValuesFrom.setDataPropertyExpressions((DataPropertyExpression) lastVisitedObject);
		ce.getFiller().accept(this);
		newDataSomeValuesFrom.setDataRange((DataRange) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newDataSomeValuesFrom);
		lastVisitedObject = newDataSomeValuesFrom;
	}
	
	@Override
	public void visit(OWLDataAllValuesFrom ce) {
		DataAllValuesFrom newDataAllValuesFrom = ecoreOntologyFactory.createDataAllValuesFrom();
		ce.getProperty().accept(this);
		newDataAllValuesFrom.setDataPropertyExpressions((DataPropertyExpression) lastVisitedObject);
		ce.getFiller().accept(this);
		newDataAllValuesFrom.setDataRange((DataRange) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newDataAllValuesFrom);
		lastVisitedObject = newDataAllValuesFrom;
	}
	
	@Override
	public void visit(OWLDataHasValue ce) {
		DataHasValue newDataHasvalue = ecoreOntologyFactory.createDataHasValue();
		ce.getProperty().accept(this);
		newDataHasvalue.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
		ce.getFiller().accept(this);
		newDataHasvalue.setLiteral((Literal) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newDataHasvalue);
		lastVisitedObject = newDataHasvalue;
	}
	
	@Override
	public void visit(OWLDataMinCardinality ce) {
		DataMinCardinality newDataMinCardinality = ecoreOntologyFactory.createDataMinCardinality();
		newDataMinCardinality.setCardinality(ce.getCardinality());
		ce.getProperty().accept(this);
		newDataMinCardinality.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
		if (ce.isQualified()) {
			ce.getFiller().accept(this);
			newDataMinCardinality.setDataRange((DataRange) lastVisitedObject);
		}
		ecoreOntologyInstance.getContents().add(newDataMinCardinality);
		lastVisitedObject = newDataMinCardinality;
	}
	
	@Override
	public void visit(OWLDataMaxCardinality ce) {
		DataMaxCardinality newDataMaxCardinality = ecoreOntologyFactory.createDataMaxCardinality();
		newDataMaxCardinality.setCardinality(ce.getCardinality());
		ce.getProperty().accept(this);
		newDataMaxCardinality.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
		if (ce.isQualified()) {
			ce.getFiller().accept(this);
			newDataMaxCardinality.setDataRange((DataRange) lastVisitedObject);
		}
		ecoreOntologyInstance.getContents().add(newDataMaxCardinality);
		lastVisitedObject = newDataMaxCardinality;
	}
	
	@Override
	public void visit(OWLDataExactCardinality ce) {
		DataExactCardinality newDataExactCardinality = ecoreOntologyFactory.createDataExactCardinality();
		newDataExactCardinality.setCardinality(ce.getCardinality());
		ce.getProperty().accept(this);
		newDataExactCardinality.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
		if (ce.isQualified()) {
			ce.getFiller().accept(this);
			newDataExactCardinality.setDataRange((DataRange) lastVisitedObject);
		}
		ecoreOntologyInstance.getContents().add(newDataExactCardinality);
		lastVisitedObject = newDataExactCardinality;
	}
	
	/*
	 * DATA RANGES [W3OWL:SECTION7]
	 * https://www.w3.org/TR/owl2-syntax/#Data_Ranges
	 * DataRange := Datatype | DataIntersectionOf | DataUnionOf | DataComplementOf | DataOneOf | DatatypeRestriction
	 * Datatype is defined in the declaration axiom functions
	 */
	
	@Override
	public void visit(OWLDataIntersectionOf dr) {
		DataIntersectionOf newDataIntersectionOf = ecoreOntologyFactory.createDataIntersectionOf();
		dr.operands().forEach(dataRange -> {
			dataRange.accept(this);
			newDataIntersectionOf.getDataRanges().add((DataRange) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newDataIntersectionOf);
		lastVisitedObject = newDataIntersectionOf;
	}
	
	@Override 
	public void visit(OWLDataUnionOf dr) {
		DataUnionOf newDataUnionOf = ecoreOntologyFactory.createDataUnionOf();
		dr.operands().forEach(dataRange -> {
			dataRange.accept(this);
			newDataUnionOf.getDataRanges().add((DataRange) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newDataUnionOf);
		lastVisitedObject = newDataUnionOf;
	}
	
	@Override 
	public void visit(OWLDataComplementOf dr) {
		DataComplementOf newDataComplementOf = ecoreOntologyFactory.createDataComplementOf();
		dr.getDataRange().accept(this);
		newDataComplementOf.setDataRange((DataRange) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newDataComplementOf);
		lastVisitedObject = newDataComplementOf;
	}
	
	@Override
	public void visit(OWLDataOneOf dr) {
		DataOneOf newDataOneOf = ecoreOntologyFactory.createDataOneOf();
		dr.values().forEach(ax -> {
			ax.accept(this);
			newDataOneOf.getLiterals().add((Literal) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newDataOneOf);
		lastVisitedObject = newDataOneOf;
	}
	
	@Override
	public void visit(OWLDatatypeRestriction dr) {
		DatatypeRestriction newDatatypeRestriction = ecoreOntologyFactory.createDatatypeRestriction();
		dr.getDatatype().accept(this);
		newDatatypeRestriction.setDatatype((Datatype) lastVisitedObject);
		dr.facetRestrictions().forEach(ax -> {
			ax.accept(this);
			newDatatypeRestriction.getRestrictions().add((FacetLiteralPair) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newDatatypeRestriction);
		lastVisitedObject = newDatatypeRestriction;
	}
	
	// Data Type restrictions are implemented slightly different in the OWL API from the structural specification, need to visit the restriction as a pair of [Restriction, Literal]
	@Override
	public void visit(OWLFacetRestriction fr) {
		FacetLiteralPair newFacetLiteralPair = ecoreOntologyFactory.createFacetLiteralPair();
		fr.getFacet().getIRI().accept(this);
		newFacetLiteralPair.setConstrainingFacet((owl.URI) lastVisitedObject);
		fr.getFacetValue().accept(this);
		newFacetLiteralPair.setRestrictionValue((Literal) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newFacetLiteralPair);
		lastVisitedObject = newFacetLiteralPair;
	}
	
    /*
     * LITERALS [W3OWL:SECTION5.7]
     * https://www.w3.org/TR/owl2-syntax/#Literals
     * Literal := typedLiteral | stringLiteralNoLanguage | stringLiteralWithLanguage
     * Literals are implemented slightly different in both the OWL API and the OWL Ecore metamodel, see below
     */
	
	@Override 
	public void visit(OWLLiteral lit) {
		Literal newLiteral;
		// String literals with datatype seem to give XSD#string as default datatype instead of RDFPlainLiteral
		if (lit.isRDFPlainLiteral() || lit.hasLang()) {
			StringLiteral newStringLiteral = ecoreOntologyFactory.createStringLiteral();
			newStringLiteral.setQuotedString(lit.getLiteral());
			if (lit.hasLang()) {
				newStringLiteral.setLanguageTag(lit.getLang());
			}
			newLiteral = newStringLiteral;
		} else {
			TypedLiteral newTypedLiteral = ecoreOntologyFactory.createTypedLiteral();
			newTypedLiteral.setLexicalValue(lit.getLiteral());
			lit.getDatatype().accept(this);
			newTypedLiteral.setDatatype((Datatype) lastVisitedObject);
			newLiteral = newTypedLiteral;
		}
		ecoreOntologyInstance.getContents().add(newLiteral);
		lastVisitedObject = newLiteral;
	}
}
