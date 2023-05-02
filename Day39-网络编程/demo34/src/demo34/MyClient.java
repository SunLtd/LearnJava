package demo34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class MyClient {

	public static void main(String[] args) throws IOException {
		try {
			//创建Socket对象并连接到服务器
			Socket socket = new Socket("localhost", 1234);

			//创建输入输出流，通过套接字发送和接收数据
			Scanner scanner=new Scanner(System.in);
			String nextLine = scanner.nextLine();
			//输出流，客户端向服务器发送消息
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(nextLine);

			//输入流，客户端从服务器接收消息
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String response = in.readLine();
			System.out.println("Server服务器返回的响应信息===>: " + response);

			//关闭套接字和流
			out.close();
			in.close();
			scanner.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
