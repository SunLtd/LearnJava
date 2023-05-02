package demo09;

import java.util.Arrays;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo08 {

	public static void main(String[] args) {
		// 数组拷贝

		//1.源数组
		int[] srcArr = {1,3,46,22,11};

		/**
		 * original：原数组
		 * newLength：新数组的长度
		 * 返回值：返回新数组 
		 */
		//2.调用copyOf方法进行数组拷贝
		int[] destArr = Arrays.copyOf(srcArr, srcArr.length+1);
		
		//3.遍历新数组
		for (int i = 0; i < srcArr.length; i++) {
		    System.out.print(destArr[i]+"\t");
		}
	}

}
