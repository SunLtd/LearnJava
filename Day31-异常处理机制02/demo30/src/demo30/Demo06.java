package demo30;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo06 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
            int a=100/0;
            System.out.println("a="+a);
        } catch (Exception e) {
            System.out.println("执行catch代码,异常信息："+e.getMessage());
            //在catch中抛出一个新的运行时异常
            throw new RuntimeException(e);
        } finally {
            System.out.println("非特殊情况，一定会执行finally里的代码");
            //在finally中也抛出一个异常
            throw new IllegalArgumentException("非法参数异常");
        }
	}
}
