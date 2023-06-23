package pack_10_ioc.pack_80_config_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAppConfig {

	public static void main(String[] argv) {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		 //BankService bankService = ctx.getBean(BankService.class);
		 BankService bankService = ctx.getBean("bankService", BankService.class);
		 
		 bankService.myBankService();
		 bankService.getBillPaymentService().myBillPaymentService();
		 bankService.getCustomerService().myCustomerService();
		 
		 System.out.println("Creating bean");
		 CustomerService sc = (CustomerService)ctx.getBean("customerService");
		 sc.myCustomerService();
	}
}
