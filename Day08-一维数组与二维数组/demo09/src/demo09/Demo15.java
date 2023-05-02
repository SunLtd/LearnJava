package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo15 {

	public static void main(String[] args) {
		// 二维数组--动态初始化

		//二维数组在动态初始化时，必须指定二维数组的长度。
        //创建一个包含了3个一维数组的二维数组，每个一维数组的长度是2。
        int[][] arr2 = new int[3][2];

        //给二维数组赋值
        //给二维数组中的第一个一维数组赋值
        arr2[0][0] = 111;
        arr2[0][1] = 222;

        //给二维数组中的第二个一维数组赋值
        arr2[1][0] = 333;
        arr2[1][1] = 444;

        //给二维数组中的第三个一维数组赋值
        arr2[2][0] = 555;
        arr2[2][1] = 666;

        //二维数组取值
        System.out.println( "二维数组中第一个元素里的第一个元素"+arr2[0][0]);
        System.out.println( "二维数组中第一个元素里的第二个元素"+arr2[0][1]);
        System.out.println( "二维数组中第二个元素里的第一个元素"+arr2[1][0]);
        System.out.println( "二维数组中第二个元素里的第二个元素"+arr2[1][1]);

        //获取二维数组的长度
        System.out.println("二维数组的长度"+arr2.length);
        System.out.println("二维数组中第一个一维数组的长度"+arr2[0].length);
        System.out.println("二维数组中第二个一维数组的长度"+arr2[1].length);
        System.out.println("二维数组中第三个一维数组的长度"+arr2[2].length);
	}
	
}
