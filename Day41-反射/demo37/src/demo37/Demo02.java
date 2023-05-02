package demo37;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo02 {
	public static void main(String[] args) {
		try {
			// 给对象赋值
			Person person = new Person();
			person.setAge(18);
			person.setAddress("千锋上海");

			// 获取Person类的字节码
			Class<Person> clazz = Person.class;
			// 获取到公开方法setName
			// Method getNameMethod = clazz.getMethod("setName");
			// getMethod()方法中的第一个参数是反射的方法名称，第二个参数是该方法中的参数类型
			Method getNameMethod = clazz.getMethod("setName", String.class);
			// 如果是私有的方法，也需要设置可访问性
			// getNameMethod.setAccessible(true);
			// 正常情况下，void setName(String name)--->person.setName("一一哥");
			// 反射时：method.invoke(类对象,参数值)，如果没有参数则传递null即可，返回值是方法的执行结果，setName()方法没有返回值
			Object result = getNameMethod.invoke(person, "一一哥");
			System.out.println("name= " + person.getName());

			// 获取私有方法getAge
			Method getAgeMethod = clazz.getDeclaredMethod("getAge");
			// getAge()方法没有参数，所以第二个参数则传入null
			Object ageValue = getAgeMethod.invoke(person, null);
			System.out.println("age= " + ageValue);

			// 获取受保护的方法getAddress
			Method getAddressMethod = clazz.getDeclaredMethod("getAddress");
			Object addressValue = getAddressMethod.invoke(person, null);
			System.out.println("address= " + addressValue);

		} catch (SecurityException | IllegalArgumentException | NoSuchMethodException | IllegalAccessException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
