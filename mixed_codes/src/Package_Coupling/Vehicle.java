package Package_Coupling;

public interface Vehicle {
void run();

public class BusV implements Vehicle{
public void run() {
System.out.println("Bus Running ");	}

public class  CarV implements Vehicle{
public Vehicle Vehicle;

public void run() {
System.out.println("Car Running ");	}

public class BikeV implements Vehicle{
public void run() {
System.out.println("Bike Running ");	}
	}
}
	
}
}






