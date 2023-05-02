package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo18 {

	private static int count = 0;

	//定义一个同步代码块，让count递增
	public static synchronized void increment() {
		count++;
	}

	public static void main(String[] args) {
		//定义线程1对象
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		//定义线程2对象
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		//启动线程
		thread1.start();
		thread2.start();

		try {
			//使一个线程等另一个线程执行完毕后再继续执行，该方法会阻塞当前线程，直到调用该方法的线程执行完
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Now Count is: " + count);
	}
}
