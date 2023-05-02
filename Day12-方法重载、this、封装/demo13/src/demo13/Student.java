package demo13;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Student {

	private String name;

	private int age;

	private String sex;

	public Student(String name, String sex, int age) {
		//方法的形参与属性名相同，可以通过“this.属性名”的形式进行区分
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public static void main(String[] args) {
		Student stu=new Student("一一哥", "男", 35);
		System.out.println("name="+stu.name+",sex="+stu.sex+",age="+stu.age);
	}
}
