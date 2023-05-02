package demo23;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo10 {
	
	public static void main(String[] args) {
		try {
			// 系统默认的编码是Unicode
			byte[] b1 = "中国".getBytes(); 
			String s1=new String(b1);
			System.out.println("s1="+s1);
			
			// 将字符串按UTF-8编码进行转换
			byte[] b2 = "中国".getBytes("UTF-8");
			String s2=new String(b2);
			System.out.println("s2="+s2);
			
			// 将字符串按UTF-8编码进行转换，另一种方式
			byte[] b3 = "中国".getBytes(StandardCharsets.UTF_8); 
			String s3=new String(b3);
			System.out.println("s3="+s3);
			
			// 将字符串按GBK编码进行转换
			byte[] b4 = "你好".getBytes("GBK");
			//将字节数组解码，转为新的字符对象，并明确采用的编码格式
			//注意，此处必须明确指明采用哪种编码，此处采用的编码格式，要与编码时的格式一致，否则中文会乱码。
			//String s4=new String(b4,"UTF-8");
			//此处必须是采用GBK
			String s4=new String(b4,"GBK");
			System.out.println("s4="+s4);
			
		} catch (UnsupportedEncodingException e) {
			//注意：设置字符串的编码时，可能会出现不支持的编码异常UnsupportedEncodingException。
			//关于异常，以后壹哥再给大家细讲
			e.printStackTrace();
		} 
	}
	
}