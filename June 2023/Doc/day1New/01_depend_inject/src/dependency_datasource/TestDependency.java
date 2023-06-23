package dependency_datasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Wiring in XML.
 * 		Needs explicit declaration
 * 		If given autowire='byName' then property name of EmpDao and reference name of db_config.xml must match.
 * 		If given autowire='byType' then prop name and ref name can be different but there must be one entry of the type in XML.
 */
public class TestDependency {
	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext(
        "context01.xml");
		
		EmpDao emp = (EmpDao) beanFact.getBean("emp_list");
	
		for(EmpPojo l : emp.getAllEmps()){
			System.out.println(l);
		}
	}
}