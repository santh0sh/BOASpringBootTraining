package pack_10_ioc.pack_70_namespace.pack_02_p;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("emp_list")
public class EmpDao {
	private DataSource ds;
	private EmpPojo p;
	// Setter methods
	//@Resource(name="dataSource")
	//@Autowired@Qualifier("dataSource")
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	public void setEmpPojo(EmpPojo j){
		this.p = j;
		System.out.println("In empPojo "+j);
	}
	
	public List<EmpPojo> getAllEmps() {
		String qry = "Select EMPNO, ENAME, SAL from EMP";
		List<EmpPojo> l = new ArrayList<EmpPojo>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(qry);
			
			while(rs.next()){
				EmpPojo ep = new EmpPojo();
				ep.setEmpNo(rs.getInt("EMPNO"));
				ep.setEmpNm(rs.getString("ENAME"));
				ep.setEmpSal(rs.getFloat("SAL"));
				l.add(ep);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try { rs.close(); stmt.close(); conn.close(); } catch(Exception e) { }
		}
		
		return l;
	}
}
