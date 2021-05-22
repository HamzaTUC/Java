package programingCourse2;
import java.text.NumberFormat;
import java.util.Scanner;

public class CompanyInterestRate {

	public static void main (String [] args) {
		
		final byte numbersOfMonths= 12;
		final byte Percent= 100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal:");
		int principal= scanner.nextInt();
		
		System.out.print("Annual Interset rate :");
		float anualInterest= scanner.nextFloat();
	
		System.out.print("Period (years):");
		byte period= scanner.nextByte();
		
		int numerOfPayments= period*numbersOfMonths;
		double monthlyInterest= (anualInterest/numbersOfMonths/Percent);
double Mortage= principal*monthlyInterest*Math.pow(1+monthlyInterest,numerOfPayments)/(Math.pow(1+monthlyInterest,numerOfPayments)-1);
String numberFormatted= NumberFormat.getCurrencyInstance().format(Mortage);
System.out.println("Mortage:"+ numberFormatted);
}}