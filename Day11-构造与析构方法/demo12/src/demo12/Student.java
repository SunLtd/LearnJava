package demo12;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Student {

	private String name;
	
	private int age;

	private String sex;

	private double score;

	public Student() {
		// 当我们自己显式地创建了构造方法后，默认的构造方法即失效
		System.out.println("这是无参的构造方法");
	}

	//构造方法重载
	public Student(String name) {
		System.out.println("这是有参的构造方法");
		// 我们可以在构造方法中，进行类的初始化操作
		System.out.println("name=" + name);
	}

	//构造方法重载
	public Student(String name, String sex, double score) {
		System.out.println("这是有参的构造方法");
		// 我们可以在构造方法中，进行类的初始化操作
		this.name = name;
		//直接在构造方法中给变量赋初值
		this.sex = "男";
		this.score = 99;
	}

}
