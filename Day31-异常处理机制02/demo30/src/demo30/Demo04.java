package demo30;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo04 {

	// throw的使用
	public static void myMethod(boolean flag) throws Exception {
		if (flag) {
			//当flag为true时就抛出一个Exception对象
			throw new Exception("主动抛出来的异常对象");
		}
	}

	public static void caller() {
	    try {
	    	//调用myMethod方法
	    	myMethod(true);
	    } catch (Exception e) {
	    	//e.getCause();
	    	e.printStackTrace();
	    	System.out.println("处理主动抛出来的异常：" + e.getMessage());
	    }
	}

	public static void main(String[] args) {
		caller();
	}
}
