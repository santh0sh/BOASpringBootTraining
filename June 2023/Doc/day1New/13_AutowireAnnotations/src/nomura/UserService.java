package nomura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ser")

public class UserService {

	
	
	@Autowired
@Qualifier("db")
	private Userdao usr;
	
	public UserService(Userdao usr){
		this.usr=usr;
	}
	
	public UserService(){
		
	}
	
	public void service(){
	usr.add();
		
	}
	
	
}
