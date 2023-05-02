package demo26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo10 {

	public static void main(String[] args) {
		//获取当前日期和时间
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("dt="+dt);
		
		// 转换到当前日期
		LocalDate d = dt.toLocalDate(); 
		System.out.println("date="+d);
		
		// 转换到当前时间
		LocalTime t = dt.toLocalTime(); 
		System.out.println("time="+t);
	}

}
