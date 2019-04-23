package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import owl.OwlFactory;
import owlecore.OwlEcoreXmiParser;

/**
 * Extension of the OwlEcoreXmiWriter to gain insights about the usage of owl constructs
 */
public class OwlStatsCollector extends OwlEcoreXmiParser {

	private HashMap<EClass, Integer> objectTracker;
	private int instantiableConstructs;
	
	public OwlStatsCollector(String document) {
		super(document);
		objectTracker = getNewObjectTracker();
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

}
