package com.lovo.resourcesystem.text;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.resourcesystem.dao.CashStatementDao;
import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.entity.StockNumberEntity;
import com.lovo.resourcesystem.entity.UserEntity;
import com.lovo.resourcesystem.service.AcceptNeService;
import com.lovo.resourcesystem.service.CashStatementService;
import com.lovo.resourcesystem.service.ResourceStockService;
import com.lovo.resourcesystem.service.StockNumberService;
import com.lovo.resourcesystem.service.UserService;
/**
 * 业务层测试类
 * @author admin
 *
 */
public class CashStatementServiceImplText {
	ClassPathXmlApplicationContext app=null;
	@Before
	public void before(){

		app=new ClassPathXmlApplicationContext("application.xml");	
	}
		@Test
		public void cashStatementAdd() {
	
			ResourceStockService a    =    (ResourceStockService) app.getBean("resourceStockService");
	Integer b = 	a.finCarNum("在线");
	System.out.println(b);
		
		
	
//			
//			List<UserEntity> list  =	cashStatementService.userFind();
//			for (UserEntity userEntity : list) {
//				
//				System.out.println(userEntity);
//			}
			
			
//			cashStatementService.userDelete(1);
			
//			
//			UserEntity a = new UserEntity();
//			a.setUserName("茆观澜");
//			a.setPassword("123");
//			a.setSex("男");
//			a.setBirthday(new Date(System.currentTimeMillis()));
//			a.setTelephone("112233");
//			cashStatementService.userAdd(a);
//	
		}
	//	@Test
	//	public void cashStatementdelete() {
	//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
	//		cashStatementService.cashStatementdelete(5);
	//	}

	//	@Test
	//	public void cashStatementFinda() {
	//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
	//		List<CashStatementEntity> list =cashStatementService.cashStatementFinda();
	//		for (CashStatementEntity cashStatementEntity : list) {
	//			
	//			System.out.println(cashStatementEntity);
	//		}
	//	}

	//	@Test
	//	public void cashStatementFindb(){
	//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
	//		List<CashStatementEntity> list=cashStatementService.cashStatementFindb("出勤");
	//		for (CashStatementEntity cashStatementEntity : list) {
	//			System.out.println(cashStatementEntity);
	//		}
	//	}
	//	
	//	@Test
	//	public void cashStatementRevise() {
	//		CashStatementService cashStatementService =  (CashStatementService) app.getBean("cashStatementService");
	//		cashStatementService.cashStatementRevise(3,"出勤");
	//	}


//		@Test
//		public void cashStatementRevisea() {
//			StockNumberService stockNumberService =  (StockNumberService) app.getBean("stockNumberService");
//			List<StockNumberEntity> list =stockNumberService.stockNumberFind();
//			for (StockNumberEntity stockNumberEntity : list) {
//				System.out.println(stockNumberEntity);	
//			}
//		}

//	
//		@Test
//	public void cashStatementRevise() {
//		StockNumberService stockNumberService =  (StockNumberService) app.getBean("stockNumberService");
//		stockNumberService.stockNumberPersonRevise(1, 1);
//	}
	
	
//	
//	@Test
//	public void cashStatementRevise() {
//		AcceptNeService acceptNeService =  (AcceptNeService) app.getBean("acceptNeService");
//		
//		List<AcceptNewsEntity> list = acceptNeService.acceptNewsFind();
//		for (AcceptNewsEntity acceptNewsEntity : list) {
//			System.out.println(acceptNewsEntity);
//		}
//	
//	}
}

