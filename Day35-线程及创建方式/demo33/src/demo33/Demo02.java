package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo02 {

	public static void main(String[] args) {
		// 创建线程对象,注意这种方式要把Runnale对象作为Thread的参数
		Thread t = new Thread(new MyRunnable());
		// 启动线程
		t.start();  

		// main方法所在的类，属于默认的主线程
		System.out.println("主线程："+Thread.currentThread());
	}

}
