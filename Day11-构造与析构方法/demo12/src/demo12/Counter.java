package demo12;

public class Counter {

	private static int count = 0; // 计数器变量

	public Counter() {
		// 构造方法
		this.count++; // 创建实例时增加值
	}

	public int getCount() {
		// 获取计数器的值
		return this.count;
	}

	@Override
	protected void finalize() {
		// 析构方法
		this.count--; // 实例销毁时减少值
		System.out.println("对象销毁");
	}

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
