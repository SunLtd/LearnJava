package demo26;

import java.util.Date;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo02 {

	public static void main(String[] args) {
		//获取当前时间对象
		Date date=new Date();
		//获取年月日
		System.out.println("年="+(date.getYear() + 1900)); // 必须加上1900
        System.out.println("月="+(date.getMonth() + 1)); // 0~11，必须加上1
        System.out.println("日="+date.getDate()); // 1~31，不能加1
        System.out.println("时="+date.getHours()); // 0~23
        System.out.println("分="+date.getMinutes()); // 0~59，不能加1
        System.out.println("秒="+date.getSeconds()); // 0~59，不能加1
        System.out.println("时间戳="+date.getTime()); // 时间戳，毫秒值
        		
		//计算自己已经活了多少天，1990年01月31日
		//构造对象的另一个方法，已过时。year:要减去1900，月份从0开始，0-11；日期是1-31
        Date d1 =  new Date(1990-1900, 2-1, 31);
        Date d2 = new Date();
        long time = d2.getTime() - d1.getTime();
        System.out.println("已活天数="+time/1000/60/60/24);
	}
	
}
