package GUIKlassen_trial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class GUI2 extends JFrame{ // build  a window by extending JFrame
private JTextField item1;
private JTextField item2;
private JTextField item3;
private  JButton item4 = new JButton("Kontoeröffnen");
private JPasswordField passwordField;

public GUI2() {
	super("The title");
	setLayout(new FlowLayout());
item1= new JTextField(20);
add(item1);
item2= new JTextField("enter text here",20);
add(item2);
item3= new JTextField("uneditable",10);
item3.setEditable(false);
add(item3);
add(item4);
passwordField = new JPasswordField("mypassword");
add(passwordField);
Thehandler handler= new Thehandler();
item1.addActionListener(handler);
item2.addActionListener(handler);
item3.addActionListener(handler);
passwordField.addActionListener(handler);

}
private class Thehandler implements ActionListener {
	public void actionPerformed(ActionEvent event) {
	String string ="";	
	if (event.getSource()==item1)
		string =String.format("sorry not available", event.getActionCommand() );
	else if (event.getSource()==item2)
		string =String.format("field 2: %s" , event.getActionCommand());
	else if (event.getSource()==item3)
		string =String.format("field 3: %s" , event.getActionCommand());
	else if (event.getSource()==passwordField)
		 string =String.format("do not repeat this again " , event.getActionCommand());
	System.err.println("do not repeat this again ");
	
	JOptionPane.showMessageDialog(null, string);
	}
	
  }


}