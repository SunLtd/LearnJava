package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo12 implements Runnable {

	public synchronized void waitForWhile() throws InterruptedException {
		//等待状态
		System.out.println(Thread.currentThread().getName() + " is waiting state");
		
		//限时等待状态
		wait(2000);
		System.out.println(Thread.currentThread().getName() + " is timed waiting state");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			waitForWhile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Demo12 demo = new Demo12();
		// 新建状态
		Thread thread = new Thread(demo);
		System.out.println(thread.getName() + " is in new state");

		// 可运行状态
		thread.start();
		System.out.println(thread.getName() + " is in runnable state");

		//等待状态
		//Thread.sleep(500);
		//demo.waitForWhile();
		//System.out.println(thread.getName() + " is in timed waiting state");

		// 终止、死亡状态
		Thread.sleep(3000);
		System.out.println(thread.getName() + " is terminated");
	}
}