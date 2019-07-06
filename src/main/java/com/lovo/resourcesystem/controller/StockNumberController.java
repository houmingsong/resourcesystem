package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovo.resourcesystem.entity.StockNumberEntity;
import com.lovo.resourcesystem.service.CashStatementService;
import com.lovo.resourcesystem.service.ResourceStockService;
import com.lovo.resourcesystem.service.StockNumberService;

@Controller
@RequestMapping("StockNumber")
public class StockNumberController {

	@Autowired
	private StockNumberService stockNumberService;

	@Autowired
	private CashStatementService cashStatementService;

	@Autowired
	private ResourceStockService resourceStockService;

	/**
	 * 展示所有资源
	 */
	@RequestMapping("/StockNumber.lovo")
	@ResponseBody
	public List<StockNumberEntity> StockNumberFind() {

		Integer doctorNum = cashStatementService.finDoctorNum("在线");
		stockNumberService.stockNumberPersonRevise(1, doctorNum);

		Integer doctorNuma = cashStatementService.finDoctorNum("出勤");

		Integer doctorNums = doctorNum + doctorNuma;

		stockNumberService.stockNumberDoctor(1, doctorNums);

		Integer CarNum = resourceStockService.finCarNum("在线");
		stockNumberService.stockNumberCarRevise(1, CarNum);

		Integer CarNuma = resourceStockService.finCarNum("出勤");

		Integer CarNums = CarNuma + CarNum;
		stockNumberService.stockNumberCar(1, CarNums);

		List<StockNumberEntity> list = null;
		list = stockNumberService.stockNumberFind();

		return list;

	}

}
