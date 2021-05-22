package Package1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Trial_ChangeUmlaut {
	
	public void umlaut () {
	String s;
					
	
		 try {
			 FileReader fr=new FileReader("D:\\germanText.txt");    
	          int i;    
	          while((i=fr.read())!=-1) {      
	         s= String.valueOf(fr.read());
	          s= s.replace("ä", "a");
	      	s= s.replace("ö", "o");
	      	s= s.replace("ü", "u");	      	      	
	            
	           FileWriter fw=new FileWriter("D:\\germantxtOhneUmt.txt");    
	           fw.write(s);     
	          }
	          fr.close();  
	          //for (int j =0; j<s.length();j++) {
	      	//	System.out.print(s);}	      		
	           }
	      		          	          
	          //	 System.out.print((char)i);    
	         
	        
	            
	       catch(Exception e){System.out.println(e);}    
		}

public static void main(String[] args) {

 
		Trial_ChangeUmlaut tr = new Trial_ChangeUmlaut();
	tr.umlaut();
    
	/*
// Hasmap
	HashMap map = new HashMap();
	map.put("hamza", 29);
	map.put(10,30 );
	map.put("Ahmed", 26);
	System.out.println("------------------------");
	System.out.println(map);
	System.out.println(map.get(10));
	System.out.println("------------------------");
	System.out.println("     **");
	System.out.println("   *  *");
	System.out.println(" *    *");
	System.out.println("*  *  *");
	System.out.println("------------------------");		
	*/	
	
	}
}
