package demo03;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class TypeDemo06 {

	public static void main(String[] args) {
		// 隐含强制类型转换，初始化时。
		//100默认是int类型，
		//虽然int>byte,但Java会把-128到127之间的数字，隐含强制转换成低级别的byte和short类型，
		//所以不用我们进行显式的强制类型转换。
		byte b = 100;
		System.out.println("b=" + b);
		
		//b2=-129，b2=128都会报错，Type mismatch: cannot convert from int to byte。
		//byte b2 = -129;
		
		long a = 100;
		//long a = 100L;
		float f=100;
		System.out.println("f=" + f);
	}

}
