package Package_Coupling;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

import Package_Coupling.Vehicle.BusV.CarV.BikeV;

public class JourneyMain {

	Travel travel;
	public void setTravel (Travel travel ) {
		this.travel= travel ;
	}
	
	public Travel getTravel() {
		return this.travel;
	}
	public void startJourney(){
		travel.go();
		
	}
	
	public static void main(String[] args) {
	JourneyMain obj  = new JourneyMain ();
	Travel objBk= new Bike ();
	Travel objCr= new Car ();
	Travel objBs= new Bus ();
	System.out.println("-------Bike-----------");
	obj.setTravel(objBk);
	obj.startJourney();
	System.out.println("-------Bus-----------");
	obj.setTravel(objBs);
	obj.startJourney();
	System.out.println("-------Car-----------");
	obj.setTravel(objCr);
	obj.startJourney();
	 System.out.println("---------------------Anonymous class---------------");
	
	  Bike bk= new Bike() {
          public void go() {
          System.out.println("overwritten by Anonymous class");
           }
           
	  };
	  bk.go();

	
	StringTokenizer st = new StringTokenizer("my name is Hamza"," ");  
    while (st.hasMoreTokens()) {  
        System.out.println(st.nextToken());  }
    try {int c= 15/0;
       System.out.println(c);}
    catch(ArithmeticException e) {System.out.println("Exception handeled ");}
    catch(Exception e) {System.out.println("Exception handeled ");}
    
   	
        System.out.println("-------Regular expression-----------");
        System.out.println(Pattern.matches("[amn]?", "aaa"));
        System.out.println(Pattern.matches("[amn]*", "aaa"));
        System.out.println(Pattern.matches("...hamza", "ghthamza"));
        System.out.println(Pattern.matches("\\D*", "hhmmzzzmhhhm"));
        System.out.println("-------------DONE BY ME -----------------");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "an78"));
        System.out.println("-------------All the 3 down here are equivalent  -----------------");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7876546787"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8897452784"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "9452679087"));
       
       
      
	}
}
