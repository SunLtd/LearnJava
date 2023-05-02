package demo28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 一一哥Sun
 */
public class Demo21 {

	public static void main(String[] args) {
		//Collections的使用--替换方法
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		//替换方法
		Collections.replaceAll(list, 2, 4);
		System.out.println(list);  // [1, 4, 3]
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		//指定元素填充List集合
		Collections.fill(list2, 0);
		System.out.println(list2);  // [0, 0, 0]

		List<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(-2);
		list3.add(88);
		list3.add(88);
		//查找集合中的最大值
		System.out.println("max="+Collections.max(list3));  
		System.out.println("min="+Collections.min(list3));  
		// 判断88在List集合中出现的次数，返回2
        System.out.println(Collections.frequency(list3, 88));
	}
}
