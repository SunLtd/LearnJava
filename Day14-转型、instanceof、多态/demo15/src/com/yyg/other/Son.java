package com.yyg.other;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 * 
 *         子类继承父类---方法的重写是在继承时实现的！没有继承就没有方法重写！
 */
public class Son extends Father {

	// 成员变量--变量隐藏
	// 变量的类型和名称，都与父类中的成员变量相同
	String name = "儿子";

	// 子类中独有的属性
	int age = 10;

	// 吃
	@Override
	public void eat() {
		// 方法重写时，子类可以对父类的同名方法进行扩展实现，方法体的内容可以和父类中的实现不一样
		System.out.println("儿子吃肉");
	}

	// 喝---子类新增的方法。
	// 当父类引用指向子类对象时，父类只能调用执行那些在父类中声明、被子类覆盖的子类方法，而不能执行子类独有的成员方法。
	public void drink() {
		System.out.println("儿子吃肉");
	}

	// 子类中与父类同名的静态方法，这不是重写，而是子类对父类同名静态方法的隐藏！
	public static void play() {
		System.out.println("儿子玩火");
	}

	public static void main(String[] args) {
		// 创建出父类对象
		//Father father = new Father();
		//father.eat();

		// 创建子类对象
		// 虽然子类继承了父类，并重新了父类的方法，但对象的引用指向的是当前对象所属类的对象，即son引用指向的是new Son()对象，这也是编译时多态！
		//Son son = new Son();
		//son.eat();

		// 当父类引用指向子类对象时，父类只能调用执行那些在父类中声明、被子类覆盖的子类方法，而不能执行子类独有的成员方法。
		// Father son2=new Son();
		// The method drink() is undefined for the type Father
		// son2.drink();

		Father son2 = new Son();
		// 当子类和父类有相同属性时，父类会调用自己的属性。
		System.out.println("name=" + son2.name);// 老子
		// 当父类引用指向子类对象向上转型时，若父类调用子类特有的属性，在编译时期就会报错：
		// age cannot be resolved or is not a field
		// son2.age;
		
		//虽然我们不建议通过“对象.方法名”的形式来调用类的静态方法，但这么调用也不会出错。
		son2.play();
	}

}
