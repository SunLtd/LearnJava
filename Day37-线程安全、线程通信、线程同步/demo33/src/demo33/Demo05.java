package demo33;

/**
 * @author 一一哥Sun
 */
public class Demo05 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程：" + Thread.currentThread().getName() + "，i = " + i);
			Thread.sleep(1000); // 暂停一秒
		}
	}
}
