package demo13;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo01 {

	public static void main(String[] args) {
		Demo01 demo=new Demo01();
		int max01 = demo.max(10, 20);
		System.out.println("较大的整数是："+max01);
		
		float max02 = demo.max(20.0f, 39.8f);
		System.out.println("较大的单精度数是："+max02);
		
		double max03 = demo.max(22.88, 10.88);
		System.out.println("较大的双精度数是："+max03);
		
		double max04 = demo.max(44.88, 5);
		System.out.println("较大的双精度数是："+max04);
		
	}

	// 输出较大的那个整数
	public int max(int a, int b) {
		// 采用三目运算符进行简化判断
		return a >= b ? a : b;
	}

	// 输出较大的那个单精度数
	public float max(float a, float b) {
		// 采用三目运算符进行简化判断
		return a >= b ? a : b;
	}

	// 输出较大的那个单精度数
	public double max(double a, double b) {
		// 采用三目运算符进行简化判断
		return a >= b ? a : b;
	}
	
	//定义一个私有的方法，该方法的两个参数类型不同，这同样也属于方法重载。
	private double max(double a, int b) {
		// 采用三目运算符进行简化判断
		return a >= b ? a : b;
	}
	
}
