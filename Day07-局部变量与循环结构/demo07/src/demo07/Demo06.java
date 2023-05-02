package demo07;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo06 {

	public static void main(String[] args) {
		// while循环

		// 计算一个数是几位数? 实现思路：将该数循环除以10，记录运算了几次
		int num = 12345;
		int temp = num;
		if (num == 0) {
			System.out.println(num + "是1位数");
		} else {
			// 定义一个变量，用于保存循环的次数
			int count = 0;
			while (num != 0) {
				// 将这个数循环除以10
				num = num / 10;
				// 每次循环次数+1
				count++;
			}
			System.out.println(temp + "是" + count + "位数");
		}
	}

}
