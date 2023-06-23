
package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.entity.Address;
import com.entity.Customer;

 
public class Test {

	 
	public static void main(String[] args) {
	  ApplicationContext context  = 
			  	new ClassPathXmlApplicationContext("beans.xml");
	  
	  Customer c = context.getBean("customer",Customer.class);
	  Address address = c.getAddress();
	  System.out.println(address);
	  
	  
	}
}
