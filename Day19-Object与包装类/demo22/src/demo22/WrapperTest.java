package demo22;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class WrapperTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//Integer变量的几种定义方式
		Integer i001 = new Integer(50);
		Integer i002=new Integer("100");
		//注意：将字符串转为数值型时，也要注意待转换的类型必须匹配，我们不能将非数字的字符串转为数值型，否则会出现NumberFormatException
		//Integer i007=new Integer("hello");
		Integer i003 = 100;
		//返回一个指定int值的Integer对象
		Integer i004=Integer.valueOf(200);
		//返回指定String值的Integer对象
		Integer i005=Integer.valueOf("300");
		//第2个参数radix，表示基数，即当前采用的进制
		Integer i006=Integer.valueOf("400",16);
		System.out.println("i006="+i006);
		
		//获取Integer的最大值与最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//Double类型的用法
		//将数值型或字符串类型转为Double类型
		Double d001 = new Double(100.1);
		Double d002 = new Double("200.2");
		//Double d007 = new Double("hello");
		Double d003 = 300.3;
		Double d004 =Double.valueOf(400.4);
		//通过doubleValue()方法取double值
		System.out.println("d004="+d004.doubleValue());
		
		Double d005 =Double.valueOf("500.5");
		//直接使用
		System.out.println("d005="+d005);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//字符串转Integer或Double类型
		String s1 = "123";
		//方式1：
		int i007 = Integer.parseInt(s1);
		System.out.println("i007="+i007);
		//方式2：
		int i008 = Integer.valueOf(s1);
		System.out.println("i008="+i008);

		String s2 = "20.5";
		//方式1：
		double d006 = Double.parseDouble(s2);
		System.out.println("d006="+d006);
		//方式2：
		double d007 = Double.valueOf(s2);
		System.out.println("d007="+d007);

		//java.lang.NumberFormatException,数字格式化异常
		//String s3 = "hello";
		String s3 = null;
		//System.out.println(Integer.parseInt(s3));
		
		//类型间转换
		Integer a = 100;
		//将Integer转为Byte类型
		Byte b = a.byteValue();
		//将Integer转为Short类型
		Short c = a.shortValue();
		//将Integer转为Long类型
		Long d = a.longValue();
		//将Integer转为Float类型
		Float e = a.floatValue();
		//将Integer转为Double类型
		Double f = a.doubleValue();
		//取出数值的整数部分，将Integer转为int
		int g = a.intValue();
		//包装类转字符串
		String intStr = Integer.toString(1000);
		String dobuleStr = Double.toString(200.5);
		Byte by=126;
		String byteStr=Byte.toString(by);
		
	
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d+",e="+e+",f="+f+",g="+g);
	}
}
