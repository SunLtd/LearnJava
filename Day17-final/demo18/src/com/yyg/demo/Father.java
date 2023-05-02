package com.yyg.demo;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 */
public class Father {
	
	private String name;
	
	private double salary;
	
	public final void setName(String name) {
		this.name=name;
	}
	
	//重载final方法
	public final void setName(String firstName,String lastName) {
		this.name=firstName+lastName;
	}
	
	//父类中私有的方法
	private final void setSalary(double salary) {
		this.salary=salary;
	}

}
