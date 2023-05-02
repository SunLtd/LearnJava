package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo20 {

	public static void main(String[] args) {
		VolatileThread t=new VolatileThread();
		t.start();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//在主线程中调用方法，修改另一个线程中变量的值
		t.stopThread();
	}
}

class VolatileThread extends Thread {
	//volatile修饰stop变量,保证stop在不同线程之间的可见性
    private volatile boolean stop = false;

    @Override
    public void run() {
    	System.out.println("线程正在运行");
        while (!stop) {
            System.out.println("线程停止了...");
        }
    }

    //在另一个线程中修改stop变量的值
    public void stopThread() {
        stop = true;
    }
}
