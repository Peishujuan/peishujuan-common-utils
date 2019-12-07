package com.peishujuan.common.utils;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testRead() {
		try {
			FileInputStream in = new FileInputStream("D:\\Eclipse-1708A-Word-CMS\\peishujuan-goods\\src\\test\\resources\\data.txt");
//			List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
			List<String> list = StreamUtil.read(in);
			for (String string : list) {
				
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
