package demo04;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class OperatorDemo04 {

	public static void main(String[] args) {
		// 逻辑运算符，结果是boolean类型
		
		int a = 17;
	    //a是否是一个偶数且大于10
		
		//短路与：如果条件表达式中，前面的结果为false，就不再执行后面的表达式，效率较高。
	    System.out.println(a % 2 == 0 && a > 10);
	    //即使条件表达式中，前面的结果为false，依然会执行后面的表达式，效率较低。
	    System.out.println(a % 2 == 0 & a > 10);

	    //a是一个奇数，或是否小于15
	    //短路或：如果条件表达式中，前面的结果为false，就不再执行后面的表达式，效率较高。
	    System.out.println(a % 2 != 0 || a < 15);
	    //即使条件表达式中，前面的结果为false，依然会执行后面的表达式，效率较低。
	    System.out.println(a % 2 != 0 | a < 15);

	    //a是否是一个奇数？
	    System.out.println(!(a % 2 == 0));

	    //&的用法
	    int b = 10;
	    int c = 12;
	    boolean flag = b > c & b== 10;
	    System.out.println(flag);
	}

}
