package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

import owl.AnnotationAssertion;
import owl.DataPropertyDomain;
import owl.DataPropertyRange;
import owl.Declaration;
import owl.ObjectPropertyDomain;
import owl.ObjectPropertyRange;
import owl.ObjectSomeValuesFrom;
import owl.OwlFactory;
import owl.SubClassOf;
import owlecore.OwlEcoreXmiParser;

/**
 * Extension of the OwlEcoreXmiWriter to gain insights about the usage of owl constructs
 */
public class OwlStatsCollector extends OwlEcoreXmiParser {

	private HashMap<EClass, Integer> objectTracker;
	private HashMap<String, Integer> breakdownTracker;
	private int instantiableConstructs;
	
	public OwlStatsCollector(String document) {
		super(document);
		objectTracker = getNewObjectTracker();
		breakdownTracker = new HashMap<String, Integer>();
		// popoluate the object tracker with all the possible OWL meta constructs
		instantiableConstructs = objectTracker.size();
		trackObjects();
	}
	
	private void trackObjects() {
		this.getOntologyInstance().getContents().forEach(object -> {	
			objectTracker.put(object.eClass(), objectTracker.get(object.eClass()) + 1);
		});
	}
	
	public float calculateCoverage(HashMap<EClass, Integer> tracker) {
		int constructsNotCovered = 0;
		for (Map.Entry<EClass, Integer> entry : tracker.entrySet()) {
		    if (entry.getValue() == 0) {
		    	constructsNotCovered++;
		    }
		}
		int coveredConstructs = instantiableConstructs - constructsNotCovered;
		float percentage = ((float) coveredConstructs / instantiableConstructs) * 100;
		return percentage;
	}
	
	public float calculateTotalCoverage(List<HashMap<EClass, Integer>> objectTrackers) {
		HashMap<EClass, Integer> totalObjects = getTotalobjects(objectTrackers);
		return calculateCoverage(totalObjects);
	}
	
	public void calculateUse(List<HashMap<EClass, Integer>> objectTrackers) {
		HashMap<EClass, Integer> totalObjects = getTotalobjects(objectTrackers);
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<EClass, Integer> entry : totalObjects.entrySet()) {
			sb.append(entry.getKey().getName());
			sb.append(",");
			sb.append(entry.getValue());
			sb.append("\n");
		}
		writeStringToCSV(sb.toString(), "useStats.csv");
	}
	
	public void collectBreakDownStats(List<HashMap<String, Integer>> breakDownTrackers) {
		HashMap<String, Integer> totalBreakDown = new HashMap<String, Integer>();
		for (HashMap<String, Integer> tracker : breakDownTrackers) {
			for (Map.Entry<String, Integer> entry : tracker.entrySet()) {
				if (totalBreakDown.containsKey(entry.getKey())) {
					totalBreakDown.put(entry.getKey(), totalBreakDown.get(entry.getKey()) + entry.getValue());
				} else {
					totalBreakDown.put(entry.getKey(), 1);
				}
			}
		}
		// writing
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Integer> entry : totalBreakDown.entrySet()) {
			sb.append(entry.getKey());
			sb.append(",");
			sb.append(entry.getValue());
			sb.append("\n");
		}
		writeStringToCSV(sb.toString(), "breakdown.csv");
	}
	
	public void calculatePercentageUse(List<HashMap<EClass, Integer>> objectTrackers) {
		HashMap<EClass, Integer> cleanObjectTracker = getNewObjectTracker();
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<EClass, Integer> entry : cleanObjectTracker.entrySet()) {
			int count = 0;
			for (HashMap<EClass, Integer> objectTracker : objectTrackers) {
				if (objectTracker.get(entry.getKey()) > 0) {
					count++;
				}
			}
			float percentage = ((float) count / objectTrackers.size()) * 100;
			sb.append(entry.getKey().getName());
			sb.append(",");
			sb.append(percentage);
			sb.append("\n");
		}
		writeStringToCSV(sb.toString(), "percentageUseStats.csv");
	}
	
	public void collectCoverage(List<HashMap<EClass, Integer>> objectTrackers) {
		StringBuilder sb = new StringBuilder();
		for (HashMap<EClass, Integer> objectTracker : objectTrackers) {
			sb.append(calculateCoverage(objectTracker));
			sb.append("\n");
		}
		writeStringToCSV(sb.toString(), "coverageStats.csv");
	}
	
	private HashMap<EClass, Integer> getTotalobjects(List<HashMap<EClass, Integer>> objectTrackers) {
		HashMap<EClass, Integer> totalObjects = new HashMap<EClass, Integer>();
		for (HashMap<EClass, Integer> objectTracker : objectTrackers) {
			for (Map.Entry<EClass, Integer> entry : objectTracker.entrySet()) {
				if (totalObjects.containsKey(entry.getKey())) {
					totalObjects.put(entry.getKey(), totalObjects.get(entry.getKey()) + entry.getValue());
				} else {
					totalObjects.put(entry.getKey(), entry.getValue());
				}
			}
		}
		return totalObjects;
	}
	
	private HashMap<EClass, Integer> getNewObjectTracker() {
		HashMap<EClass, Integer> newObjectTracker = new HashMap<EClass, Integer>();
		OwlFactory.eINSTANCE.getEPackage().getEClassifiers().forEach(object -> {
			EClass eClass = (EClass) object;
			if (!eClass.isAbstract())
				newObjectTracker.put(eClass, 0);
		});
		return newObjectTracker;
	}
	
	private void writeStringToCSV(String input, String fileName) {
		try {
			PrintWriter writer = new PrintWriter(new File("output/" + fileName));
			writer.write(input);
			writer.flush();
			System.out.println("[OwlStatsCollector] Wrote data to [output/" + fileName + "]");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public HashMap<EClass, Integer> getObjectTracker() {
		return objectTracker;
	}

	@Override
	public OWLDeclarationAxiom caseDeclaration(Declaration axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getEntity().eClass(), "Declaration:");
		return super.caseDeclaration(axiom);
	}
	
	@Override
	public OWLSubClassOfAxiom caseSubClassOf(SubClassOf axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getSubClassExpression().eClass(), "subClassExpression:");
		addBreakDownObject(axiom.getSuperClassExpression().eClass(), "superClassExpression:");
		return super.caseSubClassOf(axiom);
	}
	
	@Override
	public OWLAnnotationAssertionAxiom caseAnnotationAssertion(AnnotationAssertion axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getAnnotationSubject().eClass(), "AnnotationAssertion:");
		addBreakDownObject(axiom.getAnnotationProperty().eClass(), "AnnotationAssertion:");
		return super.caseAnnotationAssertion(axiom);
	}
	
	@Override
	public OWLObjectPropertyDomainAxiom caseObjectPropertyDomain(ObjectPropertyDomain axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getDomain().eClass(), "ObjectPropertyDomain:");
		addBreakDownObject(axiom.getObjectPropertyExpression().eClass(), "ObjectPropertyDomain:");
		return super.caseObjectPropertyDomain(axiom);
	}
	
	@Override
	public OWLObjectPropertyRangeAxiom caseObjectPropertyRange(ObjectPropertyRange axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getObjectPropertyExpression().eClass(), "ObjectPropertyRange:");
		addBreakDownObject(axiom.getRange().eClass(), "ObjectPropertyRange:");
		return super.caseObjectPropertyRange(axiom);
	}
	
	@Override
	public OWLDataPropertyRangeAxiom caseDataPropertyRange(DataPropertyRange axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getDataPropertyExpression().eClass(), "DataPropertyRange:");
		addBreakDownObject(axiom.getRange().eClass(), "DataPropertyRange:");
		return super.caseDataPropertyRange(axiom);
	}
	
	@Override
	public OWLDataPropertyDomainAxiom caseDataPropertyDomain(DataPropertyDomain axiom) {
		addBreakDownObject(axiom.eClass(), "");
		addBreakDownObject(axiom.getDataPropertyExpression().eClass(), "DataPropertyDomain:");
		addBreakDownObject(axiom.getDomain().eClass(), "DataPropertyDomain:");
		return super.caseDataPropertyDomain(axiom);
	}
	
	@Override
	public OWLObjectSomeValuesFrom caseObjectSomeValuesFrom(ObjectSomeValuesFrom ce) {
		addBreakDownObject(ce.eClass(), "");
		addBreakDownObject(ce.getClassExpression().eClass(), "ObjectSomeValuesFrom:");
		addBreakDownObject(ce.getObjectPropertyExpression().eClass(), "ObjectSomeValuesFrom:");
		return super.caseObjectSomeValuesFrom(ce);
	}
	
	private void addBreakDownObject(EClass object, String prefix) {
		if (breakdownTracker.containsKey(prefix + object.getName())) {
			breakdownTracker.put(prefix + object.getName(), breakdownTracker.get(prefix + object.getName()) + 1);
		} else {
			breakdownTracker.put(prefix + object.getName(), 1);
		}
	}
	
	public HashMap<String, Integer> getBreakDown() {
		return breakdownTracker;
	}
	
}
