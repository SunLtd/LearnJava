package demo32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo08 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// try(resource)的写法
		//1. 创建Reader对象
		try (FileReader reader = new FileReader("F:/a.txt")) {
			//Reader reader = new FileReader("F:/a.txt", StandardCharsets.UTF_8);
			//2. 读取文件
	        char[] cbuf = new char[1024];
	        int len;
	        while((len = reader.read(cbuf)) != -1) {
	        	//3.处理字符
	            String str = new String(cbuf, 0, len);
	            System.out.println(str);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		} //4.自动资源释放
	}

}
