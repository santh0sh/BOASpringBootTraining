package pack_10_ioc.pack_10_accessbean.packsimplebean;

/* This exercise demonstrates how spring framework facilitate object creation
 * by specifying details of object within configuration file.
 * It also demonstrates the ways to initialize object state.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/*
* The Container in Spring Framework is just an instance of BeanFactory interface or any of its child interfaces.
* The instance of type BeanFactory or its child is basically a factory mechanism and not really a container in real sense.
* Is it container less container?
* 
* The most common way of instantiation the IoC container is by creating an ApplicationContext instance.
* Once this instance is created, the IoC container is up and running with all the singleton beans already loaded
* with other services provided by the container.
* 
* In example below, the Bean Factory is the application context being created.
* 	Observe in context.xml, the different ways of state initialization of the object (Constructor and properties)
* 	Observe in context.xml, the way to specify is it SingleTon object(Stateless) or Prototype object(Stateful).
* 	Observe in context.xml the different in providing config context and the singleton clause instead of scope clause.
*/

public class TestIocContainer01 {
	public static void main(String[] args) {
		// Create application context/IoC container.  Instead of classpath there can be new FileSystemResource("beans.xml");
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource(
	    "pack_10_ioc\\pack_10_accessbean\\packsimplebean\\context01.xml"));
		
		// Get the bean from IoC container
		EmpBean   demo1 = (EmpBean) beanFact.getBean("employee1");
		System.out.println(demo1);	// Bean is ready
		
		// Ensures singleton/Prototype of object.
		// Bean creation invoking one para constructor
		EmpBean demo2 = (EmpBean) beanFact.getBean("employee2");
		System.out.println(demo2);
		
		// Bean creation invoking two para contructor
		EmpBean demo3 = (EmpBean) beanFact.getBean("employee3");
		System.out.println(demo3);
		
		// Bean creation invoking no-arg constructor and set properties
		EmpBean demo4 = (EmpBean) beanFact.getBean("employee4");
		System.out.println(demo4);
		
		// Scope is Singleton
		EmpBean demo51 = (EmpBean) beanFact.getBean("employee5");
		EmpBean demo52 = (EmpBean) beanFact.getBean("employee5");
		System.out.println(demo51);
		System.out.println(demo52);
	}
}