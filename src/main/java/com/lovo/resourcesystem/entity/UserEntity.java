package com.lovo.resourcesystem.entity;

import java.sql.Date;

/**
 * 用户表
 * @author admin
 *
 */
public class UserEntity {
   
	/**
	 * 用户ID
	 */
	private  Integer id;
	
	/**
	 * 用户名
	 */
	private  String userName;
	
	/**
	 * 密码
	 */
   private  String password;
   
   /**
    * 性别
    */
   private  String sex;
   
   /**
    * 生日
    */
   private  Date  birthday;
   
   /**
    * 联系方式
    */
   private  String telephone;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public Date getBirthday() {
	return birthday;
}

public void setBirthday(Date birthday) {
	this.birthday = birthday;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

@Override
public String toString() {
	return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", sex=" + sex + ", birthday="
			+ birthday + ", telephone=" + telephone + "]";
}


   
   
}
