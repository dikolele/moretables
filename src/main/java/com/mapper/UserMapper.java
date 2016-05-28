package com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.diko.po.User;
@Component

public interface UserMapper {
	//添加用户
	public void insertUser(@Param("user") User user);
	//用户登录
	public User select(@Param("name") String name , @Param("password") String password);
	/*登录后修改用户信息
	 * 1.根据id找到用户selectById
	 * 2.更新用户信息 update
	 * 3.选择角色，在role表里select role_id
	 * 4.得到role_id后    user_role表添加一条记录
	 * 5.得到role_id后  去role_permission表里得到 permission_id 
	 * 6.根据 permission_id 得到permission_name，在action页面中写permission user_name 你好
	 * 7.根据两个不同的permission_name跳转到两个不同的页面中，每个页面显示不同的权限
	 */
	// 1.根据id找到用户selectById
	public User selectUserById(int id);
	public void updateuser(int id);
	
}
