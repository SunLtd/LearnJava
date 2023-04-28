package demo03;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class TypeDemo04 {

	public static void main(String[] args) {
		// 自动类型转换:小转大，自动转换，啥也不用做

		// 1.byte-->short,可以
		byte b = 19;
		short s = b;
		// short-->byte，不可以自动转换：Type mismatch: cannot convert from short to byte
		// byte b2=s;
		System.out.println("s=" + s);

		// 2.short-->int,可以
		int i = s;
		System.out.println("i=" + i);
		// int-->short,不可以自动转换:Type mismatch: cannot convert from int to short
		// short s2=i;

		// 3.char-->int,可以
		char c = 'a';
		int j = c;
		System.out.println("j=" + j);
		// int-->char,不可以自动转换:Type mismatch: cannot convert from char to int
		// char c2=j;

		// 4.int-->long,可以
		long x = i;
		System.out.println("x=" + x);
		// long-->int,不可以自动转换:Type mismatch: cannot convert from int to long
		// j = x;

		// 5.int-->float,可以
		float f1 = i;
		System.out.println("f1=" + f1);
		// float-->int,不可以自动转换:Type mismatch: cannot convert from float to int
		// j = f1;

		// 6.int-->double,可以
		double d1 = i;
		System.out.println("d1=" + d1);
		// double-->int,不可以自动转换:Type mismatch: cannot convert from double to int
		// j = d1;

		// 7. long-->float，可以
		float f2 = x;
		System.out.println("f2=" + f2);
		// float-->long,不可以自动转换:Type mismatch: cannot convert from float to long
		// x = f2;

		// 8. long-->double，可以
		double d2 = x;
		System.out.println("d2=" + d2);
		// double-->long,不可以自动转换:Type mismatch: cannot convert from double to long
		// x = d2;

		// 9. float-->double，可以
		double d3 = f1;
		System.out.println("d3=" + d3);
		// double-->float,不可以自动转换:Type mismatch: cannot convert from double to float
		// f2 = d3;
	}

}
