package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo02 {
	
	public static void main(String[] args) {
		//直接赋值的方式创建String对象
		//注意：null表示String对象为空，而""表示是一个长度为零、内容为空的空字符串对象，但该对象不为空！
		//定义一个值为null的空字符串
		String s1=null;
		System.out.println("s1="+s1);
		
		//定义一个内容为空，长度为零的字符串
		String s2 = "";
		System.out.println("s2的长度="+s2.length()+",s22="+s2);
		
		//定义一个带有内容的字符串
		String s3 = "一一哥";
		System.out.println("s3的长度="+s3.length()+",s3="+s3);
		
	}
	
}
