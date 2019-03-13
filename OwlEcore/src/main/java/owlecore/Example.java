package owlecore;

import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;

public class Example {

	/**
	 * Example use of the parser and writer
	 * @param args
	 */
	public static void main(String[] args) {
		// Parsing document
		OwlEcoreParser<Object> parser = new OwlEcoreParser<Object>("input/Quintessential-SC1-Eclipse.xmi");
		parser.parse("output/Parsertest.owl", new OWLXMLDocumentFormat());
		System.out.println("[Parser] finished parsing.");

		// Writing document
		OwlEcoreWriter writer = new OwlEcoreWriter("input/Quintessential-SC1-Eclipse.owl");
		writer.write("output/Writertest.xmi");
		System.out.println("[Writer] finished writing.");
	}

}
