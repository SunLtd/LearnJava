package com.yyg.interf;

/**
 * 
 * @author 一一哥Sun
 * V我：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 人类可以继承动物类，同时还可以通过实现若干个接口来扩展自己的能力。
 * 实现接口必须接口里的抽象方法。
 */
public class Person extends Animal implements Flyable{

	@Override
	public void eat() {
		System.out.println("人可以生火做饭吃");
	}

	@Override
	public void drink() {
		System.out.println("人会喝酒");
	}

	@Override
	public void fly() {
		System.out.println("人可以坐飞机飞行");
	}

}
