package com.diko.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Role_Permission implements Serializable {
	private int id ;
	private int roleId ;
	private int permissionId ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	
	
}
