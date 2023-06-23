package demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyConfigure {
	@Bean(name="fda")
	public FDAccountCalculator fda(){
		return new FDAccountCalculator();
	}
	@Bean(name="service",autowire=Autowire.BY_NAME)
	 
	public CalculatorService cs(){
		
		return new CalculatorService();
	}
	
}
