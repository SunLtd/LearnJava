package demo33;

public class Demo01 {

	public static void main(String[] args) {
		// 创建线程对象
		MyThread mt = new MyThread();
		// 启动线程
		mt.start();

		// main方法所在的类，属于默认的主线程
		System.out.println("主线程："+Thread.currentThread());
	}

}

//自定义线程
class MyThread extends Thread {
	// 当线程启动的时候，会执行run方法中的代码
	@Override
	public void run() {
		System.out.println("当前线程："+Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
