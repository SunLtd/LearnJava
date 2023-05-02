package demo07;

import java.util.Scanner;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo07 {

	public static void main(String[] args) {
		// do-while循环
		// 案例：打印100遍"跟一一哥学编程"
		int i = 1;
		do {
			//循环体至少会执行一次
			System.out.println("跟一一哥学编程"+i);
			//更改i变量的值
			i++;
		} while (i <= 100);

		//案例：学生根据老师的评语，是否继续敲代码，直到测评结果为ok才结束。
		Scanner sc = new Scanner(System.in);
		String result;
		do{
		    System.out.println("敲代码ing...你看我的代码怎么样？？？");
		    System.out.println("评价：");   
		    //获取屏幕上输入的文本内容
		    result = sc.next();            
		}while(!result.equals("ok"));
	}

}
