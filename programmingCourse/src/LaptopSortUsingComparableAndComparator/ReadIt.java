package LaptopSortUsingComparableAndComparator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadIt {
	
	
	public static  Laptop readSerilizedObj() throws IOException {
		 FileInputStream fis =new FileInputStream("Laptop.ser");
		 
		 ObjectInputStream ois= new ObjectInputStream(fis);
		 
		 Laptop newLaptop = null;
		 try {
			 Object myObject= ois.readObject();
			 if (myObject instanceof Laptop ) {
				 newLaptop =(Laptop)myObject;
			 }
		 }
		 catch(ClassNotFoundException exception){
			 exception.printStackTrace();
		 }
		 ois.close();
		 return newLaptop;
			}   

}
