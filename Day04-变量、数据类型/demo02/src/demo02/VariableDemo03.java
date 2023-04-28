package demo02;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class VariableDemo03 {

	// 进阶案例
	public static void main(String[] args) {
		// 定义变量x，同时赋值为100
		int x = 100;
		// 打印x的值
		System.out.println("x = " + x);

		// 变量x赋值给另一个变量y
		//int y = x;
		// 打印y的值
		//System.out.println("y = " + y);
		
		//变量x赋值给多个变量
		int y = x, z = x;
		System.out.println("y = " + y+",z = "+z);
	}

}
