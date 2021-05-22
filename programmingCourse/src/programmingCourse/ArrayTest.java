package programmingCourse;

public class ArrayTest {
	static void test(int [] array) {
		array[0]= 4;
	}
	public static void main(String[] args) {
	int [] testArray= {1,2,3};
	test(testArray);
	System.out.println(testArray[0]);
	}
}
