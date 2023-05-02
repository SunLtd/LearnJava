package demo32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 一一哥Sun
 */
public class Demo14 {

	public static void main(String[] args) throws IOException {
		// 创建ServerSocket对象，监听9999端口
		try (ServerSocket serverSocket = new ServerSocket(9999)) {
			System.out.println("服务端启动成功，等待客户端连接...");

			while (true) {
				// 监听客户端的连接请求
				Socket socket = serverSocket.accept();
				System.out.println("客户端连接成功，客户端地址：" + socket.getInetAddress());

				// 读取客户端发来的消息
				InputStream inputStream = socket.getInputStream();
				// 创建BufferedReader对象
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				String message = reader.readLine();
				System.out.println("客户端发来的消息：" + message);

				// 服务端发送消息给客户端
				// OutputStream outputStream = socket.getOutputStream();
				// outputStream.write("Hello, 我是一一哥".getBytes());
				// outputStream.flush();

				// 关闭资源
				// outputStream.close();
				reader.close();
				inputStream.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
