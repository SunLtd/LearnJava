package com.yyg.member;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 * 
 * 成员内部类
 */
public class OuterClass {

	// 外部类的非静态成员
	String name = "一一哥";
	private String hobby = "撸码";
	static int age = 30;

	// 非静态方法
	public void show() {
		//这里的this是指OuterClass对象
		System.out.println("show方法...name="+this.name);
		
		//如果是在外部类里面创建内部类的对象，就不需要创建外部类实例，可以直接new 内部类()
		//InnerClass inner = new InnerClass();
	}

	// 定义一个成员内部类
	public class InnerClass {
		// 也可以定义私有属性
		private int a = 10;

		//在早期的JDK中，成员内部类中不能定义静态变量；但在新版JDK中，成员内部类中可以定义静态变量
		static int b = 20;

		// 非静态方法
		public void m1() {
			// 这里的this对象是InnerClass内部类对象
			System.out.println("成员内部类的成员变量:" + this.a);
			
			//外部类.this.属性或方法，这个this是外部类对象
			System.out.println("外部类的成员变量:" + OuterClass.this.name);
			
			// 内部类中可以访问外部类的私有成员和静态成员
			System.out.println("外部类的私有成员变量:" + hobby);
			System.out.println("外部类的静态变量:" + age);
		}

		//在早期的JDK中，成员内部类中不能定义静态方法；但在新版JDK中，成员内部类中可以定义静态方法
		public static void m2() {
			//在静态方法中创建内部类对象，也要通过内部类 对象名 = new 外部类().new 内部类();的格式
			//InnerClass innerClass = new OuterClass().new InnerClass();
			
			System.out.println("调用成员内部类的静态变量:" + b);
			System.out.println("调用外部类的静态变量:" + age);
		}

	}

}
