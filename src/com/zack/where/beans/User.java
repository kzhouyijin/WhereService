package com.zack.where.beans;

import java.io.Serializable;

public class User implements Serializable{

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMac_address() {
		return mac_address;
	}

	public void setMac_address(String macAddress) {
		mac_address = macAddress;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String createTime) {
		create_time = createTime;
	}

	public String getLast_time() {
		return last_time;
	}

	public void setLast_time(String lastTime) {
		last_time = lastTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phoneNumber) {
		phone_number = phoneNumber;
	}

	private String id;
	
	private String mac_address;
	
	private String create_time;
	
	private String last_time;
	
	private String password;
	
	private String account;
	
	private String realname;
	
	private String phone_number;
}
