package demo26;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo26 {

	//在数据库中经常存储的是Instant时刻，我们可以直接用长整数long表示，在数据库中存储为BIGINT类型。
	public static void main(String[] args) {
        long ts = 1694208900000L;
        System.out.println("中国风格："+timestampToString(ts, Locale.CHINA, "Asia/Shanghai"));
        System.out.println("美国风格："+timestampToString(ts, Locale.US, "America/New_York"));
    }

    static String timestampToString(long epochMilli, Locale lo, String zoneId) {
    	//获取指定时间的秒级时间戳
        Instant ins = Instant.ofEpochMilli(epochMilli);
        //对日期和时间进行格式化设置
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT);
        return f.withLocale(lo).format(ZonedDateTime.ofInstant(ins, ZoneId.of(zoneId)));
    }

}
