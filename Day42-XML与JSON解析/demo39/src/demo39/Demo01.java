package demo39;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo01 {

	public static void main(String[] args) {
		//先创建一个ObjectMapper对象映射对象
		ObjectMapper mapper = new ObjectMapper();
		//允许json字符串中有单引号,解决JsonParseException: 
		//Unexpected character (''' (code 39)): was expecting double-quote to start field name
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true); 
		String jsonString = "{'name':'一一哥','age':18,'address':'上海'}";
		try {
		    //反序列化：将JSON字符串转换为对应的Java对象
		    Person person = mapper.readValue(jsonString, Person.class);
		    System.out.println(person.getName()+"--"+person.getAge()+"--"+person.getAddress());
		} catch (JsonProcessingException e) {
			//处理json处理异常
		    e.printStackTrace();
		}
	}

}
