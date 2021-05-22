package programmingCourse;

public class StringAnomaly {

	public static void main(String[] args) {
		String a = new String("Hello");
		String b =a;
		b= b+ " Welt";
		System.out.println(a);
		System.out.println(b);
	}

}
