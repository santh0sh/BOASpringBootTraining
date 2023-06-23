package pack_10_ioc.pack_50_factory.pack_20_factory_pattern02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryPattern {

	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_50_factory\\pack_20_factory_pattern02\\context.xml");
		
		Integer i = new Integer(10);
		BankAcc acc = (BankAcc) beanFact.getBean("bankacc", i); // The second para can be of different type
		System.out.println(acc);
		
		acc = (BankAcc) beanFact.getBean("bankacc", i);
		System.out.println(acc);
	}
}