package com.yyg.demo;

import java.util.Arrays;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 */
public class FinalTypeDemo {

	public static void main(String[] args) {
		//final修饰基本类型的变量，变量值不可变
		final int x=10;
		
		//The final local variable x cannot be assigned. It must be blank and not using a compound assignment
		//x=20;
		System.out.println("x="+x);
		
		// final修饰数组变量，nums是一个引用变量
        final int[] nums = { 1, 9, 7, 3 };
        System.out.println(Arrays.toString(nums));
        
        //final修饰引用类型时，引用的地址不可变，但引用对象本身的数据内容是可变的
        //Array constants can only be used in initializers
        //nums= {2,0,8,1};
       
        // 对数组里的元素赋值修改没问题
        nums[2] = 10;
        System.out.println(Arrays.toString(nums));
        
        // final修饰Person变量，p是一个引用变量
        final User user = new User();
        // 改变Person对象的age实例变量，合法
        user.setAge(18);
        System.out.println(user.getAge());
        
        //对user变量的引用地址重新赋值，非法
        //The final local variable user cannot be assigned. It must be blank and not using a compound assignment
        //user = new User(30);
	}

}
