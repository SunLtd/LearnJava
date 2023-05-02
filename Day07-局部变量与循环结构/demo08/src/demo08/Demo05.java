package demo08;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo05 {

	public static void main(String[] args) {
		// return关键字

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i + j == 10) {
					//结束整个循环的执行，无论循环的层次
					return;
				}
				
				System.out.println("i = " + i + ",j = " + j + ",i + j = " + (i + j));
			}
		}

		//这里执行不到
		System.out.println("循环之后的语句");
	}

}
