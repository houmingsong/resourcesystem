package com.lovo.resourcesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.IUserCharacterDao;
import com.lovo.resourcesystem.entity.UserCharacterEntity;
import com.lovo.resourcesystem.service.IUserCharacterService;


@Service("userCharacterService")
public class UserChatacterServiceImpl implements IUserCharacterService{
	
	@Autowired
	private IUserCharacterDao usercharacterDao;
	@Override
	public void add(UserCharacterEntity userCharacter) {
		// TODO Auto-generated method stub
		usercharacterDao.add(userCharacter);
	}

	@Override
	public void update(UserCharacterEntity userCharacter) {
		// TODO Auto-generated method stub
		usercharacterDao.update(userCharacter);
	}

	@Override
	public void deleteByUserId(Integer userId) {
		// TODO Auto-generated method stub
		usercharacterDao.deleteByUserId(userId);
	}

	@Override
	public void deleteByCharacterId(Integer characterId) {
		// TODO Auto-generated method stub
		usercharacterDao.deleteByCharacterId(characterId);
	}

	@Override
	public void deleteByCharacterIdAndUserId(Integer characterId, Integer userId) {
		// TODO Auto-generated method stub
		usercharacterDao.deleteByCharacterIdAndUserId(characterId, userId);
	}

}
