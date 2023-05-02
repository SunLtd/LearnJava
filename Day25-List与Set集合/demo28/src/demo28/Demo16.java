package demo28;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一一哥Sun
 */
public class Demo16 {

	public static void main(String[] args) {
		//HashMap
		Map<String, String> map1 = new HashMap<>();
		map1.put("name","一一哥");
		map1.put("age", "30");
		map1.put("sex", "男");
		
		// 创建另一个TreeMap集合 
		Map<String, String> map2 = new HashMap<>(); 
		map2.put("height", "180"); 
		map2.put("salary", "5w"); 

		//将map1中的键值对添加到map2中 
		map2.putAll(map1); 
		System.out.println("map2="+map2);
	}
}
