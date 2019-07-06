package com.lovo.resourcesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.entity.CutPageBean;
import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.service.AcceptNeService;

@Controller
public class AcceptNewsController {

	@Autowired
	private AcceptNeService acceptNeService;

	@RequestMapping("showThing.lovo")
	@ResponseBody
	public CutPageBean<AcceptNewsEntity> showThing(AcceptNewsEntity acceptNewsEntity, Integer currPage) {
		Integer totalPage = acceptNeService.getTotalPageByItem();

		if (currPage < 1) {// 判断当前页是否小于1
			currPage = 1;
		} else if (currPage > totalPage) {// 判断当前页是否小于是否大于总页数
			currPage = totalPage;
		}
		CutPageBean<AcceptNewsEntity> pageBean = new CutPageBean<AcceptNewsEntity>();

		List<AcceptNewsEntity> list = acceptNeService.acceptNewsFind(currPage);

		pageBean.setDataList(list);
		pageBean.setCurrPage(currPage);
		pageBean.setTotalPage(totalPage);
		return pageBean;
	}

	/**
	 * 统计报表用
	 */
	@RequestMapping("numericalStatement.lovo")
	@ResponseBody
	public List<AcceptNewsEntity> numericalStatement() {

		List<AcceptNewsEntity> list = acceptNeService.acceptNewsFindEcharts();

		return list;
	}

}
