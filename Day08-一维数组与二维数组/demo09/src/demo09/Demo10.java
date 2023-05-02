package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo10 {

	public static void main(String[] args) {
		// 冒泡排序--优化比较次数

		// 待排序数组
		int[] arr = { 1, 3, 46, 22, 11 };

		for (int j = 0; j < arr.length; j++) {   //控制轮数
	        for (int i = 0; i < arr.length - 1 - j; i++) {//控制每一轮的次数
	            if(arr[i] > arr[i+1]) {
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	        }
	    }
		
		//遍历排序后的数组
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
