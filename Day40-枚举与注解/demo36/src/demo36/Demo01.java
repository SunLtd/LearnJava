package demo36;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo01 {
	
	//@CustomAnnotation
	//private String name;//不能在方法之外的其他地方使用这个自定义的注解，否则会报错

	//使用自定义的注解
	@CustomAnnotation(value = "一一哥")
	public void myMethod() {
	    // method body
	}
}
