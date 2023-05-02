package com.yyg.staticdemo;

//静态导入System类中的所有静态成员
import static java.lang.System.*;

//静态导入Math类中的所有静态成员
import static java.lang.Math.*;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 * 
 * 静态导包案例
 */
public class StaticImportDemo {

	public static void main(String[] args) {

		//System.out.println("静态导包");
		
		//out其实是java.lang.System类的静态变量，表示标准输出;
		//PI是java.lang.Math类中的静态变量，表示数学里的π常量；
		//java.lang.Math.PI
		out.println(PI);
		
		//我们可以直接调用Math类的sqrt静态方法，返回64的正平方根
		//java.lang.Math.sqrt(E)
		out.println(sqrt(64));
	}

}
