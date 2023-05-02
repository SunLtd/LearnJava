package demo33;

import java.util.concurrent.Callable;

/**
 * @author 一一哥Sun
 */
public class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		//执行业务方法，可以在该方法中返回结果
		String result="方法的执行结果";
		return result;
	}
}
