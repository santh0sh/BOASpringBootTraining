package pack_10_ioc.pack_50_factory.pack_20_factory_pattern03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryPattern {

	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_50_factory\\pack_20_factory_pattern03\\context.xml");
		
		BankAcc acc1 = beanFact.getBean("myfactory", BankAcc.class);
		System.out.println(acc1.hashCode());
		
		BankAcc acc2 = (BankAcc) beanFact.getBean("myfactory");
		System.out.println(acc2.hashCode());
	}
}