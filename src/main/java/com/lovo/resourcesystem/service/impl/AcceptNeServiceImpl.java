package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.AcceptNewsDao;
import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.service.AcceptNeService;
@Service(value="acceptNeService")
public class AcceptNeServiceImpl implements AcceptNeService{

	@Autowired
	private AcceptNewsDao acceptNewsDao;

	@Override
	public List<AcceptNewsEntity> acceptNewsFind(Integer currentPage) {
		currentPage=(currentPage-1)*5;
		return acceptNewsDao.acceptNewsFind(currentPage);
	}

	@Override
	public int getTotalPageByItem() {
		Integer totalCount = acceptNewsDao.getTotalPageByItem();
		Integer totalPage = (totalCount + 5 - 1) / 5;
		return totalPage;
	}

	@Override
	public void add(AcceptNewsEntity acceptNewsEntity) {
		acceptNewsDao.add(acceptNewsEntity);
		
	}

	@Override
	public AcceptNewsEntity findById(Integer id) {
		return acceptNewsDao.findById(id);
	}

	@Override
	public List<AcceptNewsEntity> acceptNewsFindEcharts() {
		return acceptNewsDao.acceptNewsFindEcharts();
	}

	@Override
	public void updateState(String state,String eventSourceId) {
		acceptNewsDao.updateState(state,eventSourceId);
	}

	

}
