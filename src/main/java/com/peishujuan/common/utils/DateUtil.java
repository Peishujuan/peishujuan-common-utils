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
		//��ȡ�ĵ�ǰϵͳ��ʱ���������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//�����·ݵ���Ϊ 1
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
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//�õ�ǰ�·�+1
		c.add(Calendar.MONTH, 1);
		//�����ڱ���¸����³�
		
		Date init = getMonthInit(c.getTime());
		
		//���³��ٴγ�ʼ������
		c.setTime(init);
		//���ڵ�����-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
	//����ĳһ��ʱ��ε��������
	public static Date random(Date minDate, Date maxDate) {
		//��ʼ������
		long t1 = minDate.getTime();
		//����������
		long t2 = maxDate.getTime();
		//����t2 t1֮��ĺ�����
		long t3 = (long)(Math.random() * (t2-t1+1)+t1);
		return new Date(t3);
	}
}
