package com.lovo.resourcesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.ICharacterPowerDao;
import com.lovo.resourcesystem.entity.CharacterPowerEntity;
import com.lovo.resourcesystem.service.ICharacterPowerService;


@Service("characterPowerService")
public class CharacterPowerServiceImpl implements ICharacterPowerService{
	
	@Autowired
	private ICharacterPowerDao characterPowerdao;
	@Override
	public void add(CharacterPowerEntity characterPower) {
		// TODO Auto-generated method stub
		characterPowerdao.add(characterPower);
	}

	@Override
	public void update(CharacterPowerEntity characterPower) {
		// TODO Auto-generated method stub
		characterPowerdao.update(characterPower);
	}

	@Override
	public void deleteByCharacterId(Integer characterId) {
		// TODO Auto-generated method stub
		characterPowerdao.deleteByCharacterId(characterId);
	}

	@Override
	public CharacterPowerEntity findById(Integer c2pId) {
		// TODO Auto-generated method stub
		return characterPowerdao.findById(c2pId);
	}

	@Override
	public void deleteByUserId(Integer userId) {
		// TODO Auto-generated method stub
		characterPowerdao.deleteByUserId(userId);
	}

	@Override
	public void deleteByCharacterIdAndPowerId(Integer characterId, Integer powerId) {
		// TODO Auto-generated method stub
		characterPowerdao.deleteByCharacterIdAndUserId(characterId, powerId);
	}

}
