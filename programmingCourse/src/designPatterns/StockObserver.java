package designPatterns;
// this code is not complete as in the video check for advanced check the link down here:
// https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4>
public class StockObserver implements Observer {
	private double ibmPreis;
	private double applePreis;
	private double googlePreis;
 private static int observerIDTrack=0;
 private int observerID;
private Subject stockGrubber ; 	
StockObserver (Subject stockGrubber ){
this.stockGrubber= stockGrubber;
this.observerID= ++ observerIDTrack;
System.out.println("New Observer "+ this.observerID);
stockGrubber.register(this);
}
 @Override
	public void update(double ibmPreis, double applePreis, double googlePreis) {
this.applePreis= applePreis;
this.googlePreis=googlePreis;
this.ibmPreis=ibmPreis;
printThePreises();
	}
 public void  printThePreises() {
	 System.out.println(observerID+ "\n IBM:"+ ibmPreis+ "\n APLP:"+ applePreis + "\n GOOGLE:"+ googlePreis);
 }

}
