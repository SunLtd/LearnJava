package demo07;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo05 {

	public static void main(String[] args) {
		// while循环
		
		//打印100遍“跟壹壹哥学Java”
		int i = 0;
		while (i < 100) {
			System.out.println("跟壹壹哥学Java"+i);
			//注意要更改i的值，否则条件就用于为真，这就成了死循环了
			i++;
		}
		
		//计算1~100的和
		int j = 1;
		int sum = 0;
		while(j < 101){            
		    sum = sum + j;
		    j++;
		}
		System.out.println(sum);
	}

}
