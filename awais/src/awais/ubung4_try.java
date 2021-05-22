package awais;
import java.util.Scanner;
public class ubung4_try {
	public static void main (String [] args) {
	int i,m=0,flag=0;    
	Scanner in = new Scanner(System.in);
			System.out.print("Enter a number :");
			int numberEntered = in.nextInt();
	  m=numberEntered/2;    
	  if(numberEntered==0||numberEntered==1){
	   System.out.println(numberEntered+" is not prime number");    
	  }else{
	   for(i=2;i<=m;i++){    
	    if(numberEntered%i==0){    
	     System.out.println(numberEntered+" is not prime number");    
	     flag=1;    
	     break;    
	    }    
	   }    
	   if(flag==0)  { System.out.println(numberEntered+" is prime number"); }
	  }//end of else
	}  
	} 

