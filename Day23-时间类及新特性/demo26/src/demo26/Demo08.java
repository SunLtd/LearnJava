package demo26;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo08 {

	public static void main(String[] args) {
		// 获取不同格式化风格和中国环境的日期
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
		//DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
		//DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
		//DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
		
		// 将不同格式化风格的日期格式化为日期字符串
		String date = df1.format(new Date());
	
		// 获取不同格式化风格和中国环境的时间
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
		// 将不同格式化风格的时间格式化为时间字符串
		String time = df2.format(new Date());
		
		// 输出日期和时间
		System.out.println("SHORT格式:" + date+" "+time);
	}

}
