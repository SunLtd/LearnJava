package demo32;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo12 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// try(resource)的写法
		// 1. 创建Writer对象
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("F:/c.txt"))) {
			//2.写入内容
			writer.write("Hello, world!");
			//3.换行
			writer.newLine();
			writer.write("Welcome to learn Java!");

			// writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
