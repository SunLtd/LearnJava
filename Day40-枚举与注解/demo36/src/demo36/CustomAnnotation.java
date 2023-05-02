package demo36;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
@Target(ElementType.METHOD)//限定作用范围
@Retention(RetentionPolicy.RUNTIME)//限定生命周期
public @interface CustomAnnotation {
	
	//自定义元素
	String value();

}
