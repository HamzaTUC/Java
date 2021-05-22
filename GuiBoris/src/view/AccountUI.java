package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import modell.GiroKonto;
import modell.Konto;
import modell.Kunde;

public class AccountUI extends JFrame{


	private static final long serialVersionUID = 1L;

	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private JLabel saldoLabel;
	private JLabel saldoWert;
	private JPanel saldoPanel;
	
	private JLabel ibanLabel;
	private JLabel ibanWert;
	private JPanel ibanPanel;
	
	private JTabbedPane verwaltung;
	private JPanel postePanel;
	private JPanel verwaltungPanel;
	private JLabel postenLabel;
	
	private JButton exitButton;
	private JPanel buttonPanel;
	
	private String saldo;
	
	private String iban;
	
private ActionListener actionListener;
	
	public AccountUI(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	
	
	public AccountUI() {
		this.composeUI();
	}
	
	private void composeUI() {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		e.printStackTrace();
	}
	
	this.titleLabel = new JLabel("KontosAussicht");
	this.titlePanel = new JPanel();
	this.titlePanel.add(this.titleLabel);
	
	Kunde Boris= new Kunde("Boris", "Afrika");
	Konto BorisKonto= new Konto(Boris);
	GiroKonto BorisGiroKonto= new GiroKonto(Boris);
	
	this.saldoLabel = new JLabel("Saldo");
	this.saldoWert = new JLabel(Integer.toString(BorisKonto.getSaldo()));
	
	
	
	this.saldoPanel = new JPanel();
	this.saldoPanel.setLayout(new BorderLayout());
	this.saldoPanel.add(this.saldoLabel , BorderLayout.WEST); 
	this.saldoPanel.add(this.saldoWert , BorderLayout.EAST);
	
	
	this.ibanLabel = new JLabel("IBAN");
	this.ibanWert = new JLabel(BorisGiroKonto.getIban());
	
	
	
	this.ibanPanel = new JPanel();
	this.ibanPanel.setLayout(new BorderLayout());
	this.ibanPanel.add(this.ibanLabel , BorderLayout.WEST); 
	this.ibanPanel.add(this.ibanWert , BorderLayout.EAST);
	
	this.verwaltung = new JTabbedPane();
	this.postePanel = new JPanel();
	this.postenLabel = new JLabel("Hier werden Posten angezeigen!!");
	this.postePanel.add(postenLabel);
	this.verwaltungPanel = new JPanel();
	
	this.verwaltung.addTab("Posten", postePanel);
	this.verwaltung.addTab("Verwaltung", verwaltungPanel);
	
	this.exitButton = new JButton("Beenden");
	this.exitButton.addActionListener(this.actionListener);
	this.buttonPanel = new JPanel();
	this.buttonPanel.setLayout(new BorderLayout());
	this.buttonPanel.add(this.exitButton, BorderLayout.EAST);
	
	this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	this.getContentPane().add(this.titlePanel);
	this.getContentPane().add(this.saldoPanel);
	this.getContentPane().add(this.ibanPanel);
	this.getContentPane().add(this.verwaltung);
	this.getContentPane().add(this.buttonPanel);
	this.pack();
   }
	
	public JButton getExitButton() {
		return this.exitButton;
	}
	
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}

	public static void main(String[] args) {
		AccountUI gui = new AccountUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		}
}
