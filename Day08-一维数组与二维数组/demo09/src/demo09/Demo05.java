package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo05 {

	public static void main(String[] args) {
		// 数组扩容

		// 原数组
		int[] oldArr = { 1, 3, 46, 22, 11 };

		// 1.定义一个新数组，长度比原数组的长度多1，用于扩容
		int[] newArr = new int[oldArr.length + 1];

		// 2.数组拷贝
		for (int i = 0; i < oldArr.length; i++) {
			// 将原来数组的元素拷贝到新数组中
			newArr[i] = oldArr[i];
		}

		// 3.将原数组的名称变量指向新数组
		oldArr = newArr;

		System.out.println("数组长度="+oldArr.length);
		//遍历数组
		for (int i = 0; i < oldArr.length; i++) {
			//最后一个元素的值是默认值0
			System.out.println(oldArr[i]);
		}
	}

}
