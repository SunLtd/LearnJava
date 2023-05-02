package demo26;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo17 {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2023, 05, 24, 13, 15, 20);
        LocalDateTime end = LocalDateTime.of(2025, 11, 8, 19, 25, 30);
        //计算两个时间的间隔
        Duration d = Duration.between(start, end);
        //PT21582H10M10S,间隔21582小时10分10秒
        System.out.println("duration="+d); 

        //计算两个日期的间隔
        Period p = LocalDate.of(2022, 12, 11).until(LocalDate.of(2025, 2, 22));
        //P2Y2M11D,间隔2个月11天
        System.out.println("period="+p); 
        
        //我们也可以使用ofXxx()或parse()方法直接创建Duration
        //10hours
        Duration d1 = Duration.ofHours(10);
        //2day,4hours,5minutes
        Duration d2 = Duration.parse("P2DT4H5M"); 
        System.out.println("d1="+d1); 
        System.out.println("d2="+d2); 
	}

}
