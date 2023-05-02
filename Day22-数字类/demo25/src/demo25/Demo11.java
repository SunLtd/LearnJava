package demo25;

import java.math.BigDecimal;

/**
 * @author 一一哥Sun V我领资料：syc_2312119590 各平台都有壹哥的同名博客哦
 */
public class Demo11 {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("1000.05800");
		// 计算大数字加上99的结果
        System.out.println("加法的结果:" + bd.add(new BigDecimal("99")));
        // 计算大数字减去25的结果
        System.out.println("减法的结果:" + bd.subtract(new BigDecimal("25")));
        // 计算大数字乘以1000的结果
        System.out.println("乘法的结果:" + bd.multiply(new BigDecimal(1000)));
		
		//获取小数的位数，5
		System.out.println(bd.scale()); 
		
		//去掉BigDecimal末尾的0，返回一个与原有BigDecimal相等的新对象
		BigDecimal bd2 = bd.stripTrailingZeros();
		System.out.println(bd2.scale()); 
	}

}
