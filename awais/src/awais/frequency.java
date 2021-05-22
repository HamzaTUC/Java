package awais;
import java.util.Scanner;
public class frequency {
	
		public static void main(String[] args) {
			frequency code = new frequency(); //object declaration
			Scanner input = new Scanner(System.in); //get scanner
			System.out.print("Input string to encrypt/decrypt then press enter: ");			
			String insertText = input.nextLine(); //Input String to encrypt/decrpyt
			
	        int[] freq = new int[insertText.length()];  
	        int i, j;  
	          
	        //Converts given string into character array  
	        char string[] = insertText.toCharArray();  
	          
	        for(i = 0; i <insertText.length(); i++) {  
	            freq[i] = 1;  
	            for(j = i+1; j <insertText.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        
	            
	        }  
	        
	          
	        //Displays the each character and their corresponding frequency  
	        System.out.println("Characters and their corresponding frequencies");  
	        for(i = 0; i <freq.length; i++) {  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.println(string[i] + "-" + freq[i]*100/insertText.length());  
	        }}}