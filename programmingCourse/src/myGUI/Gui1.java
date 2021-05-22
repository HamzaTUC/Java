package myGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gui1 extends JFrame{
private JLabel item1;
public Gui1() {
super("this is our Bank view");// this gives us the title  
setLayout(new FlowLayout()); // this is gives the defualt layout
item1= new JLabel("this is the view ");
item1.setToolTipText("click here" );
add(item1);

}
}