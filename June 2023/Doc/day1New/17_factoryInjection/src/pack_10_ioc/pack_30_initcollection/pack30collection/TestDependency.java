package pack_10_ioc.pack_30_initcollection.pack30collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestDependency {
	public static void main(String[] args) {
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource(
        "pack_10_ioc\\pack_30_initcollection\\pack30collection\\context.xml"));
		
		PragatiSoftware ps = (PragatiSoftware) beanFact.getBean("pragati_details");
	
		System.out.println(ps);
	}
}
