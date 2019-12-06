package com.peishujuan.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * 
	 * @Title: getMonthInit 
	 * @Description: TODO
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthInit(Date date) {
		//获取的当前系统的时间的日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//设置月份的天为 1
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getMonthEnd 
	 * @Description: TODO
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthEnd(Date date) {
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//让当前月份+1
		c.add(Calendar.MONTH, 1);
		//让日期变成下个月月初
		
		Date init = getMonthInit(c.getTime());
		
		//用月初再次初始日历类
		c.setTime(init);
		//日期的秒数-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
	//返回某一个时间段的随机日期
	public static Date random(Date minDate, Date maxDate) {
		//开始毫秒数
		long t1 = minDate.getTime();
		//结束毫秒数
		long t2 = maxDate.getTime();
		//介于t2 t1之间的毫米数
		long t3 = (long)(Math.random() * (t2-t1+1)+t1);
		return new Date(t3);
	}
}
