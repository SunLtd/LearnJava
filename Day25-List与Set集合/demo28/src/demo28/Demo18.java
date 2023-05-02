package demo28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 一一哥Sun
 */
public class Demo18 {

	public static void main(String[] args) {
		//HashMap
		Map<String, String> map = new HashMap<>();
		map.put("name","一一哥");
		map.put("age", "30");
		map.put("sex", "男");
		
		// 获取HashMap中所有的键 
		Set<String> keySet = map.keySet(); 
		for(String key : keySet) {
			System.out.println("key="+key); 
		}

		// 获取HashMap中所有的值 
		Collection<String> values = map.values(); 
		for(String value:values) {
			System.out.println("value"+value); 
		}
	}
}
