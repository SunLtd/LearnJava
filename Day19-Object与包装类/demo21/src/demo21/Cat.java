package demo21;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Cat implements Animal{
	
private String name;
	
	public Cat() {}

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("猫爱吃鱼");
	}
	
	@Override
	public String toString() {
		
	    return "Cat name= " + name;
	}

}
