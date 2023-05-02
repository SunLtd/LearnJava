package demo08;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo01 {

	public static void main(String[] args) {
		//break关键字
		//需求：从1累加到100，找到累加到哪个数时，就使得sum和大于888
		// 定义变量保存总和
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			if (sum > 888) {
				System.out.println("累加到"+i+"时，sum和就大于888");
				// 结束当前循环
				break;
				//这里的语句执行不到，编译阶段就会报错
				//System.out.println("能执行吗？？");
			}
			//这里的语句可以执行，当break跳出循环后，就不会再继续执行
			System.out.println("能执行吗？？"+i); 
		}
	}

}
