package demo26;

import java.util.Date;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo03 {

	public static void main(String[] args) {
		//获取当前时间对象
		//开始时间
		Date startDate=new Date();
		
		for(int i=0;i<100000;i++) {
			System.out.println("循环次数"+i);
		}
        		
		//结束时间
		Date endDate=new Date();
		//计算时间差
        long time = endDate.getTime() - startDate.getTime();
        System.out.println("10w次循环的执行时间是 "+time+" 毫秒");
	}
	
}
