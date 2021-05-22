package programingCourse2;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal jack = new Dog ();
		Animal ma9nin= new Bird();
		System.out.println("Dog: " + jack.tryToFly());
		System.out.println("Bird: " + ma9nin.tryToFly());
		jack.setFlyingAbility(new ItFlys());
		System.out.println("Dog: " + jack.tryToFly());
	Class<? extends Animal> n=jack.getClass();	
	Class<? extends Animal> m=ma9nin.getClass();	
	String l = String.valueOf(ma9nin.hashCode());
	System.out.println(n);
	System.out.println(m);
	System.out.println(l);
	System.out.println(ma9nin);
	
	
	}

}
