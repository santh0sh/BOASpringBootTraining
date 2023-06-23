package pack_10_ioc.pack_30_initcollection.pack30collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PragatiSoftware {
	private Map branches;  // Map to Addresses
	private List cliental;  // List of client details
	private Set directors;	// List of directors and contact numbers
	
	private Properties contactEmails;
	private Properties serverIps;
	
	public Map getBranches() {
		return branches;
	}
	public void setBranches(Map branches) {
	this.branches = branches;
	}
	
	public List getCliental() {
		return cliental;
	}
	public void setCliental(List cliental) {
	this.cliental = cliental;
	}
	
	public Set getDirectors() {
		return directors;
		}
	public void setDirectors(Set directors) {
		this.directors = directors;
		}
		
	public Properties getContactEmails() {
		return contactEmails;
	}
	public void setContactEmails(Properties contactEmails) {
		this.contactEmails = contactEmails;
	}
	
	public Properties getServerIps() {
		return serverIps;
	}
	public void setServerIps(Properties serverIps) {
		this.serverIps = serverIps;
	}
	
	@Override
	public String toString(){
		StringBuffer str=new StringBuffer();
		
		// Collecting information from Map
		str.append("\nBranches data from Map...");
		Set s = branches.entrySet();
		for(Object o:s){
			Map.Entry e = (Map.Entry)o;
			str.append("\n\tParaKey:"+e.getKey()+" ParaVal:"+e.getValue());
		}
		
		// Collecting information from List
		str.append("\n\nClient data from List...");
		for(Object a:cliental){
			str.append(a.toString());
		}
		
		// Collecting information from Set
		str.append("\n\nDirectors...");
		for(Object a:this.directors){
			str.append("\n"+a.toString());
		}
		
		// Collecting information from Admin Properties
		str.append("\n\nContact Properties...");
		Set ss = contactEmails.entrySet();
		for(Object o:ss){
			Map.Entry e = (Map.Entry)o;
			str.append("\n\tParaKey:"+e.getKey()+" ParaVal:"+e.getValue());
		}
		
		// Collecting information from Pragati Properties
		str.append("\n\nServer Properties...");
		ss = serverIps.entrySet();
		for(Object o:ss){
			Map.Entry e = (Map.Entry)o;
			str.append("\n\tParaKey:"+e.getKey()+" ParaVal:"+e.getValue());
		}
		
		
		
		return str.toString()+"\n";
	}
}
