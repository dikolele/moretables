package com.diko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diko.po.User;
import com.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper usermapper ;
	@Override
	public void insertUser(String name , String password) {
		User user = new User();
		user.setUserName(name);
		user.setPassword(password);
		usermapper.insertUser(user);
		
	}
	@Override
	public User select(String name, String password) {
		return usermapper.select(name, password);
	}
	@Override
	public User selectUserById(int id) {
		// TODO Auto-generated method stub
		return usermapper.selectUserById(id);
	}
	@Override
	public void updateuser(int id) {
		usermapper.updateuser(id);
		
	}

}
