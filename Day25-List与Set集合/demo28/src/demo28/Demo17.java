package demo28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 一一哥Sun
 */
public class Demo17 {

	public static void main(String[] args) {
		//HashMap
		Map<String, String> map = new HashMap<>();
		map.put("name","一一哥");
		map.put("age", "30");
		map.put("sex", "男");
		
		//遍历方式一：使用迭代器遍历HashMap 
		//获取集合中的entry条目集合
		Set<Entry<String, String>> entrySet = map.entrySet();
		//获取集合中携带的Iterator迭代器对象
		Iterator<Map.Entry<String, String>> iterator = entrySet.iterator(); 
		//通过循环进行迭代遍历
		while (iterator.hasNext()) {     
			//获取每一个Entry条目对象
		    Map.Entry<String, String> entry = iterator.next();    
		    //获取条目中的key
		    String key = entry.getKey();    
		    //获取条目中的value
		    String value = entry.getValue();     
		    System.out.println(key + " = " + value); 
		} 

		//遍历方式二：用foreach循环遍历HashMap 
		for (Map.Entry<String, String> entry : map.entrySet()) {    
		    String key = entry.getKey();     
		    String value = entry.getValue();     
		    System.out.println(key + " = " + value); 
		}
	}
}
