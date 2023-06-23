package container;

import java.util.HashMap;
import java.util.Map;

import com.model.FDAccountCalculator;
import com.model.SavingAccountInterestCalculator;
import com.service.CalculatorService;

public class InterestContainer {
	private Map<String,Object> components;
	public InterestContainer()
	{
		components=new HashMap<String, Object>();
		SavingAccountInterestCalculator s1=new SavingAccountInterestCalculator();
		components.put("s", s1);
		FDAccountCalculator fc=new FDAccountCalculator();
		components.put("f", fc);
		CalculatorService service=new CalculatorService();
		service.setIc(s1);
		components.put("service", service);
		
	}
	public Object getComponent(String s){
		return components.get(s);
	}
}
