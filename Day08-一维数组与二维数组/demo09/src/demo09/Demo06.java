package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo06 {

	public static void main(String[] args) {
		// 数组缩容

		//定义一个原数组
		int[] oldArr = {1,3,46,22,11};

		//1.定义一个新数组，新数组的长度比原数组长度少1个
		int[] newArr = new int[oldArr.length-1];

		//2.进行数组拷贝
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = oldArr[i];
		}

		//3.将原数组的名称变量指向新数组
		oldArr = newArr;

		for (int i = 0; i < newArr.length; i++) {
		    System.out.println(oldArr[i]);
		}
	}

}
