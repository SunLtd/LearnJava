package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo09 {

	public static void main(String[] args) throws InterruptedException {
		// 采用Lambda表达式创建线程
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("子线程1执行，i = " + i+"，优先级："+Thread.currentThread().getPriority());
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("子线程2执行，i = " + i+"，优先级："+Thread.currentThread().getPriority());
			}
		});

		// 设置线程优先级
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	}
}
