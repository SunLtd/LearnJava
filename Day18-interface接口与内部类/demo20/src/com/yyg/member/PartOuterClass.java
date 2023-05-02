package com.yyg.member;

/**
 * 
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 局部内部类---定义在方法中的内部类
 */
public class PartOuterClass {

	//类的成员变量
	String name="一一哥";
    private int age=30;
    static String hobby="java";
    
    public void show() {
    	//局部变量
        int num = 10;
        
        //局部内部类，类似于是方法中的局部对象
        class PartInnerClass{
        	
        	//内部可以正常定义方法
            public void m1() {
            	//访问外部类的非静态成员，可以使用OuterClass.this.成员的格式，也可以直接访问
            	//System.out.println("外部类的成员变量"+name);
                System.out.println("外部类的成员变量"+PartOuterClass.this.name);
                System.out.println("外部类私有的成员变量"+age);
                System.out.println("外部类的静态变量"+hobby);
                
                //局部内部类，可以直接访问方法中的局部变量
                System.out.println("访问局部变量"+num);
            }
            
            //在新版的jdk中，也可以定义静态的属性和方法，老版的jdk则不行
            static int b=10;
            
            public static void m2() {
            	System.out.println("外部类的静态变量，hobby="+hobby+"，b="+b);
            }
        }
        
        //创建局部内部类对象
        PartInnerClass inner = new PartInnerClass();
        inner.m1();
        
        //在当前类中，局部内部类可以直接访问静态成员
        PartInnerClass.m2();
        
    }    
    
}
