package com.lovo.resourcesystem.dao;
/**
 * 用户实体类
 * @author admin
 *
 */

import java.util.List;

import com.lovo.resourcesystem.entity.UserEntity;

public interface UserDao {

	/**
	 * 添加用户
	 * @param id
	 */
	public void userAdd(UserEntity userEntity);
	
	/**
	 * 根据ID删除用户
	 * @param id
	 */
	public void userDelete(Integer id);
	
	
	
		/**
	 * 根据ID查询用户
	 * @param id
	 */
	public List<UserEntity> userFindId(Integer id);
	
	
	/**
	 * 根据ID修改用户
	 * @param id
	 */
	public void userRevise(Integer id,String password);
	
	/**
	 * 展示所有用户
	 * @return
	 */
	public List<UserEntity> userFind();
}
