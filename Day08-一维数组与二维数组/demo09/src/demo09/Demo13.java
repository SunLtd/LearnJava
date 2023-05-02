package demo09;

import java.util.Arrays;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo13 {

	public static void main(String[] args) {
		// 选择排序

		//遍历排序后的数组
		String[] names = { "cxk", "rose", "lihua", "lilei", "zhaosi" };
		
		//直接利用Arrays类提供的数组排序的方法，内部是基于“快速排序”实现的。
		Arrays.sort(names);

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
	}

}
