package exam2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
  
//@Component("customname")
@Component
public class CustomerService 
{
	@Autowired
	CustomerDAO customerDAO;
 
	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
}