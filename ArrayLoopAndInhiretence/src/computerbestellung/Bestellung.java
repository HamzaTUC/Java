package computerbestellung;

public class Bestellung {

	public static void main(String[] args) {
computer pc1= new computer ("64", "NV", 500, 295.50f);
computer pc2= new computer ("32", "V", 250, 195);

pc1.datenblatt();
pc2.datenblatt();

pc1.preis= 350;

pc1.datenblatt();
	}

}
