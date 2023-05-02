package demo31;

import java.io.File;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo06 {

	public static void main(String[] args) {
		File file = new File("C:/");
		// 调用不带参数的list()方法
		String fileList[] = file.list(); 
        for (int i = 0; i < fileList.length; i++) { // 遍历返回的字符数组
            System.out.print(fileList[i] + "\t\t");
            System.out.print((new File("F:/", fileList[i])).isFile() ? "文件" + "\t\t" : "文件夹" + "\t\t");
            System.out.println((new File("F:/", fileList[i])).length() + "字节");
        }
	}
}
