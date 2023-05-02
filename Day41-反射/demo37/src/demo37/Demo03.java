package demo37;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo03 {
	public static void main(String[] args) {
		try {
			// 获取Person类的构造方法
			Class<Person> clazz = Person.class;
			// 获取公开的构造方法
			Constructor<Person> publicConstructor = clazz.getConstructor(String.class, int.class, String.class);
			//调用构造方法
			Person newInstance = publicConstructor.newInstance("一一哥",18,"千锋上海");
			System.out.println("person="+newInstance.toString());
			
			// 获取私有的构造方法
			Constructor<Person> privateConstructor = clazz.getDeclaredConstructor(int.class);
			//私有方法需要设置可访问性,否则会产生非法访问异常
			privateConstructor.setAccessible(true);
			//调用私有的构造方法
			Person newInstance2 = privateConstructor.newInstance(18);
			System.out.println("person2="+newInstance2.toString());
			
			// 获取受保护的构造方法
			Constructor<Person> protectedConstructor = clazz.getDeclaredConstructor(String.class);
			Person newInstance3 = protectedConstructor.newInstance("壹哥");
			System.out.println("person3="+newInstance3.toString());
		} catch (SecurityException | IllegalArgumentException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
