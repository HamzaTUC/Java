package programingCourse2;

public class Bird extends Animal {
	@Override
	public String toString() {
		return "Bird [flyingType=" + flyingType + ", tryToFly()=" + tryToFly() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Bird () {		
		flyingType= new ItFlys();
		}

}
