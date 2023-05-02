package com.yyg.demo;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class FinalDemo {

	// final修饰局部变量，该变量使用之前要赋初值
	public void declareFinal() {
		// 先声明变量
		final int x;
		// 再赋初值，该值只能赋一次，否则会报错。
		x = 200;
		// The final local variable x may already have been assigned
		// x = 400;
		System.out.println("x=" + x);

		// 声明的同时赋值
		final int y = 300;
		System.out.println("y=" + y);
	}

	// 修饰成员变量

	// 实例常量
	final int a = 10; // 直接赋值
	final int b; // 空白final变量，需要在构造方法中进行初始化

	// 静态常量
	final static int c = 20;// 直接赋值
	final static int d; // 空白final变量，需要在静态代码块中进行初始化

	static {
		// 初始化静态变量
		d = 40;
	}

	FinalDemo() {
		// 初始化成员变量
		b = 20;
		// 不能第二次赋值，否则会发生编译错误
		// The final local variable b may already have been assigned
		//b = 30;
	}

	public static void main(String[] args) {
		FinalDemo demo = new FinalDemo();
		demo.declareFinal();
	}

}
