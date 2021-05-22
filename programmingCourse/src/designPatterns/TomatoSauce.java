package designPatterns;

public class TomatoSauce extends DecoratePizza {
	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding sauce");

	}
	public String getDescription() {
		return tempPizza.getDescription()+ ", TomatoSauce";
	}
	public double getCost() {
	return tempPizza.getCost()+ 0.35;
}}
