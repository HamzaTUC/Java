package designPatterns;

public class ApplyGrabStocks {

	public static void main(String[] args) {
		StockGrubber stockGrubber = new StockGrubber();
		StockObserver observer1= new StockObserver(stockGrubber);
		stockGrubber.setIBMPreis(197.00);
		stockGrubber.setApplePreis(200.00);
		stockGrubber.setGooglePreis(300.00);
		StockObserver observer2= new StockObserver(stockGrubber);
		stockGrubber.setIBMPreis(197.00);
		stockGrubber.setApplePreis(200.00);
		stockGrubber.setGooglePreis(300.00);
	stockGrubber.unregister(observer1);
	}
	}
	


