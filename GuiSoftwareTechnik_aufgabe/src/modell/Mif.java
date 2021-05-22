package modell;

public interface Mif extends ObservableIF {
	
	public Kunde neuKunde (String name, String address);
	
	public Konto giroKontoErstellen(Kunde kunde);
	public Konto depotKontoErstellen(Kunde kunde , GiroKonto giro);
	
}
