package pack_10_ioc.pack_60_DI.pack_01_lookup_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyInjection {

	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_60_DI\\pack_01_lookup_method\\context.xml");
		
		NewsPrintManager acc = (NewsPrintManager) beanFact.getBean("news_print_manager");
		acc.printNews();
	
		acc = (NewsPrintManager) beanFact.getBean("news_print_manager");
		acc.printNews();
		//BankAcc bacc = beanFact.getBean("bankacc",	BankAcc.class);
	}
}