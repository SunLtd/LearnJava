package demo26;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo25 {

	public static void main(String[] args) {
		//新版API中的ZonedDateTime，先转为long类型
		ZonedDateTime zdt = ZonedDateTime.now();
		//获取秒级时间戳，转为long类型
		long ts = zdt.toEpochSecond() * 1000;
		System.out.println("ts=" + ts);

		//然后将long类型,转为旧版API中的Date
		Date date = new Date(ts);
		System.out.println("date=" + date);
		
		//将long类型转为旧版API中的Calendar对象
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setTimeZone(TimeZone.getTimeZone(zdt.getZone().getId()));
		calendar.setTimeInMillis(zdt.toEpochSecond() * 1000);
		System.out.println("calendar=" + calendar);
	}

}
