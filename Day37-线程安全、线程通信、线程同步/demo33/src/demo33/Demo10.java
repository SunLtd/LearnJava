package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 thread = new MyThread2();
        System.out.println("Thread is alive: " + thread.isAlive()); // 输出 false
        thread.start();
        
        System.out.println("Thread is alive: " + thread.isAlive()); // 输出 true
        // 等待2秒，等待线程执行完成
        Thread.sleep(2000);
        System.out.println("Thread is alive: " + thread.isAlive()); // 输出 false
	}
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is finished.");
    }
}