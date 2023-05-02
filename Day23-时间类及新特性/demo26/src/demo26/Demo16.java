package demo26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo16 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
        LocalDateTime target = LocalDateTime.of(2022, 12, 25, 10, 15, 10);
        //判断A日期在B日期之前
        System.out.println("before?="+now.isBefore(target));
        
        //判断A日期在B日期之前
        System.out.println(LocalDate.now().isBefore(LocalDate.of(2023, 12, 19)));
        
        //判断A时间在B时间之后
        System.out.println(LocalTime.now().isAfter(LocalTime.parse("10:15:20")));
	}

}
