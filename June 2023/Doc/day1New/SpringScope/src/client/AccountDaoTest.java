/**
 * 
 */
package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Account;


public class AccountDaoTest {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		Account kavithaAccount = context.getBean("kavithaAccount",
				Account.class);
		kavithaAccount.credit(1000);
		Account acc = context.getBean("kavithaAccount", Account.class);
		System.out.println(acc.getBalance());

	}

}
