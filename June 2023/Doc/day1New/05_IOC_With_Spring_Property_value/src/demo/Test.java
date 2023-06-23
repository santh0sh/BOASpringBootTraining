package demo;

 

 import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

 


public class Test {
	public static void main(String arg[]){
		
 		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfigure.class);
		 /*XmlBeanFactory ctx = new XmlBeanFactory
                 (new ClassPathResource("beans.xml"));*/
		CalculatorService cs=(CalculatorService)ctx.getBean("service");
		System.out.println(cs.service(10000));
		
		
	
	}
}
