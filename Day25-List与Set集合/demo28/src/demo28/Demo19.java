package demo28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 一一哥Sun
 */
public class Demo19 {

	public static void main(String[] args) {
		//Collections的使用--排序方法
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(2);
		//调用Collections的sort()排序方法---升序
		Collections.sort(list);
		System.out.println(list);  // [1, 2, 3]
		
		//调用Collections的reverse()排序方法--降序
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		Collections.reverse(list2);
		System.out.println(list2);  // [3, 2, 1]
		
		//调用Collections的shuffle()排序方法--随机
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		Collections.shuffle(list3);
		System.out.println(list3);  // [2, 1, 3]
	}
}
