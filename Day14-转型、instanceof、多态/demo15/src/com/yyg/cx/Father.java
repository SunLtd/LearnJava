package com.yyg.cx;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 * 
 *         定义父类
 */
public class Father {

	// 父类中的成员变量
	String name="老子";

	// 构造方法不能被重写，因为构造方法不能被继承！
	public Father() {
		System.out.println("爹的构造方法");
	}

	// 吃
	public void eat() {
		System.out.println("爹吃馒头");
	}

	// 喝
	public void drink() {
		System.out.println("爹喝水");
	}

	// 玩
	// 私有方法不能被重写
//	private void play() {
//		System.out.println("爹玩火");
//	}

	// 静态方法不能被重写，但可以在子类中声明一个同样的静态方法。
//	public static void play() {
//		System.out.println("爹玩火");
//	}

	// final方法不能被重写
	public final void play() {
		System.out.println("爹玩火");
	}

}
