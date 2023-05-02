package com.yyg.one;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * 抽象的人类
 */
public abstract class Person {
	//身高
	//public int height;
	
	//抽象方法只有方法的声明，没有方法体
	//计算个人标准体重，男性标准体重(kg)=[身高(cm)-80]×0.7，女性标准体重(kg)=[身高(cm)-70]×0.6
	public abstract double standardWeight(int height);
	
	//非抽象的具体方法
	public void eat() {
		System.out.println("吃吃吃...");
	}
	
}
