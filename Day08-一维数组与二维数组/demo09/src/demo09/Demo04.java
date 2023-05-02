package demo09;

import java.util.Scanner;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//定义一个新的数组,暂时未赋值
		int[] nums = new int[4];
		
		//遍历数组，给数组中的每个元素赋值
		for (int i = 0; i < nums.length; i++) {
		    System.out.println("请输入第"+(i+1)+"个元素");
		    //将输入的每个数值，赋值到数组的第i个位置上
		    nums[i] = sc.nextInt();
		}

		 System.out.println("数组遍历结果为：");
		//数组遍历
		for (int i = 0; i < nums.length; i++) {
		    System.out.println(nums[i]);
		}
		
	}

}
