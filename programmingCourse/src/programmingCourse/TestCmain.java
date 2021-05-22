package programmingCourse;

import javax.swing.JOptionPane;

public class TestCmain extends TestA{//suppose if it were  
				void run(){System.out.println("C is running safely");}  
			 public static void main(String args[]){  
			   TestCmain obj=new TestCmain();
			   TestCmain obj1=obj;
			   obj.run();//Now which msg() method would be invoked?  
		
			   System.out.println(obj.equals(obj1));
			System.out.println(obj==obj1);
			System.out.println("#########################################################");
			String st1 ="Hello";
			String st4= String.valueOf(10);
			String st2="hello";
			String st3= new String("Hello");
			System.out.println(st1.equals(st2));
			System.out.println(st1.equals(st3));
			System.out.println(st1==st3);
			System.out.println(st4);
			try {	
			String text = JOptionPane.showInputDialog("give a number? ");
			int eingabe= Integer.parseInt(text);
			JOptionPane.showMessageDialog(null,"number inseted returned is :"+text, "that s the number u ve entered",JOptionPane.INFORMATION_MESSAGE );
			System.out.println(text);
			System.out.println(eingabe);	
			}
			catch (NumberFormatException error) {
				error.printStackTrace();
				
			}
			finally {
				System.out.println("in both cases will this be run");	
			}

			
			 }  
			} 
