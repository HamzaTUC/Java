package view;

import modell.Konto;

public interface ViF extends ObserverIF{
	
	public void showHomePage();
	
	public void showNewAccountUI();
	
	public void showAccountUI();
}
