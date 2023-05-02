package com.yyg.staticdemo;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Student stu01=new Student();
		//调用成员变量
		stu01.name="流川枫";
		System.out.println("学生名称="+stu01.name);
		
		Student stu02=new Student();
		//调用成员变量
		stu02.name="樱木花道";
		System.out.println("学生名称="+stu02.name);
		
		//调用静态变量
		Student.className="高一.10班";
		
		System.out.println("班级名称="+Student.className);
		System.out.println("学校名称="+Student.SCHOOL_NAME);		
		
		//不建议通过“对象.静态变量”的形式来调用静态变量！静态属性应该通过静态方式来访问！
		//The static field Student.className should be accessed in a static way
		//System.out.println("学生所在班级="+stu02.className);
		
		//调用静态方法
		Student.setAge(100);
		
	}
	
}
