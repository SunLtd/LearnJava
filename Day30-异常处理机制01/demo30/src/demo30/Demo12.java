package demo30;

import java.io.IOException;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo12 {

	public static void main(String[] args) throws IOException {
		try {
	        test();
	    } catch (MyException e) {
	    	//捕获处理自定义异常
	        e.printStackTrace();
	    }
	}
	
	//抛出一个自定义异常
	public static void test() throws MyException {
	    throw new MyException("这是一个自定义异常哦");
	}
}
