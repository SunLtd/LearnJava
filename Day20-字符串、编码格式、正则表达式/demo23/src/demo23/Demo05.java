package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo05 {
	
	public static void main(String[] args) {
		String s1 = "yiyige"; 
		
		//判断两个字符串的内容是否相同
		System.out.println("yiYige".equals(s1));
		
		//判断两个字符串是否相等,忽略大小写
		System.out.println("yiyige".equalsIgnoreCase(s1));
		
		//判断字符串是否为空，或是否有空白字符
		
		//长度为0，字符串为空
		String s2="";
		
		//长度不是0，字符串不为空
		String s3=" ";
		
		//长度不是0，字符串不为空
		String s4=" \n";
		
		//判断字符串是否为空串""
		System.out.println("s2为空吗？"+s2.isEmpty());
		System.out.println("s3为空吗？"+s3.isEmpty());
		System.out.println("s4为空吗？"+s4.isEmpty());
		
		//判断字符串是否是空串或有空白字符
		System.out.println("s2为空吗？"+s2.isBlank());
		System.out.println("s3为空吗？"+s3.isBlank());
		System.out.println("s4为空吗？"+s4.isBlank());
		
		String s5 = "1234567890123";
		//判断字符串是否以指定的字符开头
		System.out.println(s5.startsWith("12"));
		
		//判断字符串是否以指定的字符串开头,并指定开始位置
		System.out.println(s5.startsWith("34", 2));
		
		//判断字符串是否以指定的字符串结尾
		System.out.println(s5.endsWith("23"));
		
		//判断字符串中是否包含指定的字符串
		System.out.println(s5.contains("SB"));
		
	}
	
}
