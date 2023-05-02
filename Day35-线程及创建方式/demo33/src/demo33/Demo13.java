package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo13 implements Runnable{

	private static final Object lock = new Object();

    @Override
    public void run() {
    	//加同步锁
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo13 demo = new Demo13();
        Thread thread1 = new Thread(demo);
        Thread thread2 = new Thread(demo);
        thread1.start();
        System.out.println(thread1.getName() + "的状态：" + thread1.getState());
        
        thread2.start();
        Thread.sleep(50);
        System.out.println(thread2.getName() + "的状态：" + thread2.getState());
    }
}