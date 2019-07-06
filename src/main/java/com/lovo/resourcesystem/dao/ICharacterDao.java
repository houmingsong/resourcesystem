package com.lovo.resourcesystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lovo.resourcesystem.entity.CharacterEntity;

/**
 * 角色业务接口
 * @author Administrator
 *
 */
@Repository("characterDao")
public interface ICharacterDao {
	/**
	 * 添加角色
	 * @param character
	 */
	void add(CharacterEntity character);
	/**
	 * 查询所有角色
	 * @param index 开始的索引
	 * @param colums 显示的条数
	 * @return 查询的角色集合
	 */
	List<CharacterEntity> findAll();
	/**
	 * 根据id删除角色
	 * @param characterId 角色id
	 */
	void deleteById(Integer characterId);
	/**
	 * 根据Id查找角色
	 * @param characterId
	 * @return
	 */
	CharacterEntity findById(Integer characterId);
}
