package demo33;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 一一哥Sun
 */
public class Demo04 {
	public static void main(String[] args) {
		// 通过Executors线程池框架创建线程，在线程池中创建10个线程
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		// 执行线程池中的线程
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("当前线程："+Thread.currentThread());
			}
		});
		
		//关闭线程池
		executorService.shutdown();
	}
}
