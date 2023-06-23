package pack_10_ioc.pack_70_namespace.pack_03_property_placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyPlaceholder {
	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_03_property_placeholder\\context01.xml");
		
		EmpDao emp = (EmpDao) beanFact.getBean("emp_list");
	
		for(EmpPojo l : emp.getAllEmps()){
			System.out.println(l);
		}
	}
}
