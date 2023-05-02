package demo26;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author 一一哥Sun V我领资料：syc_2312119590 各平台都有壹哥的同名博客哦
 */
public class Demo19 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2023, 1, 25, 10, 15, 11);
		//获取默认时区的时间对象
		ZonedDateTime zdt1 = ldt.atZone(ZoneId.systemDefault());
		System.out.println("zdt1=" + zdt1);

		//获取指定时区的时间对象
		ZonedDateTime zdt2 = ldt.atZone(ZoneId.of("America/New_York"));
		System.out.println("zdt2=" + zdt2);
	}

}
