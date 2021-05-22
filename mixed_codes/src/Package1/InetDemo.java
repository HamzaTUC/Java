package Package1;


import java.io.*;    
import java.net.*;    

 
public class InetDemo{    
public static void main(String[] args){    

	try{  
		InetAddress ip=InetAddress.getByName("www.javatpoint.com");  
		  
		System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());  
		}catch(Exception e){System.out.println(e);}  
	
	System.out.println("---------------------------------------------");
	
try{    
URL url=new URL("https://en.wikipedia.org/wiki/Cat");    
HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
for(int i=1;i<=8;i++){  
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
huc.disconnect();   
}catch(Exception e){System.out.println(e);}    
}    
} 






