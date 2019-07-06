package resourcesystem;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.entity.StockNumberEntity;
import com.lovo.resourcesystem.service.CashStatementService;
import com.lovo.resourcesystem.service.ResourceInfoService;
import com.lovo.resourcesystem.service.ResourceStockService;
import com.lovo.resourcesystem.service.StockNumberService;

public class ResourceStockTest {

	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {

		app = new ClassPathXmlApplicationContext("application.xml");
	}

	@Test
	public void resourceStockAdd() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		ResourceStockEntity b = new ResourceStockEntity();
		b.setPlateNumber("ae86");
		b.setState("在线");
		a.resourceStockAdd(b);
	}

	@Test
	public void resourceStockDelete() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		a.resourceStockdelete(1);
	}

	@Test
	public void resourceStockFind() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		System.out.println(a.resourceStockFind(null, 1));
	}

	@Test
	public void resourceStockRevise() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		a.resourceStockRevise("出勤", 2);
	}

	@Test
	public void getTotalPageByItem() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		System.out.println(a.getTotalPageByItem("出勤"));
	}

	@Test
	public void findStateById() {
		ResourceStockService a = (ResourceStockService) app.getBean("resourceStockService");
		System.out.println(a.findStateById(2));
	}

	@Test
	public void findPhone() {
		CashStatementService a = (CashStatementService) app.getBean("cashStatementService");
		System.out.println(a.findPhone("李四"));
	}

	@Test
	public void dispatchHead() {
		ResourceInfoService a = (ResourceInfoService) app.getBean("resourceInfoService");
//		System.out.println(a.dispatchHead(1, "执勤", 2));
	}
	
	@Test
	public void stockNumberFind() {
		StockNumberService a = (StockNumberService) app.getBean("stockNumberService");
		System.out.println(a.stockNumberFind());
	}
	
	
	
}
