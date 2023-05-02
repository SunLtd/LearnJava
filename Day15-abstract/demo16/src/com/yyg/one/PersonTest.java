package com.yyg.one;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 */
public class PersonTest {
	public static void main(String[] args) {
		// 如果直接去new一个抽象类，结果就会变成这种形式，这是匿名类的形式，需要我们实现抽象方法。
//		Person p=new Person() {
//			
//			@Override
//			public double standardWeight(int height) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};

		// 创建Man对象
		Person man = new Man();
		double manWeight = man.standardWeight(175);
		System.out.println("男人体重="+manWeight);

		// 创建Woman对象
		Person woman = new Woman();
		double womanWeight = woman.standardWeight(165);
		System.out.println("女人体重="+womanWeight);
	}

}
