package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo19 {

	private static int count = 0;
	//设置被锁定的对象
	private static Object lock=new Object();

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
            	//定义一个同步代码块，更改count的值
            	//注意：同步代码块要锁定同一个lock
                synchronized (lock) {
                    for (int i = 0; i < 10000; i++) {
                        count++;
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
            	//定义一个同步代码块，更改count的值
                synchronized (lock) {
                    for (int i = 0; i < 10000; i++) {
                        count++;
                    }
                }
            }
        });

        //启动线程
        thread1.start();
        thread2.start();

        try {
        	//使一个线程等另一个线程执行完毕后再继续执行，该方法会阻塞当前线程，直到调用该方法的线程执行完
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Now Count is: " + count);
	}
}
