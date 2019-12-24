package com.peishujuan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(null);
		System.out.println(b);
		boolean b2 = StringUtil.hasLength("");
		System.out.println(b2);
		boolean b3 = StringUtil.hasLength(" ");
		System.out.println(b3);

	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(null);
		System.out.println(b);
		boolean b2 = StringUtil.hasText("");
		System.out.println(b2);
		boolean b3 = StringUtil.hasText(" ");
		System.out.println(b3);
	}

	@Test
	public void testRandomChineseString() {
		for (int i = 0; i < 10; i++) {
			String string = StringUtil.randomChineseString();
			System.out.println(string+" ");
		}
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}
	
	
	@Test
	public   void  testPhone() {
		boolean b = StringUtil.isPhoneNumber("13503539365");
		System.out.println(b);
	}
	@Test
	public   void  testEmail() {
		boolean b = StringUtil.isEmail("_34444444@qq.net");
		System.out.println(b);
	}

	@Test
	public void testIsNumber() {
		boolean b = StringUtil.isNumber("-0.12345");
		System.out.println(b);
	}
	@Test
	public void testPlaceholderValue() {
		String url = "http://news.cnstock.com/news,yw-201908-4413224.htm";
		String string = StringUtil.getPlaceholderValue(url);
		System.out.println(string);
	}
	
	@Test
	public void testUrl() {
		String url = "http://www.baidu.com";
		String url1="www.dfahfdkhdk";
		boolean a = StringUtil.isHttpUrl(url);
		boolean b = StringUtil.isHttpUrl(url1);
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void test() {
		String str = "id:2,name:张三,created:2019-02-03 10:23:03";
		String[] split = str.split(",");
		for (String string : split) {
			String[] split2 = string.split(":", 2);
			System.out.println(split2[1]);
		}
	}
}
