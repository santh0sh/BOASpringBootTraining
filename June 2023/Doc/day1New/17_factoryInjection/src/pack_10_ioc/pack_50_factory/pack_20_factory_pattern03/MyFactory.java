package pack_10_ioc.pack_50_factory.pack_20_factory_pattern03;

import org.springframework.beans.factory.FactoryBean;


public class MyFactory implements FactoryBean<BankAcc> {

	public MyFactory(){
		System.out.println("Object created.");
	}
	
	public BankAcc getObject() throws Exception {
		
		return new BankAcc();
	}

	public Class<?> getObjectType() {
		return BankAcc.class;
	}

	public boolean isSingleton() {
		
		return true;
	}
}
