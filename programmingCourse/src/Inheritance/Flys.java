package programingCourse2;

public interface Flys {
String fly();

;}
class ItFlys implements Flys {
	@Override
	public String fly() {
		return "flying high" ;
	}

	}

	class CantFly implements Flys {
		@Override
		public String fly() {
			return "I cannot fly" ;
		}
	
}