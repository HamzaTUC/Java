
package awais;
import java.util.Scanner;
public class ubung5_reverse {
	
		public static void main (String [] args) {
			String original, reverse="";   
		Scanner in = new Scanner(System.in);
				System.out.print("Enter your input :");

	original = in.nextLine();

   
    for ( int i = original.length()-1; i >0; i-- )  
		
			{reverse = reverse + original.charAt(i);}
				
		if (original.equals(reverse))
			System.out.print("they are reverse of each other ");
		else
			System.out.print("they are NOTreverse ofeach other\n");
		
		System.out.print("yeeeeeeeeeeessssssss ");
		
		}}
