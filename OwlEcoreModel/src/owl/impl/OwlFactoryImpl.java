/**
 */
package owl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import owl.Annotation;
import owl.AnnotationAssertion;
import owl.AnnotationProperty;
import owl.AnnotationPropertyDomain;
import owl.AnnotationPropertyRange;
import owl.AnonymousIndividual;
import owl.AsymmetricObjectProperty;
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
import owl.ObjectPropertyDomain;
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
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;
import owl.TypedLiteral;
import owl.URI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlFactoryImpl extends EFactoryImpl implements OwlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwlFactory init() {
		try {
			OwlFactory theOwlFactory = (OwlFactory)EPackage.Registry.INSTANCE.getEFactory(OwlPackage.eNS_URI);
			if (theOwlFactory != null) {
				return theOwlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OwlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OwlPackage.ANNOTATION: return createAnnotation();
			case OwlPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
			case OwlPackage.URI: return createURI();
			case OwlPackage.DATATYPE: return createDatatype();
			case OwlPackage.ASYMMETRIC_OBJECT_PROPERTY: return createAsymmetricObjectProperty();
			case OwlPackage.OBJECT_PROPERTY: return createObjectProperty();
			case OwlPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
			case OwlPackage.CLASS: return createClass();
			case OwlPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
			case OwlPackage.OBJECT_UNION_OF: return createObjectUnionOf();
			case OwlPackage.OBJECT_ONE_OF: return createObjectOneOf();
			case OwlPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
			case OwlPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
			case OwlPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
			case OwlPackage.OBJECT_HAS_SELF: return createObjectHasSelf();
			case OwlPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
			case OwlPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
			case OwlPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
			case OwlPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
			case OwlPackage.DATA_PROPERTY: return createDataProperty();
			case OwlPackage.DATA_ONE_OF: return createDataOneOf();
			case OwlPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
			case OwlPackage.FACET_LITERAL_PAIR: return createFacetLiteralPair();
			case OwlPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
			case OwlPackage.DATA_HAS_VALUE: return createDataHasValue();
			case OwlPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
			case OwlPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
			case OwlPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
			case OwlPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
			case OwlPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
			case OwlPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
			case OwlPackage.DISJOINT_CLASSES: return createDisjointClasses();
			case OwlPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
			case OwlPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
			case OwlPackage.DISJOINT_UNION: return createDisjointUnion();
			case OwlPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
			case OwlPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
			case OwlPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
			case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
			case OwlPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
			case OwlPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
			case OwlPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
			case OwlPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
			case OwlPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
			case OwlPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
			case OwlPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
			case OwlPackage.SAME_INDIVIDUAL: return createSameIndividual();
			case OwlPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
			case OwlPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
			case OwlPackage.ONTOLOGY: return createOntology();
			case OwlPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
			case OwlPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
			case OwlPackage.CLASS_ASSERTION: return createClassAssertion();
			case OwlPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
			case OwlPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
			case OwlPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
			case OwlPackage.SUB_CLASS_OF: return createSubClassOf();
			case OwlPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
			case OwlPackage.INVERSE_OBJECT_PROPERTIES: return createInverseObjectProperties();
			case OwlPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
			case OwlPackage.DECLARATION: return createDeclaration();
			case OwlPackage.HAS_KEY: return createHasKey();
			case OwlPackage.TYPED_LITERAL: return createTypedLiteral();
			case OwlPackage.STRING_LITERAL: return createStringLiteral();
			case OwlPackage.DATA_INTERSECTION_OF: return createDataIntersectionOf();
			case OwlPackage.DATA_UNION_OF: return createDataUnionOf();
			case OwlPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF: return createSubAnnotationPropertyOf();
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN: return createAnnotationPropertyDomain();
			case OwlPackage.ANNOTATION_PROPERTY_RANGE: return createAnnotationPropertyRange();
			case OwlPackage.ANNOTATION_ASSERTION: return createAnnotationAssertion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty createAnnotationProperty() {
		AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURI() {
		URIImpl uri = new URIImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsymmetricObjectProperty createAsymmetricObjectProperty() {
		AsymmetricObjectPropertyImpl asymmetricObjectProperty = new AsymmetricObjectPropertyImpl();
		return asymmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseObjectProperty createInverseObjectProperty() {
		InverseObjectPropertyImpl inverseObjectProperty = new InverseObjectPropertyImpl();
		return inverseObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public owl.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIntersectionOf createObjectIntersectionOf() {
		ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
		return objectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnionOf createObjectUnionOf() {
		ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
		return objectUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOneOf createObjectOneOf() {
		ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
		return objectOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSomeValuesFrom createObjectSomeValuesFrom() {
		ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
		return objectSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAllValuesFrom createObjectAllValuesFrom() {
		ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
		return objectAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasSelf createObjectHasSelf() {
		ObjectHasSelfImpl objectHasSelf = new ObjectHasSelfImpl();
		return objectHasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasValue createObjectHasValue() {
		ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
		return objectHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMinCardinality createObjectMinCardinality() {
		ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
		return objectMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMaxCardinality createObjectMaxCardinality() {
		ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
		return objectMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSomeValuesFrom createDataSomeValuesFrom() {
		DataSomeValuesFromImpl dataSomeValuesFrom = new DataSomeValuesFromImpl();
		return dataSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOneOf createDataOneOf() {
		DataOneOfImpl dataOneOf = new DataOneOfImpl();
		return dataOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRestriction createDatatypeRestriction() {
		DatatypeRestrictionImpl datatypeRestriction = new DatatypeRestrictionImpl();
		return datatypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetLiteralPair createFacetLiteralPair() {
		FacetLiteralPairImpl facetLiteralPair = new FacetLiteralPairImpl();
		return facetLiteralPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAllValuesFrom createDataAllValuesFrom() {
		DataAllValuesFromImpl dataAllValuesFrom = new DataAllValuesFromImpl();
		return dataAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHasValue createDataHasValue() {
		DataHasValueImpl dataHasValue = new DataHasValueImpl();
		return dataHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMinCardinality createDataMinCardinality() {
		DataMinCardinalityImpl dataMinCardinality = new DataMinCardinalityImpl();
		return dataMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMaxCardinality createDataMaxCardinality() {
		DataMaxCardinalityImpl dataMaxCardinality = new DataMaxCardinalityImpl();
		return dataMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExactCardinality createDataExactCardinality() {
		DataExactCardinalityImpl dataExactCardinality = new DataExactCardinalityImpl();
		return dataExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeDataPropertyAssertion createNegativeDataPropertyAssertion() {
		NegativeDataPropertyAssertionImpl negativeDataPropertyAssertion = new NegativeDataPropertyAssertionImpl();
		return negativeDataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyDomain createDataPropertyDomain() {
		DataPropertyDomainImpl dataPropertyDomain = new DataPropertyDomainImpl();
		return dataPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyRange createDataPropertyRange() {
		DataPropertyRangeImpl dataPropertyRange = new DataPropertyRangeImpl();
		return dataPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentIndividuals createDifferentIndividuals() {
		DifferentIndividualsImpl differentIndividuals = new DifferentIndividualsImpl();
		return differentIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointClasses createDisjointClasses() {
		DisjointClassesImpl disjointClasses = new DisjointClassesImpl();
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointDataProperties createDisjointDataProperties() {
		DisjointDataPropertiesImpl disjointDataProperties = new DisjointDataPropertiesImpl();
		return disjointDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointObjectProperties createDisjointObjectProperties() {
		DisjointObjectPropertiesImpl disjointObjectProperties = new DisjointObjectPropertiesImpl();
		return disjointObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointUnion createDisjointUnion() {
		DisjointUnionImpl disjointUnion = new DisjointUnionImpl();
		return disjointUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentClasses createEquivalentClasses() {
		EquivalentClassesImpl equivalentClasses = new EquivalentClassesImpl();
		return equivalentClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentDataProperties createEquivalentDataProperties() {
		EquivalentDataPropertiesImpl equivalentDataProperties = new EquivalentDataPropertiesImpl();
		return equivalentDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDataProperty createFunctionalDataProperty() {
		FunctionalDataPropertyImpl functionalDataProperty = new FunctionalDataPropertyImpl();
		return functionalDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentObjectProperties createEquivalentObjectProperties() {
		EquivalentObjectPropertiesImpl equivalentObjectProperties = new EquivalentObjectPropertiesImpl();
		return equivalentObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalObjectProperty createFunctionalObjectProperty() {
		FunctionalObjectPropertyImpl functionalObjectProperty = new FunctionalObjectPropertyImpl();
		return functionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseFunctionalObjectProperty createInverseFunctionalObjectProperty() {
		InverseFunctionalObjectPropertyImpl inverseFunctionalObjectProperty = new InverseFunctionalObjectPropertyImpl();
		return inverseFunctionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyAssertion createObjectPropertyAssertion() {
		ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
		return objectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion() {
		NegativeObjectPropertyAssertionImpl negativeObjectPropertyAssertion = new NegativeObjectPropertyAssertionImpl();
		return negativeObjectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyDomain createObjectPropertyDomain() {
		ObjectPropertyDomainImpl objectPropertyDomain = new ObjectPropertyDomainImpl();
		return objectPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricObjectProperty createSymmetricObjectProperty() {
		SymmetricObjectPropertyImpl symmetricObjectProperty = new SymmetricObjectPropertyImpl();
		return symmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexiveObjectProperty createReflexiveObjectProperty() {
		ReflexiveObjectPropertyImpl reflexiveObjectProperty = new ReflexiveObjectPropertyImpl();
		return reflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDataPropertyOf createSubDataPropertyOf() {
		SubDataPropertyOfImpl subDataPropertyOf = new SubDataPropertyOfImpl();
		return subDataPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameIndividual createSameIndividual() {
		SameIndividualImpl sameIndividual = new SameIndividualImpl();
		return sameIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyOf createSubObjectPropertyOf() {
		SubObjectPropertyOfImpl subObjectPropertyOf = new SubObjectPropertyOfImpl();
		return subObjectPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComplementOf createObjectComplementOf() {
		ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
		return objectComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyRange createObjectPropertyRange() {
		ObjectPropertyRangeImpl objectPropertyRange = new ObjectPropertyRangeImpl();
		return objectPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyAssertion createDataPropertyAssertion() {
		DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
		return dataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAssertion createClassAssertion() {
		ClassAssertionImpl classAssertion = new ClassAssertionImpl();
		return classAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrreflexiveObjectProperty createIrreflexiveObjectProperty() {
		IrreflexiveObjectPropertyImpl irreflexiveObjectProperty = new IrreflexiveObjectPropertyImpl();
		return irreflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExactCardinality createObjectExactCardinality() {
		ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
		return objectExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataComplementOf createDataComplementOf() {
		DataComplementOfImpl dataComplementOf = new DataComplementOfImpl();
		return dataComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassOf createSubClassOf() {
		SubClassOfImpl subClassOf = new SubClassOfImpl();
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveObjectProperty createTransitiveObjectProperty() {
		TransitiveObjectPropertyImpl transitiveObjectProperty = new TransitiveObjectPropertyImpl();
		return transitiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseObjectProperties createInverseObjectProperties() {
		InverseObjectPropertiesImpl inverseObjectProperties = new InverseObjectPropertiesImpl();
		return inverseObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasKey createHasKey() {
		HasKeyImpl hasKey = new HasKeyImpl();
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedLiteral createTypedLiteral() {
		TypedLiteralImpl typedLiteral = new TypedLiteralImpl();
		return typedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntersectionOf createDataIntersectionOf() {
		DataIntersectionOfImpl dataIntersectionOf = new DataIntersectionOfImpl();
		return dataIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnionOf createDataUnionOf() {
		DataUnionOfImpl dataUnionOf = new DataUnionOfImpl();
		return dataUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition createDataTypeDefinition() {
		DataTypeDefinitionImpl dataTypeDefinition = new DataTypeDefinitionImpl();
		return dataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAnnotationPropertyOf createSubAnnotationPropertyOf() {
		SubAnnotationPropertyOfImpl subAnnotationPropertyOf = new SubAnnotationPropertyOfImpl();
		return subAnnotationPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyDomain createAnnotationPropertyDomain() {
		AnnotationPropertyDomainImpl annotationPropertyDomain = new AnnotationPropertyDomainImpl();
		return annotationPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyRange createAnnotationPropertyRange() {
		AnnotationPropertyRangeImpl annotationPropertyRange = new AnnotationPropertyRangeImpl();
		return annotationPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAssertion createAnnotationAssertion() {
		AnnotationAssertionImpl annotationAssertion = new AnnotationAssertionImpl();
		return annotationAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlPackage getOwlPackage() {
		return (OwlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OwlPackage getPackage() {
		return OwlPackage.eINSTANCE;
	}

} //OwlFactoryImpl
