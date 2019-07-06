package com.lovo.resourcesystem.entity;

/**
 * 接受消息表
 * 
 * @author admin
 *
 */
public class AcceptNewsEntity {
	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 事件编号
	 */
	private String eventSourceId;

	/**
	 * 事件名称
	 */
	private String eventName;

	/**
	 * 事件区域
	 */
	private String area;

	/**
	 * 事件等级
	 */
	private String level;

	/**
	 * 事件类型
	 */
	private String type;

	/**
	 * 事件地址
	 */
	private String site;

	/**
	 * 调度人员数量
	 */
	private Integer numberpeople;

	/**
	 * 调度车辆数量
	 */
	private Integer carnumber;

	/**
	 * 事件状态
	 */
	private String state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getNumberpeople() {
		return numberpeople;
	}

	public void setNumberpeople(Integer numberpeople) {
		this.numberpeople = numberpeople;
	}

	public Integer getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(Integer carnumber) {
		this.carnumber = carnumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEventSourceId() {
		return eventSourceId;
	}

	public void setEventSourceId(String eventSourceId) {
		this.eventSourceId = eventSourceId;
	}

	@Override
	public String toString() {
		return "AcceptNewsEntity [id=" + id + ", eventSourceId=" + eventSourceId + ", eventName=" + eventName
				+ ", area=" + area + ", level=" + level + ", type=" + type + ", site=" + site + ", numberpeople="
				+ numberpeople + ", carnumber=" + carnumber + ", state=" + state + "]";
	}

}
