package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovo.resourcesystem.entity.CashStatementEntity;
import com.lovo.resourcesystem.service.CashStatementService;
import com.lovo.resourcesystem.service.ResourceStockService;
import com.lovo.resourcesystem.service.StockNumberService;

/**
 * 医生管理
 * 
 * @author admin
 *
 */
@Controller
@RequestMapping("CashStatement")
public class CashStatementController {

	@Autowired
	private CashStatementService cashStatementService;

	@Autowired
	private StockNumberService stockNumberService;

	/**
	 * 展示医生
	 * 
	 * @return
	 */
	@RequestMapping("/CashStatement.lovo")
	@ResponseBody
	public PageInfo cashStatementFinda(Integer currPage) {
		// 设置分页条件，Parameters:pageNum 页码pageSize 每页显示数量count 是否进行count查询
		PageHelper.startPage(currPage, 5);
		List<CashStatementEntity> eventList = cashStatementService.cashStatementFinda();
		// 分页插件的bean 传入动态查询的集合
		PageInfo<CashStatementEntity> page = new PageInfo<CashStatementEntity>(eventList);
		return page;
	}

	/**
	 * 添加医生
	 * 
	 * @param name
	 * @param phone
	 * @return
	 */
	@RequestMapping("/CashStatementAdd.lovo")
	@ResponseBody
	public ModelAndView cashStatementAdd(String name, String phone) {
		ModelAndView mv = new ModelAndView("resourcemanagement/doctorAdd");
		Integer DotorNum = cashStatementService.finDoctorNum("在线");
		CashStatementEntity cashStatementEntity = new CashStatementEntity();
		cashStatementEntity.setName(name);
		cashStatementEntity.setPhone(phone);
		cashStatementEntity.setState("在线");
		cashStatementService.cashStatementAdd(cashStatementEntity);

		Integer DotorNuma = DotorNum + 1;

		stockNumberService.stockNumberCarRevise(1, DotorNuma);
		return mv;

	}

	@RequestMapping("/CashStatementdelet.lovo")
	@ResponseBody
	public ModelAndView CashStatementdelet(Integer InventoriesId) {
		ModelAndView mv = new ModelAndView("resourcemanagement/doctorManagement");

		cashStatementService.cashStatementdelete(InventoriesId);
		Integer a = cashStatementService.finDoctorNum("在线");
		Integer b = cashStatementService.finDoctorNum("出勤");
		Integer c = a + b;
		stockNumberService.stockNumberDoctor(1, c);
		stockNumberService.stockNumberPersonRevise(1, a);

		return mv;
	}
}
