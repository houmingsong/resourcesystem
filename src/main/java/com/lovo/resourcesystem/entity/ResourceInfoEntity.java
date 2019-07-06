package com.lovo.resourcesystem.entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * 资源信息事件表
 * 
 * @author admin
 *
 */

public class ResourceInfoEntity {

	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 事件接受资源ID
	 */
	private String eventSourceId;

	/**
	 * 状态
	 */
	private String state;

	/**
	 * 派出日期
	 */
	private String outDate =System.currentTimeMillis()+"";
	
	/**
	 * 派出日期
	 */
	private String outDateShow;

	/**
	 * 归还日期
	 */
	private String backDate;
	
	/**
	 * 归还日期
	 */
	private String backDateShow;

	/**
	 * 资源类型
	 */
	private String type;

	/**
	 * 资源名
	 */
	private String resourceName;

	/**
	 * 负责人id
	 */
	private Integer headId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEventSourceId() {
		return eventSourceId;
	}

	public void setEventSourceId(String eventSourceId) {
		this.eventSourceId = eventSourceId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public String getOutDate() {
		return outDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getOutDateShow() {
		if(null!=outDate) {
			Long temp=Long.parseLong(outDate);
			SimpleDateFormat currtime = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			outDateShow = currtime.format(new Date(temp));
		}
		return outDateShow;
	}

	public void setOutDateShow(String outDateShow) {
		this.outDateShow = outDateShow;
	}

	public String getBackDate() {
		return backDate;
	}

	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}

	public String getBackDateShow() {
		if(null!=backDate) {
			Long temp=Long.parseLong(backDate);
			SimpleDateFormat currtime = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
			backDateShow = currtime.format(new Date(temp));
		}
		return backDateShow;
	}

	public void setBackDateShow(String backDateShow) {
		this.backDateShow = backDateShow;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	
	public Integer getHeadId() {
		return headId;
	}

	public void setHeadId(Integer headId) {
		this.headId = headId;
	}

	@Override
	public String toString() {
		return "ResourceInfoEntity [id=" + id + ", eventSourceId=" + eventSourceId + ", state=" + state + ", outDate="
				+ outDate + ", outDateShow=" + outDateShow + ", backDate=" + backDate + ", backDateShow=" + backDateShow
				+ ", type=" + type + ", resourceName=" + resourceName + ", headId=" + headId + "]";
	}

	
	

}
