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
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
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
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;

import owl.Annotation;
import owl.AnnotationProperty;
import owl.AnonymousIndividual;
import owl.AsymmetricObjectProperty;
import owl.ClassAssertion;
import owl.ClassExpression;
import owl.Constant;
import owl.DataAllValuesFrom;
import owl.DataComplementOf;
import owl.DataExactCardinality;
import owl.DataHasValue;
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
import owl.Datatype;
import owl.DatatypeRestriction;
import owl.DifferentIndividuals;
import owl.DisjointClasses;
import owl.DisjointDataProperties;
import owl.DisjointObjectProperties;
import owl.DisjointUnion;
import owl.EquivalentClasses;
import owl.EquivalentDataProperties;
import owl.EquivalentObjectProperties;
import owl.FacetConstantPair;
import owl.FunctionalDataProperty;
import owl.FunctionalObjectProperty;
import owl.Individual;
import owl.InverseFunctionalObjectProperty;
import owl.InverseObjectProperties;
import owl.IrreflexiveObjectProperty;
import owl.KeyFor;
import owl.NamedIndividual;
import owl.NegativeDataPropertyAssertion;
import owl.NegativeObjectPropertyAssertion;
import owl.ObjectAllValuesFrom;
import owl.ObjectComplementOf;
import owl.ObjectExactCardinality;
import owl.ObjectExistsSelf;
import owl.ObjectHasValue;
import owl.ObjectIntersectionOf;
import owl.ObjectMaxCardinality;
import owl.ObjectMinCardinality;
import owl.ObjectOneOf;
import owl.ObjectProperty;
import owl.ObjectPropertyAssertion;
import owl.ObjectPropertyDomain;
import owl.ObjectPropertyExpression;
import owl.ObjectPropertyRange;
import owl.ObjectSomeValuesFrom;
import owl.ObjectUnionOf;
import owl.OwlFactory;
import owl.OwlPackage;
import owl.ReflexiveObjectProperty;
import owl.SameIndividual;
import owl.SubClassOf;
import owl.SubDataPropertyOf;
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;

public class OwlEcoreWriter implements OWLObjectVisitor {	
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
	private EObject lastVisitedObject;
	
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
    	classEntities = new HashMap<String, owl.Class>();
    	namedIndividualEntities = new HashMap<String, NamedIndividual>();
    	anonymousIndividualEntities = new HashMap<String, AnonymousIndividual>();
    	objectPropertyEntities = new HashMap<String, ObjectProperty>();
    	dataPropertyEntities = new HashMap<String, DataProperty>();
    	datatypeEntities = new HashMap<String, Datatype>();
    	annotationPropertyEntities = new HashMap<String, AnnotationProperty>();
    	
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
    
    /*
     * DECLARATION AXIOMS [W3OWL:SECTION5]
     * https://www.w3.org/TR/owl2-syntax/#Entities.2C_Literals.2C_and_Anonymous_Individuals
     * Entities := Class | Datatype | ObjectProperty | DataProperty | AnnotationProperty | NamedIndividual
     */
    
    @Override
    public void visit(OWLDeclarationAxiom axiom) {
        axiom.getEntity().accept(this);
    }
    
    @Override
    public void visit(OWLClass entity) {
    	if (classEntities.containsKey(entity.getIRI().getIRIString())) {
    		lastVisitedObject = classEntities.get(entity.getIRI().getIRIString());
    	} else {
	        owl.Class newClass = ecoreOntologyFactory.createClass();
	        newClass.setEntityURI(createURIHelper(entity.getIRI().getIRIString()));
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
    		newDatatype.setEntityURI(createURIHelper(entity.getIRI().getIRIString()));
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
    		newObjectProperty.setEntityURI(createURIHelper(entity.getIRI().getIRIString()));
    		ecoreOntologyInstance.getContents().add(newObjectProperty);
    		objectPropertyEntities.put(entity.getIRI().getIRIString(), newObjectProperty);
    		lastVisitedObject = newObjectProperty;
    	}
    }
    
    @Override
    public void visit(OWLDataProperty entity) {
    	if (dataPropertyEntities.containsKey(entity.getIRI().getIRIString())) {
    		lastVisitedObject = dataPropertyEntities.get(entity.getIRI().getIRIString());
    	} else {
    		DataProperty newDataProperty = ecoreOntologyFactory.createDataProperty();
    		newDataProperty.setEntityURI(createURIHelper(entity.getIRI().getIRIString()));
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
        	newAnnotationProperty.setEntityURI(createURIHelper(entity.getIRI().getIRIString()));
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
        	newNamedIndividual.setEntityURI(createURIHelper(entity.getIRI().getIRIString()));
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
    	axiom.getSubClass().accept(this);
    	newSubClassOf.setSubClassExpression((ClassExpression) lastVisitedObject);
    	axiom.getSuperClass().accept(this);
    	newSubClassOf.setSuperClassExpression((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubClassOf);
    }
    
    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {
    	EquivalentClasses newEquivalentClasses = ecoreOntologyFactory.createEquivalentClasses();
        axiom.classExpressions().forEach(ax -> {
            ax.accept(this);
            newEquivalentClasses.getEquivalentClassExpressions().add((ClassExpression) lastVisitedObject);
        });
    	ecoreOntologyInstance.getContents().add(newEquivalentClasses);
    }
    
    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {
    	DisjointClasses newDisjointClasses = ecoreOntologyFactory.createDisjointClasses();
        axiom.classExpressions().forEach(ax -> {
        	ax.accept(this);
        	newDisjointClasses.getDisjointClassExpressions().add((ClassExpression) lastVisitedObject);
        });
        ecoreOntologyInstance.getContents().add(newDisjointClasses);
	}
    

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {
        DisjointUnion newDisjointUnion = ecoreOntologyFactory.createDisjointUnion();
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
    	axiom.getSubProperty().accept(this);
    	newSubObjectPropertyOf.setSubObjectPropertyExpressions((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getSuperProperty().accept(this);
    	newSubObjectPropertyOf.setSuperObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubObjectPropertyOf);
    }
    
    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {
    	EquivalentObjectProperties newEquivalentObjectProperties = ecoreOntologyFactory.createEquivalentObjectProperties();
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newEquivalentObjectProperties.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newEquivalentObjectProperties);
    }
    
    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {
    	DisjointObjectProperties newDisjointObjectProperties = ecoreOntologyFactory.createDisjointObjectProperties();
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newDisjointObjectProperties.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newDisjointObjectProperties);
    }
    
    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {
    	InverseObjectProperties newInverseObjectProperties = ecoreOntologyFactory.createInverseObjectProperties();
    	axiom.getFirstProperty().accept(this);
    	newInverseObjectProperties.getInverseObjectProperties().add((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getSecondProperty().accept(this);
    	newInverseObjectProperties.getInverseObjectProperties().add((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newInverseObjectProperties);
    }
    
    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {
    	ObjectPropertyDomain newObjectPropertyDomain = ecoreOntologyFactory.createObjectPropertyDomain();
    	axiom.getProperty().accept(this);
    	newObjectPropertyDomain.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getDomain().accept(this);
    	newObjectPropertyDomain.setDomain((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newObjectPropertyDomain);
    }
    
    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {
    	ObjectPropertyRange newObjectPropertyRange = ecoreOntologyFactory.createObjectPropertyRange();
    	axiom.getProperty().accept(this);
    	newObjectPropertyRange.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	axiom.getRange().accept(this);
    	newObjectPropertyRange.setRange((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newObjectPropertyRange);
    }
    
    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {
    	FunctionalObjectProperty newFunctionalObjectProperty = ecoreOntologyFactory.createFunctionalObjectProperty();
    	axiom.getProperty().accept(this);
    	newFunctionalObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newFunctionalObjectProperty);
    }
    
    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {
    	InverseFunctionalObjectProperty newInverseFunctionalObjectProperty = ecoreOntologyFactory.createInverseFunctionalObjectProperty();
    	axiom.getProperty().accept(this);
    	newInverseFunctionalObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newInverseFunctionalObjectProperty);
    }
    
    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {
    	ReflexiveObjectProperty newReflexiveObjectProperty = ecoreOntologyFactory.createReflexiveObjectProperty();
    	axiom.getProperty().accept(this);
    	newReflexiveObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newReflexiveObjectProperty);
    }
    
    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {
    	IrreflexiveObjectProperty newIrreflexiveObjectProperty = ecoreOntologyFactory.createIrreflexiveObjectProperty();
    	axiom.getProperty().accept(this);
    	newIrreflexiveObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newIrreflexiveObjectProperty);
    }
    
    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {
    	SymmetricObjectProperty newSymmetricObjectProperty = ecoreOntologyFactory.createSymmetricObjectProperty();
    	axiom.getProperty().accept(this);
    	newSymmetricObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSymmetricObjectProperty);
    }
    
    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {
    	AsymmetricObjectProperty newAsymmetricObjectProperty = ecoreOntologyFactory.createAsymmetricObjectProperty();
    	axiom.getProperty().accept(this);
    	newAsymmetricObjectProperty.setObjectPropertyExpression((ObjectPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newAsymmetricObjectProperty);
    }
    
    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {
    	TransitiveObjectProperty newTransitiveObjectProperty = ecoreOntologyFactory.createTransitiveObjectProperty();
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
    	axiom.getSubProperty().accept(this);
    	newSubDataPropertyOf.setSubDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getSuperProperty().accept(this);
    	newSubDataPropertyOf.setSuperDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newSubDataPropertyOf);
    }
    
    @Override 
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {
    	EquivalentDataProperties newEquivalentDataProperties = ecoreOntologyFactory.createEquivalentDataProperties();
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newEquivalentDataProperties.getDataPropertyExpressions().add((DataPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newEquivalentDataProperties);
    }
    
    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {
    	DisjointDataProperties newDisjointDataProperties = ecoreOntologyFactory.createDisjointDataProperties();
    	axiom.properties().forEach(ax -> {
    		ax.accept(this);
    		newDisjointDataProperties.getDataPropertyExpressions().add((DataPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newDisjointDataProperties);
    }
    
    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {
    	DataPropertyDomain newDataPropertyDomain = ecoreOntologyFactory.createDataPropertyDomain();
    	axiom.getProperty().accept(this);
    	newDataPropertyDomain.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getDomain().accept(this);
    	newDataPropertyDomain.setDomain((ClassExpression) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newDataPropertyDomain);
    }
    
    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {
    	DataPropertyRange newDataPropertyRange = ecoreOntologyFactory.createDataPropertyRange();
    	axiom.getProperty().accept(this);
    	newDataPropertyRange.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getRange().accept(this);
    	newDataPropertyRange.setRange((DataRange) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newDataPropertyRange);
    }
    
    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {
    	FunctionalDataProperty newFunctionalDataProperty = ecoreOntologyFactory.createFunctionalDataProperty();
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
    	System.out.println("[Writer] Not available in metamodel (data type definition)");
    }
    
    /*
     * KEYS [W3OWL:SECTION9.5]
     * https://www.w3.org/TR/owl2-syntax/#Keys
     */
    
    @Override
    public void visit(OWLHasKeyAxiom axiom) {
    	KeyFor newKeyFor = ecoreOntologyFactory.createKeyFor();
    	axiom.getClassExpression().accept(this);
    	newKeyFor.setClassExpression((ClassExpression) lastVisitedObject);
    	axiom.objectPropertyExpressions().forEach(ax -> {
    		ax.accept(this);
    		newKeyFor.getObjectPropertyExpressions().add((ObjectPropertyExpression) lastVisitedObject);
    	});
    	axiom.dataPropertyExpressions().forEach(ax -> {
    		ax.accept(this);
    		newKeyFor.getDataPropertyExpressions().add((DataPropertyExpression) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newKeyFor);
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
    	axiom.individuals().forEach(ax -> {
    		ax.accept(this);
    		newSameIndividual.getSameIndividuals().add((NamedIndividual) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newSameIndividual);
    }
    
    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {
    	DifferentIndividuals newDifferentIndividuals = ecoreOntologyFactory.createDifferentIndividuals();
    	axiom.individuals().forEach(ax -> {
    		ax.accept(this);
    		newDifferentIndividuals.getDifferentIndividuals().add((NamedIndividual) lastVisitedObject);
    	});
    	ecoreOntologyInstance.getContents().add(newDifferentIndividuals);
    }
    
    @Override
    public void visit(OWLClassAssertionAxiom axiom) {
    	ClassAssertion newClassAssertion = ecoreOntologyFactory.createClassAssertion();
    	axiom.getClassExpression().accept(this);
    	newClassAssertion.setClassExpression((ClassExpression) lastVisitedObject);
    	axiom.getIndividual().accept(this);
    	newClassAssertion.setIndividual((NamedIndividual) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newClassAssertion);
    }
    
    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {
    	ObjectPropertyAssertion newObjectPropertyAssertion = ecoreOntologyFactory.createObjectPropertyAssertion();
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
    	axiom.getProperty().accept(this);
    	newDataPropertyAssertion.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newDataPropertyAssertion.setSourceIndividual((Individual) lastVisitedObject);
    	axiom.getObject().accept(this);
    	newDataPropertyAssertion.setTargetValue((Constant) lastVisitedObject);
    	ecoreOntologyInstance.getContents().add(newDataPropertyAssertion);
    }
    
    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {
    	NegativeDataPropertyAssertion newNegativeDataPropertyAssertion = ecoreOntologyFactory.createNegativeDataPropertyAssertion();
    	axiom.getProperty().accept(this);
    	newNegativeDataPropertyAssertion.setDataPropertyExpression((DataPropertyExpression) lastVisitedObject);
    	axiom.getSubject().accept(this);
    	newNegativeDataPropertyAssertion.setSourceIndividual((Individual) lastVisitedObject);
    	axiom.getObject().accept(this);
    	newNegativeDataPropertyAssertion.setTargetValue((Constant) lastVisitedObject);
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
    	//an.getValue().accept(this);
    	System.out.println("[Writer] not available in metamodel (annotation value)");
    	ecoreOntologyInstance.getContents().add(newAnnotation);
    	lastVisitedObject = newAnnotation;
    }
    
    /*
     * ANNOTATION AXIOMS [W3OWL:SECTION10.2]
     * https://www.w3.org/TR/owl2-syntax/#Annotations
     */
    
    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {
    	System.out.println("[Writer] not available in metamodel (annotation assertion)");
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
		ObjectExistsSelf newObjectHasSelf = ecoreOntologyFactory.createObjectExistsSelf();
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
		newDataHasvalue.setConstant((Constant) lastVisitedObject);
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
		System.out.println("[Writer] Not available in metamodel (data intersection of)");
	}
	
	@Override 
	public void visit(OWLDataUnionOf dr) {
		System.out.println("[Writer] Not available in metamodel (data union of)");
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
			newDataOneOf.getConstants().add((Constant) lastVisitedObject);
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
			newDatatypeRestriction.getRestrictions().add((FacetConstantPair) lastVisitedObject);
		});
		ecoreOntologyInstance.getContents().add(newDatatypeRestriction);
		lastVisitedObject = newDatatypeRestriction;
	}
	
	// Data Type restrictions are implemented slightly different in the OWL API from the structural specification, need to visit the restriction as a pair of [Restriction, Literal]
	@Override
	public void visit(OWLFacetRestriction fr) {
		FacetConstantPair newFacetConstantPair = ecoreOntologyFactory.createFacetConstantPair();
		// FACET sets a facet using a string instead of IRI
		newFacetConstantPair.setFacet(fr.getFacet().getIRI().getIRIString());
		fr.getFacetValue().accept(this);
		newFacetConstantPair.setConstant((Constant) lastVisitedObject);
		ecoreOntologyInstance.getContents().add(newFacetConstantPair);
		lastVisitedObject = newFacetConstantPair;
	}
	
    /*
     * LITERALS [W3OWL:SECTION5.7]
     * https://www.w3.org/TR/owl2-syntax/#Literals
     * Literal := typedLiteral | stringLiteralNoLanguage | stringLiteralWithLanguage
     * Literals are implemented slightly different in both the OWL API and the OWL Ecore metamodel, see below
     */
	
	@Override 
	public void visit(OWLLiteral lit) {
		Constant newConstant = ecoreOntologyFactory.createConstant();
		lit.getDatatype().accept(this);
		newConstant.setDatatype((Datatype) lastVisitedObject);
		newConstant.setLexicalValue(lit.getLiteral());
		ecoreOntologyInstance.getContents().add(newConstant);
		lastVisitedObject = newConstant;
	}
}
