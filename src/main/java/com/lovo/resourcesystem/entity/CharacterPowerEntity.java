package com.lovo.resourcesystem.entity;
/**
 * 角色权限实体类
 * @author Administrator
 *
 */
public class CharacterPowerEntity {
	
	/**主键*/
	private Integer id;
	/**权限id*/
	private Integer powerId;
	/**角色id*/
	private Integer characterId;
	public CharacterPowerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CharacterPowerEntity(Integer id, Integer powerId, Integer characterId) {
		super();
		this.id = id;
		this.powerId = powerId;
		this.characterId = characterId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPowerId() {
		return powerId;
	}
	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}
	public Integer getCharacterId() {
		return characterId;
	}
	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
	
}
