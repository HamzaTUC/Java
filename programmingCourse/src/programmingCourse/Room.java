package programmingCourse;
public class Room {
	int roomNumber;
	String name;
	float pricePerNight;
    int numberOfBeds;
	Guest guest;
public Room () {
}

public Room (int roomNumber,String name,float pricePerNight,int numberOfBeds) {
	this.name= name ;
	this.numberOfBeds=numberOfBeds;
	this.pricePerNight=pricePerNight;
	this.roomNumber=roomNumber;
}

public void printRoom () {
	System.out.println("Raum "+ roomNumber + " kostet " + pricePerNight + " und hat "+ numberOfBeds+" beds.");  
}
public boolean hasEnoughBeds (int people) {
return (numberOfBeds-people)>=0;
}	
public float calculatePricePerStay (int nights) {
float cost = this.pricePerNight*nights ;
return cost;
}	
public void checkIn (Guest guest ) {
	this.guest= guest;
	System.out.println("Der Guest "+ this.guest.name + "hat eingecheckt"); 
}
public void checkOut () {
	System.out.println("Der Guest "+ this.guest.name + "hat ausgecheckt");
	this.guest= null;
	
	 
}


}
