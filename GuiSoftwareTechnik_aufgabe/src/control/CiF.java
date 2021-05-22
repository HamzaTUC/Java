package control;

import view.ObserverIF;

public interface CiF extends ObserverIF{
	
	public void loginClicked();
	
	public void newAccountClicked();
	
	public void abbrechenClicked();
	
	public void confirmClicked();
	
	public void exitButtonClicked();
}
