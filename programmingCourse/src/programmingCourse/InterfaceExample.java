package programmingCourse;
interface Writer {
	void write ();
}

class Pen extends Printer implements Writer {
	public void write() {
		System.out.println("i m a pen");	
	}}
	
	
	class Pencil implements Writer {
		public void write() {
			System.out.println("i m a pencil");		
		}}
class Kit { 
	//give an interface writer (generalize)as a parameter instead of pen or pencil (specific) 
	public void doSomething(Writer p ) {
		p.write();
	}	}
public class InterfaceExample {

	public static void main(String[] args) {
Kit k = new Kit();
//give interface Writer as reference and Pen or Pencil as object  
Writer p = new Pen ();
Writer pc =new Pencil();
k.doSomething(p);
k.doSomething(pc);
Printer pr= new Printer ();
pr.show(777);
	}}

