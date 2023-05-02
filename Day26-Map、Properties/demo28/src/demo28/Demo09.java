package demo28;

import java.util.LinkedList;

/**
 * @author 一一哥Sun
 */
public class Demo09 {

	public static void main(String[] args) {
		// 创建LinkedList集合
		LinkedList<String> names = new LinkedList<String>();
		// 一个一个地添加元素
		names.add("一一哥");
		names.add("java");
		names.add("数学");

		//在链表的开头添加元素
        names.addFirst("壹壹哥");
        
        //在链表的结尾添加元素
        names.addLast("历史");

		// 遍历集合
		for (String name : names) {
			System.out.println("name=" + name);
		}
		
		//移除链表开头的元素
        names.removeFirst();
        //移除链表结尾的元素
        names.removeLast();
	}
}
