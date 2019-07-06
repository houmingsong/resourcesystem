package resourcesystem;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.service.AcceptNeService;

public class AcceptNewsTest {
	
	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {

		app = new ClassPathXmlApplicationContext("application.xml");
	}
	
	@Test
	public void acceptNewsFind() {
		AcceptNeService a = (AcceptNeService) app.getBean("acceptNeService");
		AcceptNewsEntity c=new AcceptNewsEntity();
		c.setArea("asd");
		c.setCarnumber(2);
		c.setEventName("asd");
		c.setEventSourceId("asdasdasd");
		c.setId(1);
		c.setLevel("一级");
		c.setNumberpeople(2);
		c.setSite("很远很远");
		c.setState("未处理");
		c.setType("火灾");
		a.add(c);
	}
	
	@Test
	public void getTotalPageByItem() {
		AcceptNeService a = (AcceptNeService) app.getBean("acceptNeService");
		System.out.println(a.getTotalPageByItem());
	}
}
