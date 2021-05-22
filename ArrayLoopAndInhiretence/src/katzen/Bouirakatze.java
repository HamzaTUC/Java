package katzen;

public class Bouirakatze extends Hauskatze {
	String eyecolor;
Bouirakatze(String rasse, int gewicht, String name, String eyefarbe){
super("Bouiracat", gewicht, name);
this.eyecolor= eyefarbe ;
}

void miau() 
{System.out.println("miauuuuu"); } 

}
