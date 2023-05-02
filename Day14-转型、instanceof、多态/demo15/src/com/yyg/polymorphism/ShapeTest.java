package com.yyg.polymorphism;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class ShapeTest {

	public static void main(String[] args) {
		//多态测试
		Shape shape01=new Circle();
		shape01.draw();
		
		Shape shape02=new Traingle();
		shape02.draw();
		
		Shape shape03=new Square();
		shape03.draw();
	}

}
