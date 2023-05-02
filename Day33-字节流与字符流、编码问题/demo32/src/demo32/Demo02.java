package demo32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (InputStream fis = new FileInputStream("F:/a.txt")) {
			byte[] buf = new byte[1024];
			int len;
			while ((len = fis.read(buf)) != -1) {
				String str = new String(buf, 0, len);
				System.out.println(str);
			}
	    } // 编译器在此自动为我们写入finally并调用close()
	}

}
