package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo17 {

	public static void main(String[] args) {
		// 二维数组

		//动态初始化时未限定一维数组的长度
		int[][] arr3 = new int[3][];
		
		//如果我们在定义二维数组时，没有给定一维数组的长度，那么在使用数组之前，一定要初始化里面的一维数组。
		//如果直接使用一维数组，就会产生空指针异常java.lang.NullPointerException
		// arr3[0][0] = 100;
		//初始化一维数组
		arr3[0] = new int[2];
		arr3[1] = new int[1];
		arr3[2] = new int[4];

		//给数组赋值
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[1][0] = 10;
		arr3[2][0] = 100;
		arr3[2][1] = 200;
		arr3[2][2] = 300;
		arr3[2][3] = 400;

		// 二维数组取值
		System.out.println("二维数组中的第一个元素中的第一个元素" + arr3[0][0]);
		System.out.println("二维数组中的第一个元素中的第二个元素" + arr3[0][1]);
		System.out.println("二维数组中的第二个元素中的第一个元素" + arr3[1][0]);
	}

}
