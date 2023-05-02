package demo29;

import java.util.Arrays;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo04 {
	
	//定义了一个静态的泛型方法，遍历数组中的每个元素
	public static <T> void printArray(T[] arr) {
		//先对数组进行排序
		Arrays.sort(arr);
		//再遍历数组元素
	    for (T t : arr) {
	        System.out.print(t + " ");
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] nums= {100,39,8,200,65};
		//调用泛型方法
		printArray(nums);
	}
}
