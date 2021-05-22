package designPatterns;

public class Mozzarella extends DecoratePizza{

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Mayonze");
		System.out.println("Adding Fromage");
	}
	public String getDescription() {
		return tempPizza.getDescription()+ ", Mozzarella";
	}
	public double getCost() {
	return tempPizza.getCost()+ 0.50;
}}
