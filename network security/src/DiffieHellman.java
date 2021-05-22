import java.math.BigInteger;
import java.util.Scanner;

public class DiffieHellman {

	public static void main(String[] args) {
		Scanner In = new Scanner (System.in);
		BigInteger n,g,x,y,key1,key2,A,B;
		
		System.out.println("Enter 2 prime numbers: ");
	n=new BigInteger(In.next());
	g=new BigInteger(In.next());
	System.out.println("Alice enter your secret number:");
	x=new BigInteger(In.next()); 
	A= g.modPow(x,n);

	System.out.println("Bob enter your secret number:");
	y=new BigInteger(In.next()); 
	B= g.modPow(y,n);

	key1= B.modPow(x,n);
	key2=A.modPow(y,n);

	System.out.println("Alice's secret key is:" + key1);
	System.out.println("Bob's secret key is:" + key2);
	}}
