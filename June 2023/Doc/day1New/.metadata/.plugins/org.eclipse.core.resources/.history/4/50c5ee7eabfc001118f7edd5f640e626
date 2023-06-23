package pack_10_ioc.pack_20_depend_inject.pack40assignment;

public class EmpBean {
	private int empNo;
	private String empNm;
	private float empSal;
	private Address add;
	private Contacts cont;
	private FamilyMembers fam;
	
	static int nextEmpNo = 0;
	
	public EmpBean(){
		empNo = ++nextEmpNo;
	}
	
	// Setter methods
		public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	public void setAddress(Address add){
		this.add = add;
	}
	public Address getAddress(){
		return add;
	}
	
	public void setContact(Contacts con){
		this.cont = con;
	}
	
	public void setFamilyMembers(FamilyMembers fam){
		this.fam = fam;
	}
	
	public FamilyMembers getFamilyMembers(){
		return fam;
	}
	
	@Override
    public String toString() {
        String str1 = String.format("Id: %d\nName: %s\nBasic: %f\n",
                this.empNo, this.empNm, this.empSal);
        String str2 = add.toString();
        String str3 = cont.toString();
        String str4 = fam.toString();
        return str1+str2+str3+str4;
    }
}
