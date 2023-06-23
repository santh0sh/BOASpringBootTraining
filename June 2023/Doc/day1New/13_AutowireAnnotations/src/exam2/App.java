package exam2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
  
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"beans2.xml"});
 
    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);
 
    }
}