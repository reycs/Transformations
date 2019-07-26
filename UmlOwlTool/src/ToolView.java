import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class ToolView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final DateFormat sdf = new SimpleDateFormat("HH:mm");
	public JCheckBox umlUseXSDCheckbox, umlUseCIMCheckbox, umlUseRDFCheckbox, owlUseXSDCheckbox, owlUseCIMCheckbox, owlUseRDFCheckbox, owlUseThingCheckbox;
	public JComboBox<String> owlFormats;
	public JTextField umlPrefixText, owlPrefixText;
	public File inputUML, inputOWL;
	public String outputUML, outputOWL;
	public JButton uml, owl, umlSelectFile, umlSelectDirectory, umlStart, owlStart, owlSelectFile, owlSelectDirectory;
	public JTextPane umlLog, owlLog;
	private JTextField umlFilePath, umlDirectoryPath, owlFilePath, owlDirectoryPath;
	private JPanel umlPanel, owlPanel, footer;
	private ToolModel model;
	private Font blackFont, boldFont, regularFont;
	private Color mainColor, accentColor;
	
	public ToolView() throws FontFormatException, IOException {
		super("UmlOwlTool");
		 try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch(Exception ex) {
	        ex.printStackTrace();
	    }
		
		// resizes the JFrame to fit the content
		addComponentListener(new ComponentAdapter() 
		{  
		    public void componentResized(ComponentEvent evt) {
		    	umlPanel.setMinimumSize(new Dimension(480, umlPanel.getHeight()));
		    	owlPanel.setMinimumSize(new Dimension(480, owlPanel.getHeight()));
		    	((JFrame) evt.getComponent()).pack();
		    }
		}); 
		 
		model = new ToolModel(this);
		setLayout(new MigLayout("insets 0"));  
		
		// colors
		mainColor = new Color(52, 73, 85);
		accentColor = new Color(249, 170, 51);
		
		// load Fonts
		InputStream blackStream = this.getClass().getResourceAsStream("/Roboto-Black.ttf");
		InputStream regularStream = this.getClass().getResourceAsStream("/Roboto-Regular.ttf");
		InputStream boldStream = this.getClass().getResourceAsStream("/Roboto-Bold.ttf");
		blackFont = Font.createFont(Font.TRUETYPE_FONT, blackStream).deriveFont(20f);
		boldFont = Font.createFont(Font.TRUETYPE_FONT, boldStream).deriveFont(14f);
		regularFont = Font.createFont(Font.TRUETYPE_FONT, regularStream).deriveFont(14f);

		// header containing the menu bar
		JPanel header = new JPanel(new MigLayout("insets 0"));
		header.setBackground(mainColor);
		header.setPreferredSize(new Dimension(500, 50));

		// uml button
		uml = new JButton("UML > OWL");
		configureJButton(uml);
		header.add(uml, "height 50!, width 140!");
		
		// owl button
		owl = new JButton("OWL > UML");
		configureJButton(owl);
		owl.setForeground(Color.WHITE);
	    owl.setOpaque(false);
	    header.add(owl, "height 50!, width 140!");
		
	    /* ##### populating the uml panel ########## */
		umlPanel = new JPanel(new MigLayout("insets 0"));
		// creating boxes to put the components in
		JPanel umlStep1 = new JPanel(new MigLayout("insets 15"));
		JPanel umlStep2 = new JPanel(new MigLayout("insets 15"));
		JPanel umlStep3 = new JPanel(new MigLayout("insets 15"));
		JPanel umlTransformation = new JPanel(new MigLayout("insets 0"));
		JPanel umlTransLog = new JPanel(new MigLayout("insets 0"));
		JLabel umlStep1Label = new JLabel("Step (1/3)");
		umlStep1Label.setFont(regularFont.deriveFont(11f));
		JLabel umlStep2Label = new JLabel("Step (2/3)");
		umlStep2Label.setFont(regularFont.deriveFont(11f));
		JLabel umlStep3Label = new JLabel("Step (3/3)");
		umlStep3Label.setFont(regularFont.deriveFont(11f));
		umlStep1Label.setForeground(Color.GRAY);
		umlStep2Label.setForeground(Color.GRAY);
		umlStep3Label.setForeground(Color.GRAY);
		JLabel umlStep1Title = new JLabel("Select an UML file to transform");  
		JLabel umlStep1Expl = new JLabel("<html>" + "Please select an UML model serialized conform to the Eclipse UML metamodel" + "</html>");
		JLabel umlStep3Expl = new JLabel("<html>" + "The tool generates an .xmi file conform to the OWL2 Ecore metamodel and an .owl file in the configured OWL serialization." + "<html>");
		JLabel umlStep2Title = new JLabel("Configure the transformation");
		JLabel prefix = new JLabel("Prefix (String)");
		prefix.setFont(regularFont.deriveFont(11f));
		umlPrefixText = new JTextField("http://transformed/uml#");
		umlPrefixText.setFont(regularFont.deriveFont(11f));
		JLabel umlStep3Title = new JLabel("Select an output directory");
		umlStep3Title.setFont(boldFont);
		umlStep2Title.setFont(boldFont);
		umlStep1Expl.setFont(regularFont.deriveFont(12f));
		umlStep3Expl.setFont(regularFont.deriveFont(12f));
		umlStep1Title.setFont(boldFont);
		outputUML = new File("").getAbsolutePath();
		umlDirectoryPath = new JTextField(new File("").getAbsolutePath());
		umlDirectoryPath.setForeground(Color.lightGray);
		umlFilePath = new JTextField("No file selected");
		umlFilePath.setForeground(Color.LIGHT_GRAY);
		umlSelectFile = new JButton("Select UML File");
		umlSelectDirectory = new JButton("Select output directory");
		umlFilePath.setEditable(false);
		umlFilePath.setFont(regularFont);
		umlDirectoryPath.setEditable(false);
		umlDirectoryPath.setFont(regularFont);
		configureJButton(umlSelectFile);
		umlSelectFile.setFont(regularFont);
		umlSelectFile.setMargin(new Insets(5, 5, 5, 5));
		umlSelectFile.setBackground(new Color(52, 73, 85));
		umlSelectFile.setForeground(Color.WHITE);
		// copied
		configureJButton(umlSelectDirectory);
		umlSelectDirectory.setFont(regularFont);
		umlSelectDirectory.setMargin(new Insets(5, 5, 5, 5));
		umlSelectDirectory.setBackground(new Color(52, 73, 85));
		umlSelectDirectory.setForeground(Color.WHITE);
		umlStep1.add(umlStep1Label, "span");
		umlStep1.add(umlStep1Title, "span");
		umlStep1.add(umlStep1Expl, "span");
		umlStep1.add(umlFilePath, "width 280!, height 30!");
		umlStep1.add(umlSelectFile, "wrap, width 160!, height 30!");
		umlStep2.add(umlStep2Label, "wrap");
		umlStep2.add(umlStep2Title, "wrap");
		// settings
		JLabel umlUseXSD = new JLabel("Map XSD Datatypes");
		umlUseXSD.setFont(regularFont.deriveFont(11f));
		umlUseXSDCheckbox = new JCheckBox();
		JLabel umlUseCIM = new JLabel("Map CIM Datatypes");
		umlUseCIM.setFont(regularFont.deriveFont(11f));
		umlUseCIMCheckbox = new JCheckBox();
		JLabel umlUseRDF = new JLabel("Use RDF Literal");
		umlUseRDF.setFont(regularFont.deriveFont(11f));
		umlUseRDFCheckbox = new JCheckBox();
		JLabel owlFormat = new JLabel("Ouput OWL format");
		owlFormat.setFont(regularFont.deriveFont(11f));
		String[] formats = new String[] {"RDF/XML", "OWL/XML",
                "Turtle"};
		owlFormats = new JComboBox<>(formats);
		owlFormats.setFont(regularFont.deriveFont(11f));
		umlStep2.add(prefix, "split 2, width 125!, height 20!");
		umlStep2.add(umlPrefixText, "width 200!, height 20!, wrap");
		umlStep2.add(umlUseXSD, "split 2, width 125!, height 20!");
		umlStep2.add(umlUseXSDCheckbox, "wrap, height 20!");
		umlStep2.add(umlUseCIM, "split 2, width 125!, height 20!");
		umlStep2.add(umlUseCIMCheckbox, "wrap, height 20!");
		umlStep2.add(umlUseRDF, "split 2, width 125!, height 20!");
		umlStep2.add(umlUseRDFCheckbox, "wrap, height 20!");
		umlStep2.add(owlFormat, "split 2, width 125!, height 20!");
		umlStep2.add(owlFormats, "wrap, width 200!, height 20!");
		umlStep1.setBackground(Color.WHITE);
		umlStep1.setPreferredSize(new Dimension(480, 100));
		umlStep2.setBackground(Color.WHITE);
		umlStep2.setPreferredSize(new Dimension(480, 90));
		umlStep3.add(umlStep3Label, "span");
		umlStep3.add(umlStep3Title, "span");
		umlStep3.add(umlStep3Expl, "span");
		umlStep3.add(umlDirectoryPath, "width 280!, height 30!");
		umlStep3.add(umlSelectDirectory, "width 160!, height 30!");
		umlStep3.setBackground(Color.WHITE);
		umlStep3.setPreferredSize(new Dimension(480, 110));
		umlStart = new JButton("Start transformation");
		configureJButton(umlStart);
		umlStart.setFont(boldFont);
		umlStart.setMargin(new Insets(5, 5, 5, 5));
		umlLog = new JTextPane();
		umlLog.setFont(regularFont.deriveFont(12f));
		umlLog.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JScrollPane scrollPane = new JScrollPane(umlLog); 
		scrollPane.setBorder(null);
		umlLog.setEditable(false);
		umlLog.setFont(regularFont.deriveFont(11f));
		umlPanel.setMinimumSize(new Dimension(480, 450));
		umlPanel.add(umlStep1, "wrap");
		umlPanel.add(umlStep2, "wrap, gapy 5");
		umlPanel.add(umlStep3, "wrap, gapy 5");
		umlTransformation.setPreferredSize(new Dimension(150, 50));
		umlTransformation.setBackground(Color.WHITE);
		umlTransLog.setPreferredSize(new Dimension(320, 50));
		umlTransLog.setBackground(Color.WHITE);
		umlTransformation.add(umlStart, "height 50!, width 150!");
		umlTransLog.add(scrollPane, "width 320!, height 50!");
		umlPanel.add(umlTransformation, "split 2, gapy 5");
		umlPanel.add(umlTransLog, "gapy 5, gapx 10");
		
		/* ########### owl panel ########### */
		owlPanel = new JPanel(new MigLayout("insets 0"));
		owlPanel.setMinimumSize(new Dimension(480, 450));
		
		// creating boxes to put the components in
		JPanel owlStep1 = new JPanel(new MigLayout("insets 15"));
		JPanel owlStep2 = new JPanel(new MigLayout("insets 15"));
		JPanel owlStep3 = new JPanel(new MigLayout("insets 15"));
		JPanel owlTransformation = new JPanel(new MigLayout("insets 0"));
		JPanel owlTransLog = new JPanel(new MigLayout("insets 0"));
		owlStep1.setBackground(Color.WHITE);
		owlStep2.setBackground(Color.WHITE);
		owlStep3.setBackground(Color.WHITE);
		owlTransformation.setBackground(Color.WHITE);
		owlTransLog.setBackground(Color.WHITE);
		JLabel owlStep1Label = new JLabel("Step (1/3)");
		owlStep1Label.setFont(regularFont.deriveFont(11f));
		JLabel owlStep2Label = new JLabel("Step (2/3)");
		owlStep2Label.setFont(regularFont.deriveFont(11f));
		JLabel owlStep3Label = new JLabel("Step (3/3)");
		owlStep3Label.setFont(regularFont.deriveFont(11f));
		owlStep1Label.setForeground(Color.GRAY);
		owlStep2Label.setForeground(Color.GRAY);
		owlStep3Label.setForeground(Color.GRAY);
		JLabel owlStep1Title = new JLabel("Select an OWL file to transform");
		JLabel owlStep2Title = new JLabel("Configure the transformation");
		JLabel owlStep3Title = new JLabel("Select an output directory");
		owlStep1Title.setFont(boldFont);
		owlStep2Title.setFont(boldFont);
		owlStep3Title.setFont(boldFont);
		JLabel owlStep1Expl = new JLabel("<html>" + "Please select an OWL file in an OWL API supported serialization (e.g. RDF/XML, OWL/XML, Turtle)" + "</html>");
		JLabel owlStep3Expl = new JLabel("<html>" + "The tool generates an .uml file conform to the Eclipse UML2 metamodel" + "<html>");
		owlStep1Expl.setFont(regularFont.deriveFont(12f));
		owlStep3Expl.setFont(regularFont.deriveFont(12f));
		
		owlFilePath = new JTextField("No file selected");
		owlFilePath.setForeground(Color.lightGray);
		owlFilePath.setEditable(false);
		owlFilePath.setFont(regularFont);
		
		outputOWL = new File("").getAbsolutePath();
		owlDirectoryPath = new JTextField(new File("").getAbsolutePath());
		owlDirectoryPath.setForeground(Color.lightGray);
		owlDirectoryPath.setEditable(false);
		owlDirectoryPath.setFont(regularFont);
		
		owlSelectFile = new JButton("Select OWL file");
		configureJButton(owlSelectFile);
		owlSelectFile.setFont(regularFont);
		owlSelectFile.setMargin(new Insets(5, 5, 5, 5));
		owlSelectFile.setBackground(new Color(52, 73, 85));
		owlSelectFile.setForeground(Color.WHITE);
		
		owlSelectDirectory = new JButton("Select output directory");
		configureJButton(owlSelectDirectory);
		owlSelectDirectory.setFont(regularFont);
		owlSelectDirectory.setMargin(new Insets(5, 5, 5, 5));
		owlSelectDirectory.setBackground(new Color(52, 73, 85));
		owlSelectDirectory.setForeground(Color.WHITE);
		
		owlStep1.add(owlStep1Label, "span");
		owlStep1.add(owlStep1Title, "span");
		owlStep1.add(owlStep1Expl, "span");
		owlStep1.add(owlFilePath, "width 280!, height 30!");
		owlStep1.add(owlSelectFile, "wrap, width 160!, height 30!");
		
		JLabel owlPrefix = new JLabel("Remove prefix");
		owlPrefix.setFont(regularFont.deriveFont(11f));
		owlPrefixText = new JTextField(".");
		owlPrefixText.setFont(regularFont.deriveFont(11f));
		JLabel owlUseXSD = new JLabel("Map XSD Datatypes");
		owlUseXSD.setFont(regularFont.deriveFont(11f));
		owlUseXSDCheckbox = new JCheckBox();
		JLabel owlUseCIM = new JLabel("Map CIM Datatypes");
		owlUseCIM.setFont(regularFont.deriveFont(11f));
		owlUseCIMCheckbox = new JCheckBox();
		JLabel owlUseRDF = new JLabel("Use RDF literal");
		owlUseRDF.setFont(regularFont.deriveFont(11f));
		owlUseRDFCheckbox = new JCheckBox();
		JLabel owlUseThing = new JLabel("Use OWL thing");
		owlUseThing.setFont(regularFont.deriveFont(11f));
		owlUseThingCheckbox = new JCheckBox();
		
		owlStep2.add(owlStep2Label, "span");
		owlStep2.add(owlStep2Title, "span");
		owlStep2.add(owlPrefix, "split 2, width 125!, height 20!");
		owlStep2.add(owlPrefixText, "width 200!, wrap, height 20!");
		owlStep2.add(owlUseXSD, "split 2, width 125!, height 20!");
		owlStep2.add(owlUseXSDCheckbox, "wrap, height 20!");
		owlStep2.add(owlUseCIM, "split 2, width 125!, height 20!");
		owlStep2.add(owlUseCIMCheckbox, "wrap, height 20!");
		owlStep2.add(owlUseRDF, "split 2, width 125!, height 20!");
		owlStep2.add(owlUseRDFCheckbox, "wrap, height 20!");
		owlStep2.add(owlUseThing, "split 2, width 125!, height 20!");
		owlStep2.add(owlUseThingCheckbox, "wrap, height 20!");
		owlStep3.add(owlStep3Label, "span");
		owlStep3.add(owlStep3Title, "span");
		owlStep3.add(owlStep3Expl, "span");
		owlStep3.add(owlDirectoryPath, "width 280!, height 30!");
		owlStep3.add(owlSelectDirectory, "wrap, width 160!, height 30!");
		
		owlStart = new JButton("Start transformation");
		configureJButton(owlStart);
		owlStart.setFont(boldFont);
		owlStart.setMargin(new Insets(5, 5, 5, 5));
		
		owlTransformation.add(owlStart, "height 50!, width 150!");
		
		owlLog = new JTextPane();
		owlLog.setFont(regularFont.deriveFont(11f));
		owlLog.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JScrollPane owlScrollPane = new JScrollPane(owlLog); 
		owlScrollPane.setBorder(null);
		owlLog.setEditable(false);
		
		owlStep1.setPreferredSize(new Dimension(480, 100));
		owlStep2.setPreferredSize(new Dimension(480, 90));
		owlStep3.setPreferredSize(new Dimension(480, 120));
		owlTransformation.setPreferredSize(new Dimension(150, 50));
		owlTransLog.setPreferredSize(new Dimension(320, 50));
		
		owlTransLog.add(owlScrollPane, "width 320!, height 50!");
		
		owlPanel.add(owlStep1, "wrap");
		owlPanel.add(owlStep2, "wrap, gapy 5");
		owlPanel.add(owlStep3, "wrap, gapy 5");
		owlPanel.add(owlTransformation, "split 2, gapy 5");
		owlPanel.add(owlTransLog, "gapy 5, gapx 10");
		
		// footer
		footer = new JPanel(new MigLayout("insets 0"));
		footer.setBackground(new Color(52, 73, 85));
		footer.setPreferredSize(new Dimension(500, 25));
		JLabel copyright = new JLabel("©2019 UMLOWLTool");
		copyright.setFont(regularFont.deriveFont(11f));
		copyright.setForeground(Color.WHITE);
		footer.add(copyright, "gapx 15, gapy 5");
		
		// add panels to main frame
		add(header, "wrap");
		add(umlPanel, "gapy 5, wrap, center");
		add(footer, "gapy 5");
		
		// center and show the view
		setResizable(false);
		setSize(500, 1000);
		setVisible(true);  
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == umlSelectFile) {
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				umlFilePath.setText(chooser.getSelectedFile().getName());
				umlFilePath.setForeground(Color.DARK_GRAY);
				inputUML = chooser.getSelectedFile();
			}
		} else if (e.getSource() == owl) {
			remove(footer);
			remove(umlPanel);
			add(owlPanel, "gapy 5, wrap, center");
			add(footer, "gapy 5");
			revalidate();
			repaint();
			// call resize event
			setSize(500, 1000);
			owl.setOpaque(true);
			owl.setForeground(Color.BLACK);
			uml.setOpaque(false);
			uml.setForeground(Color.WHITE);
		} else if (e.getSource() == uml) {
			remove(footer);
			remove(owlPanel);
			add(umlPanel, "gapy 5, wrap, center");
			add(footer, "gapy 5");
			revalidate();
			repaint();
			// call resize event
			setSize(500, 1000);
			uml.setOpaque(true);
			uml.setForeground(Color.BLACK);
			owl.setOpaque(false);
			owl.setForeground(Color.WHITE);
		} else if (e.getSource() == umlSelectDirectory) {
			JFileChooser chooser = new JFileChooser(); 
		    chooser.setCurrentDirectory(new java.io.File("."));
		    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    chooser.setAcceptAllFileFilterUsed(false);
		    int returnVal = chooser.showOpenDialog(this);
		    if (returnVal == JFileChooser.APPROVE_OPTION) {
		    	outputUML = chooser.getSelectedFile().toString();
		    	umlDirectoryPath.setText(chooser.getSelectedFile().toString());
		    	umlDirectoryPath.setForeground(Color.DARK_GRAY);
		    }
		} else if (e.getSource() == umlStart) {
			model.startUMLTransformation();
		} else if (e.getSource() == owlSelectFile) {
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				owlFilePath.setText(chooser.getSelectedFile().getName());
				owlFilePath.setForeground(Color.DARK_GRAY);
				inputOWL = chooser.getSelectedFile();
			}
		} else if (e.getSource() == owlSelectDirectory) {
			JFileChooser chooser = new JFileChooser(); 
		    chooser.setCurrentDirectory(new java.io.File("."));
		    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    chooser.setAcceptAllFileFilterUsed(false);
		    int returnVal = chooser.showOpenDialog(this);
		    if (returnVal == JFileChooser.APPROVE_OPTION) {
		    	outputOWL = chooser.getSelectedFile().toString();
		    	owlDirectoryPath.setText(chooser.getSelectedFile().toString());
		    	owlDirectoryPath.setForeground(Color.DARK_GRAY);
		    }
		} else if (e.getSource() == owlStart) {
			model.startOWLTransformation();
		}
	}
	
	public void addLogUML(String log) {
		Date date = new Date();
		umlLog.setText(sdf.format(date) + ": " + log + "\n" + umlLog.getText());
		umlLog.setCaretPosition(0);
	}
	
	public void addLogOWL(String log) {
		Date date = new Date();
		owlLog.setText(sdf.format(date) + ": " + log + "\n" + owlLog.getText());
		owlLog.setCaretPosition(0);
	}
	
	// functions for styling GUI elements
	public void configureJButton(JButton button) {
		button.addActionListener(this);
		button.setForeground(Color.BLACK);
		button.setFont(blackFont);
		button.setFocusPainted(false);
	    button.setMargin(new Insets(0, 0, 0, 0));
	    button.setContentAreaFilled(false);
	    button.setBorderPainted(false);
	    button.setOpaque(true);
	    button.setBackground(accentColor);
	}
	
	// starting point of the tool
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	        	try {
	    			new ToolView();
	    		} catch (FontFormatException e) {
	    			e.printStackTrace();
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	        }
	    });
	}
}
