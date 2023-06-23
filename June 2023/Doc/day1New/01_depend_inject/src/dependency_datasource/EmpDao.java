package dependency_datasource;

/*
 * With @Component annotation at class level, the bean may not be declared within XML.
 * 	The @Component without name of a bean does not pickup class name by default
 * 
 * With @Autowire without qualifier autowiring on type.
 * 								    
 * With @Resource without Ref name autowirs on type.
 * 
 * If autowiring on type is not working as XML has more than one entries of DataSource for different databases,
 * 	then no way than going for name.
 * For @Resource specify name as parameter
 * For @Autowire, use Qualifier clause.
 */
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

//@Repository("emp_list")
public class EmpDao {
	private DataSource ds;
	
	// Setter methods
	// @Resource(name="dataSourceRef")  // Autowires on name of set method by default
	// @Autowired@Qualifier("dataSourceRef")
	// @Autowired  // Goes with the type.
	public void setDataSourceRef(DataSource ds) {
		this.ds = ds;
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
