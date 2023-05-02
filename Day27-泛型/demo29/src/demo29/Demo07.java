package demo29;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo07 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		List<Double> numbers = new ArrayList<Double>();

		names.add("一一哥");
		names.add("秦始皇");
		ages.add(28);
		ages.add(50);
		ages.add(28);
		numbers.add(100.0);
		numbers.add(800.9);
		
		//String等非Number类型就不行
		//printElementUpbound(names);
		
		//此时Double类型也不行
		//printElementDownbound(numbers);
		
		//泛型值只能是Integer及其父类类型,所以Double/Float/String等类型都不可以
		printElementDownbound(ages);
		
	}

	//下限通配符的使用，这里的泛型值只能是Integer及其父类类型
	public static void printElementDownbound(List<? super Integer> data) {
		for(int i=0;i<data.size();i++) {
			System.out.println(data.getClass().getSimpleName()+"--data: " + data.get(i));
		}
	}
}
