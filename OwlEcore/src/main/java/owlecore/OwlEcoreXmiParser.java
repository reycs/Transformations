package owlecore;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddOntologyAnnotation;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataRange;
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
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
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
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SetOntologyID;
import org.semanticweb.owlapi.vocab.OWLFacet;

import owl.Annotation;
import owl.AnnotationAssertion;
import owl.AnnotationProperty;
import owl.AnnotationPropertyDomain;
import owl.AnnotationPropertyRange;
import owl.AnonymousIndividual;
import owl.AsymmetricObjectProperty;
import owl.Axiom;
import owl.ClassAssertion;
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
import owl.DataPropertyRange;
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
import owl.EquivalentClasses;
import owl.EquivalentDataProperties;
import owl.EquivalentObjectProperties;
import owl.FacetLiteralPair;
import owl.FunctionalDataProperty;
import owl.FunctionalObjectProperty;
import owl.HasKey;
import owl.InverseFunctionalObjectProperty;
import owl.InverseObjectProperties;
import owl.InverseObjectProperty;
import owl.IrreflexiveObjectProperty;
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
import owl.ObjectPropertyRange;
import owl.ObjectSomeValuesFrom;
import owl.ObjectUnionOf;
import owl.Ontology;
import owl.OwlPackage;
import owl.ReflexiveObjectProperty;
import owl.SameIndividual;
import owl.StringLiteral;
import owl.SubAnnotationPropertyOf;
import owl.SubClassOf;
import owl.SubDataPropertyOf;
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;
import owl.TypedLiteral;
import owl.util.OwlSwitch;

/**
 * Parser class that allows parsing XMI models conform W3C OWL2 Ecore to the OWL API.
 */
public class OwlEcoreXmiParser extends OwlSwitch<OWLObject> {
	private OWLOntologyManager ontologyManager;
	private OWLOntology ontology;
	private Resource ecoreOntologyInstance;
	private ResourceSet resourceSet;
	
	public OwlEcoreXmiParser(String uri) {
		this(uri, OWLManager.createOWLOntologyManager());
	}
	
	public OwlEcoreXmiParser(String uri, OWLOntologyManager ontologyManager) {
;		this.ontologyManager = ontologyManager;
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put("http:///owl.ecore", OwlPackage.eINSTANCE);
		loadOntology(uri);
	}
	
	public void loadOntology(String uri) {
		ecoreOntologyInstance = getResourceSet().getResource(URI.createURI(uri), true);
	}
	
	/**
	 * Iterates over the EObjects in the XMI and populates the ontology using the OWL API.
	 * @return this
	 */
	public OwlEcoreXmiParser parse() {
		// Create a new ontology
		try {
			ontology = ontologyManager.createOntology();
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
		}
		
		for (EObject object : ecoreOntologyInstance.getContents()) {
			this.doSwitch(object);
		}
		
		return this;
	}
	
	public OWLOntologyManager getOntologyManager() {
		return ontologyManager;
	}
	
	public Resource getOntologyInstance() {
		return ecoreOntologyInstance;
	}
	
	public OWLDataFactory getOWLDataFactory() {
		return ontologyManager.getOWLDataFactory();
	}
	
	public ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public OWLOntology getParsedOntology() {
		return ontology;
	}
	
	/**
	 * Saves the ontology in the given location and the given format.
	 * @param fileName filename and location
	 * @param ontologyFormat format to save the ontology in
	 */
	public void save(String fileName, OWLDocumentFormat ontologyFormat) {		
		ontologyManager.setOntologyFormat(ontology, ontologyFormat);
		File file = new File(fileName);
		try {
			ontologyManager.saveOntology(ontology, IRI.create(file.toURI()));
			
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		} 
	}
	
	public OWLAxiom handleAxiomAnnotations(Axiom inputAxiom, OWLAxiom newAxiom) {
		List<OWLAnnotation> annotations = new ArrayList<OWLAnnotation>();
		inputAxiom.getAxiomAnnotations().forEach(annotation -> {
			annotations.add((OWLAnnotation) this.doSwitch(annotation));
		});
		if (annotations.size() > 0) {
			return newAxiom.getAnnotatedAxiom(annotations);
		} else {
			return newAxiom;
		}
	}
	
	@Override
	public IRI caseURI(owl.URI uri) {
		return IRI.create(uri.getValue());
	}
	
	@Override
	public OWLObject caseOntology(Ontology ont) {
		IRI ontologyIRI = null; 
		IRI versionIRI = null;
		if (ont.getOntologyURI() != null)
			ontologyIRI = (IRI) this.doSwitch(ont.getOntologyURI());
		if (ont.getVersionURI() != null) 
			versionIRI = (IRI) this.doSwitch(ont.getVersionURI());
		SetOntologyID change = new SetOntologyID(ontology, new OWLOntologyID(ontologyIRI, versionIRI));
		ontology.getOWLOntologyManager().applyChange(change);
		ont.getOntologyAnnotations().forEach(annotation -> {
			ontology.getOWLOntologyManager().applyChange(new AddOntologyAnnotation(ontology, (OWLAnnotation) this.doSwitch(annotation)));
		});
		return null;
	}
	
	/*
	* DECLARATION AXIOMS [W3OWL:SECTION5]
	* https://www.w3.org/TR/owl2-syntax/#Entities.2C_Literals.2C_and_Anonymous_Individuals
	* Entities := Class | Datatype | ObjectProperty | DataProperty | AnnotationProperty | NamedIndividual
	*/
	@Override
	public OWLDeclarationAxiom caseDeclaration(Declaration axiom) {
		OWLEntity entity = (OWLEntity) this.doSwitch(axiom.getEntity());
		OWLDeclarationAxiom newDeclarationAxiom = getOWLDataFactory().getOWLDeclarationAxiom(entity);
		if (this.ontology.isDeclared(entity)) {
			ontology.add(newDeclarationAxiom);
		}
		return newDeclarationAxiom;
	}
	
	@Override
	public OWLClass caseClass(owl.Class entity) {
		OWLClass newEntity = getOWLDataFactory().getOWLClass(entity.getEntityURI().getValue());
		
		// Register newEntity if does not exist
		if (!this.ontology.isDeclared(newEntity)) {
			OWLDeclarationAxiom newClassDeclaration = getOWLDataFactory().getOWLDeclarationAxiom(newEntity);
			ontology.add(newClassDeclaration);
		}
		return newEntity;
	}
	
	@Override
	public OWLDatatype caseDatatype(Datatype entity) {
		OWLDatatype newEntity = getOWLDataFactory().getOWLDatatype(entity.getEntityURI().getValue());
		
		// Register newEntity if does not exist
		if (!this.ontology.isDeclared(newEntity)) {
			OWLDeclarationAxiom newDatatypeDeclaration = getOWLDataFactory().getOWLDeclarationAxiom(newEntity);
			ontology.add(newDatatypeDeclaration);
		}
		return newEntity;
	}
	
	@Override
	public OWLObjectProperty caseObjectProperty(ObjectProperty entity) {
		OWLObjectProperty newEntity = getOWLDataFactory().getOWLObjectProperty(entity.getEntityURI().getValue());
		
		// Register newEntity if does not exist
		if (!this.ontology.isDeclared(newEntity)) {
			OWLDeclarationAxiom newObjectPropertyDeclaration = getOWLDataFactory().getOWLDeclarationAxiom(newEntity);
			ontology.add(newObjectPropertyDeclaration);
		}
		return newEntity;
	}
	
	@Override
	public OWLObjectInverseOf caseInverseObjectProperty(InverseObjectProperty property) {
		OWLObjectInverseOf newObjectInverseOf = getOWLDataFactory().getOWLObjectInverseOf((OWLObjectProperty) this.doSwitch(property.getObjectProperty()));
		return newObjectInverseOf;
	}
	
	@Override 
	public OWLDataProperty caseDataProperty(DataProperty entity) {
		OWLDataProperty newEntity = getOWLDataFactory().getOWLDataProperty(entity.getEntityURI().getValue());
		
		// Register newEntity if does not exist
		if (!this.ontology.isDeclared(newEntity)) {
			OWLDeclarationAxiom newDataPropertyDeclaration = getOWLDataFactory().getOWLDeclarationAxiom(newEntity);
			ontology.add(newDataPropertyDeclaration);
		}
		return newEntity;
	}
	
	@Override
	public OWLAnnotationProperty caseAnnotationProperty(AnnotationProperty entity) {
		OWLAnnotationProperty newEntity = getOWLDataFactory().getOWLAnnotationProperty(entity.getEntityURI().getValue());
		
		// Register newEntity if does not exist
		if (!this.ontology.isDeclared(newEntity)) {
			OWLDeclarationAxiom newAnnotationPropertyDeclaration = getOWLDataFactory().getOWLDeclarationAxiom(newEntity);
			ontology.add(newAnnotationPropertyDeclaration);
		}
		return newEntity;
	}
	
	@Override
	public OWLNamedIndividual caseNamedIndividual(NamedIndividual entity) {
		OWLNamedIndividual newEntity = getOWLDataFactory().getOWLNamedIndividual(entity.getEntityURI().getValue());
		
		// Register newEntity if does not exist
		if (!this.ontology.isDeclared(newEntity)) {	
			OWLDeclarationAxiom newNamedIndividualDeclaration = getOWLDataFactory().getOWLDeclarationAxiom(newEntity);
			ontology.add(newNamedIndividualDeclaration);
		}
		return newEntity;
	}
	
	@Override
	public OWLAnonymousIndividual caseAnonymousIndividual(AnonymousIndividual individual) {
		OWLAnonymousIndividual newAnonymousIndividual = getOWLDataFactory().getOWLAnonymousIndividual(individual.getNodeID());
		return newAnonymousIndividual;
	}
	
	  /*
     * CLASS EXPRESSION AXIOMS [W3OWL:SECTION9.1]
     * https://www.w3.org/TR/owl2-syntax/#Class_Expression_Axioms
     * ClassAxiom := SubClassOf | EquivalentClasses | DisjointClasses | DisjointUnion
     */
	
	@Override
	public OWLSubClassOfAxiom caseSubClassOf(SubClassOf axiom) {
		OWLClassExpression subClass = (OWLClassExpression) this.doSwitch(axiom.getSubClassExpression());
		OWLClassExpression superClass = (OWLClassExpression) this.doSwitch(axiom.getSuperClassExpression());
		OWLSubClassOfAxiom newSubClassOfAxiom = getOWLDataFactory().getOWLSubClassOfAxiom(subClass, superClass);
		ontology.add(handleAxiomAnnotations(axiom, newSubClassOfAxiom));
		return newSubClassOfAxiom;
	}
	
	@Override
	public OWLEquivalentClassesAxiom caseEquivalentClasses(EquivalentClasses axiom) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		axiom.getEquivalentClassExpressions().forEach(ce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(ce));
		});
		OWLEquivalentClassesAxiom newEquivalentClassesAxiom = getOWLDataFactory().getOWLEquivalentClassesAxiom(classExpressions);
		ontology.add(handleAxiomAnnotations(axiom, newEquivalentClassesAxiom));
		return newEquivalentClassesAxiom;
	}
	
	@Override
	public OWLDisjointClassesAxiom caseDisjointClasses(DisjointClasses axiom) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		axiom.getDisjointClassExpressions().forEach(ce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(ce));
		});
		OWLDisjointClassesAxiom newDisjointClassesAxiom = getOWLDataFactory().getOWLDisjointClassesAxiom(classExpressions);
		ontology.add(handleAxiomAnnotations(axiom, newDisjointClassesAxiom));
		return newDisjointClassesAxiom;
	}
	
	@Override
	public OWLDisjointUnionAxiom caseDisjointUnion(DisjointUnion axiom) {
		OWLClass unionClass = (OWLClass) this.doSwitch(axiom.getUnionClass());
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		axiom.getDisjointClassExpressions().forEach(ce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(ce));
		});
		OWLDisjointUnionAxiom newDisjointUnionAxiom = getOWLDataFactory().getOWLDisjointUnionAxiom(unionClass, classExpressions);
		ontology.add(handleAxiomAnnotations(axiom, newDisjointUnionAxiom));
		return newDisjointUnionAxiom;
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
	public OWLAxiom caseSubObjectPropertyOf(SubObjectPropertyOf axiom) {
		// because of a different implementation for objectPropertyChain needs to check the type of the subProperty
		if (axiom.getSubObjectPropertyExpressions().eClass().getClassifierID() == OwlPackage.OBJECT_PROPERTY_CHAIN) {
			List<OWLObjectPropertyExpression> chain = new ArrayList<OWLObjectPropertyExpression>();
			((ObjectPropertyChain) axiom.getSubObjectPropertyExpressions()).getObjectPropertyExpressions().forEach(property -> {
				chain.add((OWLObjectPropertyExpression) this.doSwitch(property));
			});
			OWLObjectPropertyExpression superPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(axiom.getSuperObjectPropertyExpression());
			OWLSubPropertyChainOfAxiom newSubPropertyChainOfAxiom = getOWLDataFactory().getOWLSubPropertyChainOfAxiom(chain, superPropertyExpression);
			ontology.add(handleAxiomAnnotations(axiom, newSubPropertyChainOfAxiom));
			return newSubPropertyChainOfAxiom;
		} else {
			OWLObjectPropertyExpression subPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(axiom.getSubObjectPropertyExpressions());
			OWLObjectPropertyExpression superPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(axiom.getSuperObjectPropertyExpression());
			OWLSubObjectPropertyOfAxiom newSubObjectPropertyOfAxiom = getOWLDataFactory().getOWLSubObjectPropertyOfAxiom(subPropertyExpression, superPropertyExpression);
			ontology.add(handleAxiomAnnotations(axiom, newSubObjectPropertyOfAxiom));
			return newSubObjectPropertyOfAxiom;
		}
	}
	
	@Override
	public OWLEquivalentObjectPropertiesAxiom caseEquivalentObjectProperties(EquivalentObjectProperties axiom) {
		List<OWLObjectPropertyExpression> objectProperties = new ArrayList<OWLObjectPropertyExpression>();
		axiom.getObjectPropertyExpressions().forEach(pe -> {
			objectProperties.add((OWLObjectPropertyExpression) this.doSwitch(pe));
		});
		OWLEquivalentObjectPropertiesAxiom newEquivalentObjectPropertiesAxiom = getOWLDataFactory().getOWLEquivalentObjectPropertiesAxiom(objectProperties);
		ontology.add(handleAxiomAnnotations(axiom, newEquivalentObjectPropertiesAxiom));
		return newEquivalentObjectPropertiesAxiom;
	}
	
	@Override
	public OWLDisjointObjectPropertiesAxiom caseDisjointObjectProperties(DisjointObjectProperties axiom) {
		List<OWLObjectPropertyExpression> objectProperties = new ArrayList<OWLObjectPropertyExpression>();
		axiom.getObjectPropertyExpressions().forEach(pe -> {
			objectProperties.add((OWLObjectPropertyExpression) this.doSwitch(pe));
		});
		OWLDisjointObjectPropertiesAxiom newDisjointObjectPropertiesAxiom = getOWLDataFactory().getOWLDisjointObjectPropertiesAxiom(objectProperties);
		ontology.add(handleAxiomAnnotations(axiom, newDisjointObjectPropertiesAxiom));
		return newDisjointObjectPropertiesAxiom;
	}
	
	@Override
	public OWLInverseObjectPropertiesAxiom caseInverseObjectProperties(InverseObjectProperties axiom) {
		OWLObjectPropertyExpression firstProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getFirstProperty());
		OWLObjectPropertyExpression secondProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getSecondProperty());
		OWLInverseObjectPropertiesAxiom newInverseObjectProperties = getOWLDataFactory().getOWLInverseObjectPropertiesAxiom(firstProperty, secondProperty);
		ontology.add(handleAxiomAnnotations(axiom, newInverseObjectProperties));
		return newInverseObjectProperties;
	}
	
	@Override
	public OWLObjectPropertyDomainAxiom caseObjectPropertyDomain(ObjectPropertyDomain axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLClassExpression domain = (OWLClassExpression) this.doSwitch(axiom.getDomain());
		OWLObjectPropertyDomainAxiom newObjectPropertyDomainAxiom = getOWLDataFactory().getOWLObjectPropertyDomainAxiom(objectProperty, domain);
		ontology.add(handleAxiomAnnotations(axiom, newObjectPropertyDomainAxiom));
		return newObjectPropertyDomainAxiom;
	}
	
	@Override
	public OWLObjectPropertyRangeAxiom caseObjectPropertyRange(ObjectPropertyRange axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLClassExpression range = (OWLClassExpression) this.doSwitch(axiom.getRange());
		OWLObjectPropertyRangeAxiom newObjectPropertyRangeAxiom = getOWLDataFactory().getOWLObjectPropertyRangeAxiom(objectProperty, range);
		ontology.add(handleAxiomAnnotations(axiom, newObjectPropertyRangeAxiom));
		return newObjectPropertyRangeAxiom;
	}
	
	@Override
	public OWLFunctionalObjectPropertyAxiom caseFunctionalObjectProperty(FunctionalObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLFunctionalObjectPropertyAxiom newFunctionObjectPropertyAxiom = getOWLDataFactory().getOWLFunctionalObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newFunctionObjectPropertyAxiom));
		return newFunctionObjectPropertyAxiom;
	}
	
	@Override
	public OWLInverseFunctionalObjectPropertyAxiom caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLInverseFunctionalObjectPropertyAxiom newInverseFunctionalPropertyAxiom = getOWLDataFactory().getOWLInverseFunctionalObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newInverseFunctionalPropertyAxiom));
		return newInverseFunctionalPropertyAxiom;
	}
	
	@Override
	public OWLReflexiveObjectPropertyAxiom caseReflexiveObjectProperty(ReflexiveObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLReflexiveObjectPropertyAxiom newReflexiveObjectPropertyAxiom = getOWLDataFactory().getOWLReflexiveObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newReflexiveObjectPropertyAxiom));
		return newReflexiveObjectPropertyAxiom;
	}
	
	@Override
	public OWLIrreflexiveObjectPropertyAxiom caseIrreflexiveObjectProperty(IrreflexiveObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLIrreflexiveObjectPropertyAxiom newIrreflexiveObjectPropertyAxiom = getOWLDataFactory().getOWLIrreflexiveObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newIrreflexiveObjectPropertyAxiom));
		return newIrreflexiveObjectPropertyAxiom;
	}
	
	@Override
	public OWLSymmetricObjectPropertyAxiom caseSymmetricObjectProperty(SymmetricObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLSymmetricObjectPropertyAxiom newSymmetricObjectPropertyAxiom = getOWLDataFactory().getOWLSymmetricObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newSymmetricObjectPropertyAxiom));
		return newSymmetricObjectPropertyAxiom;
	}
	
	@Override
	public OWLAsymmetricObjectPropertyAxiom caseAsymmetricObjectProperty(AsymmetricObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLAsymmetricObjectPropertyAxiom newAsymmetricObjectPropertyAxiom = getOWLDataFactory().getOWLAsymmetricObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newAsymmetricObjectPropertyAxiom));
		return newAsymmetricObjectPropertyAxiom;
	}
	
	@Override
	public OWLTransitiveObjectPropertyAxiom caseTransitiveObjectProperty(TransitiveObjectProperty axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLTransitiveObjectPropertyAxiom newTransitiveObjectPropertyAxiom = getOWLDataFactory().getOWLTransitiveObjectPropertyAxiom(objectProperty);
		ontology.add(handleAxiomAnnotations(axiom, newTransitiveObjectPropertyAxiom));
		return newTransitiveObjectPropertyAxiom;
	}
	
    /*
     * DATA PROPERTY AXIOMS [W3OWL:SECTION9.3]
     * https://www.w3.org/TR/owl2-syntax/#Data_Property_Axioms
     * DataPropertyAxiom := SubDataPropertyOf | EquivalentDataProperties | DisjointDataProperties | DataPropertyDomain | DataPropertyRange | FunctionalDataProperty
     */
	
	@Override
	public OWLSubDataPropertyOfAxiom caseSubDataPropertyOf(SubDataPropertyOf axiom) {
		OWLDataPropertyExpression subDataPropertyExpression = (OWLDataPropertyExpression) this.doSwitch(axiom.getSubDataPropertyExpression());
		OWLDataPropertyExpression superDataPropertyExpression = (OWLDataPropertyExpression) this.doSwitch(axiom.getSuperDataPropertyExpression());
		OWLSubDataPropertyOfAxiom newSubDataPropertyOfAxiom = getOWLDataFactory().getOWLSubDataPropertyOfAxiom(subDataPropertyExpression, superDataPropertyExpression);
		ontology.add(handleAxiomAnnotations(axiom, newSubDataPropertyOfAxiom));
		return newSubDataPropertyOfAxiom;
	}
	
	@Override
	public OWLEquivalentDataPropertiesAxiom caseEquivalentDataProperties(EquivalentDataProperties axiom) {
		List<OWLDataPropertyExpression> dataProperties = new ArrayList<OWLDataPropertyExpression>();
		axiom.getDataPropertyExpressions().forEach(pe -> {
			dataProperties.add((OWLDataPropertyExpression) this.doSwitch(pe));
		});
		OWLEquivalentDataPropertiesAxiom newOwlEquivalentDataPropertiesAxiom = getOWLDataFactory().getOWLEquivalentDataPropertiesAxiom(dataProperties);
		ontology.add(handleAxiomAnnotations(axiom, newOwlEquivalentDataPropertiesAxiom));
		return newOwlEquivalentDataPropertiesAxiom;
	}
	
	@Override
	public OWLDisjointDataPropertiesAxiom caseDisjointDataProperties(DisjointDataProperties axiom) {
		List<OWLDataPropertyExpression> dataPropeties = new ArrayList<OWLDataPropertyExpression>();
		axiom.getDataPropertyExpressions().forEach(pe -> {
			dataPropeties.add((OWLDataPropertyExpression) this.doSwitch(pe));
		});
		OWLDisjointDataPropertiesAxiom newDisjointDataPropertiesAxiom = getOWLDataFactory().getOWLDisjointDataPropertiesAxiom(dataPropeties);
		ontology.add(handleAxiomAnnotations(axiom, newDisjointDataPropertiesAxiom));
		return newDisjointDataPropertiesAxiom;
	}
	
	@Override
	public OWLDataPropertyDomainAxiom caseDataPropertyDomain(DataPropertyDomain axiom) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(axiom.getDataPropertyExpression());
		OWLClassExpression domain = (OWLClassExpression) this.doSwitch(axiom.getDomain());
		OWLDataPropertyDomainAxiom newDataPropertyDomainAxiom = getOWLDataFactory().getOWLDataPropertyDomainAxiom(dataProperty, domain);
		ontology.add(handleAxiomAnnotations(axiom, newDataPropertyDomainAxiom));
		return newDataPropertyDomainAxiom;
	}
	
	@Override
	public OWLDataPropertyRangeAxiom caseDataPropertyRange(DataPropertyRange axiom) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(axiom.getDataPropertyExpression());
		OWLDataRange range = (OWLDataRange) this.doSwitch(axiom.getRange());
		OWLDataPropertyRangeAxiom newDataPropertyRangeAxiom = getOWLDataFactory().getOWLDataPropertyRangeAxiom(dataProperty, range);
		ontology.add(handleAxiomAnnotations(axiom, newDataPropertyRangeAxiom));
		return newDataPropertyRangeAxiom;
	}
	
	@Override
	public OWLFunctionalDataPropertyAxiom caseFunctionalDataProperty(FunctionalDataProperty axiom) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(axiom.getDataPropertyExpression());
		OWLFunctionalDataPropertyAxiom newFunctionalDataPropertyAxiom = getOWLDataFactory().getOWLFunctionalDataPropertyAxiom(dataProperty);
		ontology.add(handleAxiomAnnotations(axiom, newFunctionalDataPropertyAxiom));
		return newFunctionalDataPropertyAxiom;
	}
	
    /*
     * DATATYPE DEFINITIONS [W3OWL:SECTION9.4]
     * https://www.w3.org/TR/owl2-syntax/#Datatype_Definitions
     */
	
	@Override 
	public OWLDatatypeDefinitionAxiom caseDataTypeDefinition(DataTypeDefinition axiom) {
		OWLDatatype datatype = (OWLDatatype) this.doSwitch(axiom.getDataType());
		OWLDataRange dataRange = (OWLDataRange) this.doSwitch(axiom.getDataRange());
		OWLDatatypeDefinitionAxiom newDatatypeDefinitionAxiom = getOWLDataFactory().getOWLDatatypeDefinitionAxiom(datatype, dataRange);
		ontology.add(handleAxiomAnnotations(axiom, newDatatypeDefinitionAxiom));
		return newDatatypeDefinitionAxiom;
	}
	
    /*
     * KEYS [W3OWL:SECTION9.5]
     * https://www.w3.org/TR/owl2-syntax/#Keys
     */
	
	@Override
	public OWLHasKeyAxiom caseHasKey(HasKey axiom) {
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(axiom.getClassExpression());
		List<OWLPropertyExpression> propertyExpressions = new ArrayList<OWLPropertyExpression>();
		axiom.getObjectPropertyExpressions().forEach(pe -> {
			propertyExpressions.add((OWLObjectPropertyExpression) this.doSwitch(pe));
		});
		axiom.getDataPropertyExpressions().forEach(pe -> {
			propertyExpressions.add((OWLDataPropertyExpression) this.doSwitch(pe));
		});
		OWLHasKeyAxiom newHasKeyAxiom = getOWLDataFactory().getOWLHasKeyAxiom(classExpression, propertyExpressions);
		ontology.add(handleAxiomAnnotations(axiom, newHasKeyAxiom));
		return newHasKeyAxiom;
	}
	
	  /*
     * ASSERTIONS [W3OWL:SECTION9.6]
     * https://www.w3.org/TR/owl2-syntax/#Assertions
     * Assertion := SameIndividual | DifferentIndividuals | ClassAssertion | ObjectPropertyAssertion
     * NegativeObjectPropertyAssertion | DataPropertyAssertion | NegativeDataPropertyAssertion
     */
	
	@Override
	public OWLSameIndividualAxiom caseSameIndividual(SameIndividual axiom) {
		List<OWLIndividual> individuals = new ArrayList<OWLIndividual>();
		axiom.getIndividuals().forEach(individual -> {
			individuals.add((OWLIndividual) this.doSwitch(individual));
		});
		OWLSameIndividualAxiom newSameIndividualAxiom = getOWLDataFactory().getOWLSameIndividualAxiom(individuals);
		ontology.add(handleAxiomAnnotations(axiom, newSameIndividualAxiom));
		return newSameIndividualAxiom;
	}
	
	@Override
	public OWLDifferentIndividualsAxiom caseDifferentIndividuals(DifferentIndividuals axiom) {
		List<OWLIndividual> individuals = new ArrayList<OWLIndividual>();
		axiom.getIndividuals().forEach(individual -> {
			individuals.add((OWLIndividual) this.doSwitch(individual));
		});
		OWLDifferentIndividualsAxiom newDifferentIndividualsAxiom = getOWLDataFactory().getOWLDifferentIndividualsAxiom(individuals);
		ontology.add(handleAxiomAnnotations(axiom, newDifferentIndividualsAxiom));
		return newDifferentIndividualsAxiom;
	}
	
	@Override
	public OWLClassAssertionAxiom caseClassAssertion(ClassAssertion axiom) {
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(axiom.getClassExpression());
		OWLIndividual individual = (OWLIndividual) this.doSwitch(axiom.getIndividual());
		OWLClassAssertionAxiom newClassAssertionAxiom = getOWLDataFactory().getOWLClassAssertionAxiom(classExpression, individual);
		ontology.add(handleAxiomAnnotations(axiom, newClassAssertionAxiom));
		return newClassAssertionAxiom;
	}
	
	@Override
	public OWLObjectPropertyAssertionAxiom caseObjectPropertyAssertion(ObjectPropertyAssertion axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(axiom.getSourceIndividual());
		OWLIndividual targetIndividual = (OWLIndividual) this.doSwitch(axiom.getTargetIndividual());
		OWLObjectPropertyAssertionAxiom newObjectPropertyAssertionAxiom = getOWLDataFactory().getOWLObjectPropertyAssertionAxiom(objectProperty, sourceIndividual, targetIndividual);
		ontology.add(handleAxiomAnnotations(axiom, newObjectPropertyAssertionAxiom));
		return newObjectPropertyAssertionAxiom;
	}
	
	@Override
	public OWLNegativeObjectPropertyAssertionAxiom caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion axiom) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(axiom.getObjectPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(axiom.getSourceIndividual());
		OWLIndividual targetIndividual = (OWLIndividual) this.doSwitch(axiom.getTargetIndividual());
		OWLNegativeObjectPropertyAssertionAxiom newNegativeObjectPropertyAssertionAxiom = getOWLDataFactory().getOWLNegativeObjectPropertyAssertionAxiom(objectProperty, sourceIndividual, targetIndividual);
		ontology.add(handleAxiomAnnotations(axiom, newNegativeObjectPropertyAssertionAxiom));
		return newNegativeObjectPropertyAssertionAxiom;
	}
	
	@Override
	public OWLDataPropertyAssertionAxiom caseDataPropertyAssertion(DataPropertyAssertion axiom) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(axiom.getDataPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(axiom.getSourceIndividual());
		OWLLiteral targetValue = (OWLLiteral) this.doSwitch(axiom.getTargetValue());
		OWLDataPropertyAssertionAxiom newDataPropertyAssertionAxiom = getOWLDataFactory().getOWLDataPropertyAssertionAxiom(dataProperty, sourceIndividual, targetValue);
		ontology.add(handleAxiomAnnotations(axiom, newDataPropertyAssertionAxiom));
		return newDataPropertyAssertionAxiom;
	}
	
	@Override
	public OWLNegativeDataPropertyAssertionAxiom caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion axiom) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(axiom.getDataPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(axiom.getSourceIndividual());
		OWLLiteral targetValue = (OWLLiteral) this.doSwitch(axiom.getTargetValue());
		OWLNegativeDataPropertyAssertionAxiom newNegativeDataPropertyAssertionAxiom = getOWLDataFactory().getOWLNegativeDataPropertyAssertionAxiom(dataProperty, sourceIndividual, targetValue);
		ontology.add(handleAxiomAnnotations(axiom, newNegativeDataPropertyAssertionAxiom));
		return newNegativeDataPropertyAssertionAxiom;
	}
	
    /*
     * ANNOTATION OF ONTOLOGIES AXIOMS AND OTHER ANNOTATIONS [W3OWL:SECTION10.1]
     * https://www.w3.org/TR/owl2-syntax/#Annotations
     */
	
	@Override
	public OWLAnnotation caseAnnotation(Annotation annotation) {
		OWLAnnotationProperty annotationProperty = (OWLAnnotationProperty) this.doSwitch(annotation.getAnnotationProperty());
		OWLAnnotationValue annotationValue = (OWLAnnotationValue) this.doSwitch(annotation.getAnnotationValue());
		return getOWLDataFactory().getOWLAnnotation(annotationProperty, annotationValue);
	}
	
    /*
     * ANNOTATION AXIOMS [W3OWL:SECTION10.2]
     * https://www.w3.org/TR/owl2-syntax/#Annotations
     * AnnotationAxiom := AnnotationAssertion | SubAnnotationPropertyOf | AnnotationPropertyDomain | AnnotationPropertyRange
     */
	
	@Override
	public OWLAnnotationAssertionAxiom caseAnnotationAssertion(AnnotationAssertion axiom) {
		OWLAnnotationProperty annotationProperty = (OWLAnnotationProperty) this.doSwitch(axiom.getAnnotationProperty());
		OWLAnnotationSubject annotationSubject = (OWLAnnotationSubject) this.doSwitch(axiom.getAnnotationSubject());
		OWLAnnotationValue annotationValue = (OWLAnnotationValue) this.doSwitch(axiom.getAnnotationValue());
		OWLAnnotationAssertionAxiom newAnnotationAssertionAxiom = getOWLDataFactory().getOWLAnnotationAssertionAxiom(annotationProperty, annotationSubject, annotationValue);
		ontology.add(handleAxiomAnnotations(axiom, newAnnotationAssertionAxiom));
		return newAnnotationAssertionAxiom;
	}
	
	@Override
	public OWLSubAnnotationPropertyOfAxiom caseSubAnnotationPropertyOf(SubAnnotationPropertyOf axiom) {
		OWLAnnotationProperty subAnnotationProperty = (OWLAnnotationProperty) this.doSwitch(axiom.getSubAnnotationProperty());
		OWLAnnotationProperty superAnnotationProperty = (OWLAnnotationProperty) this.doSwitch(axiom.getSuperAnnotationProperty());
		OWLSubAnnotationPropertyOfAxiom newSubAnnotationPropertyOfAxiom = getOWLDataFactory().getOWLSubAnnotationPropertyOfAxiom(subAnnotationProperty, superAnnotationProperty);
		ontology.add(handleAxiomAnnotations(axiom, newSubAnnotationPropertyOfAxiom));
		return newSubAnnotationPropertyOfAxiom;
	}
	
	@Override
	public OWLAnnotationPropertyDomainAxiom caseAnnotationPropertyDomain(AnnotationPropertyDomain axiom) {
		OWLAnnotationProperty annotationProperty = (OWLAnnotationProperty) this.doSwitch(axiom.getAnnotationProperty());
		OWLAnnotationPropertyDomainAxiom newAnnotationPropertyDomainAxiom = getOWLDataFactory().getOWLAnnotationPropertyDomainAxiom(annotationProperty, (IRI) this.doSwitch(axiom.getDomain()));
		ontology.add(handleAxiomAnnotations(axiom, newAnnotationPropertyDomainAxiom));
		return newAnnotationPropertyDomainAxiom;
	}
	
	@Override
	public OWLAnnotationPropertyRangeAxiom caseAnnotationPropertyRange(AnnotationPropertyRange axiom) {
		OWLAnnotationProperty annotationProperty = (OWLAnnotationProperty) this.doSwitch(axiom.getAnnotationProperty());
		OWLAnnotationPropertyRangeAxiom newAnnotationPropertyRangeAxiom = getOWLDataFactory().getOWLAnnotationPropertyRangeAxiom(annotationProperty, (IRI) this.doSwitch(axiom.getRange()));
		ontology.add(handleAxiomAnnotations(axiom, newAnnotationPropertyRangeAxiom));
		return newAnnotationPropertyRangeAxiom;
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
	public OWLObjectIntersectionOf caseObjectIntersectionOf(ObjectIntersectionOf ce) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		ce.getClassExpressions().forEach(cce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(cce));
		});
		return getOWLDataFactory().getOWLObjectIntersectionOf(classExpressions);
	}
	
	@Override
	public OWLObjectUnionOf caseObjectUnionOf(ObjectUnionOf ce) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		ce.getClassExpressions().forEach(cce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(cce));
		});
		return getOWLDataFactory().getOWLObjectUnionOf(classExpressions);
	}
	
	@Override
	public OWLObjectComplementOf caseObjectComplementOf(ObjectComplementOf ce) {
		return getOWLDataFactory().getOWLObjectComplementOf((OWLClassExpression) this.doSwitch(ce.getClassExpression()));
	}
	
	@Override
	public OWLObjectOneOf caseObjectOneOf(ObjectOneOf ce) {
		List<OWLIndividual> individuals = new ArrayList<OWLIndividual>();
		ce.getIndividuals().forEach(individual -> {
			individuals.add((OWLIndividual) this.doSwitch(individual));
		});
		return getOWLDataFactory().getOWLObjectOneOf(individuals);
	}
	
	@Override
	public OWLObjectSomeValuesFrom caseObjectSomeValuesFrom(ObjectSomeValuesFrom ce) {
		OWLObjectPropertyExpression objectPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
		return getOWLDataFactory().getOWLObjectSomeValuesFrom(objectPropertyExpression, classExpression);
	}
	
	@Override
	public OWLObjectAllValuesFrom caseObjectAllValuesFrom(ObjectAllValuesFrom ce) {
		OWLObjectPropertyExpression propertyExpression = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
		return getOWLDataFactory().getOWLObjectAllValuesFrom(propertyExpression, classExpression);
	}
	
	@Override
	public OWLObjectHasValue caseObjectHasValue(ObjectHasValue ce) {
		OWLObjectPropertyExpression propertyExpression = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		OWLIndividual individual = (OWLIndividual) this.doSwitch(ce.getIndividual());
		return getOWLDataFactory().getOWLObjectHasValue(propertyExpression, individual);
	}
	
	@Override
	public OWLObjectHasSelf caseObjectHasSelf(ObjectHasSelf ce) {
		return getOWLDataFactory().getOWLObjectHasSelf((OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression()));
	}
	
	@Override
	public OWLObjectMinCardinality caseObjectMinCardinality(ObjectMinCardinality ce) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		if (ce.getClassExpression() != null) {
			OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
			return getOWLDataFactory().getOWLObjectMinCardinality(ce.getCardinality(), objectProperty, classExpression);
		} else {
			return getOWLDataFactory().getOWLObjectMinCardinality(ce.getCardinality(), objectProperty);
		}
	}
	
	@Override
	public OWLObjectMaxCardinality caseObjectMaxCardinality(ObjectMaxCardinality ce) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		if (ce.getClassExpression() != null) {
			OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
			return getOWLDataFactory().getOWLObjectMaxCardinality(ce.getCardinality(), objectProperty, classExpression);
		} else {
			return getOWLDataFactory().getOWLObjectMaxCardinality(ce.getCardinality(), objectProperty);
		}
	}
	
	@Override
	public OWLObjectExactCardinality caseObjectExactCardinality(ObjectExactCardinality ce) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		if (ce.getClassExpression() != null) {
			OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
			return getOWLDataFactory().getOWLObjectExactCardinality(ce.getCardinality(), objectProperty, classExpression);
		} else {
			return getOWLDataFactory().getOWLObjectExactCardinality(ce.getCardinality(), objectProperty);
		}
	}
	
	@Override
	public OWLDataSomeValuesFrom caseDataSomeValuesFrom(DataSomeValuesFrom ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpressions());
		OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
		return getOWLDataFactory().getOWLDataSomeValuesFrom(dataProperty, dataRange);
	}
	
	@Override
	public OWLDataAllValuesFrom caseDataAllValuesFrom(DataAllValuesFrom ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpressions());
		OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
		return getOWLDataFactory().getOWLDataAllValuesFrom(dataProperty, dataRange);
	}
	
	@Override
	public OWLDataHasValue caseDataHasValue(DataHasValue ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		OWLLiteral literal = (OWLLiteral) this.doSwitch(ce.getLiteral());
		return getOWLDataFactory().getOWLDataHasValue(dataProperty, literal);
	}
	
	@Override
	public OWLDataMinCardinality caseDataMinCardinality(DataMinCardinality ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		if (ce.getDataRange() != null) {
			OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
			return getOWLDataFactory().getOWLDataMinCardinality(ce.getCardinality(), dataProperty, dataRange);
		} else {
			return getOWLDataFactory().getOWLDataMinCardinality(ce.getCardinality(), dataProperty);
		}
	}
	
	@Override
	public OWLDataMaxCardinality caseDataMaxCardinality(DataMaxCardinality ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		if (ce.getDataRange() != null) {
			OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
			return getOWLDataFactory().getOWLDataMaxCardinality(ce.getCardinality(), dataProperty, dataRange);
		} else {
			return getOWLDataFactory().getOWLDataMaxCardinality(ce.getCardinality(), dataProperty);
		}
	}
	
	@Override
	public OWLDataExactCardinality caseDataExactCardinality(DataExactCardinality ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		if (ce.getDataRange() != null) {
			OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
			return getOWLDataFactory().getOWLDataExactCardinality(ce.getCardinality(), dataProperty, dataRange);
		} else {
			return getOWLDataFactory().getOWLDataExactCardinality(ce.getCardinality(), dataProperty);
		}
	}
	
	/*
	 * DATA RANGES [W3OWL:SECTION7]
	 * https://www.w3.org/TR/owl2-syntax/#Data_Ranges
	 * DataRange := Datatype | DataIntersectionOf | DataUnionOf | DataComplementOf | DataOneOf | DatatypeRestriction
	 * Datatype is defined in the declaration axiom functions
	 */
	
	@Override
	public OWLDataIntersectionOf caseDataIntersectionOf(DataIntersectionOf ce) {
		List<OWLDataRange> dataRanges = new ArrayList<OWLDataRange>();
		ce.getDataRanges().forEach(dataRange -> {
			dataRanges.add((OWLDataRange) this.doSwitch(dataRange));
		});
		return getOWLDataFactory().getOWLDataIntersectionOf(dataRanges);
	}
	
	@Override
	public OWLDataUnionOf caseDataUnionOf(DataUnionOf ce) {
		List<OWLDataRange> dataRanges = new ArrayList<OWLDataRange>();
		ce.getDataRanges().forEach(dataRange -> {
			dataRanges.add((OWLDataRange) this.doSwitch(dataRange));
		});
		return getOWLDataFactory().getOWLDataUnionOf(dataRanges);
	}
	
	@Override
	public OWLDataComplementOf caseDataComplementOf(DataComplementOf ce) {
		return getOWLDataFactory().getOWLDataComplementOf((OWLDataRange) this.doSwitch(ce.getDataRange()));
	}
	
	@Override
	public OWLDataOneOf caseDataOneOf(DataOneOf ce) {
		List<OWLLiteral> literals = new ArrayList<OWLLiteral>();
		ce.getLiterals().forEach(literal -> {
			literals.add((OWLLiteral) this.doSwitch(literal));
		});
		return getOWLDataFactory().getOWLDataOneOf(literals);
	}
	
	@Override
	public OWLDatatypeRestriction caseDatatypeRestriction(DatatypeRestriction ce) {
		OWLDatatype dataType = (OWLDatatype) this.doSwitch(ce.getDatatype());
		List<OWLFacetRestriction> restrictions = new ArrayList<OWLFacetRestriction>();
		ce.getRestrictions().forEach(restriction -> {
			restrictions.add((OWLFacetRestriction) this.doSwitch(restriction));
		});
		return getOWLDataFactory().getOWLDatatypeRestriction(dataType, restrictions);
	}
	
	// Data Type restrictions are implemented slightly different in the OWL API from the structural specification, need to visit the restriction as a pair of [Restriction, Literal]
	@Override
	public OWLFacetRestriction caseFacetLiteralPair(FacetLiteralPair pair) {
		return getOWLDataFactory().getOWLFacetRestriction(OWLFacet.getFacet(IRI.create(pair.getConstrainingFacet().getValue())), (OWLLiteral) this.doSwitch(pair.getRestrictionValue()));
	}
	
	 /*
     * LITERALS [W3OWL:SECTION5.7]
     * https://www.w3.org/TR/owl2-syntax/#Literals
     * Literal := typedLiteral | stringLiteralNoLanguage | stringLiteralWithLanguage
     * Literals are implemented slightly different in both the OWL API and the OWL Ecore metamodel, see below
     */
	
	@Override 
	public OWLLiteral caseTypedLiteral(TypedLiteral literal) {
		OWLDatatype datatype = (OWLDatatype) this.doSwitch(literal.getDatatype());
		return getOWLDataFactory().getOWLLiteral(literal.getLexicalValue(), datatype);
	}
	
	@Override
	public OWLLiteral caseStringLiteral(StringLiteral literal) {
		return getOWLDataFactory().getOWLLiteral(literal.getQuotedString(), literal.getLanguageTag());
	}
}
