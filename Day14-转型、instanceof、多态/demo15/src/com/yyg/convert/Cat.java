package com.yyg.convert;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 * 
 * 子类继承父类
 */
public class Cat implements Animal {

	@Override
	public void speak() {
		System.out.println("猫子：喵喵");
	}

	//给其他动物打招呼
	public void helloAnimal(Animal animal) {
		//向下转型，将父类型转为子类型。
		//此时有可能会出现ClassCastException类型转换异常，因为子类一定属于父类的一员，但父类不一定属于子类。
		//我们说“猫是动物”一定没问题，但如果说“动物是猫”，这个结论未必正确。所以把“动物强转成猫”的过程中，有可能会出现异常。
		//只有两者之间具有明确的父子关系时才能进行强转，否则就会出现类型转换异常。
		
		//向下转型时需要进行类型强转
		Cat cat=(Cat) animal;
		//向下转型后，可以使用子类Cat中的属性和方法。
		cat.speak();
	}
	
}
