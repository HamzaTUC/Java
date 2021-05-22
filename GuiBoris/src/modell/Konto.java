package modell;

import view.Konto;

public class Konto {
	
	private Kunde kunde;
	private int saldo;
	
	public Konto(Kunde kunde) {
		this.kunde = kunde;
		this.saldo = 100;
		kunde.getKontos().add(this);
	}
	
	public int getSaldo() {
		return  saldo;
	}
	public Kunde getKunde () {
		return kunde;
	}

}
