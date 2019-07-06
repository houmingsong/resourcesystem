package com.lovo.resourcesystem.service;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lovo.resourcesystem.entity.ResourceInfoEntity;
/**
 * 派遣资源业务层
 * @author admin
 *
 */
public interface ResourceInfoService {
	/**
     * 添加资源派遣
     * @param resourceInfo
     */
	public void resourceInfoEntityAdd(ResourceInfoEntity resourceInfo);
	
	/**
	 * 派遣资源展示
	 * @return 事件编号 负责人  派遣时间  
	 */
	public List<ResourceInfoEntity> resourceInfoEntityFind(Integer currpage);
	
	
	/**
	 * 根据事件id和负责人id查询负责人姓名
	 * @param eventSourceId 事件id
	 * @param state 状态
	 * @param headId 负责人id
	 * @return 负责人姓名
	 */
	public String dispatchHead(String eventSourceId,String state,Integer headId);
	
	
	/**
	 * 根据事情ID 查询派出详情  用于资源回收
	 * @return
	 */
	public List<ResourceInfoEntity> resourceInfoEntityFinda(String state,String eventSourceId);
	
	/**
	 * 归队
	 * @param state 状态
	 * @param backDate 归队时间
	 * @param id id
	 */
	public void retrieve(String state,String backDate,Integer id);
}
