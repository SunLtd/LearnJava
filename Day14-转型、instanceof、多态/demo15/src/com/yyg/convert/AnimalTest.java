package com.yyg.convert;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 * 
 *         子类继承父类
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 向上转型
		// 父类引用dog变量，指向子类对象new Dog();
		Animal dog = new Dog();
		// 向上转型后，可以使用父类Animal中的属性和方法。
		dog.speak();

		Cat cat = new Cat();
		// 以下两行代码效果一样
		// Animal animal=new Cat();
		Animal animal = cat;
		animal.speak();

		Cat cat2 = new Cat();
		// 这里我们传参时，既可以传递animal，也可以传递cat，但不能传递dog类型,否则会出现java.lang.ClassCastException:
		// 因为class com.yyg.convert.Dog cannot be cast to class
		// com.yyg.convert.Cat。狗不能被转成猫
		// cat2.helloAnimal(dog);
		cat2.helloAnimal(animal);

		// Dog dog = new Dog();
		// 这里就会编译出错，不允许把Dog对象类型转换成Cat对象类型
		// Cat cat = (Cat)dog;

		// 判断animal是否是Cat类型
		if (animal instanceof Cat) {
			animal.speak();
		}

		// 如果dog是Cat类型，才会进行方法调用，否则不会执行
		if (dog instanceof Cat) {
			// 判断类型后再进行强制类型转换
			Cat cat3 = (Cat) dog;
			cat3.speak();
		}

		// 从Java 14开始，判断instanceOf后，可以直接转型为指定类型的变量，不用再次强制转型。
		Object obj = "java14新特性";
		if (obj instanceof String s) {
			System.out.println("字符串变大写=" + s.toUpperCase());
		}

		if (dog instanceof Cat c) {
			c.speak();
		}
		
		//instanceOf也经常和三目(条件)运算符一起使用
		Object obj2 = "hello 壹壹哥";
		String result=obj2 instanceof String ? "yes":"no";
		System.out.println(result);

	}

}
