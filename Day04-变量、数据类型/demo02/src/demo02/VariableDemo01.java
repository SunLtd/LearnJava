package demo02;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class VariableDemo01 {

	public static void main(String[] args) {
		// 注意：在java中，变量一定要初始化后才能使用！

//		//变量声明方式1：
//		//1.声明变量
//		int a;
//		//2.使用变量之前，给变量赋值，否则会报错
//		a = 10;
//		//3.使用变量
//		System.out.println(a);
		

		//变量声明方式2：
		//1.声明变量和初始化
		//int a = 10;
		//2. 使用变量
		//System.out.println("a的值为：" + a);
		
		//变量声明方式3：
		//连续定义多个变量
//	    int a = 1,b = 3,c = 10;
//	    System.out.println("a的值为："+a);   
//	    System.out.println("b的值为："+b);   
//	    System.out.println("c的值为："+c);   
	    
	    int a,b,c = 10;
	    //a未初始化，会直接报错
	    //System.out.println("a的值为：" + a);
	    //System.out.println("b的值为：" + b);
	    System.out.println("c的值为："+c);  
	}

}
