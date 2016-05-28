package com.diko.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User_Role implements Serializable {
	private int userId ;
	private int roleId ;
	private int userRoleId ;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	
}
