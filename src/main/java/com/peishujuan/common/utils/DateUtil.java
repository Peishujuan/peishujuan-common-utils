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
		//设置月份的天为 
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
	
	/**
	 * 
	 * @Title: getAge 
	 * @Description: 根据出生日期获取年龄
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAge(Date birthday) {
		// 获取当前系统的日历类
		Calendar c = Calendar.getInstance();
		// 获取当前年月日
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);// 用生日初始化日历类
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		//年龄 1990-02-10 2019-02-08
		int age = yearNow - yearBirth;
		//出生月份大于前月份 年龄减少1
		if (monthBirth > monthNow) {
			age--;
		}
		// 如果月份一致并且 日期大于当前日期 年龄减少1
		if (monthBirth == monthNow && dateBirth > dateNow) {
			age--;
		}
		return age;
	}
	/**
	 * 
	 * @Title: passyn 
	 * @Description: 判断星期与车号
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean passyn(String str) {
		Calendar c = Calendar.getInstance();
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		int weekNow = c.get(Calendar.DAY_OF_WEEK);
		if(weekNow%2==0) {
			System.out.println("可以开尾号为双号车辆");
			return true;
		}else {
			System.out.println("可以开尾号为单号车辆");
			return false;
		}
	}
	
	
	/**
	  * 给一个时间对象，返回该时间所在月的1日0时0分0秒。
	  * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的结果为2019-05-01 00:00:00
	 * @Title: getDateByInitMonth 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByInitMonth(Date src){
		src.setDate(-30);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		return src;
	}
	/**
	 * 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	 * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 * @Title: getDateByFullMonth 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByFullMonth(Date src){
		if(src.getMonth()==2) {
			if(src.getYear()%4==0&&src.getYear()%100!=0) {
				src.setDate(28);
			}else {
				src.setDate(29);
			}
		}else if (src.getMonth() == 4 || src.getMonth() == 6 || src.getMonth() == 9 || src.getMonth() == 11) {
			src.setDate(30);
		}else {
			src.setDate(31);
		}
		src.setMonth(src.getMonth());
		src.setHours(23);
		src.setMinutes(59);
		src.setSeconds(59);
		return src;
		}
}
