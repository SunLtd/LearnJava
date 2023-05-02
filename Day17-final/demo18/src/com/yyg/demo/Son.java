package com.yyg.demo;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 */
public class Son extends Father{
	
	//private String name;
	
	//子类不能重新父类中的final方法！
	//Cannot override the final method from Father
	//public void setName(String name) {
	//	this.name=name;
	//}
	
	private double salary;

	//子类中定义与父类同名通参的方法，这不属于方法重写！
	private void setSalary(double salary) {
		this.salary=salary;
	}
}
