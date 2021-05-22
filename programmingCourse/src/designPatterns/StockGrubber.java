package designPatterns;

import java.util.ArrayList;

public class StockGrubber implements Subject{
private ArrayList<Observer> observers;
private double ibmPreis;
private double applePreis;
private double googlePreis;
StockGrubber(){
	observers= new ArrayList<Observer>();
}

	@Override
	public void register(Observer newObserver) {
	observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
	int observerIndex= observers.indexOf(deleteObserver);
	System.out.println("The Observer "+ observerIndex+ " is deleted.");
	observers.remove(observerIndex);
	}
	@Override
	public void notifyObserver() {
	for (Observer observer :observers ) {
		observer.update(ibmPreis, applePreis, googlePreis);
	}
	}
public void setIBMPreis (double newIBMPreis) {
	this.ibmPreis=newIBMPreis;
notifyObserver();
}
public void setApplePreis (double newApplePreis) {
	this.applePreis=newApplePreis;
notifyObserver();
}
public void setGooglePreis (double newGooglereis) {
	this.googlePreis=newGooglereis;
notifyObserver();
}

}
