package pack_10_ioc.pack_50_factory.pack_10_factory_method;

public class BankAcc {
	// Simple Singleton through factory method
	private static BankAcc singleObject;
	
	public static BankAcc getInstance(){
		System.out.println("IN getInstance method");
		if (singleObject==null){
			singleObject = new BankAcc();
		}
		return singleObject;
	}
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	private BankAcc(){
		System.out.println("Executing no-arg constructor of BankAcc.");
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "AccNo:"+accNo+" Name:"+accNm+" Balance:"+accBal;
	}
}
