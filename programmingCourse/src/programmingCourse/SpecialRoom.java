package programmingCourse;

public class SpecialRoom {
	int roomNumber;
	String name;
	int numberOfBeds;
	int numberOfTowels;
	public SpecialRoom(){		
	}
    public SpecialRoom(int roomNumber, String name, int numberOfTowels){
    	this.name= name;
    	this.roomNumber= roomNumber;
    	this.numberOfTowels=numberOfTowels;
	}
    public void printSpecialRoom () {
   System.out.println("Raumnummer "+ this.roomNumber+ " \n Raum Bezeichnung: " + this.name + " \n Anzahl der handtücher "+ this.numberOfTowels);  
}
}