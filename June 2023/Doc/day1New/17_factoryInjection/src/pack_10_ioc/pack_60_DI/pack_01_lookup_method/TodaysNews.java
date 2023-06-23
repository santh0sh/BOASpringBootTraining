package pack_10_ioc.pack_60_DI.pack_01_lookup_method;

public class TodaysNews {
	
	static int newsNumber=0;
	String todaysNews="Hockey India Federation's Elections in Limbo";
	
	public TodaysNews(){
		newsNumber++;
	}
	
	public String getNews(){
		return newsNumber+" "+todaysNews;
	}
}
