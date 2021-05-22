package Package_Coupling;

class Multitheading  extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }   
	 
	 }  
	 
	 
	 
	 public static void main(String args[]) throws InterruptedException{  
		 Multitheading  t1=new Multitheading ();  
		 Multitheading  t2=new Multitheading ();  
		 System.out.println("After changing name of t1:"+t1.getName());  
		  System.out.println("Thread 1 Priority "+ t1.getPriority());  
		  System.out.println("Thread 2 Priority "+ t2.getPriority());
		  //System.out.println(Thread.currentThread().getName()); 
	  t1.setPriority(MAX_PRIORITY);
	 t2.setPriority(MIN_PRIORITY);
	  t1.start();  
	  t1.join(1000);
	  t2.start();  
	  t1.setName("Thread1");
	 	  
	 }  
	}  