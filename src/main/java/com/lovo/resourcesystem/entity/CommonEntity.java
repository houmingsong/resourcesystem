package com.lovo.resourcesystem.entity;
/**
 * 公共实体类
 * @author Administrator
 *
 */
public class CommonEntity {
	
	/**主键*/
	private Integer id;
	/**类型*/
	private String type;
	/**键*/
	private Integer key;
	/**值*/
	private String value;
	public CommonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommonEntity(Integer id, String type, Integer key, String value) {
		super();
		this.id = id;
		this.type = type;
		this.key = key;
		this.value = value;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
