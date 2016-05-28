package com.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.diko.po.RootSelect;
@Component
public interface RoleMapper {
	public String SelectRolename(int userId);
	public List<RootSelect> rootSelect();
	public void updateU_R(int userId);
	public RootSelect select_afterupdateU_R(int userId);
	
}
