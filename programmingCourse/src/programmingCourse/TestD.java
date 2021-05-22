package programmingCourse;

public class TestD extends TestB{
	String str0=super.str;
	@Override
	public String toString() {
		return "TestD [str0=" + str0 + ", str=" + str + ", nameD=" + nameD + ", nameB1=" + nameB1 + "]";
	}
	String str= "in D";
	public void printSth() {
		System.out.println("in D");
	}
	TestD(String nameB, String nameD) {
		super(nameB);
		this.nameD=nameD;
		// TODO Auto-generated constructor stub
	}
	String nameD= "nameD";
	String nameB1= "nameB1";

}
