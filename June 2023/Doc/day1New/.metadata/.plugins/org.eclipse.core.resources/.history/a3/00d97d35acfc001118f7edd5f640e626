package pack_10_ioc.pack_20_depend_inject.pack10setter_construct;


public class EmpBean {
	private int empNo;
	private String empNm;
	private float empSal;
	
	private Address add;
	
	static int nextEmpNo = 0;
	
	public EmpBean(){
		this(null);
	}
	
	// Constructor for Constructor Injection
	public EmpBean(Address add){
		empNo = ++nextEmpNo;
		this.add = add;
	}
	
	// Setter methods
		public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	// The Setter method for Setter Injection
	public void setAddress(Address add){
		this.add = add;
	}
	
	
	public Address getAddress(){
		return add;
	}
	
	@Override
    public String toString() {
        String str1 = String.format("Id: %d\nName: %s\nBasic: %f\n",
                this.empNo, this.empNm, this.empSal);
        String str2 = add.toString();
        
        return str1+str2;
    }
}
