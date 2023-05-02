package demo29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo01 {

	public static void main(String[] args) {
		//定义集合泛型
		//此时的集合只能接受String类型元素，后面ArrayList<>中的<>，里面的String可写可不写
		List<String> list = new ArrayList<>();
		//如果类型不一致，在编译阶段就会检测出有错误，保证了数据的安全性
		//list.add(100);
		list.add("Hello");
		String strValue = list.get(0);
		System.out.println("list value="+strValue);
		
		Set<Integer> set=new HashSet<>();
		//set.add("hello");
		set.add(200);
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer nextValue = iterator.next();
			System.out.println("set value="+nextValue);
		}
		
		//限定Map集合的key是String类型，value是Long类型
		Map<String,Long> map=new HashMap<>();
		//map.put("number", "10000");
		map.put("number", 10000L);
		
		Long value = map.get("number");
		System.out.println("map value="+value);
	}

}
