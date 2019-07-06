package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.ICharacterDao;
import com.lovo.resourcesystem.dao.ICharacterPowerDao;
import com.lovo.resourcesystem.dao.IUserCharacterDao;
import com.lovo.resourcesystem.entity.CharacterEntity;
import com.lovo.resourcesystem.service.ICharacterService;

@Service("characterService")
public class CharacterServiceImpl implements ICharacterService {

	@Autowired
	private ICharacterDao characterDao;
	@Autowired
	private IUserCharacterDao usercharacterDao;
	@Autowired
	private ICharacterPowerDao characterPowerdao;

	@Override
	public void add(CharacterEntity character) {
		// TODO Auto-generated method stub
		characterDao.add(character);
	}

	@Override
	public List<CharacterEntity> findAll() {
		// TODO Auto-generated method stub
		return characterDao.findAll();
	}

	@Override
	public void deleteById(Integer characterId) {
		// TODO Auto-generated method stub
		characterDao.deleteById(characterId);
		usercharacterDao.deleteByCharacterId(characterId);
		characterPowerdao.deleteByCharacterId(characterId);
	}

	@Override
	public CharacterEntity findById(Integer characterId) {
		// TODO Auto-generated method stub
		return characterDao.findById(characterId);
	}

}
