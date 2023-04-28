package demo04;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class OperatorDemo03 {

	public static void main(String[] args) {
		// 关系运算符
		int a = 10;
		int b = 20;

		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// 判断奇数与偶数
		// 偶数条件： a % 2 == 0
		// 奇数条件： a % 2 != 0
		System.out.println("a != b " + (a != b));
		System.out.println("a % 2 != 0 " + (a % 2 != 0));
	}

}
