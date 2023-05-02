package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo12 {

	public static void main(String[] args) {
		// 选择排序

		// 待排序的数组
		int[] arr = { 1, 3, 46, 22, 11 };

		for (int j = 0; j < arr.length-1; j++) {
	        //选择下标为0的位置
	        int min = j;
	        
	        //将当前这个数与后面的每个数进行比较
	        for (int i = j+1; i < arr.length; i++) {
	        	//如果当前数字小于标记的最小值，则将当前数字标记为最小值
	            if(arr[min] > arr[i]) {
	                min = i;
	            }
	        }
	        
	        //如果当前数字不是最小的，则进行交换
	        if(min != j) {
	            int temp = arr[j];
	            arr[j] = arr[min];
	            arr[min] = temp;
	        }
	    }
		
		//遍历排序后的数组
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
