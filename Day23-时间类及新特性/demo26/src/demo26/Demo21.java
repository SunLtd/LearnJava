package demo26;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo21 {

	public static void main(String[] args) {
		//获取默认的本地时间
		ZonedDateTime zdt = ZonedDateTime.now();
		//获取一个DateTimeFormatter对象,如果需要输出固定字符，可以用'xxx'表示，如'中国时间'
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss ZZZZ '中国时间'");
        System.out.println(formatter.format(zdt));

        //获取一个DateTimeFormatter对象,中国时区
        var zhFormatter = DateTimeFormatter.ofPattern("yyyy MMM dd EE HH:mm:ss", Locale.CHINA);
        System.out.println(zhFormatter.format(zdt));
        //改变默认的显示格式,用指定的格式显示
        //System.out.println(DateTimeFormatter.ISO_DATE.format(zdt));

        //获取一个DateTimeFormatter对象,美国时区
        var usFormatter = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy HH:mm:ss", Locale.US);
        //System.out.println(usFormatter.format(zdt));
        //改变默认的显示格式
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(zdt));
	}

}
