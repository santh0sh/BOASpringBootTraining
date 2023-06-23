package pack_10_ioc.pack_20_depend_inject.pack40assignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestDependency {
	public static void main(String[] args) {
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource(
        "pack_10_ioc\\pack_20_depend_inject\\pack40assignment\\context.xml"));
		
		EmpBean emp1 = (EmpBean) beanFact.getBean("employee");
		EmpBean emp2 = (EmpBean) beanFact.getBean("employee");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
	}
}
