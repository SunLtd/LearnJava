package demo32;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo13 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
	        // 将 System.in 对象转换成 Reader 对象
	        InputStreamReader reader = new InputStreamReader(System.in);
	        // 将普通的Reader 包装成 BufferedReader
	        BufferedReader br = new BufferedReader(reader);
	        String line = null;
	        // 利用循环方式来逐行的读取
	        while ((line = br.readLine()) != null) {
	            // 如果读取的字符串为“exit”，则程序退出
	            if (line.equals("exit")) {
	                System.exit(1);
	            }
	            // 打印读取的内容
	            System.out.println("输入内容为：" + line);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
