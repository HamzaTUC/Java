package Package_Coupling;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteToFile {

	public static void main(String[] args) throws Exception  {
		
		// 1- Write Using only FileOutpuStream 
		
		/* try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\gheza\\Desktop\\Python.txt");    
             fout.write(65); 
             
             
             String s=" End of this.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             
             
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
		 */
		// 2- Write Using both FileOutpuStream &  BufferedOutputStream 
		/*
		 FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Written Using BufferedOutputStream.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
		 */
		/*
		//write using PrintStream
		FileOutputStream fout=new FileOutputStream("D:\\test4.txt ");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
	    System.out.println("Success?");    
		*/
		/*
		// Write common data to multiple files  
			      FileOutputStream out1=new FileOutputStream("f1.txt");    
			      FileOutputStream out2=new FileOutputStream("f2.txt");    
			        
			      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
			      bout.write(65);    
			      bout.writeTo(out1);    
			      bout.writeTo(out2);    
			        
			      bout.flush();    
			      bout.close();//has no effect    
			      System.out.println("Success...");    
		*/
		// Create new File using File class
		/*
		try {  
            File file = new File("NewFile.txt");  
            String path = file.getAbsolutePath();
            if (file.createNewFile()) {  
                System.out.println("New File is created!");
                System.out.println("the path is:"+ path);  
            } else { 
                System.out.println("File already exists.");
                System.out.println("the path is:"+ path); }
            
        } catch (Exception e) { e.printStackTrace();  }  
		
		*/
	//Read list of files given the path		
		 File f=new File("D:");  
		    String filenames[]=f.list();  
		    for(String filename:filenames){  
		        System.out.println(filename); 
    //Read details of files given the path
	    File dir=new File("/Users/gheza/Documents");  
	    File files[]=dir.listFiles();  
	    for(File file:files){  
		 System.out.println(file.getName()+" Can Write: "+file.canWrite()+
		"Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");  
		        }  
		        
		    }  
	}    
	}


