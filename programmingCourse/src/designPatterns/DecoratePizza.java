package designPatterns;

abstract class DecoratePizza implements Pizza {
protected Pizza tempPizza;
public DecoratePizza (Pizza newPizza) {
tempPizza = newPizza;}

public String getDescription() {	
	return tempPizza.getDescription();
}
public double getCost() {
return tempPizza.getCost()	;
}
}

