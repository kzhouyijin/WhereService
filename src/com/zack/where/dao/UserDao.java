package com.zack.where.dao;

import com.zack.where.beans.User;

public interface UserDao {

	public int countAll();
	
	
	public void insertUser(User user);
	
	public User queryUserById(int id);
}
