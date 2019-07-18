package test;

import owlecore.OwlEcoreXmiWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.apache.commons.io.FilenameUtils;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;

public class OWLRoundtrip extends TestBase {

	@Test
	public void testRoundTrip() throws Exception {
		File dir = new File("output/qvtowl");
		File[] directoryListing = dir.listFiles();
		
		// IF TIME COUNT THE DECLARATIONS
		for (File file : directoryListing) {
			// urn:absolute:
			
			// load ontologies
			OwlEcoreXmiWriter writer = new OwlEcoreXmiWriter("output/qvtowl/" + file.getName());
			OwlEcoreXmiWriter writer2 = new OwlEcoreXmiWriter("output/qvtroundtripowl/" + FilenameUtils.removeExtension(file.getName()) + ".owl");
			try {
				equal(writer.getLoadedOntology(), writer2.getLoadedOntology());
				try {
					System.out.println("Wrote data to [output/roundtripaxioms/" + FilenameUtils.removeExtension(file.getName()) + ".txt]");
					PrintWriter fileWriter = new PrintWriter(new File("output/roundtripaxioms/" + FilenameUtils.removeExtension(file.getName()) + ".txt"));
					fileWriter.write("Succesful");
					fileWriter.flush();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			} catch (AssertionError error) {
				try {
					System.out.println("Wrote data to [output/roundtripaxioms/" + FilenameUtils.removeExtension(file.getName()) + ".txt]");
					PrintWriter fileWriter = new PrintWriter(new File("output/roundtripaxioms/" + FilenameUtils.removeExtension(file.getName()) + ".txt"));
					fileWriter.write(error.toString().replace("java.lang.AssertionError: OWLRoundtrip roundTripOntology() Failing to match axioms:", "").trim());
					fileWriter.flush();
					
					if (error.toString().contains("java.lang.AssertionError: Ontologies supposed to be the same expected")) {
						System.out.println(file.getName());
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
