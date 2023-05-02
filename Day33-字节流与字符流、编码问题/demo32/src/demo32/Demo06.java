package demo32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 记录本次任务的开始时间
		long start = System.currentTimeMillis();

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try{
			//1.创建输入流对象
			fis = new FileInputStream("F:/payVideo/支付宝支付实现流程讲解.wmv");
			// 第2个参数是缓冲区的大小
			bis = new BufferedInputStream(fis, 80 * 1024);

			//2.创建输出流对象
			fos = new FileOutputStream("F:/payVideo2/支付宝支付实现流程讲解2.wmv");
			bos = new BufferedOutputStream(fos, 80 * 1024);

			byte[] buf = new byte[1024];
			int len;
			//3.从源文件中进行读取
			while ((len = bis.read(buf)) != -1) {
				//4.写入到目标文件
				bos.write(buf, 0, len);
				// 刷新一次就相当于在磁盘之间进行一次IO操作，这样会降低效率，所以这里可以关闭掉
				// bos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
					
				if (bis != null) {
					bis.close();
				}
					
				if (bos != null) {
					bos.close();
				}
					
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//记录任务的结束时间
		long end = System.currentTimeMillis();
		// 缓冲流耗时：224毫秒
		System.out.println("缓冲流耗时：" + (end - start));
	}

}
