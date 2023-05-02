package demo28;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一一哥Sun
 */
public class Demo13 {

	public static void main(String[] args) {
		//HashMap
        Map<String,String> map=new HashMap<>();
        map.put(null, null);
        map.put(null, null);
        System.out.println(map.size());
	}
}
