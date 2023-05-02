package demo31;

import java.io.File;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo02 {

	public static void main(String[] args) {
		//创建单级目录
		File dir = new File("F:/example");
		
		if (!dir.exists()) {//判断目录是否存在
			//如果目录不存在，则创建出来
		    boolean success = dir.mkdir();
		    if (success) {
		        System.out.println("目录创建成功");
		    } else {
		        System.out.println("目录创建失败");
		    }
		}
		
		//创建多级目录
		File dirs = new File("F:\\testDir\\testSubDir");
        if (dirs.mkdirs()) {
            System.out.println("多级目录创建成功！");
        } else {
            System.out.println("多级目录已经存在！");
        }
	}
}
