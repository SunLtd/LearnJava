package demo32;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author 一一哥Sun
 */
public class Demo15 {

	public static void main(String[] args) {
		try {
			// 创建客户端对象，监听9999端口
			Socket socket = new Socket("localhost", 9999);
			
			// 创建BufferedReader对象
			//InputStream inputStream = socket.getInputStream();
			//BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			//String message = reader.readLine();
			//System.out.println("服务端发来的消息：" + message);

			// 创建输出流对象
			OutputStream outputStream = socket.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
			writer.write("hello,这里是客户端");
			// 这里需要使用flush刷新，否则信息可能发不出去
			writer.flush();

			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
