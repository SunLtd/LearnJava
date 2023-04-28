package demo04;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class OperatorDemo05 {

	public static void main(String[] args) {
		// 位运算符
		
		// 按位与&
		System.out.println(18 & 23);

		// 按位或|
		System.out.println(16 | 37);

		// 按位亦或
		System.out.println(13 ^ 34);

		// 按位取反
		System.out.println(~14);
		System.out.println(~-18);

		// 左移 <<
		System.out.println(18 << 2);

		// 右移 >>
		System.out.println(23 >> 2);
		System.out.println(-18 >> 2);

		// 无符号右移 >>>
		System.out.println(-23 >>> 2);
	}

}
