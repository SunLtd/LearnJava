package demo07;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo04 {

	public static void main(String[] args) {
		// for循环的几种变形写法

		// 1.可以同时定义多个变量
		for (int i = 0, j = 0; i < 100; i++, j++) {
			System.out.println("跟一一哥学java,i=" + i + ",j=" + j);
		}

		// 2.简写形式1
//		int i = 0;
//		for (; i < 100; i++) {
//			System.out.println("跟一一哥学java,i=" + i);
//		}

		// 3.简写形式2
//		int i = 0;
//		for (; i < 100;) {
//			i++;
//			System.out.println("跟一一哥学java,i=" + i);
//		}

		// 3.简写形式3--->死循环
		int i = 0;
		for (;;) {
			i++;
			System.out.println("跟一一哥学java,i=" + i);
		}
	}

}
