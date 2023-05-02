package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo11 {
//	public static void main(String[] args) {
//		// 定义一个共享对象
//		final Object lock = new Object();
//
//		// 创建线程A：输出0~4
//		Thread threadA = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				//添加同步锁，以后壹哥再细讲synchronized的作用
//				synchronized (lock) {
//					for (int i = 0; i < 5; i++) {
//						System.out.println("Thread A: " + i);
//						try {
//							// 进入等待状态，等待线程B发出唤醒通知
//							lock.wait(); 
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//					// 线程A完成后，通知其他线程可以执行了
//					lock.notifyAll(); 
//				}
//			}
//		});
//
//		// 创建线程B：输出5~9
//		Thread threadB = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				synchronized (lock) {
//					for (int i = 5; i < 10; i++) {
//						System.out.println("Thread B: " + i);
//						// 发出通知，通知线程A继续执行
//						lock.notify(); 
//						try {
//							// 进入等待状态，等待线程A的通知
//							lock.wait(); 
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//					// 线程B完成后，通知其他线程可以执行了
//					lock.notifyAll(); 
//				}
//			}
//		});
//
//		threadA.start();
//		threadB.start();
//	}

	//定义一个数字
	private int number = 0;

	//数字加1
	//添加synchronized同步锁，以后壹哥再细讲synchronized的作用
	public synchronized void increment() {
		number++;
		// 线程完成后，通知其他线程可以执行了
		notify();
	}

	//数字减1
	public synchronized void decrement() throws InterruptedException {
		while (number == 0) {
			// 进入等待状态，等待其他线程的通知
			wait();
		}
		//数字减1
		number--;
	}

	public static void main(String[] args) {
		Demo11 demo = new Demo11();

		//创建A线程
		Thread threadA = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				//数字增加
				demo.increment();
				System.out.println("Thread A: " + demo.number);
			}
		});

		//创建B线程
		Thread threadB = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					//数字减少
					demo.decrement();
					System.out.println("Thread B: " + demo.number);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		//启动线程
		threadB.start();
		threadA.start();
		
	}
}