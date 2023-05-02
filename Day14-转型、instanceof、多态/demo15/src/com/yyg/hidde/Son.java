package com.yyg.hidde;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 * 
 * 子类继承父类
 */
public class Son extends Father {

	// 吃---静态方法
	//如果没有定义该方法，子类可以继承使用父类的eat()方法
	public static void eat() {
		//子类覆盖父类中的同名静态方法(类)
		System.out.println("儿子吃肉");
	}
	
	public static void main(String[] args) {
		//调用子类自己的静态方法
		eat();
		
		//调用父类的静态方法
		Father.eat();
	}

}
