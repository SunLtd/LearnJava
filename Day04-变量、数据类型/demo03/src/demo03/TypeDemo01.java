package demo03;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class TypeDemo01 {

	public static void main(String[] args) {
		// 定义byte类型的变量
		// byte b = 10;

		// byte b = 127;

		// byte b = -128;
		// System.out.println(b);

		// 编译阶段就会出错
		// byte b = 128;
		// System.out.println(b);

		// 定义short类型的变量
		// short s = 128;
//	    short s = 12800;
//	    System.out.println(s);

		// 定义int类型的变量
		// int i = 100000;
		// System.out.println(i);

		// 定义long类型的变量,后面要带L或l(不是1，也不是i)
//	    long l = 364748123123L; 
//	    System.out.println(l);

		// 定义float类型的变量，后面带F或f
//	    float f = 10.2F;
//	    System.out.println(f);
//
//	    float f1 = 9999.9994f;
//	    System.out.println(f1);

		// 定义double类型的变量，后面可以带D或d，也可以不带
//		double d = 10d;
//		System.out.println(d);
//
//		double d1 = 12345678910111213.0;
//		System.out.println(d1);
		
		//定义字符型，字符带有英文的''
//		char c1 = '中';
//	    char c2 = 20013;
//	    char c3 = '\u0041';
		//单引号中只能有一个字符！
	    //char c4 = '中国';
//
//	    System.out.println(c1);
//	    System.out.println(c2);
//	    System.out.println(c3);
		
		//boolean类型，真假(一般用条件判断)，true false
	    //boolean flag = true;
	    boolean flag = false;
	    System.out.println(flag);
	    
	    int age = 12;
	    boolean isAdult = age >= 18; // 计算结果为false
	    System.out.println(isAdult);
	}

}
