package demo09;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo03 {

	public static void main(String[] args) {
		// 数组的遍历

		// 定义一个数组
		int[] nums = { 10, 9, 17, 18, 22, 34 };

		// 遍历输出数组中的每个元素。以nums.length数组的长度做为循环的判断条件
		for (int i = 0; i < nums.length; i++) {
			// nums[i]表示数组中的每一个元素
			System.out.println(nums[i]);
		}

		// 利用增强for循环进行遍历
		for (int num : nums) {
			System.out.println(num);
		}

	}

}
