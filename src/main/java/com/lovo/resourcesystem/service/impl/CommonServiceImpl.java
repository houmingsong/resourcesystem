package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.ICommonDao;
import com.lovo.resourcesystem.entity.CommonEntity;
import com.lovo.resourcesystem.service.ICommonService;

@Service(value="commonService")
public class CommonServiceImpl implements ICommonService{
	
	@Autowired
	private ICommonDao com;
	
	@Override
	public void add(CommonEntity common) {
		// TODO Auto-generated method stub
		com.add(common);
	}

	@Override
	public void updateCommon(CommonEntity common) {
		// TODO Auto-generated method stub
		com.updateCommon(common);
	}

	@Override
	public void deleteById(Integer commonId) {
		// TODO Auto-generated method stub
		com.deleteById(commonId);
	}

	@Override
	public List<CommonEntity> findarea(String type) {
		return com.findarea(type);
	}

}
