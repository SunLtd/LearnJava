package demo29;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo03 {
	public static void main(String[] args) {
		//调用泛型类
		Pair<String> pair = new Pair<>("Hello", "World");
		// 输出 "Hello"
		System.out.println("first="+pair.getFirst()); 
		// 输出 "World"
		System.out.println("last="+pair.getSecond()); 
	}
}
