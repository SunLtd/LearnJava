package demo12;

public class CounterTest {

	public static void main(String[] args) {
		Counter cnt1 = new Counter(); // 建立第一个实例
		System.out.println("数量：" + cnt1.getCount()); // 输出1
		
		Counter cnt2 = new Counter(); // 建立第二个实例
		System.out.println("数量：" + cnt2.getCount()); // 输出2
		cnt2 = null; // 销毁实例2
		
		try {
			System.gc(); // 清理内存
			Thread.currentThread().sleep(1000); // 延时1000毫秒
			System.out.println("数量：" + cnt1.getCount()); // 输出1
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
