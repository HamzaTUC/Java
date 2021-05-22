package control;

import javax.swing.JOptionPane;

import modell.BankModell;
import modell.Mif;
import view.BankUI;
import view.ViF;

public class BankController implements CiF{

	private Mif model;
	private ViF view;
	
	public BankController() {
	
		this.model = new BankModell();
		
		this.model.addObserver(this);
		
		this.view = new BankUI(this, this.model);
		this.view.showHomePage();
		
		
		this.model.notifyObserver();
	}
	
	@Override
	public void update() {
		System.out.println("Update Controller");
		
	}

	@Override
	public void loginClicked() {
		JOptionPane.showMessageDialog(null,"Login wurde noch nicht implementiert" ,"Login" , JOptionPane.PLAIN_MESSAGE);
		
	}

	@Override
	public void newAccountClicked() {
		this.view.showNewAccountUI();
	}

	@Override
	public void abbrechenClicked() {
		
		
	}

	@Override
	public void confirmClicked() {
		
		this.view.showAccountUI();
	}

	@Override
	public void exitButtonClicked() {
		System.exit(0);
	}

	public static void main(String[] args) {
		
		new BankController();

}
	
}



