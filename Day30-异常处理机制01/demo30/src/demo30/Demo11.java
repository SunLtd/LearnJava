package demo30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo11 {

	public static void main(String[] args) throws IOException {
		//需要在资源对象前面添加final修饰符
		//读取一个文件
		final FileReader fileReader = new FileReader("file.txt");
		final BufferedReader br = new BufferedReader(fileReader);
		//JDK 9之后，try()后的括号中可以同时捕获处理多个资源对象，会对这多个资源对象自动关闭
		try (fileReader;br){
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		} 
	}

}
