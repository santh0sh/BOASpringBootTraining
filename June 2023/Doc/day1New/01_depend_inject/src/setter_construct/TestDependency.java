package setter_construct;

/*
 * This program demonstrates setting dependencies using Setter method.
 * Observe in context.xml
 * 		The Constructor Injection to set reference of Address object into EmpBean Object.  It is done with 'ref' child.
 * 		The setter injection to set reference of Address object into EmpBean object.  It is done with 'ref' clause.
 * 
 * Observe in EmpBean class the...
 * 		The toString method is referring to toString of Address class.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestDependency {
	public static void main(String[] args) {
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource("context.xml"));
		
		EmpBean emp = (EmpBean) beanFact.getBean("employee");
	
		System.out.println(emp);
	}
}