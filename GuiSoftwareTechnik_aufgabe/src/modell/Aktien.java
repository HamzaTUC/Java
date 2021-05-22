package modell;

public class Aktien {

	private int wertPapierNr;
	private int tageskurs;
	private DepotKonto depotKonto ;
	
	public void setWertPapierNr(int wert, DepotKonto depotKonto) {
		this.wertPapierNr = wert;
		this.depotKonto = depotKonto;
		this.depotKonto.getAktien().add(this);
	}
	
	public int getWertPapierNr() {
		return wertPapierNr;
	}
	
	public void setTagesKurs(int tageskurs) {
		this.tageskurs = tageskurs;
	}
	
	public int getTageskurs() {
		return tageskurs; 
	}
}
