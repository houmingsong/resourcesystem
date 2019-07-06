package com.lovo.resourcesystem.entity;
/**
 * 库存数量表
 * @author admin
 *
 */
public class StockNumberEntity {
	/**
	 * ID
	 */
	private  Integer resourceStocks;

	/**
	 * 总车辆数量
	 */
	private  Integer otalCar;
	
	/**
	 * 总人数数量
	 */
	private Integer  totalPerson;
	
	/**
	 * 可用车辆
	 */
	private Integer useCar;
	
	
	/**
	 * 可用人数
	 */
	private Integer usePerson;


	public Integer getResourceStocks() {
		return resourceStocks;
	}


	public void setResourceStocks(Integer resourceStocks) {
		this.resourceStocks = resourceStocks;
	}


	public Integer getOtalCar() {
		return otalCar;
	}


	public void setOtalCar(Integer otalCar) {
		this.otalCar = otalCar;
	}


	public Integer getTotalPerson() {
		return totalPerson;
	}


	public void setTotalPerson(Integer totalPerson) {
		this.totalPerson = totalPerson;
	}


	public Integer getUseCar() {
		return useCar;
	}


	public void setUseCar(Integer useCar) {
		this.useCar = useCar;
	}


	public Integer getUsePerson() {
		return usePerson;
	}
	


	@Override
	public String toString() {
		return "StockNumberEntity [resourceStocks=" + resourceStocks + ", otalCar=" + otalCar + ", totalPerson="
				+ totalPerson + ", useCar=" + useCar + ", usePerson=" + usePerson + "]";
	}


	public void setUsePerson(Integer usePerson) {
		this.usePerson = usePerson;
	}
	
	
	
	
}
