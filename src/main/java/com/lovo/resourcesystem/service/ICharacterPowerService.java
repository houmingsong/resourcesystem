package com.lovo.resourcesystem.service;

import com.lovo.resourcesystem.entity.CharacterPowerEntity;

/**
 * 角色权限业务接口
 * @author Administrator
 *
 */

public interface ICharacterPowerService {
	/**
	 * 添加角色权限对象
	 * @param character 角色权限对象
	 */
	void add(CharacterPowerEntity characterPower);
	/**
	 * 修改角色权限对象 
	 * @param characterPower 角色权限对象
	 */
	void update(CharacterPowerEntity characterPower);
	/**
	 * 根据角色权限id删除
	 * @param characterId 角色id
	 */
	void deleteByCharacterId(Integer characterId);
	/**
	 * 根据Id查询
	 * @param c2pId 中间表id
	 * @return 中间对象
	 */
	CharacterPowerEntity findById(Integer c2pId);
	/**
	 * 根据用户id删除
	 * @param userId 用户id
	 */
	void deleteByUserId(Integer userId);
	/**
	 * 根据角色和权限Id删除
	 * @param characterId 角色id
	 * @param powerId 权限id
	 */
	void deleteByCharacterIdAndPowerId(Integer characterId,Integer powerId);
}
