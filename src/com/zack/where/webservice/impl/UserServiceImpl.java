package com.zack.where.webservice.impl;

import com.zack.where.beans.User;
import com.zack.where.manager.IUserManager;
import com.zack.where.response.ResponseBean;
import com.zack.where.webservice.IUserService;

public class UserServiceImpl  implements IUserService{

	private IUserManager userManager;
	
	public IUserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}





	public ResponseBean CountAllUser() {
		
		int count=userManager.countAll();
		ResponseBean response=new ResponseBean();
		response.setCode("ok");
		response.setMsg("目前注册的用户总数为："+count);
		return response;
	}
	
	

	
	
	
	

}
