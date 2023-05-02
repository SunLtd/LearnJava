package com.yyg.polymorphism;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * “三角形”类---实现Shape接口，并对接口中的方法进行实现
 */
public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("绘制三角形");
	}

}
