package com.yyg.staticdemo;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Student {

	//成员变量
	public String name;
	
	//静态变量
	public static String className;
	
	//静态变量
	public static int age;
	
	//静态常量
	public static final String SCHOOL_NAME="湘北中学";
	
	//静态方法
	public static void setAge(int age) {
		//静态方法中不能使用this和super！
		//this.age=age;
		
		//可以通过“类名.静态成员”的形式来调用
		Student.age=age;
		//在本类中，我们也可以直接在static方法中直接访问本来中的静态成员
		System.out.println("age="+age+",className="+className);
	}
	
}
