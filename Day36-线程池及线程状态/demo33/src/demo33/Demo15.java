package demo33;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 一一哥Sun
 */
public class Demo15 {

	public static void main(String[] args) throws InterruptedException {
		//创建只有单个线程的线程池对象
		//ExecutorService service = Executors.newSingleThreadExecutor();
		
		//创建带有缓存功能的线程池对象
		//ExecutorService service = Executors.newCachedThreadPool();
		
		//创建支持定时及周期性任务的线程池对象
		//ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
		
		//创建固定大小为5的线程池对象
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		//提交线程任务
		service.submit(new Runnable() {
			@Override
			public void run() {
				//执行线程任务
			}
		});
	}
}