package awais;
import java.util.Date;
import java.util.Scanner;
public class forloop {
	
	
		
	public static void main (String [] args) {

		byte age = 30;
		Date now = new Date ();
		
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a number: ");
			int x = reader.nextInt(); // Scans the next token of the input as an int.
			//once finished
			reader.close();
		
			

			
			for (int y=2;y<= 10;y=y+2) {
		
				System.out.print (" ") ;
			
				System.out.print (x+"*"+y+ "= " ) ;
				System.out.println(x*y ) ;
				System.out.println(now);	

			}

	}
}
