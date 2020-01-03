package com.peishujuan.common.utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
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
	
//	public PageInfo<Car> getCarList(Vo vo, int pageNum) {
//		PageHelper.startPage(pageNum, 3);
//		List<Car> car = mapper.getCarList(vo);
        ////		PageInfo<Car> info = new PageInfo<Car>(car);
//		
//		List<Car> list = new ArrayList<Car>();
//		if(null!=vo && null!=vo.getJd() && null!=vo.getWd()) {
//			for (Car info : car) {
//				Double j1 = info.getJd();
//				Double w1 = info.getWd();
//				double d = DistanceUtil.getDistance(vo.getJd(), vo.getWd(), j1, w1);
//				if(d>=vo.getStart() && d<= vo.getEnd()) {
//					info.setDistance(d);
//					list.add(info);
//				}
//			}
//			return new PageInfo<Car>(list);//返回查询条件数据
//		}
//		return new PageInfo<Car>(car);//返回所有的数据
//	}
}
