package demo09;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo01 {

	public static void main(String[] args) {
		//数组的动态初始化
		//写法1
		int[] arr = new int[3];
		
		//写法2
		//int arr[] = new int[3];

		//存储数据
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;

		//取数据，数组的下标从0开始
		System.out.println("第一个元素为："+arr[0]);
		System.out.println("第二个元素为："+arr[1]);
		System.out.println("第三个元素为："+arr[2]);

		//获取数据的长度
		System.out.println("数组长度="+arr.length);

		//错误：数组下标越界
		//System.out.println(arr[3]);
	}

}
