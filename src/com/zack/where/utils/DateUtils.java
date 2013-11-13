package com.zack.where.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	
	public static String getCurrentTime()
	{
		Date date=new Date();
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
}
