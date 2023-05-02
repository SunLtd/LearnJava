package com.yyg.interf;

/**
 * @author 一一哥Sun
 * V我：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 一个类可以实现多个类
 */
public class Student implements Flyable,Swingable{

	@Override
	public void commonSkill() {
		System.out.println("学会了常规技能操作");
	}

	@Override
	public void swing() {
		System.out.println("学会了游泳技能操作");
	}

	@Override
	public void fly() {
		System.out.println("学会了飞行技能操作");
	}

}
