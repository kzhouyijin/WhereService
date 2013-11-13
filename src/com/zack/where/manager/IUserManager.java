package com.zack.where.manager;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.zack.where.beans.User;
import com.zack.where.dao.UserDao;
import com.zack.where.utils.DateUtils;

public interface IUserManager {




	
	
	public int countAll();
	
	

	public void insertUser(User user) ;

	public void test(User user1,User user2);
	
	
}
