package com.yyg.polymorphism;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * “圆形”类---实现Shape接口，并对接口中的方法进行实现
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("绘制圆形");
	}

}
