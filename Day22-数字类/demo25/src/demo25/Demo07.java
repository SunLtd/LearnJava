package demo25;

import java.util.Random;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo07 {

	public static void main(String[] args) {
		// 随机类生成随机数
		Random r = new Random();
		
		// 生成[0,1.0]区间的小数
		double d1 = r.nextDouble();
		System.out.println("d1="+d1);
		
		// 生成[0,10.0]区间的小数
		double d2 = r.nextDouble() * 10;
		System.out.println("d2="+d2);
		
		// 生成[0,10]区间的整数
		int i1 = r.nextInt(10);
		System.out.println("i1="+i1);
		
		// 生成[0,25)区间的整数
		int i2 = r.nextInt(30) - 5;
		System.out.println("i2="+i2);
		
		// 生成一个随机长整型值
		long l1 = r.nextLong();
		System.out.println("l1="+l1);
		
		// 生成一个随机布尔型值
		boolean b1 = r.nextBoolean();
		System.out.println("b1="+b1);
		
		// 生成一个随机浮点型值
		float f1 = r.nextFloat();
		System.out.println("f1="+f1);
	}

}
