package nomura;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("db")
//@Primary
public class DbDao implements Userdao {

	@Override
	public void add() {
		System.out.println("user added");

	}

}
