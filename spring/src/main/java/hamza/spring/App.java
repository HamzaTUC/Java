package hamza.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicule obj = (Vehicule)context.getBean("vehicule");
        obj.drive();
    }
}
