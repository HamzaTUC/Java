package myGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;

public class Gui2 extends JFrame{ // build  a window by extending JFrame
private JTextField item1;
private JTextField item2;
private JTextField item3;
private  JButton item4 = new JButton("Kontoeröffnen");
private  JButton item5 = new JButton("beenden");
private JPasswordField passwordField;
private JRadioButton item6;
private JRadioButton item7;
private JLabel kontoLabell;
private ButtonGroup kontoRadioo;

public Gui2() {
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
add(item5);
item6= new JRadioButton();
add(item6);
item7= new JRadioButton();
add(item7);

this.kontoLabell = new JLabel("KontoType");
add(kontoLabell);
this.item6.setText("GiroKonto");

this.item7.setText("DepotKonto");

this.kontoRadioo = new ButtonGroup();
this.kontoRadioo.add(item6);
this.kontoRadioo.add(item7);
passwordField = new JPasswordField("mypassword");
add(passwordField);
thehandler handler= new thehandler();
item1.addActionListener(handler);
item2.addActionListener(handler);
item3.addActionListener(handler);
item4.addActionListener(handler);
item5.addActionListener(handler);
passwordField.addActionListener(handler);
}

private class thehandler implements ActionListener {
	public void actionPerformed(ActionEvent event) {
	String string ="";	
	if (event.getSource()==item1)
		string =String.format("sorry not available", event.getActionCommand() );
	else if (event.getSource()==item2)
		string =String.format("field 2: %s" , event.getActionCommand());
	else if (event.getSource()==item5)
		System.exit(0);
	else if (event.getSource()==item3)
		string =String.format("field 3: %s" , event.getActionCommand());
	else if (event.getSource()==item4)
		string =String.format(" Dein konto wurde erfolreich erstellt" , event.getActionCommand());
	else if (event.getSource()==passwordField)
		 string =String.format("do not repeat this again " , event.getActionCommand());
	System.err.println("do not repeat this again ");
	
	
	JOptionPane.showMessageDialog(null, string);
	
	}
	
  }


}


