package nomura;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam2.CustomerService;

public class Client {
public static void main(String[] args) {
	
	ApplicationContext context = 
	    	  new ClassPathXmlApplicationContext("beans2.xml");
	 
	    	UserService cust = (UserService)context.getBean("ser");
	    	cust.service();
	 	
	
	
}
}
