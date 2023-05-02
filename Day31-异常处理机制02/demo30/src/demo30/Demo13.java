package demo30;

import java.io.IOException;
import java.util.Optional;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo13 {

	public static void main(String[] args) throws IOException {
		String str="一一哥";
		//创建一个包含非空值的Optional对象。如果传入的值为null，则会抛出NullPointerException异常。
		Optional<String> optional = Optional.of(str);
		if(optional.isPresent()) {
			String value = optional.get();
			System.out.println("value="+value);
		}else {
			System.out.println("字符串为空");
		}

		//ofNullable方法
		String name = null;
		//Optional.ofNullable静态工厂方法,创建一个包含指定值的Optional对象，如果传入的值为null，则返回一个空的Optional对象
		Optional<String> optionalName = Optional.ofNullable(name);
		String orElse = optionalName.orElse("Unknown");
		System.out.println("值="+orElse);
	}
	
}
