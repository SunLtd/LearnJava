package demo10;

/**
 * 
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo02 {

	public static void main(String[] args) {
		// 对象的使用

		// 先创建一个对象
		Person p1 = new Person();

		// 调用对象的属性(该属性不能是私有的,否则别的类中无法看到)--状态.
		String name = p1.name;

		// 调用对象的方法
		p1.eat();
		p1.speak("一一哥", "男", 18);

	}

}
