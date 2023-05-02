package demo23;

import java.util.Arrays;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo07 {
	
	public static void main(String[] args) {
		
		String s1 = "hello,SB";
		
		//将字符串与指定的字符串进行拼接,相当于s1 = s1 + "world";
		s1 = s1.concat("world"); 
		System.out.println("新的字符串="+s1);
		
		//用指定的字符串连接字符串数组
		String[] arr = {"A", "B", "C"};
		String str = String.join("***", arr); // "A***B***C"
		System.out.println("新的字符串str="+str);
		
		//字符串替换：将字符串中指定的字符串替换成指定的字符串
		s1 = s1.replace("SB", "**");
		System.out.println("新的字符串="+s1);
		
		String s2 = "A,,B;C ,D";
        //利用正则表达式，将字符串中指定的字符串替换成指定的字符串；
		//通过正则表达式，把匹配的子串统一替换为","
		s2 = s2.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"
		System.out.println("新的字符串s2="+s2);

		//字符串截取，从指定的下标开始和结束，范围是左闭右开
		s1 = s1.substring(0, 5);
		System.out.println("新的字符串="+s1);

		//字符串截取，从指定的下标开始一直截取到字符串的最后。
		//注意：StringIndexOutOfBoundsException
		s1 = s1.substring(3);
		System.out.println("新的字符串="+s1);

		//字符串切割，按照指定的字符串对原字符串进行切割
		String s3 = "zhangsan-lisi-wangwu";
		//利用指定的分隔符进行分割
		String[] s = s3.split("-");
		System.out.println(Arrays.toString(s));
		
		//去除字符串前后的空格
		String s4 = "      你好，       哈哈      ";
		s4 = s4.trim();
		System.out.println("新的字符串s4="+s4);
		
	}
	
}
