package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.UserDao;
import com.lovo.resourcesystem.entity.UserEntity;
import com.lovo.resourcesystem.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void userAdd(UserEntity userEntity) {
		// TODO Auto-generated method stub
		
		
		userDao.userAdd(userEntity);
	}

	

	@Override
	public void userRevise(Integer id, String password) {
		// TODO Auto-generated method stub
		userDao.userRevise(id, password);
	}

	@Override
	public List<UserEntity> userFind() {
		// TODO Auto-generated method stub
		List<UserEntity> list = null;
		
		list=userDao.userFind();
		return list;
	}



	@Override
	public void userDelete(Integer id) {
		// TODO Auto-generated method stub
		userDao.userDelete(id);
	}



	@Override
	public List<UserEntity> userFindId(Integer id) {
	
		List<UserEntity> list = null;
		list=userDao.userFindId(id);
		
		return list;
		// TODO Auto-generated method stub
		
	}

}
