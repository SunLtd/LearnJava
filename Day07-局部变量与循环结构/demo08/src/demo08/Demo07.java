package demo08;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo07 {

	public static void main(String[] args) {
		// foreach循环
		//定义一个整形数组
		int[] numbers = { 100, 200, 300, 400, 500 };

		for (int x : numbers) {
			System.out.print(x+",");
		}
		
		System.out.print("\n");
		
		//定义一个字符串数组
		String[] names = { "一一哥", "壹壹哥", "千锋教育", "千锋java" };
		for (String name : names) {
			System.out.print(name+",");
		}
	}

}
