package pack_10_ioc.pack_60_DI.pack_03_object_factory;

import org.springframework.beans.factory.ObjectFactory;

public class NewsPrintManager {
	
	private ObjectFactory<TodaysNews> factory;
	
	public void setFactory(ObjectFactory<TodaysNews> factory) {
		this.factory = factory;
	}
	
	public void printNews(){
		TodaysNews dtNews = factory.getObject();
		System.out.println(dtNews.getNews());
	}
}
