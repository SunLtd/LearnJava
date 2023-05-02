package demo28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		//创建List对象方式一：
		List<String> list1=new ArrayList<>();
		
		List<String> list2=new LinkedList<>();
		
		//创建List对象方式二：
		List<Integer> list3 = List.of(1,3,5,7,9);
		
		//该方式不能传入null参数，否则会产生NullPointerException异常
		//List<Integer> list4 = List.of(1,3,5,7,9,null);
	}
	
}
