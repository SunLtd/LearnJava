package demo28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 一一哥Sun
 */
public class Demo20 {

	public static void main(String[] args) {
		//Collections的使用--查找方法
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		//二分查找
		int index = Collections.binarySearch(list, 2);
		System.out.println(index);  // 1
		
		List<Integer> srcList = new ArrayList<>();
		srcList.add(10);
		srcList.add(88);
		srcList.add(100);
		
		List<Integer> destList = new ArrayList<>();
		destList.add(-1);
		destList.add(0);
		destList.add(1);
		//调用copy()方法，将srcList集合中的元素复制到destList集合中
		// java.lang.IndexOutOfBoundsException: Source does not fit in dest
        Collections.copy(destList, srcList);
        System.out.println(destList); 
		
	}
}
