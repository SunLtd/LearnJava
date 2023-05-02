package demo10;

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
	
	//定义一个字符串常量
	public static final String CAR_MANUFACTURER="大众";
	
	/**
	 * 为私有的成员变量提供对外的公开方法，方便其他类对该属性进行访问。
	 * 获取汽车的logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * 为汽车的logo重新赋值
	 * @param logo
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//复写toString方法，返回汽车信息
	@Override
	public String toString() {

		return "[Logo]=" + logo + ",[Color]=" + color + ",[Price]=" + price;
	}

}
