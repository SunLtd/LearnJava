package demo33;

/**
 * @author 一一哥Sun
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("创建线程的第二种方式，当前线程："+Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
