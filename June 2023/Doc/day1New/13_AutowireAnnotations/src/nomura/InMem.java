package nomura;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("inmem")
//@Primary
public class InMem implements Userdao {

	@Override
	public void add() {
		System.out.println("user added");

	}

}
