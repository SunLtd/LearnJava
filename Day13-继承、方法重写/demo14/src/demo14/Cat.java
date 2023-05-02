package demo14;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * 定义子类
 */
public class Cat extends Animal{
	
	//从父类中继承共同的属性和方法，但不能继承父类的构造方法和私有属性！

	//定义独有属性
    String color;

    //定义独有方法
    public void catchMouse() {
        System.out.println("抓老鼠...");
    }
	
}
