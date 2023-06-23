package pack_10_ioc.pack_20_depend_inject.pack30scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("familymember")
@Scope("singleton")
public class FamilyMember {
	private String name;
	private String relation;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getRelation() {
		return relation;
	}

	@Override
    public String toString() {
		String str=name+" "+"is a "+relation;
        return str;
    }
}
