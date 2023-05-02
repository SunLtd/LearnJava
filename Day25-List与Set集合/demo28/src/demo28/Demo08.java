package demo28;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 一一哥Sun
 */
public class Demo08 {

	public static void main(String[] args) {
		//创建ArrayList集合
		ArrayList<Integer> nums = new ArrayList<>();
		//一个一个地添加元素
		nums.add(100);
		nums.add(85);
		nums.add(120);
		nums.add(55);
		
		//对集合进行排序,默认是升序排列
		Collections.sort(nums);  
        
		//遍历集合
        for (Integer num : nums) {
            System.out.println("num="+num);
        }
	}
}
