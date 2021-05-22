package designPatterns;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		
		return "Piza simple";
	}

	@Override
	public double getCost() {
		
		return 3.00 ;
	}

}
