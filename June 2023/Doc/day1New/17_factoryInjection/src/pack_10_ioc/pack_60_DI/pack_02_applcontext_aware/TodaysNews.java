package pack_10_ioc.pack_60_DI.pack_02_applcontext_aware;

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
