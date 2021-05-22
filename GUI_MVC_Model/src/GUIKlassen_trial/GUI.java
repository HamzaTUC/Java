package GUIKlassen_trial;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame{
private JLabel item1;
public GUI() {
super("this is our Bank view");// this gives us the title  
setLayout(new FlowLayout()); // this is gives the defualt layout
item1= new JLabel("this is the view ");
item1.setToolTipText("click here" );
add(item1);
}
}