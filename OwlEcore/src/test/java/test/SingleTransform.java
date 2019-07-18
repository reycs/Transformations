package test;

import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;

import owlecore.OwlEcoreXmiParser;

public class SingleTransform {

	public static void main(String[] args) {
		OwlEcoreXmiParser parser = new OwlEcoreXmiParser("output/roundtripxmi/atomroundtrip.xmi");
		parser.parse().save("output/roundtripxmi/atomroundtrip.owl", new RDFXMLDocumentFormat());
	}

}
