package LaptopSortUsingComparableAndComparator;
import LaptopSortUsingComparableAndComparator.Laptop;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteIt {

	
		public static void serializeLaptopObj(Laptop serializeLaptop1) throws IOException {
			 FileOutputStream fos =new FileOutputStream("Laptop.ser1");
			 
			 ObjectOutputStream oos= new ObjectOutputStream(fos);
			 
			 oos.writeObject(serializeLaptop1);
			 
			 oos.close();
			 System.out.println("serialization done with succcess");
				}   		

	}


