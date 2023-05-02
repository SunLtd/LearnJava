package demo13;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Car {
	// 汽车品牌
	public String logo;

	// 汽车颜色
	private String color;

	// 汽车价格
	private double price;

	// 无参构造方法
	public Car() {
		System.out.println("汽车类...");
	}

	// 有参构造方法
	public Car(String logo) {
		System.out.println("汽车类...logo=" + logo);
	}

	// 有参构造方法
	public Car(String logo, String color) {
		System.out.println("汽车类...logo=" + logo + ",color=" + color);
	}

	// 有参构造方法
	public Car(String logo, String color, double price) {
		System.out.println("汽车类...logo=" + logo + ",color=" + color + ",price=" + price);
	}

}
