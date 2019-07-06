package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.CommonEntity;


public interface ICommonService {
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
}
