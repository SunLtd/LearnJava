package demo11;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo04 {

	public static void main(String[] args) {
		//调用方法
		int num = max(6,10);
		System.out.println("num="+num);
	}
	
	//定义一个带参数和返回值的方法，该方法包含2个参数num1和num2，返回这两个参数中的最大值。
	public static int max(int num1,int num2) {
	    if(num1 > num2) {
	        return num1;
	    }else {
	        return num2;
	    }
	}

}
