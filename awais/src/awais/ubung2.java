package awais;
public class ubung2 implements Size{
	int width= 200;
	int length= 500;
	int summation(int a, int b){
		int sum= a+b;
		return sum;
		}
	 public int getLength() {
		 return length;
		  }
	 public int getWidth() {
		 return width;	 
	 }
	
	 
	 int subtraction(int c, int d){
		int sub= c-d;
		return sub;
		}
	public static void main (String [] args) {
		ubung2 addit= new ubung2();
		ubung2 subit= new ubung2();
		System.out.println(addit.length);
		System.out.println(addit.width);
		
		
		String author = new String("Radia perlman ");
		author=author.substring(5);
		System.out.println(author);
		System.out.println("the result of sub is\n"+ subit.subtraction(10, 5));
		System.out.print("the result of sum is\n"+ addit.summation(10, 10));

		
	}}


