package demo26;

import java.util.Calendar;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo04 {

	public static void main(String[] args) {
		//默认是当前日期
		Calendar c1 = Calendar.getInstance();
		System.out.println("c1="+c1);
		
		//创建一个代表2023年2月2日的Calendar对象
		Calendar c2 = Calendar.getInstance();
		c2.set(2023, 2-1, 2);
		System.out.println("c2="+c2);
	}
	
}
