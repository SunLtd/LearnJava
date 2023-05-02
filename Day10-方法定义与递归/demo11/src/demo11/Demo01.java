package demo11;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo01 {

	public static void main(String[] args) {
		// 调用方法，获取到返回结果
		String result = showMsg(16, "一一哥", "要好好学习");
		System.out.println(result);
	}

	// 访问修饰符 返回值 方法名 参数类型 参数名
	public static String showMsg(int age, String name, String msg) {
		// 方法体
		String result;

		if (age >= 18) {
			result = name + ",恭喜你成年啦," + msg;
		} else {
			result = name + ",你还没成年," + msg;
		}

		// 返回结果
		return result;
	}

	//定义一个非静态的实例方法
	// 访问修饰符 返回值 方法名 参数类型 参数名
	public String showMsg2(int age, String name, String msg) {
		// 方法体
		String result;

		if (age >= 18) {
			result = name + ",恭喜你成年啦," + msg;
		} else {
			result = name + ",你还没成年," + msg;
		}

		// 返回结果
		return result;
	}

}
