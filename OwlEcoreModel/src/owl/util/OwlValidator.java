/**
 */
package owl.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import owl.Annotation;
import owl.AnnotationAssertion;
import owl.AnnotationAxiom;
import owl.AnnotationProperty;
import owl.AnnotationPropertyDomain;
import owl.AnnotationPropertyRange;
import owl.AnnotationSubject;
import owl.AnnotationValue;
import owl.AnonymousIndividual;
import owl.Assertion;
import owl.AsymmetricObjectProperty;
import owl.Axiom;
import owl.ClassAssertion;
import owl.ClassAxiom;
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
import owl.DataPropertyAxiom;
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
import owl.ObjectAndDataPropertyAxiom;
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
import owl.ObjectPropertyAxiom;
import owl.ObjectPropertyChain;
import owl.ObjectPropertyDomain;
import owl.ObjectPropertyExpression;
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
import owl.SubObjectPropertyExpression;
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;
import owl.TypedLiteral;
import owl.URI;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see owl.OwlPackage
 * @generated
 */
public class OwlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OwlValidator INSTANCE = new OwlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "owl";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thecardinalitymustbenonnegative' of 'Object Min Cardinality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_MIN_CARDINALITY__THECARDINALITYMUSTBENONNEGATIVE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thecardinalitymustbenonnegative' of 'Object Max Cardinality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_MAX_CARDINALITY__THECARDINALITYMUSTBENONNEGATIVE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thecardinalitymustbenonnegative' of 'Data Min Cardinality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_MIN_CARDINALITY__THECARDINALITYMUSTBENONNEGATIVE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thecardinalitymustbenonnegative' of 'Data Max Cardinality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_MAX_CARDINALITY__THECARDINALITYMUSTBENONNEGATIVE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thecardinalitymustbenonnegative' of 'Data Exact Cardinality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_EXACT_CARDINALITY__THECARDINALITYMUSTBENONNEGATIVE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thedatarangemustbeofarityone' of 'Data Property Range'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_PROPERTY_RANGE__THEDATARANGEMUSTBEOFARITYONE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version UR Irequiresontology UR Itobespecified' of 'Ontology'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONTOLOGY__VERSION_UR_IREQUIRESONTOLOGY_UR_ITOBESPECIFIED = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Thecardinalitymustbenonnegative' of 'Object Exact Cardinality'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_EXACT_CARDINALITY__THECARDINALITYMUSTBENONNEGATIVE = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OwlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OwlPackage.ASSERTION:
				return validateAssertion((Assertion)value, diagnostics, context);
			case OwlPackage.AXIOM:
				return validateAxiom((Axiom)value, diagnostics, context);
			case OwlPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case OwlPackage.ANNOTATION_PROPERTY:
				return validateAnnotationProperty((AnnotationProperty)value, diagnostics, context);
			case OwlPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case OwlPackage.URI:
				return validateURI((URI)value, diagnostics, context);
			case OwlPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case OwlPackage.DATATYPE:
				return validateDatatype((Datatype)value, diagnostics, context);
			case OwlPackage.DATA_RANGE:
				return validateDataRange((DataRange)value, diagnostics, context);
			case OwlPackage.DATA_PROPERTY_AXIOM:
				return validateDataPropertyAxiom((DataPropertyAxiom)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY_AXIOM:
				return validateObjectPropertyAxiom((ObjectPropertyAxiom)value, diagnostics, context);
			case OwlPackage.CLASS_EXPRESSION:
				return validateClassExpression((ClassExpression)value, diagnostics, context);
			case OwlPackage.CLASS_AXIOM:
				return validateClassAxiom((ClassAxiom)value, diagnostics, context);
			case OwlPackage.DATA_PROPERTY_EXPRESSION:
				return validateDataPropertyExpression((DataPropertyExpression)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY_EXPRESSION:
				return validateObjectPropertyExpression((ObjectPropertyExpression)value, diagnostics, context);
			case OwlPackage.ASYMMETRIC_OBJECT_PROPERTY:
				return validateAsymmetricObjectProperty((AsymmetricObjectProperty)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY:
				return validateObjectProperty((ObjectProperty)value, diagnostics, context);
			case OwlPackage.INVERSE_OBJECT_PROPERTY:
				return validateInverseObjectProperty((InverseObjectProperty)value, diagnostics, context);
			case OwlPackage.CLASS:
				return validateClass((owl.Class)value, diagnostics, context);
			case OwlPackage.OBJECT_INTERSECTION_OF:
				return validateObjectIntersectionOf((ObjectIntersectionOf)value, diagnostics, context);
			case OwlPackage.OBJECT_UNION_OF:
				return validateObjectUnionOf((ObjectUnionOf)value, diagnostics, context);
			case OwlPackage.OBJECT_ONE_OF:
				return validateObjectOneOf((ObjectOneOf)value, diagnostics, context);
			case OwlPackage.INDIVIDUAL:
				return validateIndividual((Individual)value, diagnostics, context);
			case OwlPackage.NAMED_INDIVIDUAL:
				return validateNamedIndividual((NamedIndividual)value, diagnostics, context);
			case OwlPackage.OBJECT_SOME_VALUES_FROM:
				return validateObjectSomeValuesFrom((ObjectSomeValuesFrom)value, diagnostics, context);
			case OwlPackage.OBJECT_ALL_VALUES_FROM:
				return validateObjectAllValuesFrom((ObjectAllValuesFrom)value, diagnostics, context);
			case OwlPackage.OBJECT_HAS_SELF:
				return validateObjectHasSelf((ObjectHasSelf)value, diagnostics, context);
			case OwlPackage.OBJECT_HAS_VALUE:
				return validateObjectHasValue((ObjectHasValue)value, diagnostics, context);
			case OwlPackage.OBJECT_MIN_CARDINALITY:
				return validateObjectMinCardinality((ObjectMinCardinality)value, diagnostics, context);
			case OwlPackage.OBJECT_MAX_CARDINALITY:
				return validateObjectMaxCardinality((ObjectMaxCardinality)value, diagnostics, context);
			case OwlPackage.DATA_SOME_VALUES_FROM:
				return validateDataSomeValuesFrom((DataSomeValuesFrom)value, diagnostics, context);
			case OwlPackage.DATA_PROPERTY:
				return validateDataProperty((DataProperty)value, diagnostics, context);
			case OwlPackage.DATA_ONE_OF:
				return validateDataOneOf((DataOneOf)value, diagnostics, context);
			case OwlPackage.DATATYPE_RESTRICTION:
				return validateDatatypeRestriction((DatatypeRestriction)value, diagnostics, context);
			case OwlPackage.FACET_LITERAL_PAIR:
				return validateFacetLiteralPair((FacetLiteralPair)value, diagnostics, context);
			case OwlPackage.DATA_ALL_VALUES_FROM:
				return validateDataAllValuesFrom((DataAllValuesFrom)value, diagnostics, context);
			case OwlPackage.DATA_HAS_VALUE:
				return validateDataHasValue((DataHasValue)value, diagnostics, context);
			case OwlPackage.DATA_MIN_CARDINALITY:
				return validateDataMinCardinality((DataMinCardinality)value, diagnostics, context);
			case OwlPackage.DATA_MAX_CARDINALITY:
				return validateDataMaxCardinality((DataMaxCardinality)value, diagnostics, context);
			case OwlPackage.DATA_EXACT_CARDINALITY:
				return validateDataExactCardinality((DataExactCardinality)value, diagnostics, context);
			case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION:
				return validateNegativeDataPropertyAssertion((NegativeDataPropertyAssertion)value, diagnostics, context);
			case OwlPackage.DATA_PROPERTY_DOMAIN:
				return validateDataPropertyDomain((DataPropertyDomain)value, diagnostics, context);
			case OwlPackage.DATA_PROPERTY_RANGE:
				return validateDataPropertyRange((DataPropertyRange)value, diagnostics, context);
			case OwlPackage.DIFFERENT_INDIVIDUALS:
				return validateDifferentIndividuals((DifferentIndividuals)value, diagnostics, context);
			case OwlPackage.DISJOINT_CLASSES:
				return validateDisjointClasses((DisjointClasses)value, diagnostics, context);
			case OwlPackage.DISJOINT_DATA_PROPERTIES:
				return validateDisjointDataProperties((DisjointDataProperties)value, diagnostics, context);
			case OwlPackage.DISJOINT_OBJECT_PROPERTIES:
				return validateDisjointObjectProperties((DisjointObjectProperties)value, diagnostics, context);
			case OwlPackage.DISJOINT_UNION:
				return validateDisjointUnion((DisjointUnion)value, diagnostics, context);
			case OwlPackage.EQUIVALENT_CLASSES:
				return validateEquivalentClasses((EquivalentClasses)value, diagnostics, context);
			case OwlPackage.EQUIVALENT_DATA_PROPERTIES:
				return validateEquivalentDataProperties((EquivalentDataProperties)value, diagnostics, context);
			case OwlPackage.FUNCTIONAL_DATA_PROPERTY:
				return validateFunctionalDataProperty((FunctionalDataProperty)value, diagnostics, context);
			case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES:
				return validateEquivalentObjectProperties((EquivalentObjectProperties)value, diagnostics, context);
			case OwlPackage.FUNCTIONAL_OBJECT_PROPERTY:
				return validateFunctionalObjectProperty((FunctionalObjectProperty)value, diagnostics, context);
			case OwlPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
				return validateInverseFunctionalObjectProperty((InverseFunctionalObjectProperty)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY_ASSERTION:
				return validateObjectPropertyAssertion((ObjectPropertyAssertion)value, diagnostics, context);
			case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION:
				return validateNegativeObjectPropertyAssertion((NegativeObjectPropertyAssertion)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY_DOMAIN:
				return validateObjectPropertyDomain((ObjectPropertyDomain)value, diagnostics, context);
			case OwlPackage.SYMMETRIC_OBJECT_PROPERTY:
				return validateSymmetricObjectProperty((SymmetricObjectProperty)value, diagnostics, context);
			case OwlPackage.REFLEXIVE_OBJECT_PROPERTY:
				return validateReflexiveObjectProperty((ReflexiveObjectProperty)value, diagnostics, context);
			case OwlPackage.SUB_DATA_PROPERTY_OF:
				return validateSubDataPropertyOf((SubDataPropertyOf)value, diagnostics, context);
			case OwlPackage.SAME_INDIVIDUAL:
				return validateSameIndividual((SameIndividual)value, diagnostics, context);
			case OwlPackage.SUB_OBJECT_PROPERTY_OF:
				return validateSubObjectPropertyOf((SubObjectPropertyOf)value, diagnostics, context);
			case OwlPackage.OBJECT_COMPLEMENT_OF:
				return validateObjectComplementOf((ObjectComplementOf)value, diagnostics, context);
			case OwlPackage.ONTOLOGY:
				return validateOntology((Ontology)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY_RANGE:
				return validateObjectPropertyRange((ObjectPropertyRange)value, diagnostics, context);
			case OwlPackage.DATA_PROPERTY_ASSERTION:
				return validateDataPropertyAssertion((DataPropertyAssertion)value, diagnostics, context);
			case OwlPackage.CLASS_ASSERTION:
				return validateClassAssertion((ClassAssertion)value, diagnostics, context);
			case OwlPackage.IRREFLEXIVE_OBJECT_PROPERTY:
				return validateIrreflexiveObjectProperty((IrreflexiveObjectProperty)value, diagnostics, context);
			case OwlPackage.OBJECT_EXACT_CARDINALITY:
				return validateObjectExactCardinality((ObjectExactCardinality)value, diagnostics, context);
			case OwlPackage.DATA_COMPLEMENT_OF:
				return validateDataComplementOf((DataComplementOf)value, diagnostics, context);
			case OwlPackage.SUB_CLASS_OF:
				return validateSubClassOf((SubClassOf)value, diagnostics, context);
			case OwlPackage.TRANSITIVE_OBJECT_PROPERTY:
				return validateTransitiveObjectProperty((TransitiveObjectProperty)value, diagnostics, context);
			case OwlPackage.INVERSE_OBJECT_PROPERTIES:
				return validateInverseObjectProperties((InverseObjectProperties)value, diagnostics, context);
			case OwlPackage.ANONYMOUS_INDIVIDUAL:
				return validateAnonymousIndividual((AnonymousIndividual)value, diagnostics, context);
			case OwlPackage.DECLARATION:
				return validateDeclaration((Declaration)value, diagnostics, context);
			case OwlPackage.OBJECT_AND_DATA_PROPERTY_AXIOM:
				return validateObjectAndDataPropertyAxiom((ObjectAndDataPropertyAxiom)value, diagnostics, context);
			case OwlPackage.HAS_KEY:
				return validateHasKey((HasKey)value, diagnostics, context);
			case OwlPackage.TYPED_LITERAL:
				return validateTypedLiteral((TypedLiteral)value, diagnostics, context);
			case OwlPackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case OwlPackage.DATA_INTERSECTION_OF:
				return validateDataIntersectionOf((DataIntersectionOf)value, diagnostics, context);
			case OwlPackage.DATA_UNION_OF:
				return validateDataUnionOf((DataUnionOf)value, diagnostics, context);
			case OwlPackage.DATA_TYPE_DEFINITION:
				return validateDataTypeDefinition((DataTypeDefinition)value, diagnostics, context);
			case OwlPackage.ANNOTATION_AXIOM:
				return validateAnnotationAxiom((AnnotationAxiom)value, diagnostics, context);
			case OwlPackage.SUB_ANNOTATION_PROPERTY_OF:
				return validateSubAnnotationPropertyOf((SubAnnotationPropertyOf)value, diagnostics, context);
			case OwlPackage.ANNOTATION_PROPERTY_DOMAIN:
				return validateAnnotationPropertyDomain((AnnotationPropertyDomain)value, diagnostics, context);
			case OwlPackage.ANNOTATION_PROPERTY_RANGE:
				return validateAnnotationPropertyRange((AnnotationPropertyRange)value, diagnostics, context);
			case OwlPackage.ANNOTATION_ASSERTION:
				return validateAnnotationAssertion((AnnotationAssertion)value, diagnostics, context);
			case OwlPackage.ANNOTATION_SUBJECT:
				return validateAnnotationSubject((AnnotationSubject)value, diagnostics, context);
			case OwlPackage.ANNOTATION_VALUE:
				return validateAnnotationValue((AnnotationValue)value, diagnostics, context);
			case OwlPackage.SUB_OBJECT_PROPERTY_EXPRESSION:
				return validateSubObjectPropertyExpression((SubObjectPropertyExpression)value, diagnostics, context);
			case OwlPackage.OBJECT_PROPERTY_CHAIN:
				return validateObjectPropertyChain((ObjectPropertyChain)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertion(Assertion assertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxiom(Axiom axiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationProperty(AnnotationProperty annotationProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatype(Datatype datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRange(DataRange dataRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyAxiom(DataPropertyAxiom dataPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyAxiom(ObjectPropertyAxiom objectPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassExpression(ClassExpression classExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAxiom(ClassAxiom classAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyExpression(DataPropertyExpression dataPropertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyExpression(ObjectPropertyExpression objectPropertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsymmetricObjectProperty(AsymmetricObjectProperty asymmetricObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asymmetricObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectProperty(ObjectProperty objectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInverseObjectProperty(InverseObjectProperty inverseObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inverseObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(owl.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(class_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectIntersectionOf(ObjectIntersectionOf objectIntersectionOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectIntersectionOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectUnionOf(ObjectUnionOf objectUnionOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectUnionOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectOneOf(ObjectOneOf objectOneOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectOneOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividual(Individual individual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedIndividual(NamedIndividual namedIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedIndividual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectSomeValuesFrom(ObjectSomeValuesFrom objectSomeValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectSomeValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectAllValuesFrom(ObjectAllValuesFrom objectAllValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectAllValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectHasSelf(ObjectHasSelf objectHasSelf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectHasSelf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectHasValue(ObjectHasValue objectHasValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectHasValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectMinCardinality(ObjectMinCardinality objectMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectMinCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectMinCardinality_Thecardinalitymustbenonnegative(objectMinCardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thecardinalitymustbenonnegative constraint of '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectMinCardinality_Thecardinalitymustbenonnegative(ObjectMinCardinality objectMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectMinCardinality.Thecardinalitymustbenonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectMaxCardinality(ObjectMaxCardinality objectMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectMaxCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectMaxCardinality_Thecardinalitymustbenonnegative(objectMaxCardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thecardinalitymustbenonnegative constraint of '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectMaxCardinality_Thecardinalitymustbenonnegative(ObjectMaxCardinality objectMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectMaxCardinality.Thecardinalitymustbenonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSomeValuesFrom(DataSomeValuesFrom dataSomeValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSomeValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProperty(DataProperty dataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOneOf(DataOneOf dataOneOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataOneOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeRestriction(DatatypeRestriction datatypeRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeRestriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacetLiteralPair(FacetLiteralPair facetLiteralPair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facetLiteralPair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAllValuesFrom(DataAllValuesFrom dataAllValuesFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAllValuesFrom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataHasValue(DataHasValue dataHasValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataHasValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMinCardinality(DataMinCardinality dataMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataMinCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataMinCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataMinCardinality_Thecardinalitymustbenonnegative(dataMinCardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thecardinalitymustbenonnegative constraint of '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMinCardinality_Thecardinalitymustbenonnegative(DataMinCardinality dataMinCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataMinCardinality.Thecardinalitymustbenonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMaxCardinality(DataMaxCardinality dataMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataMaxCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataMaxCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataMaxCardinality_Thecardinalitymustbenonnegative(dataMaxCardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thecardinalitymustbenonnegative constraint of '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMaxCardinality_Thecardinalitymustbenonnegative(DataMaxCardinality dataMaxCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataMaxCardinality.Thecardinalitymustbenonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataExactCardinality(DataExactCardinality dataExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataExactCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataExactCardinality_Thecardinalitymustbenonnegative(dataExactCardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thecardinalitymustbenonnegative constraint of '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataExactCardinality_Thecardinalitymustbenonnegative(DataExactCardinality dataExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataExactCardinality.Thecardinalitymustbenonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeDataPropertyAssertion(NegativeDataPropertyAssertion negativeDataPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negativeDataPropertyAssertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyDomain(DataPropertyDomain dataPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyRange(DataPropertyRange dataPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataPropertyRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPropertyRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataPropertyRange_Thedatarangemustbeofarityone(dataPropertyRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thedatarangemustbeofarityone constraint of '<em>Data Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyRange_Thedatarangemustbeofarityone(DataPropertyRange dataPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataPropertyRange.Thedatarangemustbeofarityone(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifferentIndividuals(DifferentIndividuals differentIndividuals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(differentIndividuals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointClasses(DisjointClasses disjointClasses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disjointClasses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointDataProperties(DisjointDataProperties disjointDataProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disjointDataProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointObjectProperties(DisjointObjectProperties disjointObjectProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disjointObjectProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointUnion(DisjointUnion disjointUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disjointUnion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentClasses(EquivalentClasses equivalentClasses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equivalentClasses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentDataProperties(EquivalentDataProperties equivalentDataProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equivalentDataProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalDataProperty(FunctionalDataProperty functionalDataProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalDataProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquivalentObjectProperties(EquivalentObjectProperties equivalentObjectProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equivalentObjectProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalObjectProperty(FunctionalObjectProperty functionalObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInverseFunctionalObjectProperty(InverseFunctionalObjectProperty inverseFunctionalObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inverseFunctionalObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyAssertion(ObjectPropertyAssertion objectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyAssertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion negativeObjectPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negativeObjectPropertyAssertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyDomain(ObjectPropertyDomain objectPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetricObjectProperty(SymmetricObjectProperty symmetricObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symmetricObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexiveObjectProperty(ReflexiveObjectProperty reflexiveObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflexiveObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubDataPropertyOf(SubDataPropertyOf subDataPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subDataPropertyOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameIndividual(SameIndividual sameIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sameIndividual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubObjectPropertyOf(SubObjectPropertyOf subObjectPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subObjectPropertyOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectComplementOf(ObjectComplementOf objectComplementOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectComplementOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ontology, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ontology, diagnostics, context);
		if (result || diagnostics != null) result &= validateOntology_versionURIrequiresontologyURItobespecified(ontology, diagnostics, context);
		return result;
	}

	/**
	 * Validates the versionURIrequiresontologyURItobespecified constraint of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOntology_versionURIrequiresontologyURItobespecified(Ontology ontology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ontology.versionURIrequiresontologyURItobespecified(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyRange(ObjectPropertyRange objectPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPropertyAssertion(DataPropertyAssertion dataPropertyAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPropertyAssertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAssertion(ClassAssertion classAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classAssertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIrreflexiveObjectProperty(IrreflexiveObjectProperty irreflexiveObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(irreflexiveObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectExactCardinality(ObjectExactCardinality objectExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectExactCardinality, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectExactCardinality, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectExactCardinality_Thecardinalitymustbenonnegative(objectExactCardinality, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Thecardinalitymustbenonnegative constraint of '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectExactCardinality_Thecardinalitymustbenonnegative(ObjectExactCardinality objectExactCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectExactCardinality.Thecardinalitymustbenonnegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataComplementOf(DataComplementOf dataComplementOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataComplementOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubClassOf(SubClassOf subClassOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subClassOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitiveObjectProperty(TransitiveObjectProperty transitiveObjectProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitiveObjectProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInverseObjectProperties(InverseObjectProperties inverseObjectProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inverseObjectProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnonymousIndividual(AnonymousIndividual anonymousIndividual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anonymousIndividual, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaration(Declaration declaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectAndDataPropertyAxiom(ObjectAndDataPropertyAxiom objectAndDataPropertyAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectAndDataPropertyAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasKey(HasKey hasKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedLiteral(TypedLiteral typedLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteral(StringLiteral stringLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataIntersectionOf(DataIntersectionOf dataIntersectionOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataIntersectionOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnionOf(DataUnionOf dataUnionOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataUnionOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeDefinition(DataTypeDefinition dataTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationAxiom(AnnotationAxiom annotationAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubAnnotationPropertyOf(SubAnnotationPropertyOf subAnnotationPropertyOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subAnnotationPropertyOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationPropertyDomain(AnnotationPropertyDomain annotationPropertyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationPropertyDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationPropertyRange(AnnotationPropertyRange annotationPropertyRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationPropertyRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationAssertion(AnnotationAssertion annotationAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationAssertion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationSubject(AnnotationSubject annotationSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationValue(AnnotationValue annotationValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubObjectPropertyExpression(SubObjectPropertyExpression subObjectPropertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subObjectPropertyExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyChain(ObjectPropertyChain objectPropertyChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyChain, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OwlValidator
