package Package_Coupling;



class A extends Thread {
	public synchronized  void run () 
	{
		System.out.println("A");
		for(int i=1;i<5;i++)
		   {  
		    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);
		    
		  }   
     }
	
}

class B extends Thread{
	public void run () 
	{
		System.out.println("B");
		for(int i=1;i<5;i++)
		   {  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		    
		   }   
     }
	
}



public class Multithreading2 {
	public static void main(String[] args) {
    A a= new A();		
    B b= new B();
    a.start();
    b.start();
 System.gc();
	}

}
