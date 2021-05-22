package modell;

import java.util.Vector;

import view.ObserverIF;

public class BankModell implements Mif{

	private Kunde kunde;
	private Konto konto;
	private Vector<Konto> kontos; 
	private Vector<ObserverIF> observer;
	
	public BankModell() {
		this.observer = new Vector<>();
		this.kontos = new Vector<>();
	}
	
	@Override
	public void addObserver(ObserverIF observer) {
		if (observer != null) {
			this.observer.add(observer);
		} else {
			System.err.println("Tried to add an observer that was null");
		}
		
	}

	@Override
	public void removeObserver(ObserverIF observer) {
		if (observer != null) {
			this.observer.remove(observer);
		} else {
			System.err.println("Tried to remove an observer that was null");
		}

	}

	@Override
	public void notifyObserver() {
		for (ObserverIF obs : this.observer) {
			obs.update();
		}
	}

	@Override
	public Kunde neuKunde(String name, String address) {
		this.kunde = new Kunde(name , address);
		return this.kunde;
	}


	@Override
	public Konto giroKontoErstellen(Kunde kunde) {
		this.konto = new GiroKonto(kunde);
		kontos.add(this.konto);
		return this.konto;
	}

	@Override
	public Konto depotKontoErstellen(Kunde kunde, GiroKonto giro) {
		this.giroKontoErstellen(kunde);
		this.konto = new DepotKonto(kunde , giro);
		this.kontos.add(this.konto);
		return this.konto;
	}

}
