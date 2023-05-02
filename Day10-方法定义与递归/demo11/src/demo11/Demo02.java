package demo11;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo02 {

	public static void main(String[] args) {
		//调用方法
		printTriangle(6);
	}
	
	//定义一个没有返回值的方法，打印三角形(三角形行数由调用者来确定)    
	public static void printTriangle(int rows) {
	    for (int i = 1; i <= rows; i++) {
	        for (int j = 1; j <= i ; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    //返回值为void时，返回值可以写成如下格式，但实际上没必要
	    //return ;
	}

}
