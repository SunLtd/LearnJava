package demo28;

import java.util.Iterator;
import java.util.List;

public class Demo02 {

	public static void main(String[] args) {
		List<String> list = List.of("java", "大数据", "壹壹哥");
		
		// List遍历方式一，普通for循环：
		for (int i = 0; i < list.size(); i++) {
			System.out.println("遍历方式一，值=" + list.get(i));
		}

		// List遍历方式二，迭代器：
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			// 取出下一个值
			String value = it.next();
			System.out.println("遍历方式二，值=" + value);
		}

		// List遍历方式三，增强for循环：内部会自动使用Iterator
		for (String item : list) {
			System.out.println("遍历方式三，item=" + item);
		}
	}

}
