package Package_Coupling;

import java.io.BufferedInputStream;
import java.io.Console;
import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) {

		// // 1- Read Using only FileInpuStream
		/*
		try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\gheza\\Desktop\\Python.txt");    

	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }       
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}   
	          
	           */

		// 2- Read Using both FileInpuStream &  BufferedInputStream 
		/*
		try {
		 FileInputStream fin=new FileInputStream("D:\\germanText.txt");    
		 BufferedInputStream bin=new BufferedInputStream(fin);
         int i=0;    
         while((i=bin.read())!=-1){    
        	 System.out.print((char)i);    
         }   
         bin.close();
         fin.close();    
       }catch(Exception e){System.out.println(e);}    
      */
     // Read Password from console
		
		Console c=System.console();    
		 if(c == null)    
	        {   
	            System.out.print("No console available");   
	            return;   
	        }   
		System.out.println("Enter password: ");    
		char[] ch ;
		ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);    
	}

}
