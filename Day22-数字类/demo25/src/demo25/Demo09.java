package demo25;

import java.math.BigInteger;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo09 {

	public static void main(String[] args) {
		//创建一个BigInteger对象
		BigInteger bi = new BigInteger("1234567890");
		//计算1234567890的15次方，
		//结果=23589821655914838120947036369147203948318169938519404175968425823418008249115809912616071588527110255905622789563711716349000000000000000
		System.out.println(bi.pow(15)); 	
		
		//BigInteger转基本类型
		BigInteger bi02 = new BigInteger("123456789000");
		//123456789000
		System.out.println("转为int类型="+bi02.intValue()); 
		System.out.println("转为float类型="+bi02.floatValue()); 
		System.out.println("转为long类型="+bi02.longValue()); 
		//将123456789000乘以123456789000，然后将结果转为long类型
		//java.lang.ArithmeticException: BigInteger out of long range
		//System.out.println("得到精确结果="+bi02.multiply(bi02).longValueExact()); 
		
		//计算999999的99次方，并得到该结果的float值
		BigInteger bi03 = new BigInteger("999999").pow(99);
        float f = bi03.floatValue();
        System.out.println("结果="+f);
	}

}
