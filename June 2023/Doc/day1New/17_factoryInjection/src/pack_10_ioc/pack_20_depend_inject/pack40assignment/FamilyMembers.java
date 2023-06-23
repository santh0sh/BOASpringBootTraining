package pack_10_ioc.pack_20_depend_inject.pack40assignment;

import java.util.Collection;
import java.util.Map;

public class FamilyMembers {
	private Map mp;
	
	public FamilyMembers(Map mp) {
		this.mp = mp;
	}
		
	@Override
    public String toString() {
		Collection<String> con = mp.values();
		String str="\nFamily Members\n";
		for(String s:con)
			str+=(s+",");
        return str;
    }
}
