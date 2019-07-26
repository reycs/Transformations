import java.awt.Color;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JButton;
import javax.swing.SwingWorker;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import owl.OwlPackage;
import owlecore.OwlEcoreXmiParser;
import owlecore.OwlEcoreXmiWriter;

public class ToolModel {
	private ResourceSet resourceSet;
	private ToolView view;
	private URL umlURL, owlURL;
	private int statusCode;
	
	public ToolModel(ToolView view) {
		this.view = view;
		// setup QVT
		OwlPackage owlInstance = OwlPackage.eINSTANCE;
		resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		resourceSet.getPackageRegistry().put(owlInstance.getNsURI(), owlInstance);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}
	
	public void startOWLTransformation() {
		view.owlStart.setEnabled(false);
		view.owlStart.setBackground(new Color(52, 73, 85));
		view.owlStart.setForeground(Color.WHITE);
		view.owlLog.setText("");
		view.owlLog.setForeground(Color.BLACK);
		statusCode = 0;
		SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception {
				owlURL = this.getClass().getResource("qvt/OWLtoUML.qvto");
				TransformationExecutor executorOWL = new TransformationExecutor(URI.createURI(owlURL.toString()));
				publish(1); // STATUS 1: managed to create executor
				System.out.println("Break here?");
				
				System.out.println(view.inputOWL.canRead());
				OwlEcoreXmiWriter writer = new OwlEcoreXmiWriter(view.inputOWL);
				System.out.println("break here?");
				writer.write("file:///" + view.outputOWL + "\\" + FilenameUtils.removeExtension(view.inputOWL.getName()) + ".xmi");
				publish(2); // STATUS 2: managed to write to XMI
				System.out.println("break here?????????????");
				
				ExecutionContextImpl contextOWL = new ExecutionContextImpl();
				contextOWL.setConfigProperty("useCIMDataTypes", view.owlUseCIMCheckbox.isSelected());
				contextOWL.setConfigProperty("useXSDDataTypes", view.owlUseXSDCheckbox.isSelected());
				contextOWL.setConfigProperty("useOWLThing", view.owlUseThingCheckbox.isSelected());
				contextOWL.setConfigProperty("useRDFLiteral", view.owlUseRDFCheckbox.isSelected());
				contextOWL.setConfigProperty("removePrefix", view.owlPrefixText.getText());
				contextOWL.setLog(new WriterLog(new OutputStreamWriter(System.out)));
				publish(3); // STATUS 3; managed to set configuration
				
				Resource inOWLResource = resourceSet.getResource(URI.createURI("file:///" + view.outputOWL + "\\" + FilenameUtils.removeExtension(view.inputOWL.getName()) + ".xmi"), true);
				EList<EObject> inOWLObjects = inOWLResource.getContents();
				ModelExtent inputOWL = new BasicModelExtent(inOWLObjects);
				ModelExtent outputOWL = new BasicModelExtent();
				
				ExecutionDiagnostic resultOWL = executorOWL.execute(contextOWL, inputOWL, outputOWL);
				
				if (resultOWL.getSeverity() == Diagnostic.OK) {
					publish(4); // STATUS 4; managed to execute the transformation
					System.out.println("ok");
					List<EObject> outOWLObjects = outputOWL.getContents();
					Resource outOWLResource = resourceSet.createResource(URI.createURI("file:///" + view.outputOWL + "\\" + FilenameUtils.removeExtension(view.inputOWL.getName()) + ".uml"));
					outOWLResource.getContents().addAll(outOWLObjects);
					outOWLResource.save(Collections.emptyMap());
				} else {
					System.out.println("not ok");
				}
				
				return true;
			}
			
			@Override
			protected void done() {
				boolean status;
				enableTransform(view.owlStart);
				try {
					status = get();
					System.out.println(status);
					view.addLogOWL("Successfully transformed OWL -> UML");
					view.owlLog.setForeground(new Color(0, 128, 0));
				} catch (InterruptedException e) {
					view.owlLog.setForeground(Color.RED);
					view.addLogOWL("Error: the transformation was interrupted");
				} catch (ExecutionException e) {
					view.owlLog.setForeground(Color.RED);
					view.addLogOWL("Error the transformation failed");
				}
			}
			
			@Override
			protected void process(List<Integer> logs) {
				for (int log : logs) {
					switch(log) {
						case 1:
							view.addLogOWL("Starting OWL -> UML transformation");
							view.addLogOWL("Succesfully created transformation executor");
						break;
						case 2:
							view.addLogOWL("Succesfully parsed OWL file and written XMI");
						break;
						case 3:
							view.addLogOWL("Succesfully configured the transformation");
						break;
						case 4:
							view.addLogOWL("Succesfully executed the transformation");
						break;
						case 5:
							view.addLogUML("Succesfully serialized the transformed OWL");
						break;
					}
					statusCode = log;
				}
			}
		};
		worker.execute();
	}
	
	public void startUMLTransformation() {
		view.umlStart.setEnabled(false);
		view.umlStart.setBackground(new Color(52, 73, 85));
		view.umlStart.setForeground(Color.WHITE);
		view.umlLog.setText("");
		view.umlLog.setForeground(Color.BLACK);
		statusCode = 0;
		SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception {
				umlURL = this.getClass().getResource("qvt/UMLtoOWL.qvto");
				TransformationExecutor executorUML = new TransformationExecutor(URI.createURI(umlURL.toString()));
				publish(1); // STATUS 1: managed to create executor
				
				Resource inUMLResource = resourceSet.getResource(URI.createURI("file:///" + view.inputUML.getAbsolutePath()), true);
				EList<EObject> inUMLObjects = inUMLResource.getContents();
				ModelExtent inputUML = new BasicModelExtent(inUMLObjects);
				ModelExtent outputUML = new BasicModelExtent();
				publish(2); // STATUS 2: managed to load the UML file
				
				// configuration properties, logger, monitor object etc.
				ExecutionContextImpl contextUML = new ExecutionContextImpl();
				contextUML.setConfigProperty("useCIMDataTypes", view.umlUseCIMCheckbox.isSelected());
				contextUML.setConfigProperty("useXSDDataTypes", view.umlUseXSDCheckbox.isSelected());
				contextUML.setConfigProperty("useRDFLiteral", view.umlUseRDFCheckbox.isSelected());
				contextUML.setConfigProperty("IRIPrefix", view.umlPrefixText.getText());
				contextUML.setLog(new WriterLog(new OutputStreamWriter(System.out)));
				publish(3); // STATUS 3: succesfuly set the settings
				
				ExecutionDiagnostic resultUML = executorUML.execute(contextUML, inputUML, outputUML);
				
				if(resultUML.getSeverity() == Diagnostic.OK) {
					// the output objects got captured in the output extent
					List<EObject> outUMLObjects = outputUML.getContents();
					System.out.println(URI.createURI(view.outputUML + "\\" + FilenameUtils.removeExtension(view.inputUML.getName()) + ".xmi"));
					Resource outUMLResource = resourceSet.createResource(URI.createURI("file:///" + view.outputUML + "\\" + FilenameUtils.removeExtension(view.inputUML.getName()) + ".xmi"));
					outUMLResource.getContents().addAll(outUMLObjects);
					try {
						outUMLResource.save(Collections.emptyMap());
					} catch (IOException e) {
						e.printStackTrace();
					}
					publish(4); // STATUS 4: transformation succesful
					
					// Serialize the OWL xmi
					OwlEcoreXmiParser parser = new OwlEcoreXmiParser("file:///" + view.outputUML + "\\" + FilenameUtils.removeExtension(view.inputUML.getName()) + ".xmi");
					parser.parse().save(view.outputUML + "\\" + FilenameUtils.removeExtension(view.inputUML.getName()) + ".owl", String.valueOf(view.owlFormats.getSelectedItem()));
					publish(5); // STATUS 5: serialization succesful
				} else {
					System.out.println("[QVT UML -> OWL] Something went wrong with the UML -> OWL transformation");
				}
				return true;
			}
			
			@Override
			protected void done() {
				boolean status;
				enableTransform(view.umlStart);
				try {
					status = get();
					System.out.println(status);
					view.addLogUML("Transformation succesfull");
					view.umlLog.setForeground(new Color(0, 128, 0));
				} catch (InterruptedException e) {
					view.addLogUML("Error: the transformation was interrupted");
				} catch (ExecutionException e) {
					view.umlLog.setForeground(Color.RED);
					switch(statusCode) {
						case 0:
							view.addLogUML("Error: cannot open the UML -> OWL qvt");
						break;
						case 1:
							view.addLogUML("Error: failed to parse the UML file \n please select a correct UML model");
						break;
						case 2:
							view.addLogUML("Error: failed to configure the transformation");
						break;
						case 3:
							view.addLogUML("Error: failed to execute the transformation");
						break;
						case 4:
							view.addLogUML("Error: failed to serialize the OWL");
						break;
					}
				}
			}
			
			@Override
			protected void process(List<Integer> logs) {
				for (int log : logs) {
					switch(log) {
						case 1:
							view.addLogUML("Starting UML -> OWL transformation");
							view.addLogUML("Succesfully created transformation executor");
						break;
						case 2:
							view.addLogUML("Succesfully loaded input UML file");
						break;
						case 3:
							view.addLogUML("Succesfully configured the transformation");
						break;
						case 4:
							view.addLogUML("Succesfully transformed UML -> OWL");
						break;
						case 5:
							view.addLogUML("Succesfully serialized the transformed OWL");
						break;
					}
					statusCode = log;
				}
			}
		};  
		worker.execute();
	}
	
	private void enableTransform(JButton button) {
		button.setEnabled(true);
		button.setBackground(new Color(249, 170, 51));
		button.setForeground(Color.BLACK);
	}
}
