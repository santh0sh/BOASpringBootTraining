package pack_10_ioc.pack_50_factory.pack_20_factory_pattern01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryPattern {

	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_50_factory\\pack_20_factory_pattern01\\context.xml");
		
		BankAcc acc = (BankAcc) beanFact.getBean("bankacc");
		System.out.println(acc.hashCode());
		
		BankAcc bacc = beanFact.getBean("bankacc",	BankAcc.class);
		System.out.println(bacc.hashCode());
	}
}