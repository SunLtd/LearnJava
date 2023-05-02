package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo16 {

	public static void main(String[] args) {
		// 二维数组--静态初始化

		//静态初始化一个二维数组。静态初始化时可以很灵活
		int[][] arr = {{11,22,33},{66,88}};
		
        //给二维数组赋值。
		//重新给二维数组中第一个一维数组里的第3个数据元素(即33)赋值，用99替换原来的33.
        arr[0][2] = 99;
        //重新给二维数组中第二个一维数组里的第1个数据元素(即66)赋值，用77替换原来的66.
        arr[1][0] = 77;
        
        //二维数组取值
        System.out.println( "二维数组中第一个一维数组里的第一个元素"+arr[0][0]);
        System.out.println( "二维数组中第一个一维数组里的第二个元素"+arr[0][1]);
        System.out.println( "二维数组中第二个一维数组里的第三个元素"+arr[0][2]);
        System.out.println( "二维数组中第二个一维数组里的第一个元素"+arr[1][0]);
        System.out.println( "二维数组中第二个一维数组里的第二个元素"+arr[1][1]);
        
        //获取二维数组的长度
        System.out.println("二维数组中的长度"+arr.length);
        System.out.println("二维数组中第一个一维数组的长度"+arr[0].length);
        System.out.println("二维数组中第二个一维数组的长度"+arr[1].length);
        
      //int[][][] arr2= new int[3][3][2];
      //int[][][] arr2= {{{1,2,3},{4,5,6},{7,8,9}},{{1,2},{3,4}},{{1,2},{3,4,5}}};
	}
	
}
