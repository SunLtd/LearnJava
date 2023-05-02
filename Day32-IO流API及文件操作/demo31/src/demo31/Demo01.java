package demo31;

import java.io.File;
import java.io.IOException;

/**
 * @author 一一哥Sun V我领资料：syc_2312119590 各平台都有壹哥的同名博客哦
 */
public class Demo01 {

	public static void main(String[] args) {
		//使用分隔符常量，屏蔽不同系统的路径符号差异
		//String path="F:" + File.separator + "example" + File.separator + "file.txt";
		//File file = new File(path);
		//path=F:\example\file.txt
		//System.out.println("path="+file.getPath());
		
		// 该行代码只是创建出File对象，但并不会真的创建出对应的目录和文件
		File file = new File("F:/example/file.txt");
		
		try {
			// 文件操作
			if (!file.exists()) {
				// 真正的创建文件
				file.createNewFile();
				System.out.println("文件创建成功！");
			} else {
				System.out.println("文件已经存在！");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
