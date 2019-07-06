package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.PowerEntity;


/**
 * 权限映射接口
 * @author Administrator
 *
 */
public interface IPowerService {
	/**
	 * 添加权限信息
	 * @param power 需要添加的权限对象
	 */ 
	void add(PowerEntity power);
	/**
	 * 根据id删除权限
	 * @param powerId 权限的id
	 */
	void delete(Integer powerId);
	/**
	 * 根据角色id查询权限集合
	 * @param characterId 角色id
	 * @return 查询出来的权限集合
	 */
	List<PowerEntity> findByCharacterIdHave(Integer characterId);
	/**
	 * 根据角色id查询权限集合
	 * @param characterId 角色id
	 * @return 查询出来的权限集合
	 */
	List<PowerEntity> findByCharacterIdNoHave(Integer characterId);
	/**
	 * 根据用户id查询权限集合
	 * @param userId 用户id
	 * @return 查询出来的权限集合
	 */
	List<PowerEntity> findByUserId(Integer userId);
}
