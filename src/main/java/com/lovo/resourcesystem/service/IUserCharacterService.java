package com.lovo.resourcesystem.service;

import com.lovo.resourcesystem.entity.UserCharacterEntity;

/**
 * 用户角色业务接口
 * @author Administrator
 *
 */
public interface IUserCharacterService {
	/**
	 * 添加用户角色信息
	 * @param userCharacter 用户角色对象
	 */
	void add(UserCharacterEntity userCharacter);
	/**
	 * 修改用户角色信息
	 * @param userCharacter 用户角色对象
	 */
	void update(UserCharacterEntity userCharacter);
	/**
	 * 根据用户id删除用户角色信息
	 * @param userId 用户id
	 */
	void deleteByUserId(Integer userId);
	/**
	 * 根据角色id删除用户角色信息
	 * @param characterId 角色信息
	 */
	void deleteByCharacterId(Integer characterId);
	/**
	 * 根据用户id和角色id删除用户角色信息
	 * @param characterId 角色信息
	 * @param userId 用户id
	 */
	void deleteByCharacterIdAndUserId(Integer characterId,Integer userId);
	
}
