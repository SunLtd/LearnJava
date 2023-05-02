package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo22 {
	// 定义2个锁定的对象
	private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void method1() {
    	//锁定对象
        synchronized(lock1) {
            System.out.println("Method 1: 获取对象锁lock 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized(lock2) {
                System.out.println("Method 1: 获取对象锁lock 2");
            }
        }
    }

    public void method2() {
        synchronized(lock1) {
            System.out.println("Method 2: 获取对象锁lock 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized(lock2) {
                System.out.println("Method 2: 获取对象锁lock 2");
            }
        }
    }

    public static void main(String[] args) {
        final Demo22 demo = new Demo22();

        //定义两个线程
        Thread thread1 = new Thread(new Runnable() {
        	@Override
            public void run() {
            	demo.method1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
        	@Override
            public void run() {
            	demo.method2();
            }
        });

        //开启线程
        thread1.start();
        thread2.start();
    }
}