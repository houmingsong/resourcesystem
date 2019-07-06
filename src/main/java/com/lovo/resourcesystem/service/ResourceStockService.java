package com.lovo.resourcesystem.service;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lovo.resourcesystem.entity.ResourceStockEntity;
/**
 * 车辆管理
 * @author admin
 *
 */
public interface ResourceStockService {
	/**
	 * 添加车辆
	 * @param resourceStock
	 */
	public void resourceStockAdd(ResourceStockEntity r);
	
	/**
	 * 根据ID删除车辆
	 * @param id
	 */
	public void resourceStockdelete(Integer id);
	
	/**
	 * 根据状态查询车辆
	 * @param state 状态
	 * @param currentPage 当前页面
	 * @return 车辆信息集合
	 */
	public List<ResourceStockEntity> resourceStockFind(String state,Integer currentPage);
	
	
	/**
	 * 根据ID修改状态
	 * @param id
	 */
	public void  resourceStockRevise(String state,Integer id);
	
	/**
     * 获取动态查询的总页数
     * @param state 状态
     * @return 总页数
     */
	public int getTotalPageByItem(@Param(value="state")String state);
    
	/**
     * 根据id查询所有车辆
     * @param id 车辆id
     */
    public String findStateById(@Param(value="id")Integer id);
    
    /**
     * 根据id查询所有在线车辆
     * @param state
     * @return
     */
    public List<ResourceStockEntity> findCar(@Param(value="state")String state);
    
    /**
     * 根据 id查询车牌号
     * @param plateNumber
     * @return 车牌号
     */
    public String findPlateNumber(@Param(value="resourceStocks")Integer resourceStocks);
    
    
    /**
   	 * 根据状态查询在线数量
   	 * @param state
   	 * @return
   	 */
   	public Integer finCarNum(String state);
   	
   	/**
	 * 根据车牌号修改状态
	 * @param state 状态
	 * @param plateNumber 车牌号
	 */
	public void updateState(String state,String plateNumber);

}
