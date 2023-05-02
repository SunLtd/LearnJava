package demo10;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Person {

	// 姓名
	public String name;

	// 性别
	private String sex;

	// 年龄
	private int age;

	/**
	 * 吃饭
	 */
	public void eat() {
		System.out.println("我会吃饭...");
	}

	/**
	 * 说话
	 */
	public void speak(String name, String sex, int age) {
		System.out.println("我会说话...我的名字是：" + name + ",性别：" + sex + ",年龄=" + age);
	}

}
