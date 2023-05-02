package demo14;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦 属性:姓名、年龄、性别
 *         封装步骤:(1).把成员变量变成私有的;(2).添加公开的get和set方法
 */
public class Person {

	// 私有化属性
	private String name;
	private int age;
	private String sex;

	//设置公开方法
	// 获取name
	public String getName() {
		return name;
	}

	// 对name赋值
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// 限制年龄的范围
		if (age > 100 || age < 1) {
			// 设置一个默认值
			this.age = 18;
		} else {
			this.age = age;
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		// 设置性别
		if ("男".equals(sex) || "女".equals(sex)) {
			this.sex = sex;
		} else {
			this.sex = "男";
		}
	}

	//提供无参和有参的构造方法
	public Person() {
		super();
	}
	
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

}
