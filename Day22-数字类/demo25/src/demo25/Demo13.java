package demo25;

import java.math.BigDecimal;

/**
 * @author 一一哥Sun V我领资料：syc_2312119590 各平台都有壹哥的同名博客哦
 */
public class Demo13 {

	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("123.456");
		BigDecimal d2 = new BigDecimal("123.456000");
		// false,因为scale不同
		System.out.println("d1==d2? "+d1.equals(d2)); 
		// true,因为d2去除尾部0后scale变为2
		System.out.println("d1==d2? "+d1.equals(d2.stripTrailingZeros())); 
		 //结果=0
		System.out.println("d1==d2? "+d1.compareTo(d2));
	}

}
