import javax.swing.JOptionPane;

public class Gui_interface {

	private static final String H = "hello";

	public static void main(String[] args) {

		String fn = JOptionPane.showInputDialog("Enter first one ");
		String sn = JOptionPane.showInputDialog("Enter first one ");
int num1= Integer.parseInt(fn);
int num2=Integer.parseInt(sn);
int sum= num1+num2;
JOptionPane.showMessageDialog(null, "The result is: "+ sum, "Sum operation",JOptionPane.PLAIN_MESSAGE);
System.err.println("Do not repeat this again "+ "hello");
	}
	
}