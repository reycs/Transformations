package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLOntology;

import owlecore.OwlEcoreXmiWriter;

public class RoundTripTest extends TestBase {

	private List<String> iris = new ArrayList<String>();
	private boolean createTestSet = false;
	private boolean collectStats = true;
	
	public void createUniqueOntologyTestSet() {
		File dir = new File("input/testontologies");
		File[] directoryListing = dir.listFiles();
		
		int count = 0;
		
		if (directoryListing != null) {
			for (File file : directoryListing) {
				OwlEcoreXmiWriter writer = new OwlEcoreXmiWriter("input/testontologies/" + file.getName());
				if (writer.getLoadedOntology().getAxiomCount() > 0) {
					if (!containedInUniqueTestSet(writer.getLoadedOntology())) {
						try {
							FileUtils.copyFile(file, new File("input/uniquetestontologies/" + file.getName()));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				} else {
					count++;
				}
			}
		}
		System.out.println("[RoundTripTest] Test set contained " + count + " empty ontologies");
	}
	
	private boolean containedInUniqueTestSet(OWLOntology ontology) {
		String iri = ontology.getOntologyID().getOntologyIRI().toString();
		System.out.println("[RoundTripTest] Checking if [" + iri + "] is contained in test set");
		if (iris.contains(iri) && ontology.getOntologyID().getOntologyIRI().isPresent()) {
			System.out.println("[RoundTripTest] Already present in unique test set");
			return true;
		} else {
			iris.add(iri);
			System.out.println("[RoundTripTest] Not contained in unique test set, added the ontology to the testset");
			return false;
		}
	}
	
	@Test
	public void testRoundTrip() throws Exception {
		if (createTestSet) {
			System.out.println("[RoundTripTest] Creating unique ontology test set");
			RoundTripTest test = new RoundTripTest();
			test.createUniqueOntologyTestSet();
		}
		
		System.out.println("[RoundTripTest] Going to test roundtrips OWL API -> XMI -> OWL API");
		
		// test all the files in the input/uniquetestontologies folder
		File dir = new File("input/uniquetestontologies/");
		File[] directoryListing = dir.listFiles();
		List<HashMap<EClass, Integer>> objectTrackers = new ArrayList<HashMap<EClass, Integer>>();
		
		System.out.println("[RoundTripTest] Going to test " + directoryListing.length + " ontologies");
		
		int count = 0;
		
		if (directoryListing != null) {
			for (File file : directoryListing) {
				count++;
				System.out.println("[RoundTripTest] Testing (" + count + "/" + directoryListing.length + ") [" + file.getName() + "]");
				
				// writing to XMI
				OwlEcoreXmiWriter writer = new OwlEcoreXmiWriter("input/uniquetestontologies/" + file.getName());
				writer.write("output/uniquetestontologiesxmi/" + FilenameUtils.removeExtension(file.getName()) + ".xmi");
				
				// parsing to OWL
				OwlStatsCollector parser = new OwlStatsCollector("output/uniquetestontologiesxmi/" + FilenameUtils.removeExtension(file.getName()) + ".xmi");
				parser.parse().save("output/uniquetestontologiesowl/" + file.getName(), writer.getLoadedOntology().getFormat());
				System.out.println("[RoundTripTest] RoundTrip succesful: " + equal(writer.getLoadedOntology(), parser.getParsedOntology()));
				
				if (collectStats) {
					System.out.println("[RoundTripTest] [" + file.getName() + "] covered [" + parser.calculateCoverage(parser.getObjectTracker()) + "%] of instantiable constructs");
					objectTrackers.add(parser.getObjectTracker());
					System.out.println("[RoundTripTest] Accummulative testontologyset covered [" + parser.calculateTotalCoverage(objectTrackers) + "%] of instantiable constructs");
					if (count == directoryListing.length) {
						parser.calculateUse(objectTrackers);
						parser.calculatePercentageUse(objectTrackers);
					}
				}
			}
		}
		
		System.out.println("[RoundTripTest] Finished testing");
	}
}
