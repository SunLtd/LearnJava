package demo29;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 带有泛型的父类
 */
public class FatherClass<T1> {

	private T1 t;
	
	public void showType() {
		System.out.println("父类的泛型--"+t);
	}
}
