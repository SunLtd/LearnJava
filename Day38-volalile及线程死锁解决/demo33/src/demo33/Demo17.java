package demo33;
/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo17 {

	public static void main(String[] args) {
		//创建一个Object锁定对象
        Object lock = new Object();
        
        //第一个线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            	//锁定lock对象
                synchronized (lock) {
                    try {
                        System.out.println("Thread 1 等待中...");
                        //wait()方法必须放在同步代码块中调用，否则会出现如下异常：
                        //java.lang.IllegalMonitorStateException: current thread is not owner
                        
                        //线程1陷入等待
                        lock.wait();
                        System.out.println("Thread 1 被唤醒!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        //创建第2个线程
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Thread 2 正在唤醒...");
                    //notify()方法必须在同步代码块中调用，否则会出现如下异常：
                    //java.lang.IllegalMonitorStateException: current thread is not owner
                    lock.notify();
                }
            }
        });
        
        //开启线程1
        t1.start();
        
        try {
        	//为了看到线程1的等待效果，我们1秒钟之后才开启线程2
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
    }
}
