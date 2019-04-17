/**
 */
package owl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see owl.OwlPackage
 * @generated
 */
public class OwlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OwlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlSwitch<Adapter> modelSwitch =
		new OwlSwitch<Adapter>() {
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseAxiom(Axiom object) {
				return createAxiomAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationProperty(AnnotationProperty object) {
				return createAnnotationPropertyAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseURI(URI object) {
				return createURIAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseDataRange(DataRange object) {
				return createDataRangeAdapter();
			}
			@Override
			public Adapter caseDataPropertyAxiom(DataPropertyAxiom object) {
				return createDataPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
				return createObjectPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseClassExpression(ClassExpression object) {
				return createClassExpressionAdapter();
			}
			@Override
			public Adapter caseClassAxiom(ClassAxiom object) {
				return createClassAxiomAdapter();
			}
			@Override
			public Adapter caseDataPropertyExpression(DataPropertyExpression object) {
				return createDataPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyExpression(ObjectPropertyExpression object) {
				return createObjectPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseAsymmetricObjectProperty(AsymmetricObjectProperty object) {
				return createAsymmetricObjectPropertyAdapter();
			}
			@Override
			public Adapter caseObjectProperty(ObjectProperty object) {
				return createObjectPropertyAdapter();
			}
			@Override
			public Adapter caseInverseObjectProperty(InverseObjectProperty object) {
				return createInverseObjectPropertyAdapter();
			}
			@Override
			public Adapter caseClass(owl.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object) {
				return createObjectIntersectionOfAdapter();
			}
			@Override
			public Adapter caseObjectUnionOf(ObjectUnionOf object) {
				return createObjectUnionOfAdapter();
			}
			@Override
			public Adapter caseObjectOneOf(ObjectOneOf object) {
				return createObjectOneOfAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseNamedIndividual(NamedIndividual object) {
				return createNamedIndividualAdapter();
			}
			@Override
			public Adapter caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
				return createObjectSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
				return createObjectAllValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectHasSelf(ObjectHasSelf object) {
				return createObjectHasSelfAdapter();
			}
			@Override
			public Adapter caseObjectHasValue(ObjectHasValue object) {
				return createObjectHasValueAdapter();
			}
			@Override
			public Adapter caseObjectMinCardinality(ObjectMinCardinality object) {
				return createObjectMinCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectMaxCardinality(ObjectMaxCardinality object) {
				return createObjectMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object) {
				return createDataSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseDataProperty(DataProperty object) {
				return createDataPropertyAdapter();
			}
			@Override
			public Adapter caseDataOneOf(DataOneOf object) {
				return createDataOneOfAdapter();
			}
			@Override
			public Adapter caseDatatypeRestriction(DatatypeRestriction object) {
				return createDatatypeRestrictionAdapter();
			}
			@Override
			public Adapter caseFacetLiteralPair(FacetLiteralPair object) {
				return createFacetLiteralPairAdapter();
			}
			@Override
			public Adapter caseDataAllValuesFrom(DataAllValuesFrom object) {
				return createDataAllValuesFromAdapter();
			}
			@Override
			public Adapter caseDataHasValue(DataHasValue object) {
				return createDataHasValueAdapter();
			}
			@Override
			public Adapter caseDataMinCardinality(DataMinCardinality object) {
				return createDataMinCardinalityAdapter();
			}
			@Override
			public Adapter caseDataMaxCardinality(DataMaxCardinality object) {
				return createDataMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseDataExactCardinality(DataExactCardinality object) {
				return createDataExactCardinalityAdapter();
			}
			@Override
			public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
				return createNegativeDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseDataPropertyDomain(DataPropertyDomain object) {
				return createDataPropertyDomainAdapter();
			}
			@Override
			public Adapter caseDataPropertyRange(DataPropertyRange object) {
				return createDataPropertyRangeAdapter();
			}
			@Override
			public Adapter caseDifferentIndividuals(DifferentIndividuals object) {
				return createDifferentIndividualsAdapter();
			}
			@Override
			public Adapter caseDisjointClasses(DisjointClasses object) {
				return createDisjointClassesAdapter();
			}
			@Override
			public Adapter caseDisjointDataProperties(DisjointDataProperties object) {
				return createDisjointDataPropertiesAdapter();
			}
			@Override
			public Adapter caseDisjointObjectProperties(DisjointObjectProperties object) {
				return createDisjointObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseDisjointUnion(DisjointUnion object) {
				return createDisjointUnionAdapter();
			}
			@Override
			public Adapter caseEquivalentClasses(EquivalentClasses object) {
				return createEquivalentClassesAdapter();
			}
			@Override
			public Adapter caseEquivalentDataProperties(EquivalentDataProperties object) {
				return createEquivalentDataPropertiesAdapter();
			}
			@Override
			public Adapter caseFunctionalDataProperty(FunctionalDataProperty object) {
				return createFunctionalDataPropertyAdapter();
			}
			@Override
			public Adapter caseEquivalentObjectProperties(EquivalentObjectProperties object) {
				return createEquivalentObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseFunctionalObjectProperty(FunctionalObjectProperty object) {
				return createFunctionalObjectPropertyAdapter();
			}
			@Override
			public Adapter caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
				return createInverseFunctionalObjectPropertyAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
				return createObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
				return createNegativeObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyDomain(ObjectPropertyDomain object) {
				return createObjectPropertyDomainAdapter();
			}
			@Override
			public Adapter caseSymmetricObjectProperty(SymmetricObjectProperty object) {
				return createSymmetricObjectPropertyAdapter();
			}
			@Override
			public Adapter caseReflexiveObjectProperty(ReflexiveObjectProperty object) {
				return createReflexiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseSubDataPropertyOf(SubDataPropertyOf object) {
				return createSubDataPropertyOfAdapter();
			}
			@Override
			public Adapter caseSameIndividual(SameIndividual object) {
				return createSameIndividualAdapter();
			}
			@Override
			public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object) {
				return createSubObjectPropertyOfAdapter();
			}
			@Override
			public Adapter caseObjectComplementOf(ObjectComplementOf object) {
				return createObjectComplementOfAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseObjectPropertyRange(ObjectPropertyRange object) {
				return createObjectPropertyRangeAdapter();
			}
			@Override
			public Adapter caseDataPropertyAssertion(DataPropertyAssertion object) {
				return createDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseClassAssertion(ClassAssertion object) {
				return createClassAssertionAdapter();
			}
			@Override
			public Adapter caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object) {
				return createIrreflexiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseObjectExactCardinality(ObjectExactCardinality object) {
				return createObjectExactCardinalityAdapter();
			}
			@Override
			public Adapter caseDataComplementOf(DataComplementOf object) {
				return createDataComplementOfAdapter();
			}
			@Override
			public Adapter caseSubClassOf(SubClassOf object) {
				return createSubClassOfAdapter();
			}
			@Override
			public Adapter caseTransitiveObjectProperty(TransitiveObjectProperty object) {
				return createTransitiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseInverseObjectProperties(InverseObjectProperties object) {
				return createInverseObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseAnonymousIndividual(AnonymousIndividual object) {
				return createAnonymousIndividualAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseObjectAndDataPropertyAxiom(ObjectAndDataPropertyAxiom object) {
				return createObjectAndDataPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseHasKey(HasKey object) {
				return createHasKeyAdapter();
			}
			@Override
			public Adapter caseTypedLiteral(TypedLiteral object) {
				return createTypedLiteralAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseDataIntersectionOf(DataIntersectionOf object) {
				return createDataIntersectionOfAdapter();
			}
			@Override
			public Adapter caseDataUnionOf(DataUnionOf object) {
				return createDataUnionOfAdapter();
			}
			@Override
			public Adapter caseDataTypeDefinition(DataTypeDefinition object) {
				return createDataTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseAnnotationAxiom(AnnotationAxiom object) {
				return createAnnotationAxiomAdapter();
			}
			@Override
			public Adapter caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object) {
				return createSubAnnotationPropertyOfAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyDomain(AnnotationPropertyDomain object) {
				return createAnnotationPropertyDomainAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyRange(AnnotationPropertyRange object) {
				return createAnnotationPropertyRangeAdapter();
			}
			@Override
			public Adapter caseAnnotationAssertion(AnnotationAssertion object) {
				return createAnnotationAssertionAdapter();
			}
			@Override
			public Adapter caseAnnotationSubject(AnnotationSubject object) {
				return createAnnotationSubjectAdapter();
			}
			@Override
			public Adapter caseAnnotationValue(AnnotationValue object) {
				return createAnnotationValueAdapter();
			}
			@Override
			public Adapter caseSubObjectPropertyExpression(SubObjectPropertyExpression object) {
				return createSubObjectPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyChain(ObjectPropertyChain object) {
				return createObjectPropertyChainAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link owl.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationProperty
	 * @generated
	 */
	public Adapter createAnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.URI
	 * @generated
	 */
	public Adapter createURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataRange
	 * @generated
	 */
	public Adapter createDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataPropertyAxiom
	 * @generated
	 */
	public Adapter createDataPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectPropertyAxiom
	 * @generated
	 */
	public Adapter createObjectPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ClassExpression
	 * @generated
	 */
	public Adapter createClassExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ClassAxiom
	 * @generated
	 */
	public Adapter createClassAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataPropertyExpression <em>Data Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataPropertyExpression
	 * @generated
	 */
	public Adapter createDataPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectPropertyExpression <em>Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectPropertyExpression
	 * @generated
	 */
	public Adapter createObjectPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AsymmetricObjectProperty
	 * @generated
	 */
	public Adapter createAsymmetricObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectProperty
	 * @generated
	 */
	public Adapter createObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.InverseObjectProperty <em>Inverse Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.InverseObjectProperty
	 * @generated
	 */
	public Adapter createInverseObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectIntersectionOf
	 * @generated
	 */
	public Adapter createObjectIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectUnionOf
	 * @generated
	 */
	public Adapter createObjectUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectOneOf
	 * @generated
	 */
	public Adapter createObjectOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.NamedIndividual
	 * @generated
	 */
	public Adapter createNamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectSomeValuesFrom
	 * @generated
	 */
	public Adapter createObjectSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectAllValuesFrom
	 * @generated
	 */
	public Adapter createObjectAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectHasSelf <em>Object Has Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectHasSelf
	 * @generated
	 */
	public Adapter createObjectHasSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectHasValue
	 * @generated
	 */
	public Adapter createObjectHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectMinCardinality
	 * @generated
	 */
	public Adapter createObjectMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectMaxCardinality
	 * @generated
	 */
	public Adapter createObjectMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataSomeValuesFrom
	 * @generated
	 */
	public Adapter createDataSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataProperty
	 * @generated
	 */
	public Adapter createDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataOneOf <em>Data One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataOneOf
	 * @generated
	 */
	public Adapter createDataOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DatatypeRestriction <em>Datatype Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DatatypeRestriction
	 * @generated
	 */
	public Adapter createDatatypeRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.FacetLiteralPair <em>Facet Literal Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.FacetLiteralPair
	 * @generated
	 */
	public Adapter createFacetLiteralPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataAllValuesFrom
	 * @generated
	 */
	public Adapter createDataAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataHasValue
	 * @generated
	 */
	public Adapter createDataHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataMinCardinality
	 * @generated
	 */
	public Adapter createDataMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataMaxCardinality
	 * @generated
	 */
	public Adapter createDataMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataExactCardinality
	 * @generated
	 */
	public Adapter createDataExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.NegativeDataPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataPropertyDomain <em>Data Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataPropertyDomain
	 * @generated
	 */
	public Adapter createDataPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataPropertyRange <em>Data Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataPropertyRange
	 * @generated
	 */
	public Adapter createDataPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DifferentIndividuals <em>Different Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DifferentIndividuals
	 * @generated
	 */
	public Adapter createDifferentIndividualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DisjointClasses
	 * @generated
	 */
	public Adapter createDisjointClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DisjointDataProperties
	 * @generated
	 */
	public Adapter createDisjointDataPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DisjointObjectProperties
	 * @generated
	 */
	public Adapter createDisjointObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DisjointUnion <em>Disjoint Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DisjointUnion
	 * @generated
	 */
	public Adapter createDisjointUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.EquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.EquivalentClasses
	 * @generated
	 */
	public Adapter createEquivalentClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.EquivalentDataProperties
	 * @generated
	 */
	public Adapter createEquivalentDataPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.FunctionalDataProperty <em>Functional Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.FunctionalDataProperty
	 * @generated
	 */
	public Adapter createFunctionalDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.EquivalentObjectProperties
	 * @generated
	 */
	public Adapter createEquivalentObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.FunctionalObjectProperty <em>Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.FunctionalObjectProperty
	 * @generated
	 */
	public Adapter createFunctionalObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.InverseFunctionalObjectProperty
	 * @generated
	 */
	public Adapter createInverseFunctionalObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.NegativeObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectPropertyDomain <em>Object Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectPropertyDomain
	 * @generated
	 */
	public Adapter createObjectPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SymmetricObjectProperty
	 * @generated
	 */
	public Adapter createSymmetricObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ReflexiveObjectProperty
	 * @generated
	 */
	public Adapter createReflexiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SubDataPropertyOf
	 * @generated
	 */
	public Adapter createSubDataPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SameIndividual <em>Same Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SameIndividual
	 * @generated
	 */
	public Adapter createSameIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SubObjectPropertyOf
	 * @generated
	 */
	public Adapter createSubObjectPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectComplementOf
	 * @generated
	 */
	public Adapter createObjectComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectPropertyRange <em>Object Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectPropertyRange
	 * @generated
	 */
	public Adapter createObjectPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataPropertyAssertion <em>Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataPropertyAssertion
	 * @generated
	 */
	public Adapter createDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ClassAssertion <em>Class Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ClassAssertion
	 * @generated
	 */
	public Adapter createClassAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.IrreflexiveObjectProperty
	 * @generated
	 */
	public Adapter createIrreflexiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectExactCardinality
	 * @generated
	 */
	public Adapter createObjectExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataComplementOf <em>Data Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataComplementOf
	 * @generated
	 */
	public Adapter createDataComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SubClassOf
	 * @generated
	 */
	public Adapter createSubClassOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.TransitiveObjectProperty
	 * @generated
	 */
	public Adapter createTransitiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.InverseObjectProperties <em>Inverse Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.InverseObjectProperties
	 * @generated
	 */
	public Adapter createInverseObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnonymousIndividual
	 * @generated
	 */
	public Adapter createAnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectAndDataPropertyAxiom <em>Object And Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectAndDataPropertyAxiom
	 * @generated
	 */
	public Adapter createObjectAndDataPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.HasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.HasKey
	 * @generated
	 */
	public Adapter createHasKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.TypedLiteral <em>Typed Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.TypedLiteral
	 * @generated
	 */
	public Adapter createTypedLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataIntersectionOf <em>Data Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataIntersectionOf
	 * @generated
	 */
	public Adapter createDataIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataUnionOf <em>Data Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataUnionOf
	 * @generated
	 */
	public Adapter createDataUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DataTypeDefinition
	 * @generated
	 */
	public Adapter createDataTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationAxiom <em>Annotation Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationAxiom
	 * @generated
	 */
	public Adapter createAnnotationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SubAnnotationPropertyOf
	 * @generated
	 */
	public Adapter createSubAnnotationPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationPropertyDomain <em>Annotation Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationPropertyDomain
	 * @generated
	 */
	public Adapter createAnnotationPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationPropertyRange <em>Annotation Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationPropertyRange
	 * @generated
	 */
	public Adapter createAnnotationPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationAssertion <em>Annotation Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationAssertion
	 * @generated
	 */
	public Adapter createAnnotationAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationSubject <em>Annotation Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationSubject
	 * @generated
	 */
	public Adapter createAnnotationSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AnnotationValue <em>Annotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AnnotationValue
	 * @generated
	 */
	public Adapter createAnnotationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SubObjectPropertyExpression <em>Sub Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SubObjectPropertyExpression
	 * @generated
	 */
	public Adapter createSubObjectPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectPropertyChain <em>Object Property Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectPropertyChain
	 * @generated
	 */
	public Adapter createObjectPropertyChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OwlAdapterFactory
