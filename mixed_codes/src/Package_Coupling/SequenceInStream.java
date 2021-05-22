package Package_Coupling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInStream {

	public static void main(String[] args) throws Exception {

		// Read from two Files
		/*	FileInputStream input1=new FileInputStream("D:\\testout1.txt");    
		   FileInputStream input2=new FileInputStream("D:\\testout2.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();
		   */
		/*
	// Read from 2 Files and write to 3 File
		FileInputStream fin1=new FileInputStream("D:\\test1.txt");    
		   FileInputStream fin2=new FileInputStream("D:\\test2.txt");    
		   FileOutputStream fout=new FileOutputStream("D:\\test3.txt");      
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
		   int i;    
		   while((i=sis.read())!=-1)    
		   {    
		     fout.write(i);
		   }        
		   fout.close();
		   sis.close();
		   fin1.close();
		   fin2.close();
		   System.out.println("Success..");  
		   */

//creating the FileInputStream objects for all the files    
FileInputStream fin1=new FileInputStream("D:\\test1.txt");    
FileInputStream fin2=new FileInputStream("D:\\test2.txt");    
FileInputStream fin3=new FileInputStream("D:\\test3.txt");    
//creating Vector object to all the stream    
Vector v=new Vector();    
v.add(fin1);    
v.add(fin2);    
v.add(fin3);                  
//creating enumeration object by calling the elements method    
Enumeration e=v.elements();      
//passing the enumeration object in the constructor    
SequenceInputStream bin=new SequenceInputStream(e);    
int i=0;      
while((i=bin.read())!=-1){    
System.out.print((char)i);

}     
bin.close();    
fin1.close();    
fin2.close();    
fin3.close();	
	}
	

}
