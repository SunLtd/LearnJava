package demo25;

import java.util.Scanner;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo03 {

	public static void main(String[] args) {
		//求整运算
		Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字...");
        //num=10.5
        double num = input.nextDouble();
		
		//向上取整
        System.out.println("向上取整:"+Math.ceil(num));//11.0
        
        //向下取整
        System.out.println("向下取整:"+Math.floor(num));//10.0
        
        //四舍五入
        System.out.println("四舍五入:"+Math.round(num));//11
        
        //返回最接近num的整数值，如果有两个同样接近的整数，则结果取偶数.
        System.out.println("最接近 "+num+" 的整数:" + Math.rint(num));//10.0
	}

}
