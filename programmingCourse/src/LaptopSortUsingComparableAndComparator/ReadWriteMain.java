package LaptopSortUsingComparableAndComparator;

import java.io.IOException;

public class ReadWriteMain {

	public static void main(String[] args) throws IOException {
		WriteIt rwobj= new WriteIt ();
		Laptop serializeLaptop=new Laptop("Lenovo",350,16);
		Laptop serializeLaptop1=new Laptop("Dell",300,8);
		
		try {
			rwobj.serializeLaptopObj(serializeLaptop1);	
			System.out.println("done ");
		}
		catch(IOException exception){
			System.out.println("not  done ");
		}

	}

}
