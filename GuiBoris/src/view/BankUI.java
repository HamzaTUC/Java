package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.CiF;
import modell.DepotKonto;
import modell.GiroKonto;
import modell.Konto;
import modell.Kunde;
import modell.Mif;

public class BankUI implements ViF , ActionListener{

	private CiF controller;
	private Mif model;
	
	private HomeUI home;
	private NewAccountUI newAccount;
	private AccountUI account;
	
	private Kunde kunde;
	
	public BankUI(CiF controller, Mif model) {
		if (model != null) {
			this.model = model;
			this.model.addObserver(this);
		} else {
			System.err.println("Tried to add a ModelIf to a ViewImpl that was null");
		}
		
		if (controller != null) {
			this.controller = controller;
		} else {
			System.err.println("Tried to add a ControllerIf to a ViewImpl that was null");
		}
		
		this.home = new HomeUI(this);
		this.newAccount = new NewAccountUI(this);
		this.account = new AccountUI(this);
	}


	
	
	
	
	
	@Override
	public void update() {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.home.getLoginButton()) {				
			this.controller.loginClicked();}
		else if(e.getSource() == this.home.getNewAccountButton()){
			this.controller.newAccountClicked();
		}
		else if(e.getSource() == this.newAccount.getConfirmButton()) {
			this.controller.confirmClicked();
		}
		else if(e.getSource() == this.newAccount.getAbbrechenButton()) {
			this.controller.abbrechenClicked();
		}
		else if(e.getSource() == this.account.getExitButton()) {
			this.controller.exitButtonClicked();
		}
		
	}

	@Override
	public void showHomePage() {
		this.home.setVisible(true);
		
	}

	@Override
	public void showNewAccountUI() {
		if(this.newAccount.getName() == null && this.newAccount.getAddress() == null) {
			this.newAccount.getConfirmButton().setEnabled(false);
		}

		this.newAccount.setVisible(true);
		
	}

	@Override
	public void showAccountUI() {
		
		
		Kunde kunde = this.model.neuKunde(this.newAccount.getName(), this.newAccount.getAddress());
		Konto konto = this.model.giroKontoErstellen(kunde);
		
		
		String saldo = konto.getSaldo() +"€";
		this.account.setSaldo(saldo);
		
		if(konto instanceof GiroKonto) {
			this.account.setIban(((GiroKonto) konto).getIban());
		}
		else if(konto instanceof DepotKonto){
			this.account.setIban(((DepotKonto) konto).getGiro().getIban());
		}
		
		this.account.setVisible(true);
		String st= konto.getKunde().getAddress();
		
	}

}
