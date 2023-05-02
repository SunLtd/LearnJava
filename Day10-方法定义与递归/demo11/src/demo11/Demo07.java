package demo11;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo07 {

	public static void main(String[] args) {
		int result = jc(5);
		System.out.println("result="+result);
	}
	
	//案例：求某个数的阶乘，如5! = 5*4! 
	public static int jc(int num) {
		//如果数字是1，则直接返回1
	    if(num == 1) {
	        return 1;
	    }
	    
	    //递归调用，将返回的结果与num相乘
	    return num*jc(num-1);
	}

}
