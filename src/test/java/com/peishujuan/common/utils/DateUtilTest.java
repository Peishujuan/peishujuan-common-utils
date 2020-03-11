package com.peishujuan.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetMonthInit() {
		Calendar c = Calendar.getInstance();
		c.set(2018, 8, 28);
		
		Date init = DateUtil.getMonthInit(c.getTime());
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(date.format(init));
	}

	@Test
	public void testGetMonthEnd() {
		 Calendar c = Calendar.getInstance();
		  c.set(2008, 1, 23);
		
		Date init = DateUtil.getMonthEnd(c.getTime());
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(init));
	}

	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 11, 06);
		int i = DateUtil.getAge(c.getTime());
		System.out.println(i);
	}

	@Test
	public void testpassyn() {
		Calendar c = Calendar.getInstance();
		c.getWeeksInWeekYear();
		System.out.println(c.getWeeksInWeekYear());
	}
	
	@Test
	public void getDateByInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 5, 15);
		Date init = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(date.format(init));
	}
	
	@Test
	public void getDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 5, 18);
		Date init = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(date.format(init));
	}
}
