package demo33;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 一一哥Sun
 */
public class Demo03 {
	public static void main(String[] args) {
		try {
			// 创建线程对象,注意这种方式是通过Executors线程池创建出来的
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			//将Callable作为参数传入submit()方法中，得到一个Future对象
			Future<String> future = executorService.submit(new MyCallable());
			// 获取执行结果
			String result = future.get();
			System.out.println("执行结果："+result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}  
	}
}
