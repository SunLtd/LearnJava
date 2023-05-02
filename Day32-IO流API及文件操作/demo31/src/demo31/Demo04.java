package demo31;

import java.io.File;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo04 {

	public static void main(String[] args) {
		File oldFile = new File("F:/example/newFile2.txt");
		File newFile = new File("F:/example2/newFile22.txt");
		if(oldFile.exists()) {
			//重命名文件。如果新文件所在的路径与之前的文件不是同一目录，则可以实现文件的移动，否则就是单纯重命名
		    boolean result = oldFile.renameTo(newFile);
		    if(result) {
		    	System.out.println("重命名成功");
		    }else {
		    	System.out.println("重命名失败");
		    }
		}
	}
}
