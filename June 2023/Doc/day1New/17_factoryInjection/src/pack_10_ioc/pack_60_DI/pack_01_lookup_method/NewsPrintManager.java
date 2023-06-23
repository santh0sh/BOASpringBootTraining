package pack_10_ioc.pack_60_DI.pack_01_lookup_method;

public abstract class NewsPrintManager {
	
	public abstract TodaysNews getNewsFeeder();// Dependency Injection
	
	public void printNews(){
		TodaysNews dtNews = getNewsFeeder();  
		System.out.println(dtNews.getNews());
	}
}
