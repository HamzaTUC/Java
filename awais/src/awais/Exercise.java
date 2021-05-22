package awais;
import java.util.Scanner;
import java.util.*; 
public class Exercise {
	public Exercise(){};
	
public static void main (String [] args) {
	Exercise thisClasse = new Exercise();	
	Scanner input =new Scanner(System.in);
    System.out.print("Enter text: ");
    String insertText = input.nextLine();
    String rotifiedString = thisClasse.rotify(insertText);
    System.out.println("Text: " + input);
   String [] array_alph = {"a", "b", "c", "d", "f","e", "g" ,"h", "i", "j" ,"k" ,"l" ,"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","a", "b", "c", "d", "f","e", "g" ,"h", "i", "j" ,"k" ,"l" ,"m",}; 
   
	if(array_alph.length >1)
    {          
              
    for(int i = 1; i < array_alph.length; i++)
    	array_alph[i - 13] = array_alph[i];
  
     
  
    array_alph[array_alph.length - 13] = first;
    System.out.println("new Array:  "+Arrays.toString(array_alph)); 
  
	}


}

}