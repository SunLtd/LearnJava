package demo27;

public class Demo01 {

	public static void main(String[] args) {
		//exit的用法
		try {
			Thread.sleep(5000);
			//5秒后正常退出程序
			System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//主动进行垃圾回收
		System.gc();
	}

}
