package demo12;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Teacher {

	private String name;

	private int age;

	private double salary;

	public Teacher() {
		// 当我们自己显式地创建了构造方法后，默认的构造方法即失效
		this("一一哥");
	}

	// 构造方法重载
	public Teacher(String name, int age, double salary) {
		// 我们可以在构造方法中，进行类的初始化操作
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// 构造方法重载
	public Teacher(String name) {
		//在一个构造方法中，通过this调用另一个构造方法Teacher(String, int,double)。
		//大家要注意，当我们在构造方法中调用另一个构造方法时，this()操作必须放在构造方法的第一行，注释语句除外！
		//否则会产生如下异常：
		//Constructor call must be the first statement in a constructor
		this(name, 28, 18888.88);
	}
	
}
