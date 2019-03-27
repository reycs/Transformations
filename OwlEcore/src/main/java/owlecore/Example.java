package owlecore;

import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;

public class Example {

	/**
	 * Example use of the parser and writer
	 * @param args
	 */
	public static void main(String[] args) {
		// Parsing document
		//OwlEcoreXmiParser parser = new OwlEcoreXmiParser("input/Quintessential-SC1-Eclipse.xmi");
		OwlEcoreXmiParser parser = new OwlEcoreXmiParser("output/Writertest.xmi");
		//parser.parse("output/Parsertest.owl", new OWLXMLDocumentFormat());
		parser.parse().save("output/Parsertest.owl", new RDFXMLDocumentFormat());
		System.out.println("[Parser] finished parsing.");

		// Writing document
		//OwlEcoreWriter writer = new OwlEcoreWriter("input/Quintessential-SC1-Eclipse-RDF.owl");
		OwlEcoreWriter writer = new OwlEcoreWriter("input/pizza.owl");
		writer.write("output/Writertest.xmi");
		System.out.println("[Writer] finished writing.");
		
	}

}
