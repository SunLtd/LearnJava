package demo31;

import java.io.File;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo05 {

	public static void main(String[] args) {
		File file = new File("F:/example/file.txt");
		if(file.exists()) {
		    boolean result = file.delete();
		    if(result) {
		    	System.out.println("删除成功");
		    }else {
		    	System.out.println("删除失败");
		    }
		}
	}
}
