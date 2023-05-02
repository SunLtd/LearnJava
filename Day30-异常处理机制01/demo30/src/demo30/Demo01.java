package demo30;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo01 {
	public static void main(String[] args) {
		//定义一个长度为3的数组
		int[] array = new int[3];
		try {
			//索引超出了数组长度，将会引发ArrayIndexOutOfBoundsException数组下标越界异常
			array[3] = 1; 
			//发生异常后，这行代码并不会执行
			System.out.println("数组：" + array.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			//指出异常的类型、性质、栈层次及出现在程序中的位置
			e.printStackTrace();
			//输出错误的原因及性质
			System.out.println("数组越界：" + e.getMessage());
			//输出异常的类型与性质
			System.out.println("数组越界：" + e.toString());
		}
	}
}
