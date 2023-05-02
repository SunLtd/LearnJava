package com.yyg.staticdemo;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * 外部类和内部类
 */
public class OuterClass {
	
	//普通属性，属于外部类
	int outerAge=10;
	
	//外部的静态属性
	static int outerNum=10;
	
	//定义一个静态的内部类，如果不带static，就是一个普通的内部类。
	//内部类的使用，和普通类一样，里面可以正常定义属性、方法、构造方法等。
	static class InnerClass{
		//私有属性无法在类的外部直接访问
		//private int innerNum=20;
		
		int innerNum=20;
		
		public void printNum() {
			//这里的this是指InnerClass内部类对象！
			OuterClass outer=new OuterClass();
		
			System.out.println("innerNum="+this.innerNum+",outerAge="+outer.outerAge+",outerNum="+OuterClass.outerNum);
		}
	}

}
