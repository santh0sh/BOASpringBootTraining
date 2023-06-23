package pack_10_ioc.pack_10_accessbean.packsimplebean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestIocContainer02 {

	public static void main(String[] args) {
		// Create application context/IoC container.
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource(
	    "pack_10_ioc\\pack_10_accessbean\\packsimplebean\\context02.xml"));
		
		// Get the bean from IoC container
		EmpBean demo1 = (EmpBean) beanFact.getBean("employee1");
		System.out.println(demo1);	// Bean is ready
		
		// Ensures singleton/Prototype of object.
		// Bean creation invoking one para constructor
		EmpBean demo2 = (EmpBean) beanFact.getBean("employee1");
		System.out.println(demo2);
	}
}
