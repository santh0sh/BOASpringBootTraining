package com.examples.account;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.examples.account.*;
import com.examples.account.domain.Account;
import com.examples.account.repository.AccountRepository;
import com.examples.account.service.TransferService;

public class Main {
    public static void main(String[] args) {
    	
		// Create a new AnnotationConfigApplicationContext, deriving bean 
    	// definitions from the given annotated classes and automatically 
    	// refreshing the context.  Note that we don't use a context 
    	// configuration file in this example.
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// retrieve the beans we'll use during testing
		AccountRepository accountRepository = ctx.getBean(AccountRepository.class);
		TransferService transferService = ctx.getBean(TransferService.class);

		// create accounts to test against
		accountRepository.add(new Account("A123", 1000.00));
		accountRepository.add(new Account("C456", 0.00));
		
		System.out.println("accountRepository.findById(\"A123\").getBalance() = " + 
				accountRepository.findById("A123").getBalance());
		System.out.println("accountRepository.findById(\"C456\").getBalance() = " + 
				accountRepository.findById("C456").getBalance());

		 

		// perform transfer
		System.out.println("Transfering 100 dollars from A123 to C456 ");
		transferService.transfer(100.00, "A123", "C456");
		
		System.out.println("accountRepository.findById(\"A123\").getBalance() = " + 
				accountRepository.findById("A123").getBalance());
		System.out.println("accountRepository.findById(\"C456\").getBalance() = " + 
				accountRepository.findById("C456").getBalance());

		 
		
    }
}
