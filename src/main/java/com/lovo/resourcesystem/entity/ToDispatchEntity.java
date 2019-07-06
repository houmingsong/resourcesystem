package com.lovo.resourcesystem.entity;

public class ToDispatchEntity {

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
	private String outDate = System.currentTimeMillis() + "";

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
	 * 负责人
	 */
	private String dutyPerson;

	/**
	 * 负责人联系方式
	 */
	private String phone;
	

	private String name="华西";
	private String way="医院";
	public ToDispatchEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ToDispatchEntity(String eventSourceId, String state, String outDate, String outDateShow, String backDate,
			String backDateShow, String type, String resourceName, String dutyPerson, String phone, String name,
			String way) {
		super();
		this.eventSourceId = eventSourceId;
		this.state = state;
		this.outDate = outDate;
		this.outDateShow = outDateShow;
		this.backDate = backDate;
		this.backDateShow = backDateShow;
		this.type = type;
		this.resourceName = resourceName;
		this.dutyPerson = dutyPerson;
		this.phone = phone;
		this.name = name;
		this.way = way;
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
	public String getDutyPerson() {
		return dutyPerson;
	}
	public void setDutyPerson(String dutyPerson) {
		this.dutyPerson = dutyPerson;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	
	
}
