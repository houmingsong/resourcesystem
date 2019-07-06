package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.CashStatementDao;
import com.lovo.resourcesystem.entity.CashStatementEntity;
import com.lovo.resourcesystem.service.CashStatementService;
@Service(value="cashStatementService")
public class CashStatementServiceImpl implements CashStatementService{

	@Autowired 
	private  CashStatementDao cashStatementDao;
	
	
	@Override
	public void cashStatementAdd(CashStatementEntity cashStatement) {
		// TODO Auto-generated method stub
		cashStatementDao.cashStatementAdd(cashStatement);
	}

	@Override
	public void cashStatementdelete(Integer id) {
		// TODO Auto-generated method stub
		cashStatementDao.cashStatementdelete(id);
	}

	@Override
	public List<CashStatementEntity> cashStatementFinda() {
		// TODO Auto-generated method stub
		List<CashStatementEntity> list = null;
		
		list = cashStatementDao.cashStatementFinda();
		
		return list;
	}

	@Override
	public List<CashStatementEntity> cashStatementFindb(String state) {
		// TODO Auto-generated method stub
		List<CashStatementEntity> list = null;
		list=cashStatementDao.cashStatementFindb(state);
		return list;
	}

	@Override
	public void cashStatementRevise(Integer id,String state) {
		// TODO Auto-generated method stub
		cashStatementDao.cashStatementRevise(id,state);
	}


	@Override
	public String findPhone(String name) {
		
		return cashStatementDao.findPhone(name);
	}

	@Override
	public String findHeadName(Integer inventoriesId) {
		return cashStatementDao.findHeadName(inventoriesId);
	}

	@Override
	public Integer finDoctorNum(String state) {
		// TODO Auto-generated method stub
		Integer a =   cashStatementDao.finDoctorNum(state);
		
		
		return a;
	}

	@Override
	public void updateState(String state, String name) {
		cashStatementDao.updateState(state, name);
		
	}

}
