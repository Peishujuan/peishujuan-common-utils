package com.peishujuan.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	/**
	 * 
	 * @Title: read 
	 * @Description: 一行行读取文件并放入list集合中
	 * @param inputStream
	 * @return
	 * @throws Exception
	 * @return: List<String>
	 */
	public static List<String> read(InputStream inputStream) throws Exception{
		BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
		List<String> list = new ArrayList<String>();
		String str="";
		while((str=read.readLine())!=null) {
			list.add(str);
		}
		return list;
		
	}
}
