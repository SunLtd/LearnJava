package demo28;

import java.util.LinkedList;

/**
 * @author 一一哥Sun
 */
public class Demo10 {

	public static void main(String[] args) {
		// 创建LinkedList集合
		LinkedList<String> names = new LinkedList<String>();
		// 一个一个地添加元素
		names.add("一一哥");
		names.add("java");
		names.add("数学");

		System.out.println("first=" + names.getFirst());
		System.out.println("last=" + names.getLast());

		// 迭代遍历集合
		for (String name : names) {
			System.out.println("name=" + name);
		}
		
	}
}
