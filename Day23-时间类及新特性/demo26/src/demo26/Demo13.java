package demo26;

import java.time.LocalDateTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo13 {

	public static void main(String[] args) {
		// 对日期进行加减操作
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println("dt1=" + dt1);
		
        // 加3天减6小时:
        LocalDateTime dt2 = dt1.plusDays(3).minusHours(6);
        // 2019-10-31T17:30:59
        System.out.println("dt2=" +dt2); 
        
        // 减1月:
        LocalDateTime dt3 = dt2.minusMonths(1);
        // 2019-09-30T17:30:59
        System.out.println("dt3=" +dt3); 
        
        //加两周
        LocalDateTime dt4 = dt3.plusWeeks(2);
        System.out.println("dt4=" +dt4); 
	}

}
