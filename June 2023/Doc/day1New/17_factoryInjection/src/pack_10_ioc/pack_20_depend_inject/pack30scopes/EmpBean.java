package pack_10_ioc.pack_20_depend_inject.pack30scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
/*
 * Observe how @Scope annotation works
 */

@Service("employee")
@Scope("prototype")
public class EmpBean {
	private int empNo;
	private String empNm;
	private float empSal;
	
	private Collection<FamilyMember> fam;
	
	static int nextEmpNo = 0;
	
	public EmpBean(){
		empNo = ++nextEmpNo;
		fam = new ArrayList<FamilyMember>();
	}
	
	// Setter methods
		public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public  void addFamilyMember(FamilyMember fm){
		System.out.println("Object:"+fm.toString()+" added.");
		this.fam.add(fm);
	}
	
	public FamilyMember getMember(String name){
		for(FamilyMember fm:fam){
			if (fm.getName().equalsIgnoreCase(name))
				return fm;
		}
		return null;
	}
	
	@Override
    public String toString() {
        String str = String.format("Id: %d\nName: %s\nBasic: %f\n",
                this.empNo, this.empNm, this.empSal);
        str += "\nFamily Members:\n";
        for(FamilyMember f:fam){
        	str += f.getName()+" is a "+f.getRelation()+"\n";
        }
        
        return str;
    }
}
