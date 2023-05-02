package demo39;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo02 {

	public static void main(String[] args) {
		try {
			//创建一个Person对象
			Person person=new Person();
			person.setName("一一哥");
			person.setAge(20);
			person.setAddress("千锋上海校区");
			
			//创建一个ObjectMapper对象映射对象
			ObjectMapper mapper = new ObjectMapper();
			//序列化：将Java对象转为json字符串
			String json = mapper.writeValueAsString(person);
			System.out.println("json="+json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
