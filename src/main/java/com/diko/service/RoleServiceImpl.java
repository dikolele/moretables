package com.diko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diko.po.RootSelect;
import com.mapper.RoleMapper;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper ;

	@Override
	public String selectRolename(int uid) {
		return roleMapper.SelectRolename(uid);
	}

	@Override
	public List<RootSelect> rootselect() {
		// TODO Auto-generated method stub
		return roleMapper.rootSelect();
	}


	

	@Override
	public RootSelect select_afterupdateU_R(int userId) {
		return roleMapper.select_afterupdateU_R(userId);
	}

	@Override
	public void updateU_R(int userId, int roleId) {
		roleMapper.updateU_R(userId, roleId);
		
	}

	@Override
	public int selectRidbyRnm(String rolename) {
		return roleMapper.selectRidbyRnm(rolename);
	}

	
	
	
}
