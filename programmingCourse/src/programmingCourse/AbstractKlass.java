package programmingCourse;

class Printer {
	
// Number is a super abstract class for double float and integer	
public void show(Number i ){
	System.out.println(i); 
}
}


public class AbstractKlass {	
	public static void main(String[] args) {
Printer obj = new Printer ();
obj.show(5);
obj.show(5.5);
obj.show(6.6f);
	}

}
