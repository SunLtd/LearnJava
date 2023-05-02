package demo30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo10 {

	public static void main(String[] args) {
		try {
			//读取一个文件
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}//这里就没有使用finally代码，Java会自动关闭IO流
	}

}
