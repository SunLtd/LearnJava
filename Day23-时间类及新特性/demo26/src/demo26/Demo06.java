package demo26;

import java.util.Calendar;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo06 {

	public static void main(String[] args) {
		// 设置时间
        Calendar c = Calendar.getInstance();
        // 清除所有
        c.clear();
        // 设置2023年
        c.set(Calendar.YEAR, 2023);
        // 设置2月(0~11)
        c.set(Calendar.MONTH, 1);
        // 设置2日
        c.set(Calendar.DATE, 2);
        // 设置时间
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 22);
        c.set(Calendar.SECOND, 23);
        //Thu Feb 02 21:22:23 IRKT 2023
        System.out.println("date="+c.getTime());
	}
	
}
