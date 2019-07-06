package com.lovo.resourcesystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lovo.resourcesystem.dao.ResourceInfoDao;
import com.lovo.resourcesystem.entity.ResourceInfoEntity;
import com.lovo.resourcesystem.service.ResourceInfoService;
@Service("resourceInfoService")
public class ResourceInfoServiceImpl implements ResourceInfoService{
	
	@Autowired
	private ResourceInfoDao resourceInfoDao;
	@Override
	public void resourceInfoEntityAdd(ResourceInfoEntity resourceInfo) {
		resourceInfoDao.resourceInfoEntityAdd(resourceInfo);
		
	}

	@Override
	public List<ResourceInfoEntity> resourceInfoEntityFind(Integer currpage) {
		currpage=(currpage-1)*5;
		return resourceInfoDao.resourceInfoEntityFind(currpage);
	}


	@Override
	public String dispatchHead(String eventSourceId,String state,Integer headId) {
		return resourceInfoDao.dispatchHead(eventSourceId,state,headId);
	}

	

	@Override
	public void retrieve(String state, String backDate, Integer id) {
		resourceInfoDao.retrieve(state, backDate, id);
		
	}

	@Override
	public List<ResourceInfoEntity> resourceInfoEntityFinda(String state,String eventSourceId) {
		return resourceInfoDao.resourceInfoEntityFinda(state,eventSourceId);
	}


	

	

	

	

}
