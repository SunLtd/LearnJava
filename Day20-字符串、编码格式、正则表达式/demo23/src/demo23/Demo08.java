package demo23;

import java.util.Arrays;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo08 {
	
	public static void main(String[] args) {
		String s1 = "abcADC你好123";
		
		//将字符串中的字母变成大写
		System.out.println("转换后新的字符串="+s1.toUpperCase());
		
		//将字符串中的字母变成小写
		System.out.println("转换后新的字符串="+s1.toLowerCase());
		
		String s2 = "abcd你好";
		//将字符串转变成字节数组
		byte[] b = s2.getBytes();
		System.out.println(Arrays.toString(b));
		
		//将字符串变成字符数组
		char[] c = s2.toCharArray();
		System.out.println(Arrays.toString(c));
		
		//其他类型转字符串
		int i = 10;
		
		//方式1：利用+号进行转换
		String s3 = i+"";
		System.out.println("整形转字符串s3="+s3);
		
		//方式2：将其他的类型的数据转换成String类型
		String s4 = String.valueOf(i);
		System.out.println("整形转字符串s4="+s4);
		
		//方式3：将字节数组转为字符串
		byte[] nums= {97, 98, 99, 100};
		String s5=new String(nums);
		System.out.println("整形转字符串s5="+s5);
		
	}
	
}
