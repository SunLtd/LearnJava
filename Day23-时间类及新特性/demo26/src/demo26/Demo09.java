package demo26;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo09 {

	public static void main(String[] args) {
		//设置日期时间格式化模式，这个模式是根据需求自定义展示的，也可以是"yyyy年MM月dd日 E HH点 mm分 ss秒"等格式
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//进行日期格式化
		String date = format.format(new Date());
		System.out.println("格式后的结果:" + date);
		
		try {
			//解析日期，将一个时间字符串解析为Date类型，这里有可能会产生解析异常
			String time="2022-02-12 17:30:39";
			Date date2 = format.parse(time);
			System.out.println("解析后的结果:" + date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
