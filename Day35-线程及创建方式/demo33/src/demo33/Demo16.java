package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo16 {

	public static void main(String[] args) throws InterruptedException {
		//创建一个锁对象
		Object lock = new Object();
		//创建两个线程对象
        Thread t1 = new Thread(new WaitThread(lock), "线程1");
        Thread t2 = new Thread(new WaitThread(lock), "线程2");
        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //在主线程中锁定lock对象
        synchronized (lock) {
        	//唤醒所有的等待线程
            lock.notifyAll();
            System.out.println("唤醒所有等待线程");
        }
	}
}

//创建一个线程
class WaitThread implements Runnable {

    private Object lock;

    public WaitThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
    	//在线程中加锁
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
            try {
                System.out.println(Thread.currentThread().getName() + "进入等待");
                //在线程中进入等待状态
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "被唤醒");
        }
    }
}

