package demo07;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo02 {

	public static void main(String[] args) {
		// for循环

		// 循环输出100遍 ”跟一一哥学java“
		for (int i = 0; i < 100; i++) {
			System.out.println("跟一一哥学java,i=" + i);
		}

		// 计算1-100的和，1+2+3+4+5+...+100
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// i = 1;
			// sum=0+1;
			// i = 2;
			// sum= 1+2;
			sum = sum + i;
		}
		System.out.println("sum=" + sum);
	}

}
