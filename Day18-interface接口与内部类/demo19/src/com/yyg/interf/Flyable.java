package com.yyg.interf;

import java.io.Serializable;

/**
 * 
 * @author 一一哥Sun
 * V我：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 飞行能力
 */
public interface Flyable extends Serializable{
	
	//接口中的方法，默认都是公开的抽象方法，不用加public和abstract关键字，也不用有方法体
	void fly();

	//JDK 8开始，接口中允许有默认的方法实现,该方法可以带public，也可以不带，但是不能是private修饰的
	public default void flyInDream() {
		System.out.println("在梦中，我可以飞");
	};
	
	//JDK 9开始，接口中允许有private修饰的私有方法，但是该方法必须有实现的方法体
	private void flyWithMe() {
		System.out.println("跟我一起飞");
	};
	
}
