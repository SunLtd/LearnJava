package demo31;

import java.io.File;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo03 {

	public static void main(String[] args) {
		//创建单级目录
		File file = new File("F:/example/file.txt");
		
		// 获取文件名和路径
        System.out.println("文件名：" + file.getName());
        System.out.println("文件路径：" + file.getPath());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父路径：" + file.getParent());
        System.out.println("文件父路径File对象：" + file.getParentFile());

        // 获取文件信息
        System.out.println("文件长度：" + file.length());
        System.out.println("最后修改时间：" + file.lastModified());
        System.out.println("是否存在：" + file.exists());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否可读：" + file.canRead());
        System.out.println("是否可写：" + file.canWrite());
	}
}
