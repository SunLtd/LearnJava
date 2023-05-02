package demo07;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo01 {

	private int age = 18;//实例变量、对象变量，在当前的Demo01类内部有效
	public static String msg = "Hello,一一哥";//静态变量、类变量，因为是public公开的，在当前Demo01类内部，及其他类中都可以使用

	//args也是一种局部变量，在main(){}方法的{}范围内有效
	public static void main(String[] args) {
		int a = 10;//局部变量，在main(){}方法的{}范围内有效
		
		System.out.println("a=" + a);

		System.out.println("msg=" + msg);
		
	}

	public void showAge() {
		//i也是一种局部变量，只在for(){}这对{}范围内
		for(int i=0;i<100;i++) {
			System.out.println("age=" + age);
		}
	}

}
