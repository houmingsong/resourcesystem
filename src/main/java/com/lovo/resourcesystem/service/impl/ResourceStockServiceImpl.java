package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.ResourceStockDao;
import com.lovo.resourcesystem.entity.ResourceStockEntity;
import com.lovo.resourcesystem.service.ResourceStockService;

@Service(value = "resourceStockService")
public class ResourceStockServiceImpl implements ResourceStockService {

	@Autowired
	private ResourceStockDao resourceStockDao;

	@Override
	public void resourceStockAdd(ResourceStockEntity r) {
		resourceStockDao.resourceStockAdd(r);
	}

	@Override
	public void resourceStockdelete(Integer id) {
		resourceStockDao.resourceStockDelete(id);

	}

	@Override
	public List<ResourceStockEntity> resourceStockFind( String state, Integer currentPage) {
		currentPage=(currentPage-1)*5;
		List<ResourceStockEntity> resourceStockList = resourceStockDao.resourceStockFind(state, currentPage);
		return resourceStockList;
	}

	@Override
	public void resourceStockRevise(String state, Integer id) {
		resourceStockDao.resourceStockRevise(state, id);

	}

	@Override
	public int getTotalPageByItem(@Param(value="state")String state) {
		Integer totalCount = resourceStockDao.getTotalPageByItem(state);
		Integer totalPage = (totalCount + 5 - 1) / 5;
		return totalPage;
	}

	@Override
	public String findStateById(Integer id) {
		
		return resourceStockDao.findStateById(id);
	}

	@Override
	public List<ResourceStockEntity> findCar(String state) {
		return resourceStockDao.findCar(state);
	}

	@Override
	public String findPlateNumber(Integer resourceStocks) {
		return resourceStockDao.findPlateNumber(resourceStocks);
	}

	@Override
	public Integer finCarNum(String state) {
		// TODO Auto-generated method stub
		return resourceStockDao.finCarNum(state);
	}

	@Override
	public void updateState(String state, String plateNumber) {
		resourceStockDao.updateState(state, plateNumber);
		
	}

	
	


}
