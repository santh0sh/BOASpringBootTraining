package pack_10_ioc.pack_50_factory.pack_20_factory_pattern02;


public class MyFactory {
	
	// Factory method
	public  BankAcc getBankInstance1(String accType){
		
		if (accType.equalsIgnoreCase("savings"))
			return new SavingsAcc();
		else
			return new CurrentAcc();
	}
	
	public  BankAcc getBankInstance(Integer i){
		
		if (i.equals(10))
			return new SavingsAcc();
		else
			return new CurrentAcc();
	}
}
