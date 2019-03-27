/**
 */
package owl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import owl.SubObjectPropertyOf;
import owl.SymmetricObjectProperty;
import owl.TransitiveObjectProperty;
import owl.TypedLiteral;

import owl.util.OwlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlPackageImpl extends EPackageImpl implements OwlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asymmetricObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetLiteralPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeDataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentIndividualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseFunctionalObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeObjectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDataPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subObjectPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irreflexiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subClassOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAndDataPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subAnnotationPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationValueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see owl.OwlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OwlPackageImpl() {
		super(eNS_URI, OwlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OwlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OwlPackage init() {
		if (isInited) return (OwlPackage)EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOwlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OwlPackageImpl theOwlPackage = registeredOwlPackage instanceof OwlPackageImpl ? (OwlPackageImpl)registeredOwlPackage : new OwlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOwlPackage.createPackageContents();

		// Initialize created meta-data
		theOwlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOwlPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OwlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOwlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OwlPackage.eNS_URI, theOwlPackage);
		return theOwlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxiom() {
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxiom_AxiomAnnotations() {
		return (EReference)axiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnnotationProperty() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnnotationValue() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationProperty() {
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_EntityURI() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURI() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURI_Value() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRange() {
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRange_Arity() {
		return (EAttribute)dataRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAxiom() {
		return dataPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAxiom() {
		return objectPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExpression() {
		return classExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAxiom() {
		return classAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyExpression() {
		return dataPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyExpression() {
		return objectPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsymmetricObjectProperty() {
		return asymmetricObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsymmetricObjectProperty_ObjectPropertyExpression() {
		return (EReference)asymmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseObjectProperty() {
		return inverseObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperty_ObjectProperty() {
		return (EReference)inverseObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIntersectionOf() {
		return objectIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_ClassExpressions() {
		return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnionOf() {
		return objectUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_ClassExpressions() {
		return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOneOf() {
		return objectOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOneOf_Individuals() {
		return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedIndividual() {
		return namedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSomeValuesFrom() {
		return objectSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ClassExpression() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_ObjectPropertyExpression() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAllValuesFrom() {
		return objectAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ClassExpression() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_ObjectPropertyExpression() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasSelf() {
		return objectHasSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasSelf_ObjectPropertyExpression() {
		return (EReference)objectHasSelfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasValue() {
		return objectHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_ObjectPropertyExpression() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_Individual() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMinCardinality() {
		return objectMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMinCardinality_Cardinality() {
		return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ClassExpression() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_ObjectPropertyExpression() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectMinCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map() {
		return objectMinCardinalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMaxCardinality() {
		return objectMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMaxCardinality_Cardinality() {
		return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ClassExpression() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_ObjectPropertyExpression() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectMaxCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map() {
		return objectMaxCardinalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSomeValuesFrom() {
		return dataSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataRange() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_DataPropertyExpressions() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOneOf() {
		return dataOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOneOf_Literals() {
		return (EReference)dataOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeRestriction() {
		return datatypeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Datatype() {
		return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Restrictions() {
		return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetLiteralPair() {
		return facetLiteralPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetLiteralPair_RestrictionValue() {
		return (EReference)facetLiteralPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetLiteralPair_ConstrainingFacet() {
		return (EReference)facetLiteralPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAllValuesFrom() {
		return dataAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataRange() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_DataPropertyExpressions() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHasValue() {
		return dataHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_Literal() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_DataPropertyExpression() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMinCardinality() {
		return dataMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMinCardinality_Cardinality() {
		return (EAttribute)dataMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataRange() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_DataPropertyExpression() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataMinCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map() {
		return dataMinCardinalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMaxCardinality() {
		return dataMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMaxCardinality_Cardinality() {
		return (EAttribute)dataMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataRange() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_DataPropertyExpression() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataMaxCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map() {
		return dataMaxCardinalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExactCardinality() {
		return dataExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExactCardinality_Cardinality() {
		return (EAttribute)dataExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataRange() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_DataPropertyExpression() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataExactCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map() {
		return dataExactCardinalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeDataPropertyAssertion() {
		return negativeDataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_DataPropertyExpression() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_TargetValue() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_SourceIndividual() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyDomain() {
		return dataPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_Domain() {
		return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_DataPropertyExpression() {
		return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyRange() {
		return dataPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_Range() {
		return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_DataPropertyExpression() {
		return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataPropertyRange__Thedatarangemustbeofarityone__DiagnosticChain_Map() {
		return dataPropertyRangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentIndividuals() {
		return differentIndividualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentIndividuals_Individuals() {
		return (EReference)differentIndividualsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointClasses() {
		return disjointClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DisjointClassExpressions() {
		return (EReference)disjointClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointDataProperties() {
		return disjointDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointDataProperties_DataPropertyExpressions() {
		return (EReference)disjointDataPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointObjectProperties() {
		return disjointObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointObjectProperties_ObjectPropertyExpressions() {
		return (EReference)disjointObjectPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointUnion() {
		return disjointUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_UnionClass() {
		return (EReference)disjointUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DisjointClassExpressions() {
		return (EReference)disjointUnionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentClasses() {
		return equivalentClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_EquivalentClassExpressions() {
		return (EReference)equivalentClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentDataProperties() {
		return equivalentDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentDataProperties_DataPropertyExpressions() {
		return (EReference)equivalentDataPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDataProperty() {
		return functionalDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDataProperty_DataPropertyExpression() {
		return (EReference)functionalDataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentObjectProperties() {
		return equivalentObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentObjectProperties_ObjectPropertyExpressions() {
		return (EReference)equivalentObjectPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalObjectProperty() {
		return functionalObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalObjectProperty_ObjectPropertyExpression() {
		return (EReference)functionalObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseFunctionalObjectProperty() {
		return inverseFunctionalObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression() {
		return (EReference)inverseFunctionalObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAssertion() {
		return objectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_ObjectPropertyExpression() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_SourceIndividual() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_TargetIndividual() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeObjectPropertyAssertion() {
		return negativeObjectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpression() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_SourceIndividual() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_TargetIndividual() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyDomain() {
		return objectPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_Domain() {
		return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_ObjectPropertyExpression() {
		return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricObjectProperty() {
		return symmetricObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricObjectProperty_ObjectPropertyExpression() {
		return (EReference)symmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflexiveObjectProperty() {
		return reflexiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReflexiveObjectProperty_ObjectPropertyExpression() {
		return (EReference)reflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDataPropertyOf() {
		return subDataPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDataPropertyOf_SuperDataPropertyExpression() {
		return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDataPropertyOf_SubDataPropertyExpression() {
		return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameIndividual() {
		return sameIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameIndividual_Individuals() {
		return (EReference)sameIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubObjectPropertyOf() {
		return subObjectPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_SuperObjectPropertyExpression() {
		return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_SubObjectPropertyExpressions() {
		return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComplementOf() {
		return objectComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ClassExpression() {
		return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_OntologyAnnotations() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Axioms() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_ImportedOntologies() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_OntologyURI() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_VersionURI() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntology__VersionURIrequiresontologyURItobespecified__DiagnosticChain_Map() {
		return ontologyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyRange() {
		return objectPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_Range() {
		return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_ObjectPropertyExpression() {
		return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAssertion() {
		return dataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_DataPropertyExpression() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_TargetValue() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_SourceIndividual() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAssertion() {
		return classAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ClassExpression() {
		return (EReference)classAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_Individual() {
		return (EReference)classAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrreflexiveObjectProperty() {
		return irreflexiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrreflexiveObjectProperty_ObjectPropertyExpression() {
		return (EReference)irreflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExactCardinality() {
		return objectExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectExactCardinality_Cardinality() {
		return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ClassExpression() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_ObjectPropertyExpression() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectExactCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map() {
		return objectExactCardinalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataComplementOf() {
		return dataComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataRange() {
		return (EReference)dataComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubClassOf() {
		return subClassOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_SubClassExpression() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_SuperClassExpression() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitiveObjectProperty() {
		return transitiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveObjectProperty_ObjectPropertyExpression() {
		return (EReference)transitiveObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseObjectProperties() {
		return inverseObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperties_InverseObjectProperties() {
		return (EReference)inverseObjectPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousIndividual() {
		return anonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymousIndividual_NodeID() {
		return (EAttribute)anonymousIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Entity() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAndDataPropertyAxiom() {
		return objectAndDataPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasKey() {
		return hasKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ClassExpression() {
		return (EReference)hasKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_DataPropertyExpressions() {
		return (EReference)hasKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ObjectPropertyExpressions() {
		return (EReference)hasKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedLiteral() {
		return typedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedLiteral_LexicalValue() {
		return (EAttribute)typedLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedLiteral_Datatype() {
		return (EReference)typedLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_QuotedString() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_LanguageTag() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataIntersectionOf() {
		return dataIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataRanges() {
		return (EReference)dataIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnionOf() {
		return dataUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataRanges() {
		return (EReference)dataUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDefinition() {
		return dataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDefinition_DataRange() {
		return (EReference)dataTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDefinition_DataType() {
		return (EReference)dataTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAxiom() {
		return annotationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAnnotationPropertyOf() {
		return subAnnotationPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAnnotationPropertyOf_SubAnnotationProperty() {
		return (EReference)subAnnotationPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAnnotationPropertyOf_SuperAnnotationProperty() {
		return (EReference)subAnnotationPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyDomain() {
		return annotationPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyDomain_AnnotationProperty() {
		return (EReference)annotationPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyDomain_Domain() {
		return (EReference)annotationPropertyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyRange() {
		return annotationPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyRange_AnnotationProperty() {
		return (EReference)annotationPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyRange_Range() {
		return (EReference)annotationPropertyRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAssertion() {
		return annotationAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_AnnotationSubject() {
		return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_AnnotationProperty() {
		return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_AnnotationValue() {
		return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationSubject() {
		return annotationSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationValue() {
		return annotationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlFactory getOwlFactory() {
		return (OwlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assertionEClass = createEClass(ASSERTION);

		axiomEClass = createEClass(AXIOM);
		createEReference(axiomEClass, AXIOM__AXIOM_ANNOTATIONS);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__ANNOTATION_PROPERTY);
		createEReference(annotationEClass, ANNOTATION__ANNOTATION_VALUE);

		annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ENTITY_URI);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__VALUE);

		literalEClass = createEClass(LITERAL);

		datatypeEClass = createEClass(DATATYPE);

		dataRangeEClass = createEClass(DATA_RANGE);
		createEAttribute(dataRangeEClass, DATA_RANGE__ARITY);

		dataPropertyAxiomEClass = createEClass(DATA_PROPERTY_AXIOM);

		objectPropertyAxiomEClass = createEClass(OBJECT_PROPERTY_AXIOM);

		classExpressionEClass = createEClass(CLASS_EXPRESSION);

		classAxiomEClass = createEClass(CLASS_AXIOM);

		dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

		objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);

		asymmetricObjectPropertyEClass = createEClass(ASYMMETRIC_OBJECT_PROPERTY);
		createEReference(asymmetricObjectPropertyEClass, ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		objectPropertyEClass = createEClass(OBJECT_PROPERTY);

		inverseObjectPropertyEClass = createEClass(INVERSE_OBJECT_PROPERTY);
		createEReference(inverseObjectPropertyEClass, INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY);

		classEClass = createEClass(CLASS);

		objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
		createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS);

		objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
		createEReference(objectUnionOfEClass, OBJECT_UNION_OF__CLASS_EXPRESSIONS);

		objectOneOfEClass = createEClass(OBJECT_ONE_OF);
		createEReference(objectOneOfEClass, OBJECT_ONE_OF__INDIVIDUALS);

		individualEClass = createEClass(INDIVIDUAL);

		namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

		objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

		objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

		objectHasSelfEClass = createEClass(OBJECT_HAS_SELF);
		createEReference(objectHasSelfEClass, OBJECT_HAS_SELF__OBJECT_PROPERTY_EXPRESSION);

		objectHasValueEClass = createEClass(OBJECT_HAS_VALUE);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__INDIVIDUAL);

		objectMinCardinalityEClass = createEClass(OBJECT_MIN_CARDINALITY);
		createEAttribute(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CARDINALITY);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);
		createEOperation(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY___THECARDINALITYMUSTBENONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		objectMaxCardinalityEClass = createEClass(OBJECT_MAX_CARDINALITY);
		createEAttribute(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CARDINALITY);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);
		createEOperation(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY___THECARDINALITYMUSTBENONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_RANGE);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

		dataPropertyEClass = createEClass(DATA_PROPERTY);

		dataOneOfEClass = createEClass(DATA_ONE_OF);
		createEReference(dataOneOfEClass, DATA_ONE_OF__LITERALS);

		datatypeRestrictionEClass = createEClass(DATATYPE_RESTRICTION);
		createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__DATATYPE);
		createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__RESTRICTIONS);

		facetLiteralPairEClass = createEClass(FACET_LITERAL_PAIR);
		createEReference(facetLiteralPairEClass, FACET_LITERAL_PAIR__RESTRICTION_VALUE);
		createEReference(facetLiteralPairEClass, FACET_LITERAL_PAIR__CONSTRAINING_FACET);

		dataAllValuesFromEClass = createEClass(DATA_ALL_VALUES_FROM);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_RANGE);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

		dataHasValueEClass = createEClass(DATA_HAS_VALUE);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__LITERAL);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION);

		dataMinCardinalityEClass = createEClass(DATA_MIN_CARDINALITY);
		createEAttribute(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__CARDINALITY);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_RANGE);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION);
		createEOperation(dataMinCardinalityEClass, DATA_MIN_CARDINALITY___THECARDINALITYMUSTBENONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		dataMaxCardinalityEClass = createEClass(DATA_MAX_CARDINALITY);
		createEAttribute(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__CARDINALITY);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_RANGE);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION);
		createEOperation(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY___THECARDINALITYMUSTBENONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		dataExactCardinalityEClass = createEClass(DATA_EXACT_CARDINALITY);
		createEAttribute(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__CARDINALITY);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_RANGE);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION);
		createEOperation(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY___THECARDINALITYMUSTBENONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		negativeDataPropertyAssertionEClass = createEClass(NEGATIVE_DATA_PROPERTY_ASSERTION);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);

		dataPropertyDomainEClass = createEClass(DATA_PROPERTY_DOMAIN);
		createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DOMAIN);
		createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION);

		dataPropertyRangeEClass = createEClass(DATA_PROPERTY_RANGE);
		createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__RANGE);
		createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION);
		createEOperation(dataPropertyRangeEClass, DATA_PROPERTY_RANGE___THEDATARANGEMUSTBEOFARITYONE__DIAGNOSTICCHAIN_MAP);

		differentIndividualsEClass = createEClass(DIFFERENT_INDIVIDUALS);
		createEReference(differentIndividualsEClass, DIFFERENT_INDIVIDUALS__INDIVIDUALS);

		disjointClassesEClass = createEClass(DISJOINT_CLASSES);
		createEReference(disjointClassesEClass, DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS);

		disjointDataPropertiesEClass = createEClass(DISJOINT_DATA_PROPERTIES);
		createEReference(disjointDataPropertiesEClass, DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);

		disjointObjectPropertiesEClass = createEClass(DISJOINT_OBJECT_PROPERTIES);
		createEReference(disjointObjectPropertiesEClass, DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);

		disjointUnionEClass = createEClass(DISJOINT_UNION);
		createEReference(disjointUnionEClass, DISJOINT_UNION__UNION_CLASS);
		createEReference(disjointUnionEClass, DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS);

		equivalentClassesEClass = createEClass(EQUIVALENT_CLASSES);
		createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS);

		equivalentDataPropertiesEClass = createEClass(EQUIVALENT_DATA_PROPERTIES);
		createEReference(equivalentDataPropertiesEClass, EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);

		functionalDataPropertyEClass = createEClass(FUNCTIONAL_DATA_PROPERTY);
		createEReference(functionalDataPropertyEClass, FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION);

		equivalentObjectPropertiesEClass = createEClass(EQUIVALENT_OBJECT_PROPERTIES);
		createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);

		functionalObjectPropertyEClass = createEClass(FUNCTIONAL_OBJECT_PROPERTY);
		createEReference(functionalObjectPropertyEClass, FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		inverseFunctionalObjectPropertyEClass = createEClass(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
		createEReference(inverseFunctionalObjectPropertyEClass, INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

		negativeObjectPropertyAssertionEClass = createEClass(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

		objectPropertyDomainEClass = createEClass(OBJECT_PROPERTY_DOMAIN);
		createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__DOMAIN);
		createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION);

		symmetricObjectPropertyEClass = createEClass(SYMMETRIC_OBJECT_PROPERTY);
		createEReference(symmetricObjectPropertyEClass, SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		reflexiveObjectPropertyEClass = createEClass(REFLEXIVE_OBJECT_PROPERTY);
		createEReference(reflexiveObjectPropertyEClass, REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		subDataPropertyOfEClass = createEClass(SUB_DATA_PROPERTY_OF);
		createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION);
		createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION);

		sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
		createEReference(sameIndividualEClass, SAME_INDIVIDUAL__INDIVIDUALS);

		subObjectPropertyOfEClass = createEClass(SUB_OBJECT_PROPERTY_OF);
		createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION);
		createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS);

		objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
		createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION);

		ontologyEClass = createEClass(ONTOLOGY);
		createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_ANNOTATIONS);
		createEReference(ontologyEClass, ONTOLOGY__AXIOMS);
		createEReference(ontologyEClass, ONTOLOGY__IMPORTED_ONTOLOGIES);
		createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_URI);
		createEReference(ontologyEClass, ONTOLOGY__VERSION_URI);
		createEOperation(ontologyEClass, ONTOLOGY___VERSION_UR_IREQUIRESONTOLOGY_UR_ITOBESPECIFIED__DIAGNOSTICCHAIN_MAP);

		objectPropertyRangeEClass = createEClass(OBJECT_PROPERTY_RANGE);
		createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__RANGE);
		createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION);

		dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);

		classAssertionEClass = createEClass(CLASS_ASSERTION);
		createEReference(classAssertionEClass, CLASS_ASSERTION__CLASS_EXPRESSION);
		createEReference(classAssertionEClass, CLASS_ASSERTION__INDIVIDUAL);

		irreflexiveObjectPropertyEClass = createEClass(IRREFLEXIVE_OBJECT_PROPERTY);
		createEReference(irreflexiveObjectPropertyEClass, IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
		createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);
		createEOperation(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY___THECARDINALITYMUSTBENONNEGATIVE__DIAGNOSTICCHAIN_MAP);

		dataComplementOfEClass = createEClass(DATA_COMPLEMENT_OF);
		createEReference(dataComplementOfEClass, DATA_COMPLEMENT_OF__DATA_RANGE);

		subClassOfEClass = createEClass(SUB_CLASS_OF);
		createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
		createEReference(subClassOfEClass, SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);

		transitiveObjectPropertyEClass = createEClass(TRANSITIVE_OBJECT_PROPERTY);
		createEReference(transitiveObjectPropertyEClass, TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

		inverseObjectPropertiesEClass = createEClass(INVERSE_OBJECT_PROPERTIES);
		createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__INVERSE_OBJECT_PROPERTIES);

		anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
		createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__ENTITY);

		objectAndDataPropertyAxiomEClass = createEClass(OBJECT_AND_DATA_PROPERTY_AXIOM);

		hasKeyEClass = createEClass(HAS_KEY);
		createEReference(hasKeyEClass, HAS_KEY__CLASS_EXPRESSION);
		createEReference(hasKeyEClass, HAS_KEY__DATA_PROPERTY_EXPRESSIONS);
		createEReference(hasKeyEClass, HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS);

		typedLiteralEClass = createEClass(TYPED_LITERAL);
		createEAttribute(typedLiteralEClass, TYPED_LITERAL__LEXICAL_VALUE);
		createEReference(typedLiteralEClass, TYPED_LITERAL__DATATYPE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__QUOTED_STRING);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__LANGUAGE_TAG);

		dataIntersectionOfEClass = createEClass(DATA_INTERSECTION_OF);
		createEReference(dataIntersectionOfEClass, DATA_INTERSECTION_OF__DATA_RANGES);

		dataUnionOfEClass = createEClass(DATA_UNION_OF);
		createEReference(dataUnionOfEClass, DATA_UNION_OF__DATA_RANGES);

		dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
		createEReference(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__DATA_RANGE);
		createEReference(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__DATA_TYPE);

		annotationAxiomEClass = createEClass(ANNOTATION_AXIOM);

		subAnnotationPropertyOfEClass = createEClass(SUB_ANNOTATION_PROPERTY_OF);
		createEReference(subAnnotationPropertyOfEClass, SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY);
		createEReference(subAnnotationPropertyOfEClass, SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY);

		annotationPropertyDomainEClass = createEClass(ANNOTATION_PROPERTY_DOMAIN);
		createEReference(annotationPropertyDomainEClass, ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY);
		createEReference(annotationPropertyDomainEClass, ANNOTATION_PROPERTY_DOMAIN__DOMAIN);

		annotationPropertyRangeEClass = createEClass(ANNOTATION_PROPERTY_RANGE);
		createEReference(annotationPropertyRangeEClass, ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY);
		createEReference(annotationPropertyRangeEClass, ANNOTATION_PROPERTY_RANGE__RANGE);

		annotationAssertionEClass = createEClass(ANNOTATION_ASSERTION);
		createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__ANNOTATION_SUBJECT);
		createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__ANNOTATION_PROPERTY);
		createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__ANNOTATION_VALUE);

		annotationSubjectEClass = createEClass(ANNOTATION_SUBJECT);

		annotationValueEClass = createEClass(ANNOTATION_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assertionEClass.getESuperTypes().add(this.getAxiom());
		annotationPropertyEClass.getESuperTypes().add(this.getEntity());
		uriEClass.getESuperTypes().add(this.getAnnotationSubject());
		uriEClass.getESuperTypes().add(this.getAnnotationValue());
		literalEClass.getESuperTypes().add(this.getAnnotationValue());
		datatypeEClass.getESuperTypes().add(this.getDataRange());
		datatypeEClass.getESuperTypes().add(this.getEntity());
		dataPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
		objectPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
		classAxiomEClass.getESuperTypes().add(this.getAxiom());
		asymmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectPropertyEClass.getESuperTypes().add(this.getEntity());
		objectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
		inverseObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
		classEClass.getESuperTypes().add(this.getEntity());
		classEClass.getESuperTypes().add(this.getClassExpression());
		objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
		namedIndividualEClass.getESuperTypes().add(this.getEntity());
		namedIndividualEClass.getESuperTypes().add(this.getIndividual());
		objectSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		objectAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		objectHasSelfEClass.getESuperTypes().add(this.getClassExpression());
		objectHasValueEClass.getESuperTypes().add(this.getClassExpression());
		objectMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		objectMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		dataPropertyEClass.getESuperTypes().add(this.getEntity());
		dataPropertyEClass.getESuperTypes().add(this.getDataPropertyExpression());
		dataOneOfEClass.getESuperTypes().add(this.getDataRange());
		datatypeRestrictionEClass.getESuperTypes().add(this.getDataRange());
		dataAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
		dataHasValueEClass.getESuperTypes().add(this.getClassExpression());
		dataMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		negativeDataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		dataPropertyDomainEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		dataPropertyRangeEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		differentIndividualsEClass.getESuperTypes().add(this.getAssertion());
		disjointClassesEClass.getESuperTypes().add(this.getClassAxiom());
		disjointDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		disjointObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		disjointUnionEClass.getESuperTypes().add(this.getClassAxiom());
		equivalentClassesEClass.getESuperTypes().add(this.getClassAxiom());
		equivalentDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		functionalDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		equivalentObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		functionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		inverseFunctionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		negativeObjectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		objectPropertyDomainEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		symmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		reflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		subDataPropertyOfEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		sameIndividualEClass.getESuperTypes().add(this.getAssertion());
		subObjectPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
		objectPropertyRangeEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		classAssertionEClass.getESuperTypes().add(this.getAssertion());
		irreflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
		dataComplementOfEClass.getESuperTypes().add(this.getDataRange());
		subClassOfEClass.getESuperTypes().add(this.getClassAxiom());
		transitiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		inverseObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
		anonymousIndividualEClass.getESuperTypes().add(this.getAnnotationSubject());
		anonymousIndividualEClass.getESuperTypes().add(this.getAnnotationValue());
		declarationEClass.getESuperTypes().add(this.getAxiom());
		objectAndDataPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
		hasKeyEClass.getESuperTypes().add(this.getObjectAndDataPropertyAxiom());
		typedLiteralEClass.getESuperTypes().add(this.getLiteral());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		dataIntersectionOfEClass.getESuperTypes().add(this.getDataRange());
		dataTypeDefinitionEClass.getESuperTypes().add(this.getAxiom());
		annotationAxiomEClass.getESuperTypes().add(this.getAxiom());
		subAnnotationPropertyOfEClass.getESuperTypes().add(this.getAnnotationAxiom());
		annotationPropertyDomainEClass.getESuperTypes().add(this.getAnnotationAxiom());
		annotationPropertyRangeEClass.getESuperTypes().add(this.getAnnotationAxiom());
		annotationAssertionEClass.getESuperTypes().add(this.getAnnotationAxiom());

		// Initialize classes, features, and operations; add parameters
		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(axiomEClass, Axiom.class, "Axiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxiom_AxiomAnnotations(), this.getAnnotation(), null, "axiomAnnotations", null, 0, -1, Axiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotation_AnnotationValue(), this.getAnnotationValue(), null, "annotationValue", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_EntityURI(), this.getURI(), null, "entityURI", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(uriEClass, owl.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURI_Value(), ecorePackage.getEString(), "value", null, 0, 1, owl.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRange_Arity(), ecorePackage.getEInt(), "arity", null, 1, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPropertyAxiomEClass, DataPropertyAxiom.class, "DataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyAxiomEClass, ObjectPropertyAxiom.class, "ObjectPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classAxiomEClass, ClassAxiom.class, "ClassAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asymmetricObjectPropertyEClass, AsymmetricObjectProperty.class, "AsymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, AsymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverseObjectPropertyEClass, InverseObjectProperty.class, "InverseObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseObjectProperty_ObjectProperty(), this.getObjectProperty(), null, "objectProperty", null, 1, 1, InverseObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classEClass, owl.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIntersectionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectUnionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOneOf_Individuals(), this.getIndividual(), null, "individuals", null, 1, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSomeValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectSomeValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectAllValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectAllValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectHasSelfEClass, ObjectHasSelf.class, "ObjectHasSelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHasSelf_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectHasSelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHasValue_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectHasValue_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectMinCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectMinCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getObjectMinCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectMaxCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectMaxCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getObjectMaxCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSomeValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataSomeValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataOneOfEClass, DataOneOf.class, "DataOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOneOf_Literals(), this.getLiteral(), null, "literals", null, 1, -1, DataOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeRestrictionEClass, DatatypeRestriction.class, "DatatypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeRestriction_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDatatypeRestriction_Restrictions(), this.getFacetLiteralPair(), null, "restrictions", null, 0, -1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facetLiteralPairEClass, FacetLiteralPair.class, "FacetLiteralPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetLiteralPair_RestrictionValue(), this.getLiteral(), null, "restrictionValue", null, 1, 1, FacetLiteralPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacetLiteralPair_ConstrainingFacet(), this.getURI(), null, "constrainingFacet", null, 1, 1, FacetLiteralPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAllValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataAllValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataHasValue_Literal(), this.getLiteral(), null, "literal", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataHasValue_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataMinCardinalityEClass, DataMinCardinality.class, "DataMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataMinCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataMinCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataMinCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataMaxCardinalityEClass, DataMaxCardinality.class, "DataMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataMaxCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataMaxCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataMaxCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataExactCardinalityEClass, DataExactCardinality.class, "DataExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataExactCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataExactCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataExactCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(negativeDataPropertyAssertionEClass, NegativeDataPropertyAssertion.class, "NegativeDataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNegativeDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNegativeDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPropertyDomainEClass, DataPropertyDomain.class, "DataPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPropertyDomain_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPropertyRangeEClass, DataPropertyRange.class, "DataPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyRange_Range(), this.getDataRange(), null, "range", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPropertyRange_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataPropertyRange__Thedatarangemustbeofarityone__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thedatarangemustbeofarityone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(differentIndividualsEClass, DifferentIndividuals.class, "DifferentIndividuals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentIndividuals_Individuals(), this.getIndividual(), null, "individuals", null, 2, -1, DifferentIndividuals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointClassesEClass, DisjointClasses.class, "DisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointClasses_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(disjointDataPropertiesEClass, DisjointDataProperties.class, "DisjointDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointDataProperties_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 2, -1, DisjointDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(disjointObjectPropertiesEClass, DisjointObjectProperties.class, "DisjointObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointObjectProperties_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, DisjointObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(disjointUnionEClass, DisjointUnion.class, "DisjointUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointUnion_UnionClass(), this.getClass_(), null, "unionClass", null, 1, 1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDisjointUnion_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equivalentClassesEClass, EquivalentClasses.class, "EquivalentClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentClasses_EquivalentClassExpressions(), this.getClassExpression(), null, "equivalentClassExpressions", null, 2, -1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equivalentDataPropertiesEClass, EquivalentDataProperties.class, "EquivalentDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentDataProperties_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 2, -1, EquivalentDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionalDataPropertyEClass, FunctionalDataProperty.class, "FunctionalDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDataProperty_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, FunctionalDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equivalentObjectPropertiesEClass, EquivalentObjectProperties.class, "EquivalentObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentObjectProperties_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionalObjectPropertyEClass, FunctionalObjectProperty.class, "FunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, FunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inverseFunctionalObjectPropertyEClass, InverseFunctionalObjectProperty.class, "InverseFunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, InverseFunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(negativeObjectPropertyAssertionEClass, NegativeObjectPropertyAssertion.class, "NegativeObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNegativeObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNegativeObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectPropertyDomainEClass, ObjectPropertyDomain.class, "ObjectPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectPropertyDomain_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(symmetricObjectPropertyEClass, SymmetricObjectProperty.class, "SymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, SymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reflexiveObjectPropertyEClass, ReflexiveObjectProperty.class, "ReflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ReflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subDataPropertyOfEClass, SubDataPropertyOf.class, "SubDataPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubDataPropertyOf_SuperDataPropertyExpression(), this.getDataPropertyExpression(), null, "superDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubDataPropertyOf_SubDataPropertyExpression(), this.getDataPropertyExpression(), null, "subDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSameIndividual_Individuals(), this.getIndividual(), null, "individuals", null, 2, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subObjectPropertyOfEClass, SubObjectPropertyOf.class, "SubObjectPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubObjectPropertyOf_SuperObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "superObjectPropertyExpression", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubObjectPropertyOf_SubObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "subObjectPropertyExpressions", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectComplementOf_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntology_OntologyAnnotations(), this.getAnnotation(), null, "ontologyAnnotations", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOntology_Axioms(), this.getAxiom(), null, "axioms", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOntology_ImportedOntologies(), this.getOntology(), null, "importedOntologies", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOntology_OntologyURI(), this.getURI(), null, "ontologyURI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOntology_VersionURI(), this.getURI(), null, "versionURI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOntology__VersionURIrequiresontologyURItobespecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "versionURIrequiresontologyURItobespecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectPropertyRangeEClass, ObjectPropertyRange.class, "ObjectPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyRange_Range(), this.getClassExpression(), null, "range", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectPropertyRange_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassAssertion_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(irreflexiveObjectPropertyEClass, IrreflexiveObjectProperty.class, "IrreflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIrreflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, IrreflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectExactCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectExactCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getObjectExactCardinality__Thecardinalitymustbenonnegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataComplementOfEClass, DataComplementOf.class, "DataComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataComplementOf_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transitiveObjectPropertyEClass, TransitiveObjectProperty.class, "TransitiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, TransitiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inverseObjectPropertiesEClass, InverseObjectProperties.class, "InverseObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseObjectProperties_InverseObjectProperties(), this.getObjectPropertyExpression(), null, "inverseObjectProperties", null, 2, 2, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_Entity(), this.getEntity(), null, "entity", null, 1, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectAndDataPropertyAxiomEClass, ObjectAndDataPropertyAxiom.class, "ObjectAndDataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasKeyEClass, HasKey.class, "HasKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasKey_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHasKey_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 0, -1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHasKey_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 0, -1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typedLiteralEClass, TypedLiteral.class, "TypedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedLiteral_LexicalValue(), ecorePackage.getEString(), "lexicalValue", null, 1, 1, TypedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypedLiteral_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, TypedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_QuotedString(), ecorePackage.getEString(), "quotedString", null, 1, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStringLiteral_LanguageTag(), ecorePackage.getEString(), "languageTag", null, 1, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataIntersectionOfEClass, DataIntersectionOf.class, "DataIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataIntersectionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 2, -1, DataIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnionOfEClass, DataUnionOf.class, "DataUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 2, -1, DataUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeDefinition_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeDefinition_DataType(), this.getDatatype(), null, "dataType", null, 1, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationAxiomEClass, AnnotationAxiom.class, "AnnotationAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subAnnotationPropertyOfEClass, SubAnnotationPropertyOf.class, "SubAnnotationPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubAnnotationPropertyOf_SubAnnotationProperty(), this.getAnnotationProperty(), null, "subAnnotationProperty", null, 1, 1, SubAnnotationPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubAnnotationPropertyOf_SuperAnnotationProperty(), this.getAnnotationProperty(), null, "superAnnotationProperty", null, 1, 1, SubAnnotationPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationPropertyDomainEClass, AnnotationPropertyDomain.class, "AnnotationPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationPropertyDomain_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, AnnotationPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationPropertyDomain_Domain(), this.getURI(), null, "domain", null, 1, 1, AnnotationPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationPropertyRangeEClass, AnnotationPropertyRange.class, "AnnotationPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationPropertyRange_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, AnnotationPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationPropertyRange_Range(), this.getURI(), null, "range", null, 1, 1, AnnotationPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationAssertionEClass, AnnotationAssertion.class, "AnnotationAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationAssertion_AnnotationSubject(), this.getAnnotationSubject(), null, "annotationSubject", null, 1, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationAssertion_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationAssertion_AnnotationValue(), this.getAnnotationValue(), null, "annotationValue", null, 1, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationSubjectEClass, AnnotationSubject.class, "AnnotationSubject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationValueEClass, AnnotationValue.class, "AnnotationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OwlPackageImpl
