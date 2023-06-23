package pack_10_ioc.pack_70_namespace.pack_01_util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {
	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_01_util\\context.xml");
		
		Services service = (Services) beanFact.getBean("services");
	
		System.out.println("IP for data_server"+service.getIp("data_server"));
	}
}
