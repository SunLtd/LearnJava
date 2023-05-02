package demo25;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 一一哥Sun V我领资料：syc_2312119590 各平台都有壹哥的同名博客哦
 */
public class Demo12 {

	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("123.456");
		BigDecimal d2 = new BigDecimal("123.456789");
		
		// 会产生ArithmeticException异常，因为除不尽,可以设置RoundingMode，按照指定的方法进行四舍五入或者直接截断：
		//BigDecimal d3 = d1.divide(d2); 
		
		// 保留10位小数并四舍五入
		BigDecimal d4 = d1.divide(d2, 10, RoundingMode.HALF_UP); 
		System.out.println("d4="+d4);
		//按指定的位数直接截断，0.xxxx
		BigDecimal d5 = d1.divide(d2, 4, RoundingMode.DOWN); 
		System.out.println("d5="+d5);
		
		//divideAndRemainder方法，返回一个数组，该数组内部包含了两个BigDecimal，分别是商和余数，其中商总是整数，余数不会大于除数。
		//我们可以利用这个特性来判断两个BigDecimal是否是整数倍数。
		BigDecimal n = new BigDecimal("123.456");
        BigDecimal m = new BigDecimal("0.123");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 1003
        System.out.println(dr[1]); // 0.087
        
        if (dr[1].signum() == 0) {
            // n是m的整数倍
        	System.out.println("n是m的整数倍"); 
        }else {
        	System.out.println("n不是m的整数倍"); 
        }
		
	}

}
