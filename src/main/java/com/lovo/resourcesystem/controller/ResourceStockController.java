package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lovo.resourcesystem.entity.CutPageBean;
import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.service.ResourceStockService;
import com.lovo.resourcesystem.service.StockNumberService;

@Controller
public class ResourceStockController {
	
	@Autowired
	private ResourceStockService resourceStock;
	
	@Autowired 
	private StockNumberService stockNumberService;
	
	@RequestMapping("show.lovo")
	@ResponseBody
	public CutPageBean<ResourceStockEntity> findAllCar(String state ,Integer currPage){
		//获取总页数
		if("".equals(state)) {
			state=null;
		}
		Integer totalPage = resourceStock.getTotalPageByItem(state);
		
		if (currPage < 1 ) {//判断当前页是否小于1
			currPage = 1;
		}
		else if (currPage > totalPage) {//判断当前页是否小于是否大于总页数
			currPage = totalPage;
		}
		CutPageBean<ResourceStockEntity> pageBean = new CutPageBean<ResourceStockEntity>();
		
		List<ResourceStockEntity> userList = resourceStock.resourceStockFind(state, currPage);
		pageBean.setDataList(userList);
		pageBean.setCurrPage(currPage);
		pageBean.setTotalPage(totalPage);
		return pageBean;
	}
	
	@RequestMapping("del.lovo")
	public ModelAndView delCar(Integer resourceStocks) {
		ModelAndView mv = new ModelAndView("resourcemanagement/carManagement");
		resourceStock.resourceStockdelete(resourceStocks);
		
		Integer a =  resourceStock.finCarNum("在线");
		Integer b = resourceStock.finCarNum("出勤");
		 Integer c = a+b;
		 stockNumberService.stockNumberCar(1, c);
		 stockNumberService.stockNumberCarRevise(1, a);
		 
		 
		return mv;		
	}
	
	@RequestMapping("update.lovo")
	public ModelAndView update(Integer currPage,Integer resourceStocks,ResourceStockEntity resourceStockEntity) {
		ModelAndView mv = new ModelAndView("resourcemanagement/carManagement");
		String a = resourceStock.findStateById(resourceStocks);	
			if("出勤".equals(a)) {
				resourceStock.resourceStockRevise("在线", resourceStocks);			
			}else{
				resourceStock.resourceStockRevise("出勤", resourceStocks);
			}
		return mv;		
	}
	
	@RequestMapping("addCar.lovo")
	public ModelAndView update(String plateNumber,ResourceStockEntity r) {
		ModelAndView mv = new ModelAndView("resourcemanagement/carManagement");
		Integer CarNum = resourceStock.finCarNum("在线");
		Integer CarNuma = CarNum+1;
		
		r.setState("在线");
		r.setPlateNumber(plateNumber);
		resourceStock.resourceStockAdd(r);
		stockNumberService.stockNumberCarRevise(1, CarNuma);
		return mv;		
	}
}
