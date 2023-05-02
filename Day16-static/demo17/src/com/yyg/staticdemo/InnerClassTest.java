package com.yyg.staticdemo;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * 测试访问内部类
 */
public class InnerClassTest {
	
	public static void main(String[] args) {
		//创建内部类对象，格式为“外部类.内部类 对象名 = new 外部类.内部类的构造方法”
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		
		//调用内部类的方法
		inner.printNum();
		
		//访问外部类属性
	    System.out.println("outerNum="+OuterClass.outerNum);
	    
	    //访问内部类属性
	    System.out.println("innerNum="+inner.innerNum);
	}

}
