package Package1;

public class Student  implements StudentInterface{
 private int age;
 private String name;
 public Student (String name, int age) {
		this.age= age;
		this.name= name;		
	}
		
public void speak () {
	System.out.println(name + "\n"+ age );
}

@Override
public void run() {
	System.out.println("Run ");
	
}

@Override
public void search() {
System.out.println("Search");	
}
public static void main(String[] args) {
Student2 st2= new Student2("Hamza",34);
st2.talk();
System.out.println(st2.toString());
Outerclass out= new Outerclass();
Outerclass.Innerclass in = out.new Innerclass();
System.out.println("------------------------------");
in.display();
Student st=new Student("Bob", 23);
st.run();
System.out.println("------IMPLEMENTATION INSIDE AN INTERFACE------");
st.defMethod();
System.out.println("Addition operation in an interface: "+ st.math(5, 10));
System.out.println("Substraction operation in an interface: "+ StudentInterface.math1(10, 5));
System.out.println("---------Enums----Enums---Enums---------");
Level [] arr=Level.values();
for (Level l : arr) {
	System.out.println(l);
}
System.out.println(Level.valueOf("LOW"));
Level lvl=Level.HIGH;
System.out.println(lvl.getLvlNum());
lvl.setLvlNum(10);
System.out.println(" after setting LOW to 10 it is set : "+lvl.getLvlNum());

/*  Student an= new Student ("Bob", 25);
        an.speak();
	     an.setAge(20);
     an.talk();
	     System.out.println(an.getAge());
*/

	}

}
