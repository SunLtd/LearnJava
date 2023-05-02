package demo26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo11 {

	public static void main(String[] args) {
		// 解析时间字符串
		LocalDateTime dt = LocalDateTime.parse("2023-02-22T20:18:15");
		System.out.println("dt="+dt);
		
		LocalDate date = LocalDate.parse("2012-10-15");
		System.out.println("date="+date);
		
		LocalTime time = LocalTime.parse("16:15:20");
		System.out.println("time="+time);
	}

}
