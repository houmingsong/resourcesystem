package com.lovo.resourcesystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lovo.resourcesystem.entity.PowerEntity;


/**
 * 权限映射接口
 * @author Administrator
 *
 */
@Repository("powerDao")
public interface IPowerDao {
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
	List<PowerEntity> findByCharacterId(Integer characterId);
	/**
	 * 根据用户id查询权限集合
	 * @param userId 用户id
	 * @return 查询出来的权限集合
	 */
	List<PowerEntity> findByUserId(Integer userId);
	
	/**
	 * 查询权限集合
	 * @return 查询出来的权限集合
	 */
	List<PowerEntity> findAll();
}
