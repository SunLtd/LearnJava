package demo28;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一一哥Sun
 */
public class Demo15 {

	public static void main(String[] args) {
		//HashMap
		Map<String, String> map = new HashMap<>();
		map.put("name","一一哥");
		map.put("age", "30");
		map.put("sex", "男");
		
		//根据key获取指定的元素
		String name = map.get("name");
		String age = map.get("age");
		//根据key获取指定的元素，并设置默认值
		String sex = map.getOrDefault("sex","男");
		String height = map.getOrDefault("height","0");
		System.out.println("[name]="+name+",[age]="+age+",[sex]="+sex+",[height]="+height);
	}
}
