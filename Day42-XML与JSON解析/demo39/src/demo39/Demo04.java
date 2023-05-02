package demo39;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo04 {

	public static void main(String[] args) {
		// 先创建一个ObjectMapper对象映射对象
		ObjectMapper mapper = new ObjectMapper();
		// 允许json字符串中有单引号,解决JsonParseException:
		// Unexpected character (''' (code 39)): was expecting double-quote to start
		// field name
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		String jsonString = "{'persons':[{'name':'一一哥','age':20,'address':'千锋上海校区'},{'name':'千锋壹哥','age':18,'address':'千锋北京校区'}]}";
		try {
			// 反序列化：将JSON字符串转换为对应的Java对象
			//直接将json字符串转为对应的Java对象
			Persons persons = mapper.readValue(jsonString, Persons.class);
			List<Person> list = persons.getPersons();
			for (Person person : list) {
				System.out.println(person.getName() + "--" + person.getAge() + "--" + person.getAddress());
			}

			// 也可以直接将json字符串转为Map集合
			Map<String, Person> map = mapper.readValue(jsonString, Map.class);
			for (Map.Entry<String, Person> entry : map.entrySet()) {
				System.out.println(entry.toString());
			}
		} catch (JsonProcessingException e) {
			// 处理json处理异常
			e.printStackTrace();
		}
	}

}
