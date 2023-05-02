package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo06 {
	
	public static void main(String[] args) {
		String s1 = "abcn12c3fcds";
		
		//charAt(index)，获取指定下标位置上对应的字符，并返回char类型
		System.out.println("下标索引位置3上的字符是："+s1.charAt(3));
		
		//indexOf("字符串")，获取指定字符串在原字符串中的下标位置，如果不包含该字符串则返回-1
		System.out.println("字符串的索引位置是："+s1.indexOf("cn2"));
		
		//lastIndexOf("字符串")，与indexOf()方法类似，区别是该方法是从后往前找，找到指定字符最后出现的位置
		System.out.println("指定字符的索引为："+s1.lastIndexOf("c"));
		
		//length()，获取字符串的长度
		System.out.println("字符串的长度是："+s1.length());
		
	}
	
}
