package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OWLAnalysis {

	public static void writeStringToCSV(String input, String fileName) {
		try {
			PrintWriter writer = new PrintWriter(new File("output/diffroundtrip/" + fileName));
			writer.write(input);
			writer.flush();
			System.out.println("Wrote data to [output/diffroundtrip/" + fileName + "]");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// iterate over all the axiom diffs in the directory: 
		File dir = new File("output/roundtripaxioms");
		File[] directoryListing = dir.listFiles();
		HashMap<String, Integer> totalCounter = new HashMap<String, Integer>();
		List<HashMap<String, Integer>> axiomCounters = new ArrayList<HashMap<String, Integer>>();
		
		int count = 0;
		
		if (directoryListing != null) {
			for (File file : directoryListing) {
				count++;
				HashMap<String, Integer> axiomCounter = new HashMap<String, Integer>();

				List<String> strings = Files.readAllLines(Paths.get("output/roundtripaxioms/" + file.getName()), StandardCharsets.ISO_8859_1);
				
				
				String result = "";
				
				for (String line : strings) {
					result += line;
				}
		
				result = result.replaceAll("\\<[^\\>]+>","URI");
				result = result.replaceAll("\"[^\"]+\"","String");
				
				// strip
				String[] addedAxioms = result.split("Add axiom:");
				
				// missing axioms
				String[] missingAxioms = addedAxioms[0].split("Rem axiom:");
				for (String axiom : missingAxioms) {
					if (!axiom.isEmpty()) {
						if (axiomCounter.containsKey("Missing" + axiom)) {
							axiomCounter.put("Missing" + axiom, axiomCounter.get("Missing" + axiom) + 1);
						} else {
							axiomCounter.put("Missing" + axiom, 1);
						}
					}
				}
				
				
				// [0] contains all the missing axioms [1..*] contains all the added axioms
				for (int x = 1; x < addedAxioms.length; x++) {
					if (!addedAxioms[x].isEmpty()) {
						if (axiomCounter.containsKey("Added" + addedAxioms[x])) {
							axiomCounter.put("Added" + addedAxioms[x], axiomCounter.get("Added" + addedAxioms[x]) + 1);
						} else {
							axiomCounter.put("Added" + addedAxioms[x], 1);
						}
					}
				}
				
				StringBuilder sb = new StringBuilder();
				for (Map.Entry<String, Integer> entry : axiomCounter.entrySet()) {
					sb.append(entry.getKey());
					sb.append(",");
					sb.append(entry.getValue());
					sb.append("\n");
				}
				writeStringToCSV(sb.toString(), file.getName() + ".csv");
				
				// add
				axiomCounters.add(axiomCounter);
			}
		}
		
		for (HashMap<String, Integer> counter : axiomCounters) {
			for (Map.Entry<String, Integer> entry : counter.entrySet()) {
				String key = entry.getKey();
				if (key.contains("AnnotationAssertion")) {
					key = "AnnotationAssertion(Grouped)";
				}
				
				if (key.contains("ClassAssertion")) {
					key = "ClassAssertion(Grouped)";
				}
				
				if (key.contains("DataPropertyAssertion")) {
					key = "DataPropertyAssertion(Grouped)";
				}
				
				if (key.contains("ObjectPropertyAssertion")) {
					key = "ObjectPropertyAssertion(Grouped)";
				}
				
				if (key.contains("Declaration(AnnotationProperty")) {
					key = "Declaration(AnnotationProperty(Grouped))";
				}
				
				if (totalCounter.containsKey(key)) {
					totalCounter.put(key, totalCounter.get(key) + entry.getValue());
				} else {
					totalCounter.put(key, entry.getValue());
				}
			}
		}
		
		System.out.println("Wrote data of <" + count + "> files");
		
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Integer> entry : totalCounter.entrySet()) {
			sb.append(entry.getKey());
			sb.append(",");
			sb.append(entry.getValue());
			sb.append("\n");
		}
		writeStringToCSV(sb.toString(), "OWLRoundtrip.csv");
	}
}
