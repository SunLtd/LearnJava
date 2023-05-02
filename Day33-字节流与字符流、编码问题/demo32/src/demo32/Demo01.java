package demo32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 创建文件字节输入流
			fis = new FileInputStream("F:/a.txt");
			// 一次读取一个字节，返回该字节对应的ASCII值，如果到了流的末尾则返回-1
			// System.out.println(fis.read());

			// read(byte[])：从流中一次读取自定义缓冲区大小的字节，并返回读取到的字节长度，如果读到流的末尾则返回-1
			// 自定义缓冲区1
//			byte[] buf = new byte[1024];
//			int len = fis.read(buf);
//			// 将byte数组转换成String字符串
//			String str = new String(buf, 0, len);
//			System.out.println(str);

			// read(byte[])：自定义缓冲区2
			byte[] buf2 = new byte[1024];
			int len2;
			while ((len2 = fis.read(buf2)) != -1) {
				String str2 = new String(buf2, 0, len2);
				System.out.println(str2);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 三、关闭流对象
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
