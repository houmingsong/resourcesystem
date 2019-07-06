package com.lovo.resourcesystem.entity;
/**
 * 用户角色实体类
 * @author Administrator
 *
 */
public class UserCharacterEntity {
	
	/**主键*/
	private Integer id;
	/**用户id*/
	private Integer userId;
	/**角色id*/
	private Integer characterId;
	public UserCharacterEntity(Integer id, Integer userId, Integer characterId) {
		super();
		this.id = id;
		this.userId = userId;
		this.characterId = characterId;
	}
	public UserCharacterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCharacterId() {
		return characterId;
	}
	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
	
}
