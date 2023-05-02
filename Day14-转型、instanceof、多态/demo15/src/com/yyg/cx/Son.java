package com.yyg.cx;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 * 
 *         子类继承父类---方法的重写是在继承时实现的！没有继承就没有方法重写！
 */
public class Son extends Father {

	// 成员变量--变量隐藏
	// 变量的类型和名称，都与父类中的成员变量相同
	String name = "儿子";

	int age = 10;

	// 构造方法不能被重写，因为构造方法不能被继承！
	// @Override
	// public Father() {}

	// 吃
	/**
	 * 方法重写时可以带有@Ovriride关键词，当重写的方法签名不一致时，可以有编译错误的提示。
	 * 否则方法签名不一致时不会有错误提示，会被当做一个新的方法来处理。
	 */
	@Override
	public void eat() {
		// 如果子类的功能，是在父类的基础之上进行的额外扩展增加，
		// 我们可以使用super关键字调用父类的同名方法,然后再进行自己的额外扩展！
		// 如果子类的实现和父类完全不一样，可以不调用super！
		super.eat();

		// 方法重写时，子类可以对父类的同名方法进行扩展实现，方法体的内容可以和父类中的实现不一样
		System.out.println("儿子吃肉");
	}

	// 喝
	@Override
	public void drink() {
		// 如果子类的实现和父类完全不一样，可以不调用super！
		System.out.println("儿子喝酒");
	}

	// 变量隐藏--调用父类和子类中的同名成员变量
	public void sayHello() {
		// 如果子类的实现和父类完全不一样，可以不调用super！
		System.out.println("父亲的名字=" + super.name);
		System.out.println("儿子的名字=" + name);
	}

	public static void main(String[] args) {
		Son son = new Son();
		son.sayHello();
	}

	/**
	 * 父类私有的、static、final等方法无法被重写
	 */
	// @Override
	// public void play() {}

	// static静态的父类方法不能被重写，但可以在子类中再重新编写一个静态的同名方法。
	// public static void play() {}

}
