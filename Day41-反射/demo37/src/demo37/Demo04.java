package demo37;

import java.lang.reflect.Method;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo04 {

	// 给该方法添加一个自定义的注解
	@MyAnnotation("hello,一一哥")
	public void myMethod() {
		System.out.println("反射加注解，法力大无边");
	}

	public static void main(String[] args) {
		try {
			Demo04 obj = new Demo04();
			// 获取到obj对象里的myMethod方法
			Method method = obj.getClass().getMethod("myMethod");
			// 获取该方法上的MyAnnotation注解
			//MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

//			if (annotation != null) {// 判断注解是否为空
//				// 获取注解的value属性值
//				String value = annotation.value();
//				//value= hello,一一哥
//				System.out.println("value= " + value);
//			}
			
			//反射解析注解
			if (method.isAnnotationPresent(MyAnnotation.class)) {
			    MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
			    // 获取注解的value属性值
				String value = annotation.value(); 
				System.out.println("value= " + value);
			}
		} catch (SecurityException | IllegalArgumentException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
