package pack_10_ioc.pack_50_factory.pack_20_factory_pattern01;

public class MyFactory {
	private static BankAcc bcc;
	
	// Factory method
	/*
	public  BankAcc getBankInstance(){
		if (bcc==null){
			bcc = new BankAcc();
		}
		return bcc;
	}
	*/
	public BankAcc getBankInstance(){
		return new BankAcc();
	}
}
