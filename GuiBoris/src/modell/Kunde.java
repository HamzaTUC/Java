package modell;

import java.util.Vector;

public class Kunde {
	
	private String name;
	private String address;
	private Vector<Konto> kontos;
	
	public Kunde(String name, String address) {
		this.kontos = new Vector<>();
		this.name = name;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Vector<Konto> getKontos(){
		return this.kontos;
	}
}
