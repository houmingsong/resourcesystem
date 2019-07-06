package com.lovo.resourcesystem.entity;


/**
 * 权限实体类
 * @author Administrator
 *
 */
public class PowerEntity{
	
	/**主键*/
	private Integer id;
	/**权限名字*/
	private String powerName;
	/**权限描述*/
	private String describe;
	/**url*/
	private String url;
	public PowerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PowerEntity(Integer id, String powerName, String describe, String url) {
		super();
		this.id = id;
		this.powerName = powerName;
		this.describe = describe;
		this.url = url;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}