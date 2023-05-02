package demo29;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo09 {

	public static void main(String[] args) {
		SubGenericClass<Integer,String> sub=new SubGenericClass<>("hello");
		sub.doSomething(100);
		String otherData = sub.getOtherData();
		System.out.println("t2---data="+otherData);
	}
}
