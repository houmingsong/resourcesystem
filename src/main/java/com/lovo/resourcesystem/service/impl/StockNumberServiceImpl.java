package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lovo.resourcesystem.dao.StockNumberDao;
import com.lovo.resourcesystem.entity.StockNumberEntity;
import com.lovo.resourcesystem.service.StockNumberService;
@Service(value="stockNumberService")
public class StockNumberServiceImpl implements StockNumberService{
	@Autowired 
	private  StockNumberDao stockNumberDao;
	@Override
	public List<StockNumberEntity> stockNumberFind() {			
		return stockNumberDao.stockNumberFind();
	}
	
	@Override
	public void stockNumberCarRevise(Integer resourceStocks, Integer useCar) {
		// TODO Auto-generated method stub
		stockNumberDao.stockNumberCarRevise(resourceStocks, useCar);
	}

	@Override
	public void stockNumberPersonRevise(Integer resourceStocks, Integer usePerson) {
		// TODO Auto-generated method stub
		stockNumberDao.stockNumberPersonRevise(resourceStocks, usePerson);
	}

	@Override
	public void stockNumberDoctor(Integer resourceStocks, Integer totalPerson) {
		// TODO Auto-generated method stub
		stockNumberDao.stockNumberDoctor(resourceStocks, totalPerson);
	}

	@Override
	public void stockNumberCar(Integer resourceStocks, Integer otalCar) {
		// TODO Auto-generated method stub
		stockNumberDao.stockNumberCar(resourceStocks, otalCar);
	}


}
