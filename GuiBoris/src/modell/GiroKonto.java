package modell;

import java.util.Random;
import java.util.Vector;

public class GiroKonto extends Konto{
	
	private String iban="DE1234565677";
	private Vector<DepotKonto> depotkontos;
	
	
	public GiroKonto(Kunde kunde) {
		super(kunde);
	}
	
	public void setIban() {
		Random wurfel = new Random();
		this.iban = "DE"+ wurfel.nextInt();
	}
	
	public String getIban() {
		return iban;
	}
	
	public Vector<DepotKonto> getDepotKonto(){
		return this.depotkontos;
	}
}
