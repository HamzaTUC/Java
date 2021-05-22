
class vergleich {
int rollnummer;
String name;
void insertInfo (int r, String n) {
name = n;
rollnummer = r;
}	

void displayInfo () {
	System.out.println(name +"  " +rollnummer);
}
class TestNewtudent{
public void main (String [] args) {
	vergleich s1= new vergleich();
	vergleich s2= new vergleich();
s1.insertInfo (10,"Hamza" )	;
s2.insertInfo (10,"Walid" )	;
s1.displayInfo ()	;
s1.displayInfo ();
}
}}

	
	
	
