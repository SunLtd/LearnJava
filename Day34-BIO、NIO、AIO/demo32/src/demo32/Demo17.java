package demo32;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author 一一哥Sun
 */
public class Demo17 {

	public static void main(String[] args) {
		//1.创建一个Channel对象
		Path path = Paths.get("F:/d.txt");
		try (FileChannel channel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			//2.创建Buffer缓冲区，并存入数据
			String data = "hello, 跟一一哥学Java吧!";
			ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
			//3.将缓冲区里的数据写入到文件中
			channel.write(buffer);
			//4.关闭资源
			channel.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
