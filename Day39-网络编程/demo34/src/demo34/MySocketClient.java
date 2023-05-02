package demo34;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class MySocketClient {

	public static void main(String[] args) throws IOException {
		try {
			// 创建Socket对象并连接到服务器，关联服务器的ip地址与端口号
			Socket socket = new Socket("localhost", 1234);

			// 创建输入输出流，通过套接字发送和接收数据
			Scanner scanner = new Scanner(System.in);
			String nextLine = scanner.nextLine();
			// 输出流，客户端向服务器发送消息
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(nextLine);

			// 关闭套接字和流
			out.close();
			scanner.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
