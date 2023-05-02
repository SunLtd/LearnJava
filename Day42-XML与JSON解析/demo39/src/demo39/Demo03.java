package demo39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo03 {

	public static void main(String[] args) {
		try {
			//创建一个集合
			Map<String,List<Person>> map=new HashMap<>();
			List<Person> list=new ArrayList<>();
			
			Person p1=new Person();
			p1.setName("一一哥");
			p1.setAge(20);
			p1.setAddress("千锋上海校区");
			
			Person p2=new Person();
			p2.setName("千锋壹哥");
			p2.setAge(18);
			p2.setAddress("千锋北京校区");
			
			Person p3=new Person();
			p3.setName("孙老师");
			p3.setAge(30);
			p3.setAddress("千锋青岛校区");
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			
			map.put("persons", list);
			
			//创建一个ObjectMapper对象映射对象
			ObjectMapper mapper = new ObjectMapper();
			//序列化：将Java对象转为json字符串
			String json = mapper.writeValueAsString(map);
			System.out.println("json="+json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
