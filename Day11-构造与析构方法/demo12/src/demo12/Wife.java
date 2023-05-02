package demo12;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Wife {
	// 创建一个私有静态的实例对象
	private static Wife wife = new Wife();

	// 创建私有化无参构造方法
	private Wife() {
	}

	// 创建一个供外界获取当前实例对象的公开静态方法
	public static Wife getInstance() {
		return wife;
	}

	public static void main(String[] args) {
		// 获取Wife对象1
		Wife wife1 = Wife.getInstance();
		// 获取Wife对象2
		Wife wife2 = Wife.getInstance();
		
		// 打印结果会是 true，说明两个对象是同一个对象
		System.out.println(wife1 == wife2);
	}

}
