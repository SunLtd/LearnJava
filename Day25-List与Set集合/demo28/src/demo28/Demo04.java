package demo28;

import java.util.Arrays;
import java.util.List;

/**
 * @author 一一哥Sun
 */
public class Demo04 {

	public static void main(String[] args) {
		
		// 数组转List的方式一：List.of()返回一个只读的集合，不能进行add/remove等修改操作。
		List<Integer> values = List.of(1,8,222,10,5);
        for (Integer val : values) {
            System.out.println("方式一，value="+val);
            
            //该集合是一种只读的集合，不能在遍历时进行增删改等更新操作，只能进行读取操作，
            //否则会产生java.lang.UnsupportedOperationException异常
            //values.remove(0);
        }
        
        // 数组转List的方式二：Arrays.asList()返回一个只读的集合，不能进行add/remove等修改操作。
        List<String> items = Arrays.asList("java","壹壹哥","元宇宙");
        for (String item : items) {
            System.out.println("方式二，value="+item);
            
            //不可以进行增删改操作
            //items.add("sss");
            //items.remove(0);
        }
	}

}
