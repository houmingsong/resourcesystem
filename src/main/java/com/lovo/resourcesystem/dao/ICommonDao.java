package com.lovo.resourcesystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lovo.resourcesystem.entity.CommonEntity;

/**
 * 公共业务接口
 * @author Administrator
 *
 */
@Repository("commonDao")
public interface ICommonDao {
	/**
	 * 添加公共信息
	 * @param common 公共信息对象
	 */
	void add(CommonEntity common);
	/**
	 * 修改公共信息
	 * @param common
	 */
	void updateCommon(CommonEntity common);
	/**
	 * 根据id删除公共信息
	 * @param commonId
	 */
	void deleteById(Integer commonId);
	
	/**
	 * 根据类型查询所属集合
	 * @param type 类型
	 * @return 所属类型集合
	 */
	List<CommonEntity> findarea(String type);
	
	/**
	 * 根据类型和key查找
	 * @param type 类型
	 * @param key 键
	 * @return
	 */
	CommonEntity findByTypeAndKey(String type,Integer key);
}
