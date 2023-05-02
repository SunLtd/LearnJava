package com.yyg.member;

import com.yyg.member.OuterClass.InnerClass;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class InnerClassTest {

	public static void main(String[] args) {
		
		//在外部类中，不能直接创建内部类对象，否则：
		//No enclosing instance of type OuterClass is accessible. 
		//Must qualify the allocation with an enclosing instance of type OuterClass 
		//(e.g. x.new A() where x is an instance of OuterClass).
		//InnerClass inner=new InnerClass();
		
		//在外部的其他类中创建内部类对象，需要通过如下格式：
		//内部类 对象名 = new 外部类().new 内部类();
		//InnerClass inner=new OuterClass().new InnerClass();
		
		//也可以拆分成如下格式：
		OuterClass outer=new OuterClass();
		InnerClass inner=outer.new InnerClass();
		
		inner.m1();
		
		InnerClass.m2();
		
	}
}
