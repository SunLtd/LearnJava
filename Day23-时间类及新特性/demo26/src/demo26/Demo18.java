package demo26;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo18 {

	public static void main(String[] args) {
		//获取默认时区的时间对象
		ZonedDateTime zdt1 = ZonedDateTime.now(); 
		System.out.println("zdt1="+zdt1); 
		
		 //获取指定时区的时间对象
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("zdt2="+zdt2); 
	}

}
