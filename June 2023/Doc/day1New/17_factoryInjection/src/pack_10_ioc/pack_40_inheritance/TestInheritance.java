package pack_10_ioc.pack_40_inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInheritance {

	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_40_inheritance\\context.xml");
		
		SavingsAcc acc = (SavingsAcc) beanFact.getBean("savingsacc");
		System.out.println(acc);
		
		BankAcc bacc = beanFact.getBean("savingsacc",	BankAcc.class);
		
		System.out.println(bacc);
	}
}