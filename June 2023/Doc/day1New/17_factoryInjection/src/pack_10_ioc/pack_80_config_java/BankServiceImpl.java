package pack_10_ioc.pack_80_config_java;

public class BankServiceImpl implements BankService {

	private CustomerService customerService;
	private BillPaymentService billPaymentService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public void setBillPaymentService(BillPaymentService billPaymentService) {
		this.billPaymentService = billPaymentService;
	}	

	public BillPaymentService getBillPaymentService() {
		return billPaymentService;
	}
	
	public CustomerService getCustomerService() {
		return customerService;
	}
	
	public void myBankService(){
		System.out.println("Bank Service.");
	}
}
