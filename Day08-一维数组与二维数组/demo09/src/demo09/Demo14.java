package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo14 {

	public static void main(String[] args) {
		// 二分查找法--折半查找法

		// 遍历排序后的数组
		int[] arr = { 1, 3, 46, 22, 11 };

		int index = search(arr,46);
		System.out.println("46所在的索引位置="+index);
	}
	
	//定义二分查找法
	public static int search(int[] arr,int num) {
	    //1. 获取最小、大值的下标
	    int min = 0;
	    int max = arr.length -1;

	    while(min <= max) {
	        //2. 获取中间值的下标
	        int middle = (min + max) / 2;

	        //3. 将要查找的数字与中间值做比较
	        if(num > arr[middle]) {
	            min = middle +1;
	        }else if(num < arr[middle]) {
	            max = middle -1;
	        }else {
	            return middle;
	        }
	    }
	    return -1;
	}

}
