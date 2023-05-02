package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo18 {

	public static void main(String[] args) {
		// 二维数组--遍历

		//定义一个二维数组
		int[][] arr = {{11,22,33},{55,66},{77,88,99}};
		
        //使用双重for循环，遍历二维数组。
		//第一层循环：遍历二维数组中有几个一维数组
        for (int i = 0; i < arr.length; i++) {
            //arr[i]是一维数组
        	//第二层循环：遍历每个一维数组
            for(int j = 0 ; j < arr[i].length ; j++) {
                System.out.println("二维数组中第"+(i+1)+"个一维数组里的元素"+arr[i][j]);
            }
        }
	}

}
