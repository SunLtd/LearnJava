package demo32;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author 一一哥Sun
 */
public class AioServer {

	private static final int PORT = 9999;

	public static void main(String[] args) throws Exception {
		// 创建一个AsynchronousServerSocketChannel对象
		AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open()
				.bind(new InetSocketAddress(PORT));
		System.out.println("Server started at port " + PORT);

		// 进行异步处理
		serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {
			//处理成功时的请求
			@Override
			public void completed(AsynchronousSocketChannel channel, Void attachment) {
				// 接收下一次的连接
				serverChannel.accept(null, this);

				// 处理请求：读取客户端发来的信息，并向客户端返回消息
				handle(channel);
			}

			@Override
			public void failed(Throwable throwable, Void attachment) {
				// 失败时进行异常处理
				throwable.printStackTrace();
			}
		});

		// 阻塞程序的执行，保持服务器一直运行
		Thread.currentThread().join();
	}

	//读取和返回信息
	private static void handle(AsynchronousSocketChannel channel) {
		//创建一个缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		try {
			//从缓冲区中读取数据
			Future<Integer> future = channel.read(buffer);
			//获取读取到的数据
			int readBytes = future.get();
			if (readBytes > 0) {
				//切换到读模式
				buffer.flip();
				String message = StandardCharsets.UTF_8.decode(buffer).toString();
				System.out.println("接收到客户端发来的消息: " + message);

				// 向客户端返回响应信息
//				Future<Integer> writeFuture = channel.write(ByteBuffer.wrap(("回复: " + message).getBytes()));
//				writeFuture.get();
			}
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				channel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
