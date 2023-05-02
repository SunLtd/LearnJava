package demo30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo08 {

	public static void main(String[] args) {
		try {
			//在调用readFile的上层方法中进行异常的捕获
			readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// throws的用法--抛出了两个异常
	public static void readFile() throws FileNotFoundException,IOException {
		// 定义一个缓冲流对象，以后在IO流阶段壹哥会细讲
		BufferedReader reader = null;
		// 对接一个file.txt文件，该文件可能不存在
		reader = new BufferedReader(new FileReader("file.txt"));
		// 读取文件中的内容。所有的IO流都可能会产生IO流异常
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
	}
}
