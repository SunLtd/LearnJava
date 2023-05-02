package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo14 {

	public static void main(String[] args) throws InterruptedException {
		//定义一个Object对象
		final Object lock = new Object();
		
		//定义一个线程对象
		Thread thread = new Thread(() -> {
			//添加同步锁
			synchronized (lock) {
				try {
					System.out.println(Thread.currentThread().getName() + " is waiting ");
					//进入到WAITING状态
					lock.wait();
					
					//主线程notify之后，线程thread0被唤醒
					System.out.println(Thread.currentThread().getName() + " is awake ");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		//启动子线程thread0
		thread.start();
		
		//一秒钟后，主线程唤醒子线程thread0
		Thread.sleep(1000);
		synchronized (lock) {
			// 唤醒线程
			lock.notify(); 
		}
	}
}