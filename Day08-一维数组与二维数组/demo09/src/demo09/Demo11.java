package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo11 {

	public static void main(String[] args) {
		// 冒泡排序--优化比较轮数

		// 待排序数组
		int[] arr = { 1, 3, 46, 22, 11 };

		for (int j = 0; j < arr.length - 1; j++) { //轮数
	        //假设这一轮已经拍好序，设置一个标签进行记录
	        boolean flag = true;
	        
	        for (int i = 0; i < arr.length - 1 - j; i++) {//每一轮比较的次数
	            if(arr[i] > arr[i+1]) {
	            	//更改是否比较过的标签
	                flag = false;
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	        }
	        
	        //如果本轮已排序好，则直接跳过，避免没必要的比较。
	        if(flag) {
	            break;
	        }
	    }
		
		//遍历排序后的数组
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
