package demo26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo12 {

	public static void main(String[] args) {
		// 根据指定的日期和时间创建LocalDateTime对象

		// 2023-01-25, 月份与之前不同：1-12分别表示1-12个月
		LocalDate date = LocalDate.of(2023, 1, 25);
		// 20:35:48
		LocalTime time = LocalTime.of(20, 35, 48);
		LocalDateTime dt1 = LocalDateTime.of(date, time);
		System.out.println("dt1=" + dt1);

		LocalDateTime dt2 = LocalDateTime.of(2023, 1, 23, 20, 35, 48);
		System.out.println("dt2=" + dt2);
	}

}
