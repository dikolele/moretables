package com.diko.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Role implements Serializable {
	private int roleId ;
	private String roleName ;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
}
