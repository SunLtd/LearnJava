package demo13;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Person implements Sport {
	// 姓名
	public String name;

	// 年龄
	private int age;

	//定义带有3个参数的构造方法，第3个参数是自定义的Sport接口类型
	public Person(String name, int age, Sport sport) {
		System.out.println("我的名字是：" + name + ",年龄：" + age);
		sport.pingpang();
	}

	@Override
	public void pingpang() {
		System.out.println("我会打乒乓球");
	}

	// 才艺展示
	public void show() {
		Person p = new Person("张继科", 30, this);
	}

}
