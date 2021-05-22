package designPatterns;

public class PizzaMakerApply {

	public static void main(String[] args) {
		Pizza basicPizza= new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Desciption:"+ basicPizza.getDescription());
		System.out.println("Preis:"+ basicPizza.getCost());
	}

}
