package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo07 {

	public static void main(String[] args) {
		// 数组拷贝

		//1.源数组
		int[] srcArr = {1,3,46,22,11};

		//2.目标数组
		int[] destArr = new int[srcArr.length + 5];

		/**
		* src:原数组
		* srcPos：原数组的起始拷贝位置
		* dest：目标数组
		* destPos：目标数组的起始拷贝位置
		* length：拷贝的长度
		*/
		//3.调用arraycopy方法进行复制
		System.arraycopy(srcArr, 1, destArr, 3, 4);

		//对新数组进行遍历
		for (int i = 0; i < destArr.length; i++) {
		    System.out.print(destArr[i]+"\t");
		}
	}

}
