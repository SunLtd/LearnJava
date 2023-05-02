package demo34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class MySocketServer {

	public static void main(String[] args) throws IOException {
		//设置服务器的端口号
		int portNumber = 1234;
		// 创建服务器套接字并绑定端口号
		ServerSocket serverSocket = new ServerSocket(portNumber);
		//获取与ServerSocket关联的Socket客户端对象
		Socket acceptSocket = serverSocket.accept();

		// 服务器接收客户端发来的消息
		InputStream serverInputStream = acceptSocket.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(serverInputStream));
		String response = in.readLine();
		if (response != null) {
			System.out.println("服务器接收客户端发来的消息===>: " + response);
		}

		// 关闭套接字和流
		serverSocket.close();
		acceptSocket.close();
		serverInputStream.close();
	}
}
