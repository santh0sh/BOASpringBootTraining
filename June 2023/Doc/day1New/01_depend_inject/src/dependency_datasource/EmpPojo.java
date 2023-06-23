package dependency_datasource;

public class EmpPojo {
	private int empNo;
	private String empNm;
	private float empSal;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	@Override
	public String toString(){
		return "Emp Id: "+empNo+"    Name: "+empNm+"   Salary:"+empSal;
	}
}