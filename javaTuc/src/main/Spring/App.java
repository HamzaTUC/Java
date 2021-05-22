package com.hamza.javaTuc;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicule obj = (Vehicule)context.getBean("vehicule");
        obj.drive();
    }
}
