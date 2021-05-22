package modell;

import java.util.Vector;

public class DepotKonto extends Konto{

	private Vector<Aktien> posten;
	private GiroKonto giro;
	
	public DepotKonto(Kunde kunde, GiroKonto giro) {
		super(kunde);
		this.posten = new Vector<>();
		this.giro.getDepotKonto().add(this);
	}
	
	public Vector<Aktien> getAktien(){
		return this.posten;
	}
	
	public void setGiroKonto(GiroKonto giro) {
		this.giro = giro;
	}
	public GiroKonto getGiro() {
		return this.giro;
	}
}
