package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewAccountUI extends JFrame{


	private static final long serialVersionUID = 1L;
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private JPanel namePanel;
	private JLabel nameLabel;
	private JTextField nameField;
	
	private JPanel addressPanel;
	private JLabel addressLabel;
	private JTextField addressField;
	
	private JPanel kontoTypPanel;
	private JLabel kontoLabel;
	private JRadioButton giroButton;
	private JRadioButton depotButton;
	
	private JButton confirmButton;
	private JButton abbrechenButton;
	private JPanel buttonPanel;
	
	private ButtonGroup kontoRadio;
	
	private ActionListener actionListener;
	
	public NewAccountUI(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	
	
	public NewAccountUI() {
		this.composeUI();
	}
	
	private void composeUI() {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		e.printStackTrace();
	}
	this.titleLabel = new JLabel("New Account");
	this.titlePanel = new JPanel();
	this.titlePanel.add(this.titleLabel);
	
	this.nameLabel = new JLabel("Name");
	this.nameField = new JTextField(10);
	this.namePanel = new JPanel();
	this.namePanel.add(nameLabel);
	this.namePanel.add(nameField);
	

	this.addressLabel = new JLabel("Address");
	this.addressField = new JTextField(10);
	this.addressPanel = new JPanel();
	this.addressPanel.add(addressLabel);
	this.addressPanel.add(addressField);
	
	this.kontoLabel = new JLabel("KontoTyp");
	this.giroButton = new JRadioButton();
	this.giroButton.setText("GiroKonto");
	
	this.depotButton = new JRadioButton();
	this.depotButton.setText("DepotKonto");
	
	this.kontoRadio = new ButtonGroup();
	this.kontoRadio.add(depotButton);
	this.kontoRadio.add(giroButton);
	
	this.kontoTypPanel = new JPanel();
	this.kontoTypPanel.add(kontoLabel);
	this.kontoTypPanel.add(giroButton);
	this.kontoTypPanel.add(depotButton);
	
	this.buttonPanel = new JPanel();
	this.buttonPanel.setLayout(new BorderLayout());
	this.confirmButton = new JButton("Weiter");
	this.abbrechenButton = new JButton("abbrechen");
	this.confirmButton.addActionListener(this.actionListener);
	this.abbrechenButton.addActionListener(this.actionListener);
	this.buttonPanel.add(this.abbrechenButton, BorderLayout.WEST);
	this.buttonPanel.add(this.confirmButton, BorderLayout.EAST);
	
	this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	this.getContentPane().add(this.titlePanel);
	this.getContentPane().add(this.namePanel);
	this.getContentPane().add(this.addressPanel);
	this.getContentPane().add(this.kontoTypPanel);
	this.getContentPane().add(this.buttonPanel);
	this.pack();
	}
	
	public JButton getAbbrechenButton() {
		return this.abbrechenButton;
	}
	
	/*public boolean getGiroKonto() {
		return this.giroButton;
	}*/

	public JButton getConfirmButton() {
		return this.confirmButton;
	}
	
	public String getName() {
		return this.nameField.getText();
	}
	
	public String getAddress() {
		return this.addressField.getText();
	}
	public static void main(String[] args) {
		NewAccountUI gui = new NewAccountUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
	}
}
