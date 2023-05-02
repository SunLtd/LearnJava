package com.yyg.other;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 * 
 *         定义父类
 */
public class Father {

	// 父类中的成员变量
	String name = "老子";

	// 吃
	public void eat() {
		System.out.println("爹吃馒头");
	}

	// 父类中的静态方法。静态方法不能被重新，只会被子类隐藏！
	public static void play() {
		System.out.println("爹玩球");
	}
	
}
