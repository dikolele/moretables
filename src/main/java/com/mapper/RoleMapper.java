package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.diko.po.RootSelect;
@Component
public interface RoleMapper {
	public String SelectRolename(int userId);
	public List<RootSelect> rootSelect();
	public void updateU_R(@Param(value="userId") int userId ,@Param(value="roleId") int roleId);
	public RootSelect select_afterupdateU_R(int userId);
	public int selectRidbyRnm(String rolename);	
}
