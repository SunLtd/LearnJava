package demo26;

import java.util.Date;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo01 {

	public static void main(String[] args) {
		//获取当前时间的时间戳
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("时间戳="+currentTimeMillis);
		
		//获取当前时间对象
		Date date=new Date();
		//Sat Feb 11 12:04:03 IRKT 2023
		System.out.println("当前时间="+date);
		//转为字符串：Sat Feb 11 12:04:03 IRKT 2023
		System.out.println("当前时间="+date.toString());
		//转换为本地时区：2023年2月11日 下午12:04:03
		System.out.println("当前时间，Locale="+date.toLocaleString());
		//转换为GMT时区：11 Feb 2023 04:04:03 GMT
		System.out.println("当前时间，GMT="+date.toGMTString());
	}
	
}
