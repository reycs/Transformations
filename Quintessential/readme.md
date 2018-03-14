Eclipse ATL transformation of Quintessential CIM package 

This is a complete ATL Project, import dir Quintessential as such into Eclipse.

Use Eclipse Oxygen Modeling (https://www.eclipse.org/downloads/eclipse-packages/)

The total transformation consist of 3 steps:
- UML to OWL metamodel
- OWL to XML metamodel ( RDF/XML serialization )
- XML Metamodel to actual RDF/XML

In future it is quit possible to add a OWL/XML serialization.

The first 2 are done with ATL scripts, the second with a dedicated 'projector' whitch you must put in the 'plugins' subdir of the eclipse installation (org.eclipse.m2m.atl.projectors.xml_0.4.0.jar, originally from  http://docatlanmod.emn.fr/ATL/Plugins/org.eclipse.m2m.atl.projectors.xml_0.4.0.jar)

The total transform can be done by starting the Ant build script (AntBuild-Quintessential.xml, right click, Run as, Ant Build)
This is the only way the last step ( actual xml production ) can be triggered.

The UML2OWL and OWL2XML transformations can be done seperatly by using the launch configurations 
- LinkED-OWL2XML.launch launches LinkED.atl
- LinkED-UML2OWL.launch launches LinkED-XML.atl

The Eclipse internal UML 2.5 ( URL: http://www.eclipse.org/uml2/5.0.0/UML ) is used. The UML.Ecore file can be found in the Eclipse install subdir plugins in the file org.eclipse.uml2.uml_5.3.0.v20170605-1616.jar ( e.g. for Eclipse Oxygen ). For convenience it is include here. It can be used directly, but there will be small differences ( i.e. uppervalue=* is invalid according to the 'raw' metamodel. Using the nsuri, Eclipse translates this during parsing to -1. For concenience this will also be done in the stylesheet (see later)  

The OWL2.ecore metamodel comes from the w3c ( https://www.w3.org/2007/OWL/wiki/MOF-Based_Metamodel ). It is not entirely sure whether this conforms to the latest specification, but it seems to work. 
