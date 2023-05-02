package demo32;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 一一哥Sun
 */
public class Demo16 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("F:/a.txt");
			// 1.创建Channel对象
			FileChannel fileChannel = fileInputStream.getChannel();
			// 2.设置缓冲区
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			// 3.将数据从Channel读取到Buffer中
			while (fileChannel.read(byteBuffer) != -1) {
				//4.切换到读模式
				byteBuffer.flip();
				// 判断是否还有内容
				while (byteBuffer.hasRemaining()) {
					//5.读取数据并进行处理
					System.out.print((char) byteBuffer.get());
				}
				//6.切换到写模式，为下次读取数据做准备
				byteBuffer.clear();
			}
			// 关闭资源
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
