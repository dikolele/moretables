package com.diko.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Permission implements Serializable {
	private int permissionId ;
	private String permissionName ;
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
}
