package GUIKlassen_trial;

import javax.swing.JFrame;

public class Costumer {
 public String nachName;
 public String vorName;
 public String addresse;
 public String iban;
 public String password;
 public String saldo;
 public String userName;
 
 Costumer(String nachName,String vorName,String addresse,String iban,String saldo,String userName, String password ){
	 
	 this.vorName=vorName;
	 this.nachName=nachName;
	 this.addresse=addresse;
	 this.iban=iban;
	 this.saldo=saldo;
	 this.password=password;
	 this.userName=userName;
 }
		
	public static void main(String[] args) {
		GuiMain guimain = new GuiMain();
		
		
		
		
		
Costumer Costumer1 = new Costumer("Ayman", "Amyan","Leibniz1", "DE1","100eu","Aymani","111");  
Costumer Costumer2 = new Costumer("hamza", "gh","Leibnizstr2", "DE2","200eu","hamzah","222");
Costumer Costumer3 = new Costumer("golam", "nabi","Leibniz3", "DE3","300eu","golami","333");
Costumer Costumer4 = new Costumer("boris", "afrika","Leibniz4", "DE4","400eu","borisi","444");
System.out.println(Costumer1.vorName+" " +Costumer1.nachName+" "+Costumer1.addresse+" "+Costumer1.iban+" "+Costumer1.userName+" "+Costumer1.password);
System.out.println(Costumer2.vorName+" " +Costumer2.nachName+" "+Costumer2.addresse+" "+Costumer2.iban+" "+Costumer2.userName+" "+Costumer2.password);
System.out.println(Costumer3.vorName+" " +Costumer3.nachName+" "+Costumer3.addresse+" "+Costumer3.iban+" "+Costumer3.userName+" "+Costumer3.password);
System.out.println(Costumer4.vorName+" " +Costumer4.nachName+" "+Costumer4.addresse+" "+Costumer4.iban+" "+Costumer4.userName+" "+Costumer4.password);

if (Costumer1.userName=="Ayani" && Costumer1.password=="111") {

	
	GUI bank0= new GUI();
	bank0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bank0.setSize(300, 200);
	bank0.setVisible(true);	
}
else if (Costumer2.userName=="hamzah" && Costumer1.password=="222") {	

}
else if (Costumer3.userName=="golami" && Costumer3.password=="333") {	
}
else if (Costumer4.userName=="borisi" && Costumer4.password=="444") {	
}
else 
System.err.println("Fehler versuch es noch einmal");	
	}

}
