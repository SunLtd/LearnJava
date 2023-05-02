package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo08 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			//判断当前线程是否中断了
            while (!Thread.currentThread().isInterrupted()) {
				System.out.println("Thread 正在运行...");
                try {
                	//休眠阻塞1秒
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                	// 发生异常时，中断线程
                    Thread.currentThread().interrupt(); 
                    System.out.println("Thread 中断了");
                }
            }
        });

		//开始执行
        t.start();

        //主线程等待5秒
        Thread.sleep(5000);
        //中断线程
        t.interrupt();
	}
}
