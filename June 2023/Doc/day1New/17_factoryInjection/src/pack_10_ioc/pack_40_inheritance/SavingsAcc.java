package pack_10_ioc.pack_40_inheritance;

public class SavingsAcc extends BankAcc {
	private boolean is_sal_acc;

	public SavingsAcc(){
		System.out.println("Executing no-arg constructor of SavingsAcc.");
	}
	
	public SavingsAcc(int accNo, String accNm, float accBal, boolean is_sal_acc) {
		super(accNo, accNm, accBal);
		this.is_sal_acc = is_sal_acc;
		System.out.println("Executing arg constructor of SavingsAcc.");
	}

	public boolean isIs_sal_acc() {
		return is_sal_acc;
	}

	public void setIs_sal_acc(boolean is_sal_acc) {
		this.is_sal_acc = is_sal_acc;
	}
	
	@Override
	public String toString() {
		return super.toString()+"     Is SalAcc?"+is_sal_acc;
	}
}
