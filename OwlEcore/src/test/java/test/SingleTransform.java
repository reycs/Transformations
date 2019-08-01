package test;

import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;

import owlecore.OwlEcoreXmiParser;
import owlecore.OwlEcoreXmiWriter;

public class SingleTransform {

	public static void main(String[] args) {
		OwlEcoreXmiParser parser = new OwlEcoreXmiParser("output/inspireslice.xmi");
		parser.parse().save("output/inspireslice.owl", new RDFXMLDocumentFormat());
		//OwlEcoreXmiWriter writer = new OwlEcoreXmiWriter("output/inspireFixed.owl");
	}

}
