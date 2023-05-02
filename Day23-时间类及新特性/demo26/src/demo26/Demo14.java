package demo26;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo14 {

	public static void main(String[] args) {
		// 对日期进行加减操作
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println("dt1=" + dt1);
		
		// 注意：如果某个月中没有29、30、31等日期,会出现java.time.DateTimeException: Invalid date 'FEBRUARY 31'类似的异常。
        //LocalDateTime dt2 = dt1.withDayOfMonth(31);
		
		//日期变为25日
        LocalDateTime dt2 = dt1.withDayOfMonth(25);
        System.out.println("dt2="+dt2); // 2019-10-31T20:30:59
        
        //月份变成5月
        LocalDateTime dt3 = dt2.withMonth(5);
        //2023-05-25T20:06:06.768
        System.out.println("dt3="+dt3); 
		
        //年份变成2024年
        LocalDateTime dt4 = dt3.withYear(2024);
        //2024-05-25T20:06:06.768
        System.out.println("dt4=" +dt4); 
	}

}
