package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo07 {

	public static void main(String[] args) throws InterruptedException {
		// 采用Lambda表达式创建线程
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("子线程1执行，i = " + i);
				// 当前子线程放弃CPU资源
				Thread.yield();
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("子线程2执行，i = " + i);
				// 当前子线程放弃CPU资源
				Thread.yield();
			}
		}).start();

		// 主线程
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程执行，i = " + i);
			// 当前线程放弃CPU资源
			Thread.yield();
		}
	}

}
