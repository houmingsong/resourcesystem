package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.AcceptNewsEntity;
/**
 * 事件维护业务层
 * @author admin
 *
 */
public interface AcceptNeService {
	/**
	 * 添加事件
	 * @param acceptNewsEntity
	 */
	public void add(AcceptNewsEntity acceptNewsEntity);
	/**
	 * 查询全部事件维护，用来展示
	 * @return
	 */
	public List<AcceptNewsEntity>  acceptNewsFind(Integer currentPage);
	
	/**
     * 获取动态查询的总页数
     * @return 总页数
     */
    public int getTotalPageByItem();
    
    /**
     * 按id查询单个事件
     * @param id
     * @return
     */
    public AcceptNewsEntity findById(Integer id);
    
    /**
     * 查询全部事件
     * @return
     */
   public List<AcceptNewsEntity> acceptNewsFindEcharts();
   
   /**
    * 根据事件ID修改事件状态
    * @param state 状态
    * @param eventSourceId 事件ID
    */
    public void updateState(String state,String eventSourceId);
}
