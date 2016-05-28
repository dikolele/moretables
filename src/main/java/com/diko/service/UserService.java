package com.diko.service;

import com.diko.po.User;

public interface UserService {
	//添加用户
	public void insertUser(String name , String password);
	//用户登录
	public User select(String name , String password);
	//查找用户Id
	public User selectUserById(int id);
	//更新用户信息
	public void updateuser(int id);
	public  int selct_UIdByUNM(String userName);
}
