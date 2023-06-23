package pack_10_ioc.pack_10_accessbean.packsimplebean;

public class EmpBean{
	private int empNo;
	private String empNm;
	private float empSal;
	
	static int nextEmpNo = 0;
	
	// Initializer block and Constructors
	{	empNo = ++nextEmpNo;
	}
	
	public EmpBean(){
		this.empNm = "Unknown";
		System.out.println("In no-args Constructor.");
	}
	
	public EmpBean(String empNm){
		this.empNm = empNm;
		empSal = 0.0f;
		System.out.println("In One Para Constructor.");
	}
	
	public EmpBean(String empNm, float empSal){
		this.empNm = empNm;
		this.empSal = empSal;
		System.out.println("In Two Para Constructor.");
	}
	
	// Setter methods
		public void setEmpNm(String empNm) {
		this.empNm = empNm;
		System.out.println("In empNm setter.");
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
		System.out.println("In empSal setter.");
	}

	@Override
    public String toString() {
        return String.format("Id: %d\nName: %s\nBasic: %f\n",
                this.empNo, this.empNm, this.empSal);
    }
}
