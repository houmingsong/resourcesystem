package com.lovo.resourcesystem.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.entity.CashStatementEntity;
import com.lovo.resourcesystem.entity.ResourceInfoEntity;
import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.entity.StockNumberEntity;
import com.lovo.resourcesystem.entity.ToDispatchEntity;
import com.lovo.resourcesystem.service.AcceptNeService;
import com.lovo.resourcesystem.service.AmqSenderService;
import com.lovo.resourcesystem.service.CashStatementService;
import com.lovo.resourcesystem.service.ResourceInfoService;
import com.lovo.resourcesystem.service.ResourceStockService;
import com.lovo.resourcesystem.service.StockNumberService;

@Controller
public class TeamController {
	@Autowired
	private AcceptNeService acceptNeService;
	@Autowired
	private ResourceInfoService resourceInfoService;

	@Autowired
	private CashStatementService cashStatementService;

	@Autowired
	private ResourceStockService resourceStockService;

	@Autowired
	private StockNumberService stockNumberService;
	@Autowired
	private AmqSenderService amqSenderService;
	
	@RequestMapping("addteam.lovo")
	public ModelAndView addteam(Integer id) {
		ModelAndView mv = new ModelAndView("dispatch/resourceDispatch");
		AcceptNewsEntity a = acceptNeService.findById(id);
		mv.addObject("a", a);
		return mv;

	}

	@RequestMapping("finda.lovo")
	@ResponseBody
	public List<CashStatementEntity> finda() {
		List<CashStatementEntity> list = cashStatementService.cashStatementFindb("在线");
		return list;
	}

	@RequestMapping("findcar.lovo")
	@ResponseBody
	public List<ResourceStockEntity> findcar() {
		return resourceStockService.findCar("在线");
	}

	@RequestMapping("showteam.lovo")
	public ModelAndView showteam(String sjbh, String[] kk, String[] oo, HttpServletRequest rq) {
		ModelAndView mv = new ModelAndView("dispatch/dispatchRecovery");
		acceptNeService.updateState("处理中",sjbh);
		ResourceInfoEntity a = new ResourceInfoEntity();
		String c = rq.getParameter("boss");
		if (oo == null || oo.length == 0) {
				
		}
		String name=null;
		String duty=null;
		String dutyTel=null;
		String phone=null;
		duty = resourceInfoService.dispatchHead(sjbh, "出勤", Integer.parseInt(kk[0]));
		
		dutyTel = cashStatementService.findPhone(duty);
		for (String string : kk) {
			cashStatementService.cashStatementRevise(Integer.parseInt(string), "出勤");
			a.setEventSourceId(sjbh);
			a.setState("出勤");
			a.setType("医生");
			a.setResourceName(cashStatementService.findHeadName(Integer.parseInt(string)));
			if (string.equals(c)) {
				a.setHeadId(Integer.parseInt(c));
			} else {
				a.setHeadId(null);
			}
			resourceInfoService.resourceInfoEntityAdd(a);
			//像调度发送 派遣详情
			ToDispatchEntity t=new ToDispatchEntity();
			t.setDutyPerson(duty);
			t.setPhone(dutyTel);
			t.setEventSourceId(a.getEventSourceId());
			t.setOutDate(a.getOutDate());
			t.setResourceName(a.getResourceName());
			t.setState("出勤");
			t.setType(a.getType());
			amqSenderService.sendOverMessage1(t);
		}
		for (String string : oo) {
			resourceStockService.resourceStockRevise("出勤", Integer.parseInt(string));

			a.setEventSourceId(sjbh);
			a.setState("出勤");
			a.setType("救护车");
			a.setResourceName(resourceStockService.findPlateNumber(Integer.parseInt(string)));
			resourceInfoService.resourceInfoEntityAdd(a);
			//像调度发送 派遣详情
			ToDispatchEntity t=new ToDispatchEntity();
			t.setDutyPerson(duty);
			t.setPhone(dutyTel);
			t.setEventSourceId(a.getEventSourceId());
			t.setOutDate(a.getOutDate());
			t.setResourceName(a.getResourceName());
			t.setState("出勤");
			t.setType(a.getType());
			amqSenderService.sendOverMessage1(t);
		}
		List<StockNumberEntity> list = stockNumberService.stockNumberFind();
		for (StockNumberEntity stockNumberEntity : list) {
			// 可用车辆
			Integer useCar = stockNumberEntity.getUseCar();
			int cd = oo.length;
			// 剩余可用车辆
			int surplusVehicle = useCar - cd;
			// 修改剩余可用车辆
			stockNumberService.stockNumberCarRevise(1, surplusVehicle);
		}
		
		List<StockNumberEntity> list2 = stockNumberService.stockNumberFind();
		for (StockNumberEntity stockNumberEntity : list2) {
			// 可用人数
			Integer usePerson = stockNumberEntity.getUsePerson();
			int cd = kk.length;
			// 剩余可用人数
			int surplusNumber = usePerson - cd;
			// 修改剩余可用人数
			stockNumberService.stockNumberPersonRevise(1, surplusNumber);
		}
		return mv;
	}

	@RequestMapping("resourceInfoEntityFinda.lovo")
	@ResponseBody
	public PageInfo resourceInfoEntityFinda(String type,String eventNumber, Integer currPage) {
		if("".equals(type)) {
			type=null;
		}
		if("".equals(eventNumber)) {
			eventNumber=null;
		}
		// 设置分页条件，Parameters:pageNum 页码pageSize 每页显示数量count 是否进行count查询
		PageHelper.startPage(currPage, 5, true);
		PageHelper.orderBy("f_state");
		List<ResourceInfoEntity> eventList = resourceInfoService.resourceInfoEntityFinda(type, eventNumber);
		// 分页插件的bean 传入动态查询的集合
		PageInfo<ResourceInfoEntity> page = new PageInfo<ResourceInfoEntity>(eventList);		
		return page;
	}

	@RequestMapping("retturn.lovo")
	public ModelAndView retrieve(Integer id, String resourceName,String eventSourceId) {
		ModelAndView mv = new ModelAndView("dispatch/dispatchRecovery");
		String backDate = System.currentTimeMillis()+"";
		resourceInfoService.retrieve("在线", backDate, id);
		resourceStockService.updateState("在线", resourceName);
		cashStatementService.updateState("在线", resourceName);
		Integer a = cashStatementService.finDoctorNum("在线");
		Integer b = resourceStockService.finCarNum("在线");
		stockNumberService.stockNumberPersonRevise(1, a);
		stockNumberService.stockNumberCarRevise(1, b);
		List<ResourceInfoEntity> list = resourceInfoService.resourceInfoEntityFinda("在线", eventSourceId);
		for (ResourceInfoEntity resourceInfoEntity : list) {
			ToDispatchEntity t=new ToDispatchEntity();
			t.setEventSourceId(resourceInfoEntity.getEventSourceId());
			t.setState("在线");
			t.setBackDate(backDate);
			t.setType(resourceInfoEntity.getType());
			t.setResourceName(resourceName);
			String name = resourceInfoService.dispatchHead(id.toString(), "出勤", resourceInfoEntity.getId());
			String phone = cashStatementService.findPhone(name);
			t.setDutyPerson(name);
			t.setPhone(phone);
			amqSenderService.sendOverMessage1(t);
			
		}
		
//		acceptNeService.updateState("已处理",id);
		return mv;
	}
}
