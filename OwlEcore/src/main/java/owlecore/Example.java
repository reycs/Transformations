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
		OwlEcoreParser parser = new OwlEcoreParser("input/Quintessential-SC1-Eclipse.xmi");
		//OwlEcoreParser parser = new OwlEcoreParser("output/Writertest.xmi");
		//parser.parse("output/Parsertest.owl", new OWLXMLDocumentFormat());
		parser.parse("output/Parsertest.owl", new RDFXMLDocumentFormat());
		System.out.println("[Parser] finished parsing.");

		// Writing document
		//OwlEcoreWriter writer = new OwlEcoreWriter("input/Quintessential-SC1-Eclipse-RDF.owl");
		//OwlEcoreWriter writer = new OwlEcoreWriter("input/pizza.owl");
		//writer.write("output/Writertest.xmi");
		//System.out.println("[Writer] finished writing.");
	}

}
