package pack_10_ioc.pack_20_depend_inject.pack30scopes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestDependency {
	public static void main(String[] args) {
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource(
        "pack_10_ioc\\pack_20_depend_inject\\pack30scopes\\context.xml"));
		
		EmpBean emp = (EmpBean) beanFact.getBean("employee");
		FamilyMember fm1 = (FamilyMember)beanFact.getBean("familymember");
		fm1.setName("Shubham");
		fm1.setRelation("Elder son");
		
		FamilyMember fm2 = (FamilyMember)beanFact.getBean("familymember");
		fm2.setName("Shubham");
		fm2.setRelation("Elder son");
		
		if (fm1 == fm2)
			System.out.println("The FamilyMember object is singleton.");
		else
			System.out.println("The FamilyMember object is prototype.");
		
		emp.addFamilyMember(fm1);
		emp.addFamilyMember(fm2);
		
		FamilyMember fm = emp.getMember("Shubham");
		fm.setName("Shaunak");
		fm.setRelation("Younger son");
		
		System.out.println("List of members after changes.");
		System.out.println(emp);
	}
}
