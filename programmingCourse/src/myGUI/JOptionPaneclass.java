package myGUI;

import javax.swing.JOptionPane;

public class JOptionPaneclass {
	
	public void addOne() {
	String text =JOptionPane.showInputDialog(null, "Please enter a number ");
	int eingabe= Integer.parseInt(text);
	
	if (eingabe <100 && eingabe >=0) {
	System.out.println(eingabe+1);
	JOptionPane.showMessageDialog(null,  "The result of adding 1 is: "+(eingabe+1), "The result of calcualtion  ",JOptionPane.ERROR_MESSAGE);
	} 
	else {
	System.out.println("False input");
	JOptionPane.showMessageDialog(null,  "False input try another input less than 100 ","Title: wrong input", JOptionPane.ERROR_MESSAGE);
	     }
    }
}