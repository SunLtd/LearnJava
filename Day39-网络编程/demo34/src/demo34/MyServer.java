package demo34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		int portNumber = 1234;
		// 创建服务器套接字并绑定端口号
		ServerSocket serverSocket = new ServerSocket(portNumber);
		// 注意：服务器只能接受一次客户端！用该socket对象既可以接收客户端发来的消息，也可以给客户端回复消息
		Socket acceptSocket = serverSocket.accept();

		// 服务器接收客户端发来的消息
		InputStream serverInputStream = acceptSocket.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(serverInputStream));
		String response = in.readLine();
		if (response != null) {
			System.out.println("服务器接收客户端发来的消息===>: " + response);

			// 服务器向客户端发送响应信息
			OutputStream serverOutputStream = acceptSocket.getOutputStream();
			String serverResponse = "我是服务器,你的消息已收到!";
			serverOutputStream.write(serverResponse.getBytes());
			serverOutputStream.flush();
			serverOutputStream.close();
		}

		// 关闭套接字和流
		serverSocket.close();
		acceptSocket.close();
		serverInputStream.close();
		//serverOutputStream.close();
	}
}
