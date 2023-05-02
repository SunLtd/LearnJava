package demo32;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;

/**
 * @author 一一哥Sun
 */
public class AioClient {

	// 定义一个Channel客户端对象
	private AsynchronousSocketChannel client;

	public AioClient(String host, int port) throws Exception {
		// 打开链接，获取Channel对象
		client = AsynchronousSocketChannel.open();
		// 设置网络地址和端口
		InetSocketAddress serverAddress = new InetSocketAddress(host, port);

		// 客户端异步连接到服务器
		client.connect(serverAddress, null, new CompletionHandler<Void, Void>() {
			// 连接成功时的回调方法
			@Override
			public void completed(Void result, Void attachment) {
				System.out.println("server连接成功...");

//				ByteBuffer buffer = ByteBuffer.allocate(1024);
//				// 接收服务端返回的信息
//				client.read(buffer, null, new CompletionHandler<Integer, Object>() {
//					@Override
//					public void completed(Integer result, Object attachment) {
//						System.out.println("接收服务端返回的信息: " + new String(buffer.array(), 0, result));
//						try {
//							client.close();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//
//					@Override
//					public void failed(Throwable exc, Object attachment) {
//						exc.printStackTrace();
//						try {
//							client.close();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//				});
			}

			// 连接失败时的回调方法
			@Override
			public void failed(Throwable exc, Void attachment) {
				System.out.println("server连接失败...");
			}
		});

		// 阻塞程序保持客户端的允许
		//System.in.read();
	}

	// 定义一个发送消息的方法
	public void send(String message) throws InterruptedException, ExecutionException {
		// 缓冲区
		ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
		// 发送消息
		client.write(buffer).get();
		buffer.clear();
	}

	public static void main(String[] args) throws Exception {
		AioClient client = new AioClient("localhost", 9999);
		// 发送消息
		client.send("Hello, Server,我是客户端!");

		// Thread.currentThread().join();
	}
}
