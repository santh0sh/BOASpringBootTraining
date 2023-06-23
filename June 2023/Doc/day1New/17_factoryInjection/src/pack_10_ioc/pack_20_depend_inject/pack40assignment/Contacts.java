package pack_10_ioc.pack_20_depend_inject.pack40assignment;

public class Contacts {
	private String phoneno;
	
	public Contacts(String phoneno){
		this.phoneno = phoneno;
	}

	@Override
	public String toString(){
		return "\nPhone no:"+phoneno;
	}
}
