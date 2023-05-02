package demo29;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo05 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		List<Number> numbers = new ArrayList<Number>();

		names.add("一一哥");
		names.add("秦始皇");
		ages.add(28);
		ages.add(50);
		ages.add(28);
		numbers.add(100);
		numbers.add(800);

		printElement(names);
		printElement(ages);
		printElement(numbers);
	}

	//未限定通配符的使用
	public static void printElement(List<?> data) {
		for(int i=0;i<data.size();i++) {
			//data.getClass().getSimpleName():用于获取某个类的类名
			System.out.println(data.getClass().getSimpleName()+"--data: " + data.get(i));
		}
	}

}
