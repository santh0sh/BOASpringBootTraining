package pack_10_ioc.pack_60_DI.pack_02_applcontext_aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class NewsPrintManager implements ApplicationContextAware {
	
	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext ctx)
	throws BeansException {
		this.ctx = ctx;
	}
	public void printNews(){
		
		TodaysNews dtNews = ctx.getBean("todays_news", TodaysNews.class);  
		System.out.println(dtNews.getNews());
	}


}
