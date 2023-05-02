package demo28;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 一一哥Sun
 */
public class Demo11 {

	public static void main(String[] args) {
		//创建HashSet集合
		HashSet<String> set = new HashSet<String>();
		set.add("一一哥");
		set.add("壹壹哥");
		set.add("java");
		//重复元素无法被添加进去
		set.add("java");
		System.out.println(set);
		
		//集合遍历
		Iterator<String> it = set.iterator();
	    while (it.hasNext()) {
	    	//输出Set集合中的每个元素
	        System.out.println("值="+it.next()); 
	    }
	}
}
