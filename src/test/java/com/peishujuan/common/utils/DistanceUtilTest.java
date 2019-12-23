package com.peishujuan.common.utils;

import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;

public class DistanceUtilTest {

	@Test
	public void testGetDistance() throws Exception {
		
		double j=116.425249;
		double w=39.914504;
		
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data1.txt"));
		for (String str : read) {
			String[] s = str.split(",");
			double d = DistanceUtil.getDistance(j,w,Double.parseDouble(s[2]), Double.parseDouble(s[3]));
			 //保留两位小数
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("目标距离?"+df.format(d)+"米");
		}
	}
}
