package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lovo.resourcesystem.dao.IPowerDao;
import com.lovo.resourcesystem.entity.PowerEntity;
import com.lovo.resourcesystem.service.IPowerService;


@Repository("powerService")
public class PowerServiceImpl implements IPowerService{
	
	@Autowired
	private IPowerDao powerDao;
	@Override
	public void add(PowerEntity power) {
		// TODO Auto-generated method stub
		powerDao.add(power);
	}

	@Override
	public void delete(Integer powerId) {
		// TODO Auto-generated method stub
		powerDao.delete(powerId);
	}

	@Override
	public List<PowerEntity> findByCharacterIdHave(Integer characterId) {
		// TODO Auto-generated method stub
		return powerDao.findByCharacterId(characterId);
	}
	@Override
	public List<PowerEntity> findByCharacterIdNoHave(Integer characterId) {
		// TODO Auto-generated method stub
		List<PowerEntity> all=powerDao.findAll();
		List<PowerEntity> have=powerDao.findByCharacterId(characterId);
		for (int i = 0; i < have.size(); i++) {
			for (int j = 0; j < all.size(); j++) {
				if(have.get(i).getId()==all.get(j).getId()) {
					all.remove(j);
					break;
				}
			}
		}
		return all;
	}

	@Override
	public List<PowerEntity> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return powerDao.findByUserId(userId);
	}

}
