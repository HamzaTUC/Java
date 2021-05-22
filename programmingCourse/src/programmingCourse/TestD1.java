package programmingCourse;

public class TestD1 {

	public static void main(String[] args) {
		TestD objD= new TestD("first paramter", "second parameter");
		
		System.out.println(objD.nameA);
		System.out.println(objD.nameB);
		System.out.println(objD.nameD);
		objD.printSth();
		System.out.println(objD.str);
		System.out.println(objD.str0);
		System.out.println(objD.toString());
	}

}
