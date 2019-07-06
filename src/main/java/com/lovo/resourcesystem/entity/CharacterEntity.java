package com.lovo.resourcesystem.entity;
/**
 * 角色实体类
 * @author Administrator
 *
 */

import java.util.List;

public class CharacterEntity {
	/**主键*/
	private Integer id;
	/**角色Id*/
	private String characterName;
	/**权限集合*/
	private List<PowerEntity> powerList;
	/**用户集合*/
	private List<UserEntity> userList;
	public CharacterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CharacterEntity(Integer id, String characterName) {
		super();
		this.id = id;
		this.characterName = characterName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public List<PowerEntity> getPowerList() {
		return powerList;
	}
	public void setPowerList(List<PowerEntity> powerList) {
		this.powerList = powerList;
	}
	public List<UserEntity> getUserList() {
		return userList;
	}
	public void setUserList(List<UserEntity> userList) {
		this.userList = userList;
	}
	
}
