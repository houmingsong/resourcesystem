package com.lovo.resourcesystem.entity;
/**
 * 资源库存表
 * @author admin
 *
 */
public class ResourceStockEntity {
    
	/**
	 * ID
	 */
	private Integer resourceStocks;
	/**
	 * 车牌
	 */
	private String   plateNumber;
	
	/**
	 * 处理状态
	 */
	
	private  String state;

	public Integer getResourceStocks() {
		return resourceStocks;
	}

	public void setResourceStocks(Integer resourceStocks) {
		this.resourceStocks = resourceStocks;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

	
	@Override
	public String toString() {
		return "ResourceStockEntity [resourceStocks=" + resourceStocks + ", plateNumber=" + plateNumber + ", state="
				+ state + "]";
	}
	
	
	
	
	
}
