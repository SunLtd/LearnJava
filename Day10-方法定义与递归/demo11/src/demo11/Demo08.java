package demo11;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo08 {

	public static void main(String[] args) {
		printNum(1234);
	}
	
	//换行输出一个数字中每一位上的值，如把1234的每一个数字分别输出。
	public static void printNum(int num) {
	    if(num == 0) {
	        return;
	    }
	    
	    //换行输出每一位的数字
	    System.out.println(num % 10);
	    
	    //递归调用
	    printNum(num/10);
	}

}
