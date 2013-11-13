package com.zack.where.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zack.where.beans.User;
import com.zack.where.manager.IUserManager;


public class TestDB {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext Context=new ClassPathXmlApplicationContext(new String[]{"classpath:where-spring-db.xml","classpath:where-spring-context.xml"});
		
		IUserManager service=(IUserManager)Context.getBean("userManager");
		System.out.println("用户总数为："+service.countAll());
		try
		{
			User user=new User();
			user.setPhone_number("12313");
			user.setMac_address("nsiamrwoa");
			service.test(user, user);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println("事务执行完成后用户总数为："+service.countAll());
	}
}
