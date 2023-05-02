package demo26;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 一一哥Sun V我领资料：syc_2312119590 各平台都有壹哥的同名博客哦
 */
public class Demo24 {

	public static void main(String[] args) {
		// 将旧版API中的Date，转为新版API中的Instant对象
		Instant instant = new Date().toInstant();
		System.out.println("instant=" + instant);

		// 将旧版API中的Calendar，转为新版API中的Instant，然后再进一步转为新版的ZonedDateTime:
		Calendar calendar = Calendar.getInstance();
		Instant instant2 = calendar.toInstant();
		ZonedDateTime zdt = instant2.atZone(calendar.getTimeZone().toZoneId());
		System.out.println("zdt=" + zdt);
	}

}
