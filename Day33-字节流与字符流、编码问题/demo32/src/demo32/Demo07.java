package demo32;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo07 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//try(resource)的写法
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:/b.txt"))){
			String message = "Hello, 一一哥!";
			byte[] bytes = message.getBytes();
			//写入数据
			bos.write(bytes);
			//刷新缓存
			bos.flush();
			//不需要close
			//bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
