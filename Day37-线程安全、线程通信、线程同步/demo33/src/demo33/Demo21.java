package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo21 {
	// 定义2个锁定的对象
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void method1() {
		// 锁定对象1
		synchronized (lock1) {
			System.out.println("Method 1: 获取对象lock1的锁");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 锁定对象2
			synchronized (lock2) {
				System.out.println("Method 1: 获取对象lock2的锁");
			}
		}
	}

	public void method2() {
		// 锁定对象2
		synchronized (lock2) {
			System.out.println("Method 2: 获取对象lock2的锁");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 锁定对象1
			synchronized (lock1) {
				System.out.println("Method 2: 获取对象lock1的锁");
			}
		}
	}

	public static void main(String[] args) {
		final Demo21 example = new Demo21();

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				example.method1();
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				example.method2();
			}
		});

		//开启线程
		thread1.start();
		thread2.start();
	}
}