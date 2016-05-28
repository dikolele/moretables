package com.diko.service;

import java.util.List;

import com.diko.po.RootSelect;


public interface RoleService {
	public String selectRolename(int uid);
	public List<RootSelect> rootselect();
	public void updateU_R(int userId , int roleId);
	public RootSelect select_afterupdateU_R(int userId);
	public int selectRidbyRnm(String rolename);	
}
