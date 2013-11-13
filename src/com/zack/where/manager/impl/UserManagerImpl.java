package com.zack.where.manager.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.zack.where.beans.User;
import com.zack.where.dao.UserDao;
import com.zack.where.manager.IUserManager;
import com.zack.where.utils.DateUtils;

public class UserManagerImpl  implements IUserManager{

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public int countAll()
	{
		return userDao.countAll();
	}
	
	

	public void insertUser(User user) 
	{
		userDao.insertUser(user);
	}
	
	@Transactional
	public void test(User user1,User user2)
	{
		userDao.insertUser(user1);
		int i=5/0;
		userDao.insertUser(user2);
	}
	
	
}
