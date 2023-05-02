package demo32;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo09 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// try(resource)的写法
		// 1. 创建Writer对象
		try (FileWriter writer = new FileWriter("F:/b.txt")) {
			// 利用Scanner进行内容的输入
			Scanner input = new Scanner(System.in);
			// 2. 写入文件
			for (int i = 0; i < 5; i++) {
				System.out.println("请输入第" + (i + 1) + "行内容：");
				// 读取输入的名称
				String content = input.next(); 
				// 循环写入到文件中
				writer.write(content + "\r\n"); 
			}
			System.out.println("录入完毕");
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		} // 3.自动资源释放
	}

}
