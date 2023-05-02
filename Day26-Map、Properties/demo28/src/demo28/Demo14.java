package demo28;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一一哥Sun
 */
public class Demo14 {

	public static void main(String[] args) {
		//HashMap
		Map<String, String> map = new HashMap<>();
		map.put("name","一一哥");
		map.put("age", "30");
		map.put("sex", "男");
		System.out.println("map="+map);
		
		//从集合中移除元素
		map.remove("age");
		System.out.println("map="+map);
	}
}
