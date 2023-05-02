package demo26;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo05 {

	public static void main(String[] args) {
		//定义一个月份数组
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		int year;
		
		// 使用当前时间和日期,初始化Gregorian日历对象,默认为本地时间和时区
		GregorianCalendar gcalendar = new GregorianCalendar();
		// 显示当前时间和日期的信息
		System.out.print("Date:");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gcalendar.get(Calendar.YEAR));
		
		System.out.print("Time:");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));

		//判断当前年份是否为闰年
		if (gcalendar.isLeapYear(year)) {
			System.out.println("当前年份是闰年");
		} else {
			System.out.println("当前年份是平年");
		}
	}

}
