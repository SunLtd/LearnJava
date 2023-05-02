package demo30;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo09 {

	public static void main(String[] args) {
		try {
            int a = Integer.parseInt("100");
            int b = a / 0;
            System.out.println("b=" + b);
        } catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println("异常信息="+e.getMessage());
            e.printStackTrace();
            // 捕获多个异常时，异常对象e的前面默认有final修饰，e对象不能被重新赋值
            // 否则会产生如下异常：The parameter e of a multi-catch block cannot be assigned
            //e = new ArithmeticException("test");
        } catch (Exception e) {
            System.out.println("e,异常信息="+e.getMessage());
            e.printStackTrace();
            // 捕获一种类型的异常时，异常变量没有final修饰，e变量可以被重新赋值
            e = new RuntimeException("test");
        }
	}

}
