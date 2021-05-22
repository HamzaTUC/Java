package programmingCourse;
import javax.swing.*; 


 
public class Simple {  
JFrame f;  
Simple(){  
f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("djdfdffhhg");//creating instance of JButton  
b.setBounds(150,250,200, 100);  
          
f.add(b);//adding button in JFrame  
          
f.setSize(500,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(false);//making the frame visible  
}  
  
public static void main(String[] args) {  
new Simple();  
}  
}  