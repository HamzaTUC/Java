package Package1;

public interface StudentInterface {
void run ();
void search ();
default void defMethod() {
	System.out.println("it is possible I m inside an interface ");
}
default int math(int a, int b) {
	return a+b; 
}
static int math1(int a, int b) {
	return a-b; 
}
}
