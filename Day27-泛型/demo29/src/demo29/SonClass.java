package demo29;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 带有泛型的父类
 */
public class SonClass<T1,T2,T3> extends FatherClass<T1>{

	private T1 t1;
	private T2 t2;
	private T3 t3;
	
	public void showType() {
		System.out.println("子类的泛型--"+t1);
	}
	
	public static void main(String[] args) {
		SonClass<Integer, String, String> sonClazz = new SonClass<Integer, String, String>();
		sonClazz.showType();
	}
}
