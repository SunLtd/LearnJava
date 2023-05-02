package com.yyg.staticdemo;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class User {
	
	//静态属性，属于整个类，被整个类的所有对象共享！
	static int num = 10;
	
	//普通属性，属于某个对象，是对象私有的！
	private int age=20;
	
	//静态代码块，在类被加载时自动调用，且只会被调用一次。比普通代码块先执行！
    static {
    	//无论创建几个User对象，本静态代码块都只会执行一次，num++变成11
        System.out.println("这是静态代码块,num="+(num++));
    }    
	
	//非静态代码块，在对象被创建时自动调用，每次创建对象时都会执行，比构造方法先执行！
    {
    	//每创建一个User对象，就会执行一次本代码块，num++变成12，age=20.
        System.out.println("这是非静态代码块,num="+(num++)+",age="+(age++));
    }
	
    //构造方法
    public User(){
    	//每创建一个User对象，就会执行一次构造方法，num++变成13，age=21.
        System.out.println("这是无参构造方法,num"+(num++)+",age="+(age++));
    }
    
}
