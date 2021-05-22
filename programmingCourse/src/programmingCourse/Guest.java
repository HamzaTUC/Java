package programmingCourse;

public class Guest {
	String name ;
	int yearOfBirth;
	boolean formerGuest;
	char gender;

public Guest() {
}

public Guest(String name, int yearofBirth, char gender) {
	this.name= name ;
	this.gender= gender;
	this.yearOfBirth=yearofBirth;
}

 public int calculateAge(int currentYear) {
	 return currentYear-this.yearOfBirth;
	  
 }

public void printGuest () {
	System.out.println("Der Guest "+ name + " ist im jahr " + yearOfBirth + " geboren");  
	
}

private void printIt() {
	System.out.println("Der Guest "+ name + " ist im jahr " + yearOfBirth + " geboren");
}

private void printG() {
	printIt();
}


}