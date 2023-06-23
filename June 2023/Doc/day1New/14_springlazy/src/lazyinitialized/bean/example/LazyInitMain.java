package lazyinitialized.bean.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitMain {

	public static void main(String args[]) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
		"context.xml");
		System.out.println("Initialization done when require");
		//beanfactory.getBean("addressBean");
	}
}
