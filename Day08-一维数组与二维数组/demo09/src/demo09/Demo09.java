package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo09 {

	public static void main(String[] args) {
		// 冒泡排序---基本实现

		// 待排序数组
		int[] arr = { 1, 3, 46, 22, 11 };

		//控制需要几轮比较
		for (int i = 0; i < arr.length; i++) {
			//控制每一轮的比较
			for (int j = 0; j < arr.length - 1; j++) {
				//如果前面的比后面的数字大，则两者就进行交换
				if (arr[j] > arr[j + 1]) {
					//两数交换，需要一个“第三方”，好比两杯水互换，需要第三个杯子。
					
					//定义一个新的中间变量，将数组中的前面的元素先赋值给中间变量
					int temp = arr[j];
					//后面的值赋值到前面的位置上
					arr[j] = arr[j + 1];
					//再将中间变量的值赋值到后面的位置上
					arr[j + 1] = temp;
				}
			}
		}
		
		//遍历排序后的数组
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
