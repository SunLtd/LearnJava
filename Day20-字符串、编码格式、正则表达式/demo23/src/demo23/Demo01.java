package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo01 {
	
	public static void main(String[] args) {
		//通过构造方法创建String对象
		
		//构造一个空字符串，相当于String s1="";
		String s1=new String();
		System.out.println("s1的长度="+s1.length()+",s1="+s1);
		
		//构造一个由内容的字符串,相当于String s1 = "一一哥";
		String s2 = new String("跟一一哥学Java"); 
		System.out.println("s2的长度="+s2.length()+",s2="+s2);

		//通过字节数组构建字符串对象
		byte[] b = {97,98,99,100};
		String s3=new String(b);
		System.out.println("s3的长度="+s3.length()+",s3="+s3);
		
		//通过字节数组构建字符串对象
		//参数1:字节数组；参数2:起始下标；参数3:长度
		String s4 = new String(b, 0, b.length);
		System.out.println("s4的长度="+s4.length()+",s4="+s4);

		//通过字符数组创建字符串对象
		char[] c = {'一','一','哥'};
		String s5 = new String(c, 0, c.length);
		System.out.println("s5的长度="+s5.length()+",s5="+s5);
		
	}
	
}
