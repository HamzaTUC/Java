package LaptopSortUsingComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopMain {

	public static void main(String[] args) {	
		
	List<Laptop> laptops= new ArrayList<>(); 
    laptops.add(new Laptop("Dell", 200,4));
    laptops.add(new Laptop("Lenovo", 300,8));
    laptops.add(new Laptop("Toshiba", 100,2));
	Comparator<Laptop> comp=new Comparator<Laptop>(){
		public int compare(Laptop l1, Laptop l2) {
			if (l1.getRam()<l2.getRam())
				return -1;
				else 
					return 1; 
	}};
    
	Collections.sort(laptops,comp);
	for(Laptop l :laptops)
		System.out.println(l);
	System.out.println("\n");
	System.out.println("Hello ");

	
	
    
	}

}
