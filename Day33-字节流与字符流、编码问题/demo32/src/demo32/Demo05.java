package demo32;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			//1.创建一个文件字节输入流对象
			FileInputStream fis = new FileInputStream("F:/a.txt");
			//2.创建一个字节缓冲流对象，将该对象与FileInputStream套接在一起
			BufferedInputStream bis = new BufferedInputStream(fis);
//			byte[] buffer = new byte[1024];
//		    int data = bis.read(buffer);
//		    while (data != -1) {
//		    	System.out.print((char) data);
//		        // 处理读取到的数据
//		        data = bis.read(buffer);
//		    }
			
			
			//3.开始进行数据的读取
			//byte[] buffer = new byte[1024];
			int data = bis.read();
			while (data != -1) {
				System.out.print((char) data);
				data = bis.read();
			}
			//为了简便，我就直接把close方法在这里操作了，大家可以在finally中或使用try(resource)的写法
			fis.close();
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
