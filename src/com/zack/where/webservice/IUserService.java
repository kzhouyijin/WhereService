package com.zack.where.webservice;

import com.zack.where.beans.User;
import com.zack.where.response.ResponseBean;

/**
 * 用户服务，所有与用户关联的操作均由此发布
 * @author 周艺津
 *
 */
public interface IUserService {

	
	public ResponseBean CountAllUser();
}
