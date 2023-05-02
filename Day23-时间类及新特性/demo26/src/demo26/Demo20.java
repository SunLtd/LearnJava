package demo26;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo20 {

	public static void main(String[] args) {
		//将北京时间转为纽约时间
		//获取北京时区的当前时间
		//注意：这里的时区名字不能随便瞎写，否则会产生java.time.zone.ZoneRulesException: Unknown time-zone ID: Asia/Beijing
        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("zdt1=" + zdt1);
        
        //将当前时区的时间，转换为纽约时间
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("zdt2=" + zdt2);
		
		//转换为本地时间
		LocalDateTime ldt = zdt2.toLocalDateTime();
		System.out.println("ldt=" + ldt);
	}

}
