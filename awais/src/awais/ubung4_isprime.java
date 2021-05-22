package awais;

import java.util.Scanner;

public class ubung4_isprime {
	public static void main (String [] args) {
		int j=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number :");
		int numberEntered = scanner.nextInt();
		for (j=2, j <numberEntered, j++) {
			if (numberEntered % j ==0) {
			 
				System.out.print("Number is Prime ");	
			}
			
			else
	
			
				System.out.print("Number is not Prime ");	
		}
          }
}