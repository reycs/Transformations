package owlecore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
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
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
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
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.vocab.OWLFacet;

import owl.AnnotationProperty;
import owl.AnonymousIndividual;
import owl.AsymmetricObjectProperty;
import owl.ClassAssertion;
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
import owl.DataPropertyRange;
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
import owl.ObjectPropertyRange;
import owl.ObjectSomeValuesFrom;
import owl.ObjectUnionOf;
import owl.OwlPackage;
import owl.ReflexiveObjectProperty;
import owl.SameIndividual;
import owl.SubClassOf;
import owl.SubDataPropertyOf;
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;
import owl.util.OwlSwitch;

public class OwlEcoreParser extends OwlSwitch<OWLObject> {
	private OWLOntologyManager ontologyManager;
	private OWLDataFactory ontologyDataFactory;
	private OWLOntology ontology;
	private Resource ecoreOntologyInstance;
	private HashMap<String, OWLClass> classEntities;
	private HashMap<String, OWLDatatype> datatypeEntities;
	private HashMap<String, OWLObjectProperty> objectPropertyEntities;
	private HashMap<String, OWLDataProperty> dataPropertyEntities;
	private HashMap<String, OWLAnnotationProperty> annotationPropertyEntities;
	private HashMap<String, OWLNamedIndividual> namedIndividualEntities;
	
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
		
		// Keep track of declared entities
		classEntities = new HashMap<String, OWLClass>();
		datatypeEntities = new HashMap<String, OWLDatatype>();
		objectPropertyEntities = new HashMap<String, OWLObjectProperty>();
		dataPropertyEntities = new HashMap<String, OWLDataProperty>();
		annotationPropertyEntities = new HashMap<String, OWLAnnotationProperty>();
		namedIndividualEntities = new HashMap<String, OWLNamedIndividual>();
		
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
	
    /*
     * DECLARATION AXIOMS [W3OWL:SECTION5]
     * https://www.w3.org/TR/owl2-syntax/#Entities.2C_Literals.2C_and_Anonymous_Individuals
     * Entities := Class | Datatype | ObjectProperty | DataProperty | AnnotationProperty | NamedIndividual
     */
	
	@Override
	public OWLClass caseClass(owl.Class entity) {
		if (classEntities.containsKey(entity.getEntityURI().getValue())) {
			return classEntities.get(entity.getEntityURI().getValue());
		} else {
			OWLClass newClass = ontologyDataFactory.getOWLClass(entity.getEntityURI().getValue());
			OWLDeclarationAxiom newClassDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newClass);
			classEntities.put(entity.getEntityURI().getValue(), newClass);
			ontology.add(newClassDeclaration);
			return newClass;
		}
	}
	
	@Override
	public OWLDatatype caseDatatype(Datatype entity) {
		if (datatypeEntities.containsKey(entity.getEntityURI().getValue())) {
			return datatypeEntities.get(entity.getEntityURI().getValue());
		} else {
			OWLDatatype newDatatype = ontologyDataFactory.getOWLDatatype(entity.getEntityURI().getValue());
			OWLDeclarationAxiom newDatatypeDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newDatatype);
			datatypeEntities.put(entity.getEntityURI().getValue(), newDatatype);
			ontology.add(newDatatypeDeclaration);
			return newDatatype;
		}
	}
	
	@Override
	public OWLObjectProperty caseObjectProperty(ObjectProperty entity) {
		if (objectPropertyEntities.containsKey(entity.getEntityURI().getValue())) {
			return objectPropertyEntities.get(entity.getEntityURI().getValue());
		} else {
			OWLObjectProperty newObjectProperty = ontologyDataFactory.getOWLObjectProperty(entity.getEntityURI().getValue());
			OWLDeclarationAxiom newObjectPropertyDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newObjectProperty);
			objectPropertyEntities.put(entity.getEntityURI().getValue(), newObjectProperty);
			ontology.add(newObjectPropertyDeclaration);
			return newObjectProperty;
		}
	}
	
	@Override 
	public OWLDataProperty caseDataProperty(DataProperty entity) {
		if (dataPropertyEntities.containsKey(entity.getEntityURI().getValue())) {
			return dataPropertyEntities.get(entity.getEntityURI().getValue());
		} else {
			OWLDataProperty newDataProperty = ontologyDataFactory.getOWLDataProperty(entity.getEntityURI().getValue());
			OWLDeclarationAxiom newDataPropertyDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newDataProperty);
			dataPropertyEntities.put(entity.getEntityURI().getValue(), newDataProperty);
			ontology.add(newDataPropertyDeclaration);
			return newDataProperty;
		}
	}
	
	@Override
	public OWLAnnotationProperty caseAnnotationProperty(AnnotationProperty entity) {
		if (annotationPropertyEntities.containsKey(entity.getEntityURI().getValue())) {
			return annotationPropertyEntities.get(entity.getEntityURI().getValue());
		} else {
			OWLAnnotationProperty newAnnotationProperty = ontologyDataFactory.getOWLAnnotationProperty(entity.getEntityURI().getValue());
			OWLDeclarationAxiom newAnnotationPropertyDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newAnnotationProperty);
			annotationPropertyEntities.put(entity.getEntityURI().getValue(), newAnnotationProperty);
			ontology.add(newAnnotationPropertyDeclaration);
			return newAnnotationProperty;
		}
	}
	
	@Override
	public OWLNamedIndividual caseNamedIndividual(NamedIndividual entity) {
		if (namedIndividualEntities.containsKey(entity.getEntityURI().getValue())) {
			return namedIndividualEntities.get(entity.getEntityURI().getValue());
		} else {
			OWLNamedIndividual newNamedIndividual = ontologyDataFactory.getOWLNamedIndividual(entity.getEntityURI().getValue());
			OWLDeclarationAxiom newNamedIndividualDeclaration = ontologyDataFactory.getOWLDeclarationAxiom(newNamedIndividual);
			namedIndividualEntities.put(entity.getEntityURI().getValue(), newNamedIndividual);
			ontology.add(newNamedIndividualDeclaration);
			return newNamedIndividual;
		}
	}
	
	@Override
	public OWLAnonymousIndividual caseAnonymousIndividual(AnonymousIndividual individual) {
		OWLAnonymousIndividual newAnonymousIndividual = ontologyDataFactory.getOWLAnonymousIndividual(individual.getNodeID());
		return newAnonymousIndividual;
	}
	
	  /*
     * CLASS EXPRESSION AXIOMS [W3OWL:SECTION9.1]
     * https://www.w3.org/TR/owl2-syntax/#Class_Expression_Axioms
     * ClassAxiom := SubClassOf | EquivalentClasses | DisjointClasses | DisjointUnion
     */
	
	@Override
	public OWLSubClassOfAxiom caseSubClassOf(SubClassOf object) {
		OWLClassExpression subClass = (OWLClassExpression) this.doSwitch(object.getSubClassExpression());
		OWLClassExpression superClass = (OWLClassExpression) this.doSwitch(object.getSuperClassExpression());
		OWLSubClassOfAxiom newSubClassOfAxiom = ontologyDataFactory.getOWLSubClassOfAxiom(subClass, superClass);
		ontology.add(newSubClassOfAxiom);
		return newSubClassOfAxiom;
	}
	
	@Override
	public OWLEquivalentClassesAxiom caseEquivalentClasses(EquivalentClasses object) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		object.getEquivalentClassExpressions().forEach(ce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(ce));
		});
		OWLEquivalentClassesAxiom newEquivalentClassesAxiom = ontologyDataFactory.getOWLEquivalentClassesAxiom(classExpressions);
		ontology.add(newEquivalentClassesAxiom);
		return newEquivalentClassesAxiom;
	}
	
	@Override
	public OWLDisjointClassesAxiom caseDisjointClasses(DisjointClasses object) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		object.getDisjointClassExpressions().forEach(ce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(ce));
		});
		OWLDisjointClassesAxiom newDisjointClassesAxiom = ontologyDataFactory.getOWLDisjointClassesAxiom(classExpressions);
		ontology.add(newDisjointClassesAxiom);
		return newDisjointClassesAxiom;
	}
	
	@Override
	public OWLDisjointUnionAxiom caseDisjointUnion(DisjointUnion object) {
		OWLClass unionClass = (OWLClass) this.doSwitch(object.getUnionClass());
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		object.getDisjointClassExpressions().forEach(ce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(ce));
		});
		OWLDisjointUnionAxiom newDisjointUnionAxiom = ontologyDataFactory.getOWLDisjointUnionAxiom(unionClass, classExpressions);
		ontology.add(newDisjointUnionAxiom);
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
	public OWLSubObjectPropertyOfAxiom caseSubObjectPropertyOf(SubObjectPropertyOf object) {
		OWLObjectPropertyExpression subPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(object.getSubObjectPropertyExpressions());
		OWLObjectPropertyExpression superPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(object.getSuperObjectPropertyExpression());
		OWLSubObjectPropertyOfAxiom newSubObjectPropertyOfAxiom = ontologyDataFactory.getOWLSubObjectPropertyOfAxiom(subPropertyExpression, superPropertyExpression);
		ontology.add(newSubObjectPropertyOfAxiom);
		return newSubObjectPropertyOfAxiom;
	}
	
	@Override
	public OWLEquivalentObjectPropertiesAxiom caseEquivalentObjectProperties(EquivalentObjectProperties object) {
		List<OWLObjectPropertyExpression> objectProperties = new ArrayList<OWLObjectPropertyExpression>();
		object.getObjectPropertyExpressions().forEach(pe -> {
			objectProperties.add((OWLObjectPropertyExpression) this.doSwitch(pe));
		});
		OWLEquivalentObjectPropertiesAxiom newEquivalentObjectPropertiesAxiom = ontologyDataFactory.getOWLEquivalentObjectPropertiesAxiom(objectProperties);
		ontology.add(newEquivalentObjectPropertiesAxiom);
		return newEquivalentObjectPropertiesAxiom;
	}
	
	@Override
	public OWLDisjointObjectPropertiesAxiom caseDisjointObjectProperties(DisjointObjectProperties object) {
		List<OWLObjectPropertyExpression> objectProperties = new ArrayList<OWLObjectPropertyExpression>();
		object.getObjectPropertyExpressions().forEach(pe -> {
			objectProperties.add((OWLObjectPropertyExpression) this.doSwitch(pe));
		});
		OWLDisjointObjectPropertiesAxiom newDisjointObjectPropertiesAxiom = ontologyDataFactory.getOWLDisjointObjectPropertiesAxiom(objectProperties);
		ontology.add(newDisjointObjectPropertiesAxiom);
		return newDisjointObjectPropertiesAxiom;
	}
	
	@Override
	public OWLInverseObjectPropertiesAxiom caseInverseObjectProperties(InverseObjectProperties object) {
		// this object should have two items in the list of propertyexpressions otherwise its invalid
		if (object.getInverseObjectProperties().size() == 2) {
			OWLObjectPropertyExpression firstProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getInverseObjectProperties().get(0));
			OWLObjectPropertyExpression secondProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getInverseObjectProperties().get(1));
			OWLInverseObjectPropertiesAxiom newInverseObjectProperties = ontologyDataFactory.getOWLInverseObjectPropertiesAxiom(firstProperty, secondProperty);
			ontology.add(newInverseObjectProperties);
			return newInverseObjectProperties;
		}
		return null;
	}
	
	@Override
	public OWLObjectPropertyDomainAxiom caseObjectPropertyDomain(ObjectPropertyDomain object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLClassExpression domain = (OWLClassExpression) this.doSwitch(object.getDomain());
		OWLObjectPropertyDomainAxiom newObjectPropertyDomainAxiom = ontologyDataFactory.getOWLObjectPropertyDomainAxiom(objectProperty, domain);
		ontology.add(newObjectPropertyDomainAxiom);
		return newObjectPropertyDomainAxiom;
	}
	
	@Override
	public OWLObjectPropertyRangeAxiom caseObjectPropertyRange(ObjectPropertyRange object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLClassExpression range = (OWLClassExpression) this.doSwitch(object.getRange());
		OWLObjectPropertyRangeAxiom newObjectPropertyRangeAxiom = ontologyDataFactory.getOWLObjectPropertyRangeAxiom(objectProperty, range);
		ontology.add(newObjectPropertyRangeAxiom);
		return newObjectPropertyRangeAxiom;
	}
	
	@Override
	public OWLFunctionalObjectPropertyAxiom caseFunctionalObjectProperty(FunctionalObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLFunctionalObjectPropertyAxiom newFunctionObjectPropertyAxiom = ontologyDataFactory.getOWLFunctionalObjectPropertyAxiom(objectProperty);
		ontology.add(newFunctionObjectPropertyAxiom);
		return newFunctionObjectPropertyAxiom;
	}
	
	@Override
	public OWLInverseFunctionalObjectPropertyAxiom caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLInverseFunctionalObjectPropertyAxiom newInverseFunctionalPropertyAxiom = ontologyDataFactory.getOWLInverseFunctionalObjectPropertyAxiom(objectProperty);
		ontology.add(newInverseFunctionalPropertyAxiom);
		return newInverseFunctionalPropertyAxiom;
	}
	
	@Override
	public OWLReflexiveObjectPropertyAxiom caseReflexiveObjectProperty(ReflexiveObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLReflexiveObjectPropertyAxiom newReflexiveObjectPropertyAxiom = ontologyDataFactory.getOWLReflexiveObjectPropertyAxiom(objectProperty);
		ontology.add(newReflexiveObjectPropertyAxiom);
		return newReflexiveObjectPropertyAxiom;
	}
	
	@Override
	public OWLIrreflexiveObjectPropertyAxiom caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLIrreflexiveObjectPropertyAxiom newIrreflexiveObjectPropertyAxiom = ontologyDataFactory.getOWLIrreflexiveObjectPropertyAxiom(objectProperty);
		ontology.add(newIrreflexiveObjectPropertyAxiom);
		return newIrreflexiveObjectPropertyAxiom;
	}
	
	@Override
	public OWLSymmetricObjectPropertyAxiom caseSymmetricObjectProperty(SymmetricObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLSymmetricObjectPropertyAxiom newSymmetricObjectPropertyAxiom = ontologyDataFactory.getOWLSymmetricObjectPropertyAxiom(objectProperty);
		ontology.add(newSymmetricObjectPropertyAxiom);
		return newSymmetricObjectPropertyAxiom;
	}
	
	@Override
	public OWLAsymmetricObjectPropertyAxiom caseAsymmetricObjectProperty(AsymmetricObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLAsymmetricObjectPropertyAxiom newAsymmetricObjectPropertyAxiom = ontologyDataFactory.getOWLAsymmetricObjectPropertyAxiom(objectProperty);
		ontology.add(newAsymmetricObjectPropertyAxiom);
		return newAsymmetricObjectPropertyAxiom;
	}
	
	@Override
	public OWLTransitiveObjectPropertyAxiom caseTransitiveObjectProperty(TransitiveObjectProperty object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLTransitiveObjectPropertyAxiom newTransitiveObjectPropertyAxiom = ontologyDataFactory.getOWLTransitiveObjectPropertyAxiom(objectProperty);
		ontology.add(newTransitiveObjectPropertyAxiom);
		return newTransitiveObjectPropertyAxiom;
	}
	
    /*
     * DATA PROPERTY AXIOMS [W3OWL:SECTION9.3]
     * https://www.w3.org/TR/owl2-syntax/#Data_Property_Axioms
     * DataPropertyAxiom := SubDataPropertyOf | EquivalentDataProperties | DisjointDataProperties | DataPropertyDomain | DataPropertyRange | FunctionalDataProperty
     */
	
	@Override
	public OWLSubDataPropertyOfAxiom caseSubDataPropertyOf(SubDataPropertyOf object) {
		OWLDataPropertyExpression subDataPropertyExpression = (OWLDataPropertyExpression) this.doSwitch(object.getSubDataPropertyExpression());
		OWLDataPropertyExpression superDataPropertyExpression = (OWLDataPropertyExpression) this.doSwitch(object.getSuperDataPropertyExpression());
		OWLSubDataPropertyOfAxiom newSubDataPropertyOfAxiom = ontologyDataFactory.getOWLSubDataPropertyOfAxiom(subDataPropertyExpression, superDataPropertyExpression);
		ontology.add(newSubDataPropertyOfAxiom);
		return newSubDataPropertyOfAxiom;
	}
	
	@Override
	public OWLEquivalentDataPropertiesAxiom caseEquivalentDataProperties(EquivalentDataProperties object) {
		List<OWLDataPropertyExpression> dataProperties = new ArrayList<OWLDataPropertyExpression>();
		object.getDataPropertyExpressions().forEach(pe -> {
			dataProperties.add((OWLDataPropertyExpression) this.doSwitch(pe));
		});
		OWLEquivalentDataPropertiesAxiom newOwlEquivalentDataPropertiesAxiom = ontologyDataFactory.getOWLEquivalentDataPropertiesAxiom(dataProperties);
		ontology.add(newOwlEquivalentDataPropertiesAxiom);
		return newOwlEquivalentDataPropertiesAxiom;
	}
	
	@Override
	public OWLDisjointDataPropertiesAxiom caseDisjointDataProperties(DisjointDataProperties object) {
		List<OWLDataPropertyExpression> dataPropeties = new ArrayList<OWLDataPropertyExpression>();
		object.getDataPropertyExpressions().forEach(pe -> {
			dataPropeties.add((OWLDataPropertyExpression) this.doSwitch(pe));
		});
		OWLDisjointDataPropertiesAxiom newDisjointDataPropertiesAxiom = ontologyDataFactory.getOWLDisjointDataPropertiesAxiom(dataPropeties);
		ontology.add(newDisjointDataPropertiesAxiom);
		return newDisjointDataPropertiesAxiom;
	}
	
	@Override
	public OWLDataPropertyDomainAxiom caseDataPropertyDomain(DataPropertyDomain object) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(object.getDataPropertyExpression());
		OWLClassExpression domain = (OWLClassExpression) this.doSwitch(object.getDomain());
		OWLDataPropertyDomainAxiom newDataPropertyDomainAxiom = ontologyDataFactory.getOWLDataPropertyDomainAxiom(dataProperty, domain);
		ontology.add(newDataPropertyDomainAxiom);
		return newDataPropertyDomainAxiom;
	}
	
	@Override
	public OWLDataPropertyRangeAxiom caseDataPropertyRange(DataPropertyRange object) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(object.getDataPropertyExpression());
		OWLDataRange range = (OWLDataRange) this.doSwitch(object.getRange());
		OWLDataPropertyRangeAxiom newDataPropertyRangeAxiom = ontologyDataFactory.getOWLDataPropertyRangeAxiom(dataProperty, range);
		ontology.add(newDataPropertyRangeAxiom);
		return newDataPropertyRangeAxiom;
	}
	
	@Override
	public OWLFunctionalDataPropertyAxiom caseFunctionalDataProperty(FunctionalDataProperty object) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(object.getDataPropertyExpression());
		OWLFunctionalDataPropertyAxiom newFunctionalDataPropertyAxiom = ontologyDataFactory.getOWLFunctionalDataPropertyAxiom(dataProperty);
		ontology.add(newFunctionalDataPropertyAxiom);
		return newFunctionalDataPropertyAxiom;
	}
	
    /*
     * DATATYPE DEFINITIONS [W3OWL:SECTION9.4]
     * https://www.w3.org/TR/owl2-syntax/#Datatype_Definitions
     */
	
	// CURRENTLY NOT AVAILABLE IN METAMODEL
	
    /*
     * KEYS [W3OWL:SECTION9.5]
     * https://www.w3.org/TR/owl2-syntax/#Keys
     */
	
	@Override
	public OWLHasKeyAxiom caseKeyFor(KeyFor object) {
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(object.getClassExpression());
		List<OWLPropertyExpression> propertyExpressions = new ArrayList<OWLPropertyExpression>();
		object.getObjectPropertyExpressions().forEach(pe -> {
			propertyExpressions.add((OWLObjectPropertyExpression) this.doSwitch(pe));
		});
		object.getDataPropertyExpressions().forEach(pe -> {
			propertyExpressions.add((OWLDataPropertyExpression) this.doSwitch(pe));
		});
		OWLHasKeyAxiom newHasKeyAxiom = ontologyDataFactory.getOWLHasKeyAxiom(classExpression, propertyExpressions);
		ontology.add(newHasKeyAxiom);
		return newHasKeyAxiom;
	}
	
	  /*
     * ASSERTIONS [W3OWL:SECTION9.6]
     * https://www.w3.org/TR/owl2-syntax/#Assertions
     * Assertion := SameIndividual | DifferentIndividuals | ClassAssertion | ObjectPropertyAssertion
     * NegativeObjectPropertyAssertion | DataPropertyAssertion | NegativeDataPropertyAssertion
     */
	
	@Override
	public OWLSameIndividualAxiom caseSameIndividual(SameIndividual object) {
		List<OWLIndividual> individuals = new ArrayList<OWLIndividual>();
		object.getSameIndividuals().forEach(individual -> {
			individuals.add((OWLIndividual) this.doSwitch(individual));
		});
		OWLSameIndividualAxiom newSameIndividualAxiom = ontologyDataFactory.getOWLSameIndividualAxiom(individuals);
		ontology.add(newSameIndividualAxiom);
		return newSameIndividualAxiom;
	}
	
	@Override
	public OWLDifferentIndividualsAxiom caseDifferentIndividuals(DifferentIndividuals object) {
		List<OWLIndividual> individuals = new ArrayList<OWLIndividual>();
		object.getDifferentIndividuals().forEach(individual -> {
			individuals.add((OWLIndividual) this.doSwitch(individual));
		});
		OWLDifferentIndividualsAxiom newDifferentIndividualsAxiom = ontologyDataFactory.getOWLDifferentIndividualsAxiom(individuals);
		ontology.add(newDifferentIndividualsAxiom);
		return newDifferentIndividualsAxiom;
	}
	
	@Override
	public OWLClassAssertionAxiom caseClassAssertion(ClassAssertion object) {
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(object.getClassExpression());
		OWLIndividual individual = (OWLIndividual) this.doSwitch(object.getIndividual());
		OWLClassAssertionAxiom newClassAssertionAxiom = ontologyDataFactory.getOWLClassAssertionAxiom(classExpression, individual);
		ontology.add(newClassAssertionAxiom);
		return newClassAssertionAxiom;
	}
	
	@Override
	public OWLObjectPropertyAssertionAxiom caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(object.getSourceIndividual());
		OWLIndividual targetIndividual = (OWLIndividual) this.doSwitch(object.getTargetIndividual());
		OWLObjectPropertyAssertionAxiom newObjectPropertyAssertionAxiom = ontologyDataFactory.getOWLObjectPropertyAssertionAxiom(objectProperty, sourceIndividual, targetIndividual);
		ontology.add(newObjectPropertyAssertionAxiom);
		return newObjectPropertyAssertionAxiom;
	}
	
	@Override
	public OWLNegativeObjectPropertyAssertionAxiom caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(object.getObjectPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(object.getSourceIndividual());
		OWLIndividual targetIndividual = (OWLIndividual) this.doSwitch(object.getTargetIndividual());
		OWLNegativeObjectPropertyAssertionAxiom newNegativeObjectPropertyAssertionAxiom = ontologyDataFactory.getOWLNegativeObjectPropertyAssertionAxiom(objectProperty, sourceIndividual, targetIndividual);
		ontology.add(newNegativeObjectPropertyAssertionAxiom);
		return newNegativeObjectPropertyAssertionAxiom;
	}
	
	@Override
	public OWLDataPropertyAssertionAxiom caseDataPropertyAssertion(DataPropertyAssertion object) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(object.getDataPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(object.getSourceIndividual());
		OWLLiteral targetValue = (OWLLiteral) this.doSwitch(object.getTargetValue());
		OWLDataPropertyAssertionAxiom newDataPropertyAssertionAxiom = ontologyDataFactory.getOWLDataPropertyAssertionAxiom(dataProperty, sourceIndividual, targetValue);
		ontology.add(newDataPropertyAssertionAxiom);
		return newDataPropertyAssertionAxiom;
	}
	
	@Override
	public OWLNegativeDataPropertyAssertionAxiom caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(object.getDataPropertyExpression());
		OWLIndividual sourceIndividual = (OWLIndividual) this.doSwitch(object.getSourceIndividual());
		OWLLiteral targetValue = (OWLLiteral) this.doSwitch(object.getTargetValue());
		OWLNegativeDataPropertyAssertionAxiom newNegativeDataPropertyAssertionAxiom = ontologyDataFactory.getOWLNegativeDataPropertyAssertionAxiom(dataProperty, sourceIndividual, targetValue);
		ontology.add(newNegativeDataPropertyAssertionAxiom);
		return newNegativeDataPropertyAssertionAxiom;
	}
	
	  /*
     * ANNOTATION OF ONTOLOGIES AXIOMS AND OTHER ANNOTATIONS [W3OWL:SECTION10.1]
     * https://www.w3.org/TR/owl2-syntax/#Annotations
     */
	
	// ANNOTATION NOT PROPERLY MODELLED IN THE METAMODEL
	
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
		return ontologyDataFactory.getOWLObjectIntersectionOf(classExpressions);
	}
	
	@Override
	public OWLObjectUnionOf caseObjectUnionOf(ObjectUnionOf ce) {
		List<OWLClassExpression> classExpressions = new ArrayList<OWLClassExpression>();
		ce.getClassExpressions().forEach(cce -> {
			classExpressions.add((OWLClassExpression) this.doSwitch(cce));
		});
		return ontologyDataFactory.getOWLObjectUnionOf(classExpressions);
	}
	
	@Override
	public OWLObjectComplementOf caseObjectComplementOf(ObjectComplementOf ce) {
		return ontologyDataFactory.getOWLObjectComplementOf((OWLClassExpression) this.doSwitch(ce.getClassExpression()));
	}
	
	@Override
	public OWLObjectOneOf caseObjectOneOf(ObjectOneOf ce) {
		List<OWLIndividual> individuals = new ArrayList<OWLIndividual>();
		ce.getIndividuals().forEach(individual -> {
			individuals.add((OWLIndividual) this.doSwitch(individual));
		});
		return ontologyDataFactory.getOWLObjectOneOf(individuals);
	}
	
	@Override
	public OWLObjectSomeValuesFrom caseObjectSomeValuesFrom(ObjectSomeValuesFrom ce) {
		OWLObjectPropertyExpression objectPropertyExpression = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
		return ontologyDataFactory.getOWLObjectSomeValuesFrom(objectPropertyExpression, classExpression);
	}
	
	@Override
	public OWLObjectAllValuesFrom caseObjectAllValuesFrom(ObjectAllValuesFrom ce) {
		OWLObjectPropertyExpression propertyExpression = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
		return ontologyDataFactory.getOWLObjectAllValuesFrom(propertyExpression, classExpression);
	}
	
	@Override
	public OWLObjectHasValue caseObjectHasValue(ObjectHasValue ce) {
		OWLObjectPropertyExpression propertyExpression = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		OWLIndividual individual = (OWLIndividual) this.doSwitch(ce.getIndividual());
		return ontologyDataFactory.getOWLObjectHasValue(propertyExpression, individual);
	}
	
	@Override
	public OWLObjectHasSelf caseObjectExistsSelf(ObjectExistsSelf ce) {
		return ontologyDataFactory.getOWLObjectHasSelf((OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression()));
	}
	
	@Override
	public OWLObjectMinCardinality caseObjectMinCardinality(ObjectMinCardinality ce) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		if (ce.getClassExpression() != null) {
			OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
			return ontologyDataFactory.getOWLObjectMinCardinality(ce.getCardinality(), objectProperty, classExpression);
		} else {
			return ontologyDataFactory.getOWLObjectMinCardinality(ce.getCardinality(), objectProperty);
		}
	}
	
	@Override
	public OWLObjectMaxCardinality caseObjectMaxCardinality(ObjectMaxCardinality ce) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		if (ce.getClassExpression() != null) {
			OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
			return ontologyDataFactory.getOWLObjectMaxCardinality(ce.getCardinality(), objectProperty, classExpression);
		} else {
			return ontologyDataFactory.getOWLObjectMaxCardinality(ce.getCardinality(), objectProperty);
		}
	}
	
	@Override
	public OWLObjectExactCardinality caseObjectExactCardinality(ObjectExactCardinality ce) {
		OWLObjectPropertyExpression objectProperty = (OWLObjectPropertyExpression) this.doSwitch(ce.getObjectPropertyExpression());
		if (ce.getClassExpression() != null) {
			OWLClassExpression classExpression = (OWLClassExpression) this.doSwitch(ce.getClassExpression());
			return ontologyDataFactory.getOWLObjectExactCardinality(ce.getCardinality(), objectProperty, classExpression);
		} else {
			return ontologyDataFactory.getOWLObjectExactCardinality(ce.getCardinality(), objectProperty);
		}
	}
	
	@Override
	public OWLDataSomeValuesFrom caseDataSomeValuesFrom(DataSomeValuesFrom ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpressions());
		OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
		return ontologyDataFactory.getOWLDataSomeValuesFrom(dataProperty, dataRange);
	}
	
	@Override
	public OWLDataAllValuesFrom caseDataAllValuesFrom(DataAllValuesFrom ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpressions());
		OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
		return ontologyDataFactory.getOWLDataAllValuesFrom(dataProperty, dataRange);
	}
	
	@Override
	public OWLDataHasValue caseDataHasValue(DataHasValue ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		OWLLiteral literal = (OWLLiteral) this.doSwitch(ce.getConstant());
		return ontologyDataFactory.getOWLDataHasValue(dataProperty, literal);
	}
	
	@Override
	public OWLDataMinCardinality caseDataMinCardinality(DataMinCardinality ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		if (ce.getDataRange() != null) {
			OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
			return ontologyDataFactory.getOWLDataMinCardinality(ce.getCardinality(), dataProperty, dataRange);
		} else {
			return ontologyDataFactory.getOWLDataMinCardinality(ce.getCardinality(), dataProperty);
		}
	}
	
	@Override
	public OWLDataMaxCardinality caseDataMaxCardinality(DataMaxCardinality ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		if (ce.getDataRange() != null) {
			OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
			return ontologyDataFactory.getOWLDataMaxCardinality(ce.getCardinality(), dataProperty, dataRange);
		} else {
			return ontologyDataFactory.getOWLDataMaxCardinality(ce.getCardinality(), dataProperty);
		}
	}
	
	@Override
	public OWLDataExactCardinality caseDataExactCardinality(DataExactCardinality ce) {
		OWLDataPropertyExpression dataProperty = (OWLDataPropertyExpression) this.doSwitch(ce.getDataPropertyExpression());
		if (ce.getDataRange() != null) {
			OWLDataRange dataRange = (OWLDataRange) this.doSwitch(ce.getDataRange());
			return ontologyDataFactory.getOWLDataExactCardinality(ce.getCardinality(), dataProperty, dataRange);
		} else {
			return ontologyDataFactory.getOWLDataExactCardinality(ce.getCardinality(), dataProperty);
		}
	}
	
	/*
	 * DATA RANGES [W3OWL:SECTION7]
	 * https://www.w3.org/TR/owl2-syntax/#Data_Ranges
	 * DataRange := Datatype | DataIntersectionOf | DataUnionOf | DataComplementOf | DataOneOf | DatatypeRestriction
	 * Datatype is defined in the declaration axiom functions
	 */
	
	// DATA INTERSECTION OF AND DATA UNION OF MISSING
	
	@Override
	public OWLDataComplementOf caseDataComplementOf(DataComplementOf ce) {
		return ontologyDataFactory.getOWLDataComplementOf((OWLDataRange) this.doSwitch(ce.getDataRange()));
	}
	
	@Override
	public OWLDataOneOf caseDataOneOf(DataOneOf ce) {
		List<OWLLiteral> literals = new ArrayList<OWLLiteral>();
		ce.getConstants().forEach(constant -> {
			literals.add((OWLLiteral) this.doSwitch(constant));
		});
		return ontologyDataFactory.getOWLDataOneOf(literals);
	}
	
	@Override
	public OWLDatatypeRestriction caseDatatypeRestriction(DatatypeRestriction ce) {
		OWLDatatype dataType = (OWLDatatype) this.doSwitch(ce.getDatatype());
		List<OWLFacetRestriction> restrictions = new ArrayList<OWLFacetRestriction>();
		ce.getRestrictions().forEach(restriction -> {
			restrictions.add((OWLFacetRestriction) this.doSwitch(restriction));
		});
		return ontologyDataFactory.getOWLDatatypeRestriction(dataType, restrictions);
	}
	
	// Data Type restrictions are implemented slightly different in the OWL API from the structural specification, need to visit the restriction as a pair of [Restriction, Literal]
	@Override
	public OWLFacetRestriction caseFacetConstantPair(FacetConstantPair pair) {
		return ontologyDataFactory.getOWLFacetRestriction(OWLFacet.getFacet(IRI.create(pair.getFacet())), (OWLLiteral) this.doSwitch(pair.getConstant()));
	}
	
	 /*
     * LITERALS [W3OWL:SECTION5.7]
     * https://www.w3.org/TR/owl2-syntax/#Literals
     * Literal := typedLiteral | stringLiteralNoLanguage | stringLiteralWithLanguage
     * Literals are implemented slightly different in both the OWL API and the OWL Ecore metamodel, see below
     */
	
	@Override 
	public OWLLiteral caseConstant(Constant co) {
		OWLDatatype datatype = (OWLDatatype) this.doSwitch(co.getDatatype());
		return ontologyDataFactory.getOWLLiteral(co.getLexicalValue(), datatype);
	}
}
