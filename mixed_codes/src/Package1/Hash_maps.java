package Package1;

import java.util.HashMap;
import java.util.Map;

public class Hash_maps {
	public static void stat(String st, int x) {
		for (int i =0;i <x ; i++) {
			System.out.println(st);
		}		
	}


	public static void main(String[] args) {
		
		
		String y= "hello akhjga alkngag äögg thee";
		Map mapStr = new HashMap();
		for (char i :y.toCharArray()) {
			 if (mapStr.containsKey(i)){
			int old = (int) mapStr.get(i);
			mapStr.put(i, old+1);
			}
			 else {
				 mapStr.put(i, 1);
			 }
		}
		mapStr.remove(' ');
		System.out.println(mapStr);
		System.out.println("--------------------");
		stat("Hamza", 3);
	}

}
