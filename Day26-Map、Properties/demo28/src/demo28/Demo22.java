package demo28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 一一哥Sun
 */
public class Demo22 {

	public static void main(String[] args) {
		//Collections的使用--同步方法
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		//将指定集合转换为线程安全的集合
		Collection<Integer> synchronizedList = Collections.synchronizedCollection(list);
		System.out.println("list="+synchronizedList);
		
		//同步方法2
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		//将指定的List集合转换为线程安全的List集合
		List<Integer> synchronizedList2 = Collections.synchronizedList(list2);
		System.out.println("list2="+synchronizedList2);

		//同步方法3
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		//将指定的Set集合转换为线程安全的Set集合
		Set<Integer> synchronizedSet = Collections.synchronizedSet(set);
		System.out.println("set="+synchronizedSet);
		
		//同步方法4
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		//将指定的Map集合转换为线程安全的Map集合
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
		System.out.println("map="+synchronizedMap);
	}
}
