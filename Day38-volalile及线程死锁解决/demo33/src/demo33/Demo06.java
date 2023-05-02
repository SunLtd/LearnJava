package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo06 {

	public static void main(String[] args) throws InterruptedException {
		// 采用Lambda表达式创建线程
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("子线程1执行，i = " + i + ",当前线程：" + Thread.currentThread());
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("子线程2执行，i = " + i + ",当前线程：" + Thread.currentThread());
			}
		});

		thread1.start();
		thread2.start();

		//主线程会等待两个子线程执行完毕后再继续执行
		thread1.join();
		thread2.join();

		System.out.println("主线程执行完毕,当前线程：" + Thread.currentThread());
	}

}
