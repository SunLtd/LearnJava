package demo25;

import java.text.DecimalFormat;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo08 {

	public static void main(String[] args) {
		// 实例化DecimalFormat类对象，并设置格式
		//小数点后保留1位
		DecimalFormat df1 = new DecimalFormat("0.0");
		//整数格式
		DecimalFormat df2 = new DecimalFormat("#.#");
		//小数点后保留3位小数
		DecimalFormat df3 = new DecimalFormat("000.000");
		//以100%百分比格式显示
		DecimalFormat df4 = new DecimalFormat("#%");
		
		float f = 1000f;
		// 对输入的数字应用格式，并输出结果
		System.out.println("0.0格式:" + df1.format(f));
		System.out.println("#.#格式:" + df2.format(f));
		System.out.println("000.000格式:" + df3.format(f));
		System.out.println("百分比格式:" + df4.format(f));
	}

}
