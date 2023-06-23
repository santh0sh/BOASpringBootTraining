package demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.InterestCalculator;

public class CalculatorService {
	 
	private InterestCalculator ic;
	
	public InterestCalculator getIc() {
		return ic;
	}
	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	
	public double service(double amt){
		return ic.calculate(amt);
	}
}
