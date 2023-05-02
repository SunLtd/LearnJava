package demo26;

import java.util.Date;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo07 {

	public static void main(String[] args) {
		// 初始化 Date 对象
		Date date = new Date();
		//c：全部日期和时间
		System.out.printf("全部日期和时间信息：%tc%n", date);
		//f：年-月-日
		System.out.printf("年-月-日的格式：%tF%n", date);
		//d：月/日/年
		System.out.printf("月/日/年的格式：%tD%n", date);
		//r：HH:MM:SS PM
		System.out.printf("HH:MM:SS PM的格式(12时制)：%tr%n", date);
		//t：HH:MM:SS格式（24时制）
		System.out.printf("HH:MM:SS的格式(24时制)：%tT%n", date);
		//R：HH:MM格式（24时制）
		System.out.printf("HH:MM的格式(24时制)：%tR", date);
		
		//用格式化字符串,指出要被格式化的参数索引。
		// 使用toString()显示日期和时间
	    System.out.printf("%1$s %2$tB %2$td, %2$tY","Due date:", date);
	}

}
