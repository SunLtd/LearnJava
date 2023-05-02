package demo37;

import java.lang.reflect.Field;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo01 {
	public static void main(String[] args) {
		try {
			//给对象赋值
			Person person=new Person();
			person.setName("一一哥");
			person.setAge(18);
			person.setAddress("千锋上海");
			
			// 获取Person类的字节码
			Class<Person> clazz = Person.class;
			// 获取到公有的成员变量name
			Field nameField = clazz.getField("name");
			//获取属性的值。正常情况下是“String name=person.get()”,反射时则正好相反，“field.get(对象)”
			Object nameValue = nameField.get(person);
			System.out.println("name = "+nameValue);
			
			// 获取到私有的成员变量age
			Field ageField = clazz.getDeclaredField("age"); 
			//注意：private修饰的元素必须要设置可访问性，否则会出现非法访问的异常"java.lang.IllegalAccessException"，
			//设置私有属性的可访问性，属于是“暴力反射”
			ageField.setAccessible(true);
			Object ageValue = ageField.get(person);
			System.out.println("age = "+ageValue);
			
			// 获取到受保护的成员变量address
			Field addressField = clazz.getDeclaredField("address"); 
			Object addressValue = addressField.get(person);
			System.out.println("address = "+addressValue);
			
			//获取所有公开的属性
			Field[] fields = clazz.getFields();
			for(Field field: fields) {
				Object value = field.get(person);
				System.out.println("public value---"+value);
			}
			
			//获取到所有的成员变量，无论公开或私有
			Field[] declaredFields = clazz.getDeclaredFields();
			for(Field field: declaredFields) {
				//设置可访问性
				field.setAccessible(true);
				Object value = field.get(person);
				System.out.println("value---"+value);
			}
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		} 
	}
}
