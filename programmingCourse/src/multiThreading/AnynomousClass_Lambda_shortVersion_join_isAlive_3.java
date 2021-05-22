package multiThreading;

public class AnynomousClass_Lambda_shortVersion_join_isAlive_3 {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hii this Thread's Priority is "+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}

			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {

				System.out.println("Helloo");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}, "Thread-1");
		t1.setName("Thread_Zero");
		System.out.println(t1.getName());	
			
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t2' s Priority is "+ t2.getPriority());
		t2.start();
		System.out.println(t1.isAlive());	
		t1.join();
		t2.join();
		System.out.println(t2.getName());
		System.out.println("finished successfully Salam");
		System.out.println(t2.isAlive());
		
	}
}
 