package demo30;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo07 {

	//这里要利用throws关键字抛出Exception
	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {
		//定义一个异常变量,存储catch中的异常信息
		Exception origin = null;
		
		try {
            int a=100/0;
            System.out.println("a="+a);
        } catch (Exception e) {
            System.out.println("执行catch代码,异常信息："+e.getMessage());
            //存储catch中的异常信息
            origin = e;
            //抛出catch中的异常信息
            throw e;
        } finally {
            System.out.println("非特殊情况，一定会执行finally里的代码");
            Exception e = new IllegalArgumentException();
            if (origin != null) {
            	//将catch中的异常信息添加到finally中的异常信息中
                e.addSuppressed(origin);
            }
            //抛出finally中的异常信息，注意此时需要在方法中利用throws关键字抛出Exception
            throw e;
        }
	}
}
