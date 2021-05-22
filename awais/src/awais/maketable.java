package awais;
import java.util.Scanner;


public class maketable {
	


public static void main (String [] args) {

	
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int x = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
	
		

		int y=1;
		while (y<= 10) {
	
			System.out.print (x+"*"+y+ "= " ) ;
			System.out.println(x*y ) ;
			y++;
		}
		
		
		y=1;
	
		while (y<= 10) {
			
			if( y % 2 == 0)
			System.out.print (x+"*"+y+ "= " ) ;
			System.out.println(x*y ) ;
			y++;
		}
		
	}
}