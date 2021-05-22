package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class HomeUI extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel titlePanel;
	private JLabel titleLabel;
	
	private JButton newAccountButton;
	private JButton loginButton;
	private JPanel buttonPanel;
	
	private ActionListener actionListener;
	
	public HomeUI(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	
	
	public HomeUI() {
		this.composeUI();
	}
	
	private void composeUI() {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		e.printStackTrace();
	}
	
	this.titleLabel = new JLabel("  BANK    ");
	this.titlePanel = new JPanel();
	this.titlePanel.add(this.titleLabel);
	
	this.buttonPanel = new JPanel();
	this.buttonPanel.setLayout(new BorderLayout());
	this.loginButton = new JButton("Login");
	this.newAccountButton = new JButton("new Account");
	this.loginButton.addActionListener(this.actionListener);
	this.newAccountButton.addActionListener(this.actionListener);
	this.buttonPanel.add(this.loginButton, BorderLayout.WEST);
	this.buttonPanel.add(this.newAccountButton, BorderLayout.EAST);
	
	this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	this.getContentPane().add(this.titlePanel);
	this.getContentPane().add(this.buttonPanel);
	this.pack();
	}
	
	public static void main(String[] args) {
		HomeUI gui = new HomeUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
	}
	
	public JButton getLoginButton() {
		return loginButton;
	}


	public JButton getNewAccountButton() {
		return newAccountButton;
	}
}
