package com.diko.po;

import java.io.Serializable;


@SuppressWarnings("serial")
public class RootSelect implements Serializable {
	private int userId ;
	private String userName ;
	private String roleName ;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
